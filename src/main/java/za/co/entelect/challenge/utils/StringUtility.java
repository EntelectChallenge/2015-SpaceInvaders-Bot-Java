package za.co.entelect.challenge.utils;

public final class StringUtility {
    /**
     * Takes in a string and checks to see that it is not null and
     * that its length is greater than zero.  It does not however check
     * the contents of the string.  It can contain any kind of character.
     */
    public static boolean isValidString(final String source) {
        return (source != null && source.length() > 0);
    }
}
