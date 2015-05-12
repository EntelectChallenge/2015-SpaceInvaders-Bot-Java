package za.co.entelect.challenge.dto;

import com.fasterxml.jackson.annotation.*;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "PlayerNumberReal",
        "PlayerNumber",
        "PlayerName",
        "Ship",
        "Kills",
        "Lives",
        "RespawnTimer",
        "Missiles",
        "MissileLimit",
        "AlienWaveSize",
        "AlienFactory",
        "MissileController",
        "AlienManager"
})
public class Player {

    @JsonProperty("PlayerNumberReal")
    @SerializedName("PlayerNumberReal")
    private Integer playerNumberReal;
    @JsonProperty("PlayerNumber")
    @SerializedName("PlayerNumber")
    private Integer playerNumber;
    @JsonProperty("PlayerName")
    @SerializedName("PlayerName")
    private String playerName;
    @JsonProperty("Ship")
    @SerializedName("Ship")
    private Ship ship;
    @JsonProperty("Kills")
    @SerializedName("Kills")
    private Integer kills;
    @JsonProperty("Lives")
    @SerializedName("Lives")
    private Integer lives;
    @JsonProperty("RespawnTimer")
    @SerializedName("RespawnTimer")
    private Integer respawnTimer;
    @JsonProperty("Missiles")
    @SerializedName("Missiles")
    private List<Object> missiles = new ArrayList<Object>();
    @JsonProperty("MissileLimit")
    @SerializedName("MissileLimit")
    private Integer missileLimit;
    @JsonProperty("AlienWaveSize")
    @SerializedName("AlienWaveSize")
    private Integer alienWaveSize;
    @JsonProperty("AlienFactory")
    @SerializedName("AlienFactory")
    private Object alienFactory;
    @JsonProperty("MissileController")
    @SerializedName("MissileController")
    private Object missileController;
    @JsonProperty("AlienManager")
    @SerializedName("AlienManager")
    private za.co.entelect.challenge.dto.AlienManager alienManager;
    @JsonIgnore
    private java.util.Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The PlayerNumberReal
     */
    @JsonProperty("PlayerNumberReal")
    public Integer getPlayerNumberReal() {
        return playerNumberReal;
    }

    /**
     *
     * @param PlayerNumberReal
     * The PlayerNumberReal
     */
    @JsonProperty("PlayerNumberReal")
    public void setPlayerNumberReal(Integer playerNumberReal) {
        this.playerNumberReal = playerNumberReal;
    }

    /**
     *
     * @return
     * The PlayerNumber
     */
    @JsonProperty("PlayerNumber")
    public Integer getPlayerNumber() {
        return playerNumber;
    }

    /**
     *
     * @param PlayerNumber
     * The PlayerNumber
     */
    @JsonProperty("PlayerNumber")
    public void setPlayerNumber(Integer playerNumber) {
        this.playerNumber = playerNumber;
    }

    /**
     *
     * @return
     * The PlayerName
     */
    @JsonProperty("PlayerName")
    public String getPlayerName() {
        return playerName;
    }

    /**
     *
     * @param PlayerName
     * The PlayerName
     */
    @JsonProperty("PlayerName")
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    /**
     *
     * @return
     * The Ship
     */
    @JsonProperty("Ship")
    public Ship getShip() {
        return ship;
    }

    /**
     *
     * @param Ship
     * The Ship
     */
    @JsonProperty("Ship")
    public void setShip(Ship ship) {
        this.ship = ship;
    }

    /**
     *
     * @return
     * The Kills
     */
    @JsonProperty("Kills")
    public Integer getKills() {
        return kills;
    }

    /**
     *
     * @param Kills
     * The Kills
     */
    @JsonProperty("Kills")
    public void setKills(Integer kills) {
        this.kills = kills;
    }

    /**
     *
     * @return
     * The Lives
     */
    @JsonProperty("Lives")
    public Integer getLives() {
        return lives;
    }

    /**
     *
     * @param Lives
     * The Lives
     */
    @JsonProperty("Lives")
    public void setLives(Integer lives) {
        this.lives = lives;
    }

    /**
     *
     * @return
     * The RespawnTimer
     */
    @JsonProperty("RespawnTimer")
    public Integer getRespawnTimer() {
        return respawnTimer;
    }

    /**
     *
     * @param RespawnTimer
     * The RespawnTimer
     */
    @JsonProperty("RespawnTimer")
    public void setRespawnTimer(Integer respawnTimer) {
        this.respawnTimer = respawnTimer;
    }

    /**
     *
     * @return
     * The Missiles
     */
    @JsonProperty("Missiles")
    public List<Object> getMissiles() {
        return missiles;
    }

    /**
     *
     * @param Missiles
     * The Missiles
     */
    @JsonProperty("Missiles")
    public void setMissiles(List<Object> missiles) {
        this.missiles = missiles;
    }

    /**
     *
     * @return
     * The MissileLimit
     */
    @JsonProperty("MissileLimit")
    public Integer getMissileLimit() {
        return missileLimit;
    }

    /**
     *
     * @param MissileLimit
     * The MissileLimit
     */
    @JsonProperty("MissileLimit")
    public void setMissileLimit(Integer missileLimit) {
        this.missileLimit = missileLimit;
    }

    /**
     *
     * @return
     * The AlienWaveSize
     */
    @JsonProperty("AlienWaveSize")
    public Integer getAlienWaveSize() {
        return alienWaveSize;
    }

    /**
     *
     * @param AlienWaveSize
     * The AlienWaveSize
     */
    @JsonProperty("AlienWaveSize")
    public void setAlienWaveSize(Integer alienWaveSize) {
        this.alienWaveSize = alienWaveSize;
    }

    /**
     *
     * @return
     * The AlienFactory
     */
    @JsonProperty("AlienFactory")
    public Object getAlienFactory() {
        return alienFactory;
    }

    /**
     *
     * @param AlienFactory
     * The AlienFactory
     */
    @JsonProperty("AlienFactory")
    public void setAlienFactory(Object alienFactory) {
        this.alienFactory = alienFactory;
    }

    /**
     *
     * @return
     * The MissileController
     */
    @JsonProperty("MissileController")
    public Object getMissileController() {
        return missileController;
    }

    /**
     *
     * @param MissileController
     * The MissileController
     */
    @JsonProperty("MissileController")
    public void setMissileController(Object missileController) {
        this.missileController = missileController;
    }

    /**
     *
     * @return
     * The AlienManager
     */
    @JsonProperty("AlienManager")
    public AlienManager getAlienManager() {
        return alienManager;
    }

    /**
     *
     * @param AlienManager
     * The AlienManager
     */
    @JsonProperty("AlienManager")
    public void setAlienManager(AlienManager alienManager) {
        this.alienManager = alienManager;
    }

    @JsonAnyGetter
    public java.util.Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}
