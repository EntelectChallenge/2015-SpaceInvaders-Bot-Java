package za.co.entelect.challenge.dto.reader;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import net.minidev.json.JSONArray;

import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.PathNotFoundException;

import za.co.entelect.challenge.dto.GameState;
import za.co.entelect.challenge.dto.Missile;
import za.co.entelect.challenge.dto.Player;
import za.co.entelect.challenge.dto.Ship;
import za.co.entelect.challenge.dto.enums.EntityType;
import za.co.entelect.challenge.utils.LogHelper;

/**
 * This class accesses the json elements directly
 * Advantage: Fast and no need initialise everything - only use what you need
 * Disadvantage: Match/Game State model only partially initialised
 */
public class BasicGameStateReader implements GameStateReader
{
    @Override
    public GameState read(File jsonFile) throws IOException {
        try {
            GameState gameState = new GameState();

            loadRoundNumber(jsonFile, gameState);

            String player1Path = "$.Players[0]";
            String player2Path = "$.Players[1]";

            Player player1 = loadPlayer(jsonFile, player1Path);
            Player player2 = loadPlayer(jsonFile, player2Path);

            gameState.getPlayers().add(player1);
            gameState.getPlayers().add(player2);

            return gameState;
        } catch (NumberFormatException nfe) {
            throw new RuntimeException("Unable to convert Round Number to int", nfe);
        }
    }
    
    private void loadRoundNumber(File jsonFile, GameState gameState) throws IOException {
        String roundNumber = "$.RoundNumber";
        gameState.setRoundNumber(Integer.valueOf(JsonPath.read(jsonFile, roundNumber).toString()));
    }

    private Player loadPlayer(File jsonFile, String playerPath) throws IOException {
        Player player = new Player();

        try {
            Map<String, Object> playerMap = JsonPath.read(jsonFile, playerPath);

            player.setPlayerName((String)playerMap.get("PlayerName"));
            player.setPlayerNumber((Integer)playerMap.get("PlayerNumber"));
            player.setPlayerNumberReal((Integer)playerMap.get("PlayerNumberReal"));
            player.setKills((Integer)playerMap.get("Kills"));
            player.setLives((Integer)playerMap.get("Lives"));
            player.setMissileLimit((Integer)playerMap.get("MissileLimit"));

            JSONArray missiles = (JSONArray)playerMap.get("Missiles");

            player.setMissiles(loadMissiles(missiles));
            
            Ship ship = loadShip ((Map)playerMap.get("Ship"));
            
            player.setShip(ship );

        } catch (PathNotFoundException pnfe) {
            LogHelper.log("Index out of bounds when evaluating path " + playerPath);
            pnfe.printStackTrace();
        }

        return player;
    }

    private Ship loadShip(Map<String,Object> in) {
		Ship ship = new Ship();
		
		ship.setAlive((Boolean) in.get("Alive"));
		ship.setCommand(in.get("Command").toString());
		ship.setCommandFeedback(in.get("CommandFeedback").toString());
		ship.setHeight((Integer) in.get("Height"));
		ship.setId((Integer) in.get("Id"));
		ship.setPlayerNumber((Integer) in.get ("PlayerNumber"));
		ship.setType((String) in.get("Type"));
		ship.setWidth((Integer) in.get ("Width"));
		ship.setX((Integer) in.get("X"));
		ship.setY((Integer) in.get("Y"));
		
		return ship;
	}

	private List<Object> loadMissiles(JSONArray missiles) {
        List<Object> playerMissiles = new ArrayList<>();
        Missile playerMissile;

        for (Object missile : missiles) {
            playerMissile = new Missile();

            @SuppressWarnings("unchecked")
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
}
