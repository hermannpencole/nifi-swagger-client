/*
 * NiFi Rest Api
 * The Rest Api provides programmatic access to command and control a NiFi instance in real time. Start and                                              stop processors, monitor queues, query provenance data, and more. Each endpoint below includes a description,                                             definitions of the expected input and output, potential response codes, and the authorizations required                                             to invoke each service.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: dev@nifi.apache.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.github.hermannpencole.nifi.swagger.client.model;

import java.util.Objects;
import com.github.hermannpencole.nifi.swagger.client.model.ControllerServiceReferencingComponentEntity;
import com.github.hermannpencole.nifi.swagger.client.model.PositionDTO;
import com.github.hermannpencole.nifi.swagger.client.model.PropertyDescriptorDTO;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ControllerServiceDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-30T10:58:58.550+02:00")
public class ControllerServiceDTO {
  @SerializedName("id")
  private String id = null;

  @SerializedName("parentGroupId")
  private String parentGroupId = null;

  @SerializedName("position")
  private PositionDTO position = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("comments")
  private String comments = null;

  /**
   * The state of the controller service.
   */
  public enum StateEnum {
    @SerializedName("ENABLED")
    ENABLED("ENABLED"),
    
    @SerializedName("ENABLING")
    ENABLING("ENABLING"),
    
    @SerializedName("DISABLED")
    DISABLED("DISABLED"),
    
    @SerializedName("DISABLING")
    DISABLING("DISABLING");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("state")
  private StateEnum state = null;

  @SerializedName("persistsState")
  private Boolean persistsState = null;

  @SerializedName("properties")
  private Map<String, String> properties = new HashMap<String, String>();

  @SerializedName("descriptors")
  private Map<String, PropertyDescriptorDTO> descriptors = new HashMap<String, PropertyDescriptorDTO>();

  @SerializedName("customUiUrl")
  private String customUiUrl = null;

  @SerializedName("annotationData")
  private String annotationData = null;

  @SerializedName("referencingComponents")
  private List<ControllerServiceReferencingComponentEntity> referencingComponents = new ArrayList<ControllerServiceReferencingComponentEntity>();

  @SerializedName("validationErrors")
  private List<String> validationErrors = new ArrayList<String>();

  public ControllerServiceDTO id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the component.
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "The id of the component.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ControllerServiceDTO parentGroupId(String parentGroupId) {
    this.parentGroupId = parentGroupId;
    return this;
  }

   /**
   * The id of parent process group of this component if applicable.
   * @return parentGroupId
  **/
  @ApiModelProperty(example = "null", value = "The id of parent process group of this component if applicable.")
  public String getParentGroupId() {
    return parentGroupId;
  }

  public void setParentGroupId(String parentGroupId) {
    this.parentGroupId = parentGroupId;
  }

  public ControllerServiceDTO position(PositionDTO position) {
    this.position = position;
    return this;
  }

   /**
   * The position of this component in the UI if applicable.
   * @return position
  **/
  @ApiModelProperty(example = "null", value = "The position of this component in the UI if applicable.")
  public PositionDTO getPosition() {
    return position;
  }

  public void setPosition(PositionDTO position) {
    this.position = position;
  }

  public ControllerServiceDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the controller service.
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "The name of the controller service.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ControllerServiceDTO type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the controller service.
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "The type of the controller service.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ControllerServiceDTO comments(String comments) {
    this.comments = comments;
    return this;
  }

   /**
   * The comments for the controller service.
   * @return comments
  **/
  @ApiModelProperty(example = "null", value = "The comments for the controller service.")
  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }

  public ControllerServiceDTO state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * The state of the controller service.
   * @return state
  **/
  @ApiModelProperty(example = "null", value = "The state of the controller service.")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public ControllerServiceDTO persistsState(Boolean persistsState) {
    this.persistsState = persistsState;
    return this;
  }

   /**
   * Whether the controller service persists state.
   * @return persistsState
  **/
  @ApiModelProperty(example = "null", value = "Whether the controller service persists state.")
  public Boolean getPersistsState() {
    return persistsState;
  }

  public void setPersistsState(Boolean persistsState) {
    this.persistsState = persistsState;
  }

  public ControllerServiceDTO properties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }

  public ControllerServiceDTO putPropertiesItem(String key, String propertiesItem) {
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * The properties of the controller service.
   * @return properties
  **/
  @ApiModelProperty(example = "null", value = "The properties of the controller service.")
  public Map<String, String> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, String> properties) {
    this.properties = properties;
  }

  public ControllerServiceDTO descriptors(Map<String, PropertyDescriptorDTO> descriptors) {
    this.descriptors = descriptors;
    return this;
  }

  public ControllerServiceDTO putDescriptorsItem(String key, PropertyDescriptorDTO descriptorsItem) {
    this.descriptors.put(key, descriptorsItem);
    return this;
  }

   /**
   * The descriptors for the controller service properties.
   * @return descriptors
  **/
  @ApiModelProperty(example = "null", value = "The descriptors for the controller service properties.")
  public Map<String, PropertyDescriptorDTO> getDescriptors() {
    return descriptors;
  }

  public void setDescriptors(Map<String, PropertyDescriptorDTO> descriptors) {
    this.descriptors = descriptors;
  }

  public ControllerServiceDTO customUiUrl(String customUiUrl) {
    this.customUiUrl = customUiUrl;
    return this;
  }

   /**
   * The URL for the controller services custom configuration UI if applicable.
   * @return customUiUrl
  **/
  @ApiModelProperty(example = "null", value = "The URL for the controller services custom configuration UI if applicable.")
  public String getCustomUiUrl() {
    return customUiUrl;
  }

  public void setCustomUiUrl(String customUiUrl) {
    this.customUiUrl = customUiUrl;
  }

  public ControllerServiceDTO annotationData(String annotationData) {
    this.annotationData = annotationData;
    return this;
  }

   /**
   * The annontation for the controller service. This is how the custom UI relays configuration to the controller service.
   * @return annotationData
  **/
  @ApiModelProperty(example = "null", value = "The annontation for the controller service. This is how the custom UI relays configuration to the controller service.")
  public String getAnnotationData() {
    return annotationData;
  }

  public void setAnnotationData(String annotationData) {
    this.annotationData = annotationData;
  }

  public ControllerServiceDTO referencingComponents(List<ControllerServiceReferencingComponentEntity> referencingComponents) {
    this.referencingComponents = referencingComponents;
    return this;
  }

  public ControllerServiceDTO addReferencingComponentsItem(ControllerServiceReferencingComponentEntity referencingComponentsItem) {
    this.referencingComponents.add(referencingComponentsItem);
    return this;
  }

   /**
   * All components referencing this controller service.
   * @return referencingComponents
  **/
  @ApiModelProperty(example = "null", value = "All components referencing this controller service.")
  public List<ControllerServiceReferencingComponentEntity> getReferencingComponents() {
    return referencingComponents;
  }

  public void setReferencingComponents(List<ControllerServiceReferencingComponentEntity> referencingComponents) {
    this.referencingComponents = referencingComponents;
  }

  public ControllerServiceDTO validationErrors(List<String> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }

  public ControllerServiceDTO addValidationErrorsItem(String validationErrorsItem) {
    this.validationErrors.add(validationErrorsItem);
    return this;
  }

   /**
   * The validation errors from the controller service. These validation errors represent the problems with the controller service that must be resolved before it can be enabled.
   * @return validationErrors
  **/
  @ApiModelProperty(example = "null", value = "The validation errors from the controller service. These validation errors represent the problems with the controller service that must be resolved before it can be enabled.")
  public List<String> getValidationErrors() {
    return validationErrors;
  }

  public void setValidationErrors(List<String> validationErrors) {
    this.validationErrors = validationErrors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ControllerServiceDTO controllerServiceDTO = (ControllerServiceDTO) o;
    return Objects.equals(this.id, controllerServiceDTO.id) &&
        Objects.equals(this.parentGroupId, controllerServiceDTO.parentGroupId) &&
        Objects.equals(this.position, controllerServiceDTO.position) &&
        Objects.equals(this.name, controllerServiceDTO.name) &&
        Objects.equals(this.type, controllerServiceDTO.type) &&
        Objects.equals(this.comments, controllerServiceDTO.comments) &&
        Objects.equals(this.state, controllerServiceDTO.state) &&
        Objects.equals(this.persistsState, controllerServiceDTO.persistsState) &&
        Objects.equals(this.properties, controllerServiceDTO.properties) &&
        Objects.equals(this.descriptors, controllerServiceDTO.descriptors) &&
        Objects.equals(this.customUiUrl, controllerServiceDTO.customUiUrl) &&
        Objects.equals(this.annotationData, controllerServiceDTO.annotationData) &&
        Objects.equals(this.referencingComponents, controllerServiceDTO.referencingComponents) &&
        Objects.equals(this.validationErrors, controllerServiceDTO.validationErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, parentGroupId, position, name, type, comments, state, persistsState, properties, descriptors, customUiUrl, annotationData, referencingComponents, validationErrors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ControllerServiceDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parentGroupId: ").append(toIndentedString(parentGroupId)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    persistsState: ").append(toIndentedString(persistsState)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    descriptors: ").append(toIndentedString(descriptors)).append("\n");
    sb.append("    customUiUrl: ").append(toIndentedString(customUiUrl)).append("\n");
    sb.append("    annotationData: ").append(toIndentedString(annotationData)).append("\n");
    sb.append("    referencingComponents: ").append(toIndentedString(referencingComponents)).append("\n");
    sb.append("    validationErrors: ").append(toIndentedString(validationErrors)).append("\n");
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

