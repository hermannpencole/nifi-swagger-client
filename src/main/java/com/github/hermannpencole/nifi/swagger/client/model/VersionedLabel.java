/*
 * NiFi Rest Api
 * The Rest Api provides programmatic access to command and control a NiFi instance in real time. Start and                                              stop processors, monitor queues, query provenance data, and more. Each endpoint below includes a description,                                             definitions of the expected input and output, potential response codes, and the authorizations required                                             to invoke each service.
 *
 * OpenAPI spec version: 1.5.0
 * Contact: dev@nifi.apache.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.github.hermannpencole.nifi.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.github.hermannpencole.nifi.swagger.client.model.ThePositionOfAComponentOnTheGraph;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * VersionedLabel
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-03T16:29:45.931+01:00")
public class VersionedLabel {
  @SerializedName("identifier")
  private String identifier = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("comments")
  private String comments = null;

  @SerializedName("position")
  private ThePositionOfAComponentOnTheGraph position = null;

  @SerializedName("label")
  private String label = null;

  @SerializedName("width")
  private Double width = null;

  @SerializedName("height")
  private Double height = null;

  @SerializedName("style")
  private Map<String, String> style = null;

  /**
   * Gets or Sets componentType
   */
  @JsonAdapter(ComponentTypeEnum.Adapter.class)
  public enum ComponentTypeEnum {
    CONNECTION("CONNECTION"),
    
    PROCESSOR("PROCESSOR"),
    
    PROCESS_GROUP("PROCESS_GROUP"),
    
    REMOTE_PROCESS_GROUP("REMOTE_PROCESS_GROUP"),
    
    INPUT_PORT("INPUT_PORT"),
    
    OUTPUT_PORT("OUTPUT_PORT"),
    
    REMOTE_INPUT_PORT("REMOTE_INPUT_PORT"),
    
    REMOTE_OUTPUT_PORT("REMOTE_OUTPUT_PORT"),
    
    FUNNEL("FUNNEL"),
    
    LABEL("LABEL"),
    
    CONTROLLER_SERVICE("CONTROLLER_SERVICE");

    private String value;

    ComponentTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ComponentTypeEnum fromValue(String text) {
      for (ComponentTypeEnum b : ComponentTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ComponentTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ComponentTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ComponentTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ComponentTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("componentType")
  private ComponentTypeEnum componentType = null;

  @SerializedName("groupIdentifier")
  private String groupIdentifier = null;

  public VersionedLabel identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

   /**
   * The component&#39;s unique identifier
   * @return identifier
  **/
  @ApiModelProperty(value = "The component's unique identifier")
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public VersionedLabel name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The component&#39;s name
   * @return name
  **/
  @ApiModelProperty(value = "The component's name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public VersionedLabel comments(String comments) {
    this.comments = comments;
    return this;
  }

   /**
   * The user-supplied comments for the component
   * @return comments
  **/
  @ApiModelProperty(value = "The user-supplied comments for the component")
  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }

  public VersionedLabel position(ThePositionOfAComponentOnTheGraph position) {
    this.position = position;
    return this;
  }

   /**
   * The component&#39;s position on the graph
   * @return position
  **/
  @ApiModelProperty(value = "The component's position on the graph")
  public ThePositionOfAComponentOnTheGraph getPosition() {
    return position;
  }

  public void setPosition(ThePositionOfAComponentOnTheGraph position) {
    this.position = position;
  }

  public VersionedLabel label(String label) {
    this.label = label;
    return this;
  }

   /**
   * The text that appears in the label.
   * @return label
  **/
  @ApiModelProperty(value = "The text that appears in the label.")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public VersionedLabel width(Double width) {
    this.width = width;
    return this;
  }

   /**
   * The width of the label in pixels when at a 1:1 scale.
   * @return width
  **/
  @ApiModelProperty(value = "The width of the label in pixels when at a 1:1 scale.")
  public Double getWidth() {
    return width;
  }

  public void setWidth(Double width) {
    this.width = width;
  }

  public VersionedLabel height(Double height) {
    this.height = height;
    return this;
  }

   /**
   * The height of the label in pixels when at a 1:1 scale.
   * @return height
  **/
  @ApiModelProperty(value = "The height of the label in pixels when at a 1:1 scale.")
  public Double getHeight() {
    return height;
  }

  public void setHeight(Double height) {
    this.height = height;
  }

  public VersionedLabel style(Map<String, String> style) {
    this.style = style;
    return this;
  }

  public VersionedLabel putStyleItem(String key, String styleItem) {
    if (this.style == null) {
      this.style = new HashMap<String, String>();
    }
    this.style.put(key, styleItem);
    return this;
  }

   /**
   * The styles for this label (font-size : 12px, background-color : #eee, etc).
   * @return style
  **/
  @ApiModelProperty(value = "The styles for this label (font-size : 12px, background-color : #eee, etc).")
  public Map<String, String> getStyle() {
    return style;
  }

  public void setStyle(Map<String, String> style) {
    this.style = style;
  }

  public VersionedLabel componentType(ComponentTypeEnum componentType) {
    this.componentType = componentType;
    return this;
  }

   /**
   * Get componentType
   * @return componentType
  **/
  @ApiModelProperty(value = "")
  public ComponentTypeEnum getComponentType() {
    return componentType;
  }

  public void setComponentType(ComponentTypeEnum componentType) {
    this.componentType = componentType;
  }

  public VersionedLabel groupIdentifier(String groupIdentifier) {
    this.groupIdentifier = groupIdentifier;
    return this;
  }

   /**
   * The ID of the Process Group that this component belongs to
   * @return groupIdentifier
  **/
  @ApiModelProperty(value = "The ID of the Process Group that this component belongs to")
  public String getGroupIdentifier() {
    return groupIdentifier;
  }

  public void setGroupIdentifier(String groupIdentifier) {
    this.groupIdentifier = groupIdentifier;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionedLabel versionedLabel = (VersionedLabel) o;
    return Objects.equals(this.identifier, versionedLabel.identifier) &&
        Objects.equals(this.name, versionedLabel.name) &&
        Objects.equals(this.comments, versionedLabel.comments) &&
        Objects.equals(this.position, versionedLabel.position) &&
        Objects.equals(this.label, versionedLabel.label) &&
        Objects.equals(this.width, versionedLabel.width) &&
        Objects.equals(this.height, versionedLabel.height) &&
        Objects.equals(this.style, versionedLabel.style) &&
        Objects.equals(this.componentType, versionedLabel.componentType) &&
        Objects.equals(this.groupIdentifier, versionedLabel.groupIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier, name, comments, position, label, width, height, style, componentType, groupIdentifier);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionedLabel {\n");
    
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
    sb.append("    componentType: ").append(toIndentedString(componentType)).append("\n");
    sb.append("    groupIdentifier: ").append(toIndentedString(groupIdentifier)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

