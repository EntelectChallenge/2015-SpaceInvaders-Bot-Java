package za.co.entelect.challenge.dto.reader;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

import za.co.entelect.challenge.dto.GameState;

public class JacksonGameStateReader implements GameStateReader
{
    public GameState read(File jsonFile) throws IOException {
        
        // ObjectMapper provides functionality for data binding between
        // Java Bean Objects/POJO and JSON constructs/string
        ObjectMapper mapper = new ObjectMapper();

        return mapper.readValue(jsonFile, GameState.class);
    }
}
