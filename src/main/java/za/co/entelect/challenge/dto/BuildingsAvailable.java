package za.co.entelect.challenge.dto;

import com.fasterxml.jackson.annotation.*;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

import java.util.HashMap;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "Command",
        "Type",
        "Cost"
})
public class BuildingsAvailable {

    @JsonProperty("Command")
    @SerializedName("Command")
    private String command;
    @JsonProperty("Type")
    @SerializedName("Type")
    private String type;
    @JsonProperty("Cost")
    @SerializedName("Cost")
    private Integer cost;
    @JsonIgnore
    private java.util.Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The Command
     */
    @JsonProperty("Command")
    public String getCommand() {
        return command;
    }

    /**
     *
     * @param Command
     * The Command
     */
    @JsonProperty("Command")
    public void setCommand(String command) {
        this.command = command;
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
     * The Cost
     */
    @JsonProperty("Cost")
    public Integer getCost() {
        return cost;
    }

    /**
     *
     * @param Cost
     * The Cost
     */
    @JsonProperty("Cost")
    public void setCost(Integer cost) {
        this.cost = cost;
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
