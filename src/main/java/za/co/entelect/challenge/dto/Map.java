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
        "Width",
        "Height",
        "Rows"
})
public class Map {

    @JsonProperty("Width")
    @SerializedName("Width")
    private Integer width;
    @JsonProperty("Height")
    @SerializedName("Height")
    private Integer height;
    @JsonProperty("Rows")
    @SerializedName("Rows")
    private List<List<Row>> rows = new ArrayList<List<Row>>();
    @JsonIgnore
    private java.util.Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
     * The Rows
     */
    @JsonProperty("Rows")
    public List<List<Row>> getRows() {
        return rows;
    }

    /**
     *
     * @param Rows
     * The Rows
     */
    @JsonProperty("Rows")
    public void setRows(List<List<Row>> rows) {
        this.rows = rows;
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
