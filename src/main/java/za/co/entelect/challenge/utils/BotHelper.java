package za.co.entelect.challenge.utils;

import za.co.entelect.challenge.dto.enums.ShipCommand;

public class BotHelper {

    public static String translateMove(int number) {
    	return ShipCommand.values()[number].toString();
    }
}
