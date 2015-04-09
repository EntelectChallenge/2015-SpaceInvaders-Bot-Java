package za.co.entelect.challenge.utils;

public class LogHelper {

    public final static String PREFIX = "[BOT]\t";

    public static void log(Object aMsg) {
        System.out.println(String.valueOf(aMsg));
    }

    public static void log(String description, Object aMsg) {
        System.out.print(PREFIX + description + ": ");
        log(aMsg);
    }

    public static void logPartsOnDifferentLines(String description, Object aMsg) {
        log(PREFIX + description + ":");
        log(aMsg);
    }

    public static void logEmptyLine() {
        System.out.println();
    }
}
