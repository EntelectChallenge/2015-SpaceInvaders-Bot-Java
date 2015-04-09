package za.co.entelect.challenge.utils;

import za.co.entelect.challenge.dto.enums.ShipCommand;

public class BotHelper {

    public static String translateMove(int number) {
        String latestMove = ShipCommand.NOTHING.getMoveDescription();

        for (ShipCommand move : ShipCommand.values()) {
            if (move.getMoveNumber() == number) {
                latestMove = move.getMoveDescription();
                break;
            }
        }

        return latestMove;
    }
}
