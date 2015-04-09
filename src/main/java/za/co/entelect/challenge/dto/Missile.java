package za.co.entelect.challenge.dto;

import za.co.entelect.challenge.dto.enums.EntityType;

public class Missile {

    private Boolean alive;
    private Integer x;
    private Integer y;
    private Integer width;
    private Integer height;

    private EntityType type;

    private Integer playerNumber;
    private Integer actionRate;

    public Boolean isAlive() {
        return alive;
    }

    public void setAlive(Boolean alive) {
        this.alive = alive;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public EntityType getType() {
        return type;
    }

    public void setType(EntityType type) {
        this.type = type;
    }

    public Integer getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(Integer playerNumber) {
        this.playerNumber = playerNumber;
    }

    public Integer getActionRate() {
        return actionRate;
    }

    public void setActionRate(Integer actionRate) {
        this.actionRate = actionRate;
    }
}
