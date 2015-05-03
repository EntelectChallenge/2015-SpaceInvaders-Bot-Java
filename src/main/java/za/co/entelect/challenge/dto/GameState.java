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
        "BuildingsAvailable",
        "Map",
        "Players",
        "RoundNumber",
        "RoundLimit"
})
public class GameState {

    @JsonProperty("BuildingsAvailable")
    @SerializedName("BuildingsAvailable")
    private List<BuildingsAvailable> buildingsAvailable = new ArrayList<BuildingsAvailable>();
    @JsonProperty("Map")
    @SerializedName("Map")
    private Map map;
    @JsonProperty("Players")
    @SerializedName("Players")
    private List<Player> players = new ArrayList<Player>();
    @JsonProperty("RoundNumber")
    @SerializedName("RoundNumber")
    private Integer roundNumber;
    @JsonProperty("RoundLimit")
    @SerializedName("RoundLimit")
    private Integer roundLimit;
    @JsonIgnore
    private java.util.Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The BuildingsAvailable
     */
    @JsonProperty("BuildingsAvailable")
    public List<BuildingsAvailable> getBuildingsAvailable() {
        return buildingsAvailable;
    }

    /**
     *
     * @param BuildingsAvailable
     * The BuildingsAvailable
     */
    @JsonProperty("BuildingsAvailable")
    public void setBuildingsAvailable(List<BuildingsAvailable> buildingsAvailable) {
        this.buildingsAvailable = buildingsAvailable;
    }

    /**
     *
     * @return
     * The Map
     */
    @JsonProperty("Map")
    public Map getMap() {
        return map;
    }

    /**
     *
     * @param Map
     * The Map
     */
    @JsonProperty("Map")
    public void setMap(Map map) {
        this.map = map;
    }

    /**
     *
     * @return
     * The Players
     */
    @JsonProperty("Players")
    public List<Player> getPlayers() {
        return players;
    }

    /**
     *
     * @param Players
     * The Players
     */
    @JsonProperty("Players")
    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    /**
     *
     * @return
     * The RoundNumber
     */
    @JsonProperty("RoundNumber")
    public Integer getRoundNumber() {
        return roundNumber;
    }

    /**
     *
     * @param RoundNumber
     * The RoundNumber
     */
    @JsonProperty("RoundNumber")
    public void setRoundNumber(Integer roundNumber) {
        this.roundNumber = roundNumber;
    }

    /**
     *
     * @return
     * The RoundLimit
     */
    @JsonProperty("RoundLimit")
    public Integer getRoundLimit() {
        return roundLimit;
    }

    /**
     *
     * @param RoundLimit
     * The RoundLimit
     */
    @JsonProperty("RoundLimit")
    public void setRoundLimit(Integer roundLimit) {
        this.roundLimit = roundLimit;
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





