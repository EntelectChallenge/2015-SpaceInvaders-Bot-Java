package za.co.entelect.challenge.dto;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

import za.co.entelect.challenge.dto.reader.BasicGameStateReader;
import za.co.entelect.challenge.dto.reader.GameStateReader;
import za.co.entelect.challenge.utils.FileHelper;
import za.co.entelect.challenge.utils.LogHelper;

public class GameStateParsingTest {

	@Test
	public void test() {
		 GameStateReader reader = 
	                new BasicGameStateReader();
	                //new JacksonGameStateReader();
	                //new GsonGameStateReader();

	        GameState gameState = loadGameState(reader);
	        assertNotNull(gameState);
	        
	        Ship ship =gameState.getPlayers().get(0).getShip();
	        assertNotNull (ship);
	        assertEquals(7, ship.getX().intValue());
	        assertEquals(22, ship.getY().intValue());
	        
	}
	
	  private GameState loadGameState(GameStateReader reader) {
	        GameState gameState = null;

	        File jsonFile = new File ("src/test/resources/state.json");

	        try {
	            gameState = reader.read(jsonFile);
	        } catch (Exception ioe) {
	            
	            ioe.printStackTrace();
	            return null;
	        }

	        return gameState;
	    }

}
