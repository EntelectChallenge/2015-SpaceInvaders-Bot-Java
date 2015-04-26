package za.co.entelect.challenge.dto;

import com.fasterxml.jackson.annotation.*;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "PlayerNumber",
        "Disabled",
        "Waves",
        "ShotEnergyCost",
        "ShotEnergy",
        "DeltaX"
})
public class AlienManager {

    @JsonProperty("PlayerNumber")
    @SerializedName("PlayerNumber")
    private Integer playerNumber;
    @JsonProperty("Disabled")
    @SerializedName("Disabled")
    private Boolean disabled;
    @JsonProperty("Waves")
    @SerializedName("Waves")
    private List<List<Wave>> waves = new ArrayList<List<Wave>>();
    @JsonProperty("ShotEnergyCost")
    @SerializedName("ShotEnergyCost")
    private Integer shotEnergyCost;
    @JsonProperty("ShotEnergy")
    @SerializedName("ShotEnergy")
    private Integer shotEnergy;
    @JsonProperty("DeltaX")
    @SerializedName("DeltaX")
    private Integer deltaX;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
     * The Disabled
     */
    @JsonProperty("Disabled")
    public Boolean getDisabled() {
        return disabled;
    }

    /**
     *
     * @param Disabled
     * The Disabled
     */
    @JsonProperty("Disabled")
    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    /**
     *
     * @return
     * The Waves
     */
    @JsonProperty("Waves")
    public List<List<Wave>> getWaves() {
        return waves;
    }

    /**
     *
     * @param Waves
     * The Waves
     */
    @JsonProperty("Waves")
    public void setWaves(List<List<Wave>> waves) {
        this.waves = waves;
    }

    /**
     *
     * @return
     * The ShotEnergyCost
     */
    @JsonProperty("ShotEnergyCost")
    public Integer getShotEnergyCost() {
        return shotEnergyCost;
    }

    /**
     *
     * @param ShotEnergyCost
     * The ShotEnergyCost
     */
    @JsonProperty("ShotEnergyCost")
    public void setShotEnergyCost(Integer shotEnergyCost) {
        this.shotEnergyCost = shotEnergyCost;
    }

    /**
     *
     * @return
     * The ShotEnergy
     */
    @JsonProperty("ShotEnergy")
    public Integer getShotEnergy() {
        return shotEnergy;
    }

    /**
     *
     * @param ShotEnergy
     * The ShotEnergy
     */
    @JsonProperty("ShotEnergy")
    public void setShotEnergy(Integer shotEnergy) {
        this.shotEnergy = shotEnergy;
    }

    /**
     *
     * @return
     * The DeltaX
     */
    @JsonProperty("DeltaX")
    public Integer getDeltaX() {
        return deltaX;
    }

    /**
     *
     * @param DeltaX
     * The DeltaX
     */
    @JsonProperty("DeltaX")
    public void setDeltaX(Integer deltaX) {
        this.deltaX = deltaX;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
