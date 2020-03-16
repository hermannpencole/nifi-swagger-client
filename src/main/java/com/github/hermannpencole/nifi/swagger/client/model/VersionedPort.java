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

/**
 * VersionedPort
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-03T16:29:45.931+01:00")
public class VersionedPort {
  @SerializedName("identifier")
  private String identifier = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("comments")
  private String comments = null;

  @SerializedName("position")
  private ThePositionOfAComponentOnTheGraph position = null;

  /**
   * The type of port.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    INPUT_PORT("INPUT_PORT"),
    
    OUTPUT_PORT("OUTPUT_PORT");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("concurrentlySchedulableTaskCount")
  private Integer concurrentlySchedulableTaskCount = null;

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

  public VersionedPort identifier(String identifier) {
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

  public VersionedPort name(String name) {
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

  public VersionedPort comments(String comments) {
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

  public VersionedPort position(ThePositionOfAComponentOnTheGraph position) {
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

  public VersionedPort type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of port.
   * @return type
  **/
  @ApiModelProperty(value = "The type of port.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public VersionedPort concurrentlySchedulableTaskCount(Integer concurrentlySchedulableTaskCount) {
    this.concurrentlySchedulableTaskCount = concurrentlySchedulableTaskCount;
    return this;
  }

   /**
   * The number of tasks that should be concurrently scheduled for the port.
   * @return concurrentlySchedulableTaskCount
  **/
  @ApiModelProperty(value = "The number of tasks that should be concurrently scheduled for the port.")
  public Integer getConcurrentlySchedulableTaskCount() {
    return concurrentlySchedulableTaskCount;
  }

  public void setConcurrentlySchedulableTaskCount(Integer concurrentlySchedulableTaskCount) {
    this.concurrentlySchedulableTaskCount = concurrentlySchedulableTaskCount;
  }

  public VersionedPort componentType(ComponentTypeEnum componentType) {
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

  public VersionedPort groupIdentifier(String groupIdentifier) {
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
    VersionedPort versionedPort = (VersionedPort) o;
    return Objects.equals(this.identifier, versionedPort.identifier) &&
        Objects.equals(this.name, versionedPort.name) &&
        Objects.equals(this.comments, versionedPort.comments) &&
        Objects.equals(this.position, versionedPort.position) &&
        Objects.equals(this.type, versionedPort.type) &&
        Objects.equals(this.concurrentlySchedulableTaskCount, versionedPort.concurrentlySchedulableTaskCount) &&
        Objects.equals(this.componentType, versionedPort.componentType) &&
        Objects.equals(this.groupIdentifier, versionedPort.groupIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier, name, comments, position, type, concurrentlySchedulableTaskCount, componentType, groupIdentifier);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionedPort {\n");
    
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    concurrentlySchedulableTaskCount: ").append(toIndentedString(concurrentlySchedulableTaskCount)).append("\n");
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

