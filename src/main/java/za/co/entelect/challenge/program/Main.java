package za.co.entelect.challenge.program;

import za.co.entelect.challenge.bot.BasicBot;
import za.co.entelect.challenge.dto.Settings;
import za.co.entelect.challenge.utils.LogHelper;
import za.co.entelect.challenge.utils.StringUtility;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Main {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        if (args.length != 1) {
            printUsage();
        }

        Settings settings = loadSettings();

        getDefaultFolderNameFromArguments(args, settings);

        BasicBot bot = new BasicBot(settings);
        bot.execute();

        long runTime = System.currentTimeMillis() - startTime;

        printRunTime(bot, runTime);
    }

    private static void printUsage() {
        LogHelper.log("Java QuickStartBot usage: java -jar target/BasicBot-1.0-SNAPSHOT-jar-with-dependencies.jar <defaultOutputFolderName>");
        LogHelper.logEmptyLine();
        LogHelper.log("\tdefaultOutputFolderName\tThe folder into which the bot should write its move.");
    }

    private static Settings loadSettings() {
        Settings settings = new Settings();
        Properties prop = new Properties();
        String propFileName = "settings.properties";
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        InputStream stream = loader.getResourceAsStream(propFileName);
        try {
            if (stream != null) {
                prop.load(stream);
                settings.setDefaultOutputFolder(prop.getProperty("DefaultOutputFolder"));
                settings.setOutputFile(prop.getProperty("OutputFile"));
                settings.setStateFile(prop.getProperty("StateFile"));
                settings.setMapFile(prop.getProperty("MapFile"));
            } else {
                LogHelper.log(propFileName + " not found in the classpath");
            }
        } catch (FileNotFoundException fnfe) {
            LogHelper.log(propFileName + " not found in the classpath");
        } catch (IOException ioe) {
            LogHelper.log("Error reading " + propFileName);
        }
        return settings;
    }

    private static void getDefaultFolderNameFromArguments(String[] args, Settings settings)
    {
        if (StringUtility.isValidString(args[0])) {
            settings.setDefaultOutputFolder(args[0]);
        } else {
            LogHelper.log("Invalid output folder. Defaulting to: " + settings.getDefaultOutputFolder());
        }
    }

    private static void printRunTime(BasicBot bot, long runTime) {
        LogHelper.log(LogHelper.PREFIX + getPlayerName(bot) + " finished in " + runTime + " ms.");
    }

    /**
     * You can always assume that you are player 1
     *
     * @param bot
     * @return playerName
     */
    private static String getPlayerName(BasicBot bot) {
        return bot.getPlayers().get(0).getPlayerName();
    }
}
