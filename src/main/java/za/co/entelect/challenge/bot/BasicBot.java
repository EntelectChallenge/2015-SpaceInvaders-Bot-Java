package za.co.entelect.challenge.bot;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.PathNotFoundException;
import net.minidev.json.JSONArray;
import za.co.entelect.challenge.dto.GameState;
import za.co.entelect.challenge.dto.Missile;
import za.co.entelect.challenge.dto.Player;
import za.co.entelect.challenge.dto.Settings;
import za.co.entelect.challenge.dto.enums.EntityType;
import za.co.entelect.challenge.dto.enums.ShipCommand;
import za.co.entelect.challenge.utils.BotHelper;
import za.co.entelect.challenge.utils.FileHelper;
import za.co.entelect.challenge.utils.LogHelper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Random;

public class BasicBot {

    private Settings settings = null;

    public BasicBot(Settings settings) {
        this.settings = settings;
    }

    private GameState gameState;

    public void execute() {

        //Choose how you want to access the JSON
        boolean basicAccess = false;

        gameState = basicAccess ? loadBasicState() : loadAdvancedState();

        loadAdvancedState();

        logMatchState();

        StringBuilder map = loadMap();
        LogHelper.logPartsOnDifferentLines("Map", map);

        String move = getRandomMove();
        saveMove(move);
    }

    /**
     * This method accesses the json elements directly
     * Advantage: Fast and no need initialise everything - only use what you need
     * Disadvantage: Match/Game State model only partially initialised
     *
     * @return match
     */
    private GameState loadBasicState() {
        try {
            GameState gameState = new GameState();

            File jsonFile = FileHelper.getFile(settings.getDefaultOutputFolder(), settings.getStateFile());

            loadRoundNumber(jsonFile, gameState);

            String player1Path = "$.Players[0]";
            String player2Path = "$.Players[1]";

            Player player1 = loadPlayer(jsonFile, player1Path);
            Player player2 = loadPlayer(jsonFile, player2Path);

            gameState.getPlayers().add(player1);
            gameState.getPlayers().add(player2);

            return gameState;
        } catch (IOException ioe) {
            LogHelper.log("Unable to read state file: " + settings.getStateFile());
            ioe.printStackTrace();
            return null;
        } catch (NumberFormatException nfe) {
            LogHelper.log("Unable to convert Round Number to int: " + settings.getStateFile());
            nfe.printStackTrace();
            return null;
        }
    }

    /**
     * This method initialises the entire Game State model using Jackson
     * Advantage: All elements are accessible
     * Disadvantage: slower than method loadBasicState()
     *
     * @return match
     */
    private GameState loadAdvancedState() {
        GameState gameState = null;

        File jsonFile = FileHelper.getFile(settings.getDefaultOutputFolder(), settings.getStateFile());

        // ObjectMapper provides functionality for data binding between
        // Java Bean Objects/POJO and JSON constructs/string
        ObjectMapper mapper = new ObjectMapper();

        try {
            gameState = mapper.readValue(jsonFile, GameState.class);
        } catch (IOException ioe) {
            LogHelper.log("Unable to read state file: " + settings.getStateFile());
            ioe.printStackTrace();
            return null;
        }

        return gameState;
    }

    private void loadRoundNumber(File jsonFile, GameState gameState) throws IOException {
        String roundNumber = "$.RoundNumber";
        gameState.setRoundNumber(Integer.valueOf(JsonPath.read(jsonFile, roundNumber).toString()));
    }

    private Player loadPlayer(File jsonFile, String playerPath) throws IOException {
        Player player = new Player();

        try {
            LinkedHashMap<String, Object> playerMap = JsonPath.read(jsonFile, playerPath);

            player.setPlayerName((String)playerMap.get("PlayerName"));
            player.setPlayerNumber((Integer)playerMap.get("PlayerNumber"));
            player.setPlayerNumberReal((Integer)playerMap.get("PlayerNumberReal"));
            player.setKills((Integer)playerMap.get("Kills"));
            player.setLives((Integer)playerMap.get("Lives"));
            player.setMissileLimit((Integer)playerMap.get("MissileLimit"));

            JSONArray missiles = (JSONArray)playerMap.get("Missiles");

            player.setMissiles(loadMissiles(missiles));

        } catch (PathNotFoundException pnfe) {
            LogHelper.log("Index out of bounds when evaluating path " + playerPath);
            pnfe.printStackTrace();
        }

        return player;
    }

    private List<Object> loadMissiles(JSONArray missiles) {
        List<Object> playerMissiles = new ArrayList<>();
        Missile playerMissile;

        for (Object missile : missiles) {
            playerMissile = new Missile();

            LinkedHashMap<String, Object> playerMissilesMap = (LinkedHashMap<String, Object>) missile;

            playerMissile.setAlive((Boolean)playerMissilesMap.get("Alive"));
            playerMissile.setX((Integer)playerMissilesMap.get("x"));
            playerMissile.setY((Integer)playerMissilesMap.get("y"));
            playerMissile.setWidth((Integer)playerMissilesMap.get("Width"));
            playerMissile.setHeight((Integer)playerMissilesMap.get("Height"));
            for (EntityType type : EntityType.values()) {
                if (((String)playerMissilesMap.get("Type")).equalsIgnoreCase(type.toString())) {
                    playerMissile.setType(type);
                    break;
                }
            }
            playerMissile.setPlayerNumber((Integer)playerMissilesMap.get("PlayerNumber"));
            playerMissile.setActionRate((Integer)playerMissilesMap.get("ActionRate"));

            playerMissiles.add(playerMissile);
        }

        return playerMissiles;
    }

    private void logMatchState() {
        LogHelper.log(LogHelper.PREFIX + "Game state:");
        LogHelper.log("\tRound: " + gameState.getRoundNumber());

        for (Player player : getPlayers()) {
            logPlayerState(player);
        }
    }

    public GameState getGameState() {
        return gameState;
    }

    public List<Player> getPlayers() {
        return gameState.getPlayers();
    }

    private void logPlayerState(Player player) {
        LogHelper.log("\tPlayer " + player.getPlayerNumberReal() + " Kills: " + player.getKills());
        LogHelper.log("\tPlayer " + player.getPlayerNumberReal() + " Lives: " + player.getLives());
        LogHelper.log("\tPlayer " + player.getPlayerNumberReal() + " Missiles: " + player.getMissiles().size() + "/" + player.getMissileLimit());
    }

    private StringBuilder loadMap() {
        try {
            return FileHelper.readFile(settings.getDefaultOutputFolder(), settings.getMapFile());
        } catch(IOException ioe) {
            LogHelper.log("Unable to read map file: " + settings.getMapFile());
            ioe.printStackTrace();
            return new StringBuilder();
        }
    }

    private String getRandomMove() {
        long seed = System.currentTimeMillis();
        Random random = new Random(seed);
        int move = Math.abs(random.nextInt() % ShipCommand.values().length);
        String translatedMove = BotHelper.translateMove(move);
        return translatedMove;
    }

    private void saveMove(String move) {
        try {
            FileHelper.writeFile(settings.getDefaultOutputFolder(), settings.getOutputFile(), move);
            LogHelper.log("Move", move);
        } catch (IOException ioe) {
            LogHelper.log("Unable to write move file: " + settings.getOutputFile());
            ioe.printStackTrace();
        }
    }


}
