package za.co.entelect.challenge.dto;

import com.fasterxml.jackson.annotation.*;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

import java.util.HashMap;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "Id",
        "Alive",
        "x",
        "y",
        "Width",
        "Height",
        "Type",
        "PlayerNumber"
})
public class Row {

    @JsonProperty("Id")
    @SerializedName("Id")
    private Integer id;
    @JsonProperty("Alive")
    @SerializedName("Alive")
    private Boolean alive;
    @JsonProperty("X")
    @SerializedName("X")
    private Integer x;
    @JsonProperty("Y")
    @SerializedName("Y")
    private Integer y;
    @JsonProperty("Width")
    @SerializedName("Width")
    private Integer width;
    @JsonProperty("Height")
    @SerializedName("Height")
    private Integer height;
    @JsonProperty("Type")
    @SerializedName("Type")
    private String type;
    @JsonProperty("PlayerNumber")
    @SerializedName("PlayerNumber")
    private Integer playerNumber;
    @JsonIgnore
    private java.util.Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The Id
     */
    @JsonProperty("Id")
    public Integer getId() {
        return id;
    }

    /**
     *
     * @param Id
     * The Id
     */
    @JsonProperty("Id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *
     * @return
     * The Alive
     */
    @JsonProperty("Alive")
    public Boolean getAlive() {
        return alive;
    }

    /**
     *
     * @param Alive
     * The Alive
     */
    @JsonProperty("Alive")
    public void setAlive(Boolean alive) {
        this.alive = alive;
    }

    /**
     *
     * @return
     * The x
     */
    @JsonProperty("x")
    public Integer getX() {
        return x;
    }

    /**
     *
     * @param x
     * The x
     */
    @JsonProperty("x")
    public void setX(Integer x) {
        this.x = x;
    }

    /**
     *
     * @return
     * The y
     */
    @JsonProperty("y")
    public Integer getY() {
        return y;
    }

    /**
     *
     * @param y
     * The y
     */
    @JsonProperty("y")
    public void setY(Integer y) {
        this.y = y;
    }

    /**
     *
     * @return
     * The Width
     */
    @JsonProperty("Width")
    public Integer getWidth() {
        return width;
    }

    /**
     *
     * @param Width
     * The Width
     */
    @JsonProperty("Width")
    public void setWidth(Integer width) {
        this.width = width;
    }

    /**
     *
     * @return
     * The Height
     */
    @JsonProperty("Height")
    public Integer getHeight() {
        return height;
    }

    /**
     *
     * @param Height
     * The Height
     */
    @JsonProperty("Height")
    public void setHeight(Integer height) {
        this.height = height;
    }

    /**
     *
     * @return
     * The Type
     */
    @JsonProperty("Type")
    public String getType() {
        return type;
    }

    /**
     *
     * @param Type
     * The Type
     */
    @JsonProperty("Type")
    public void setType(String type) {
        this.type = type;
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

    @JsonAnyGetter
    public java.util.Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
