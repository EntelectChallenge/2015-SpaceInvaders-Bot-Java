package za.co.entelect.challenge.dto;

public class Settings {

    private String defaultOutputFolder = "output";
    private String outputFile = "move.txt";
    private String stateFile = "state.json";
    private String mapFile = "map.txt";

    public String getDefaultOutputFolder() {
        return defaultOutputFolder;
    }

    public void setDefaultOutputFolder(String defaultOutputFolder) {
        this.defaultOutputFolder = defaultOutputFolder;
    }

    public String getOutputFile() {
        return outputFile;
    }

    public void setOutputFile(String outputFile) {
        this.outputFile = outputFile;
    }

    public String getStateFile() {
        return stateFile;
    }

    public void setStateFile(String stateFile) {
        this.stateFile = stateFile;
    }

    public String getMapFile() {
        return mapFile;
    }

    public void setMapFile(String mapFile) {
        this.mapFile = mapFile;
    }
}
