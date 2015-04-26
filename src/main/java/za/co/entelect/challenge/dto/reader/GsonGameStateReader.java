package za.co.entelect.challenge.dto.reader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import com.google.gson.Gson;

import za.co.entelect.challenge.dto.GameState;

public class GsonGameStateReader implements GameStateReader
{
    @Override
    public GameState read(File jsonFile) throws IOException {
        
        try (FileReader reader = new FileReader(jsonFile)) {
            return (new Gson()).fromJson(reader, GameState.class);
        }
    }
}
