package za.co.entelect.challenge.dto.reader;

import java.io.File;
import java.io.IOException;

import za.co.entelect.challenge.dto.GameState;

public interface GameStateReader
{
    public GameState read(File jsonFile) throws IOException;
}
