package za.co.entelect.challenge.dto;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.google.gson.annotations.SerializedName;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "Command", "CommandFeedback", "Id", "Alive", "X", "Y",
		"Width", "Height", "Type", "PlayerNumber" })
public class Ship {
	@JsonProperty("Command")
    @SerializedName("Command")
	private String command;
	
	@JsonProperty("CommandFeedback")
    @SerializedName("CommandFeedback")
	private String commandFeedback;
	
	@JsonProperty("Id")
    @SerializedName("Id")
	private Integer id;
	
	public String getCommand() {
		return command;
	}

	public void setCommand(String command) {
		this.command = command;
	}

	public String getCommandFeedback() {
		return commandFeedback;
	}

	public void setCommandFeedback(String commandFeedback) {
		this.commandFeedback = commandFeedback;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean getAlive() {
		return alive;
	}

	public void setAlive(Boolean alive) {
		this.alive = alive;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getPlayerNumber() {
		return playerNumber;
	}

	public void setPlayerNumber(Integer playerNumber) {
		this.playerNumber = playerNumber;
	}

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
	
	

	public Integer getY() {
		return y;
	}

	public Integer getX() {
		return x;
	}

	public void setX(Integer x) {
		this.x = x;
	}

	public void setY(Integer y) {
		this.y = y;
	}

}
