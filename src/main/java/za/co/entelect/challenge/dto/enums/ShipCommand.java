package za.co.entelect.challenge.dto.enums;

public enum ShipCommand {

    NOTHING("Nothing", 0),
    MOVE_LEFT("MoveLeft", 1),
    MOVE_RIGHT("MoveRight", 2),
    SHOOT("Shoot", 3),
    BUILD_ALIEN_FACTORY("BuildAlienFactory", 4),
    BUILD_MISSILE_CONTROLLER("BuildMissileController", 5),
    BUILD_SHIELD("BuildShield", 6);

    private ShipCommand(String moveDescription, int moveNumber) {
        this.moveDescription = moveDescription;
        this.moveNumber = moveNumber;
    }

    private String moveDescription;
    private int moveNumber;

    public String getMoveDescription() {
        return moveDescription;
    }

    public int getMoveNumber() {
        return moveNumber;
    }
}
