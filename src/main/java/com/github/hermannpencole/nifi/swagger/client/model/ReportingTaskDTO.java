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
import com.github.hermannpencole.nifi.swagger.MapTypeAdapterFactory;
import java.util.Arrays;
import com.github.hermannpencole.nifi.swagger.client.model.BundleDTO;
import com.github.hermannpencole.nifi.swagger.client.model.PositionDTO;
import com.github.hermannpencole.nifi.swagger.client.model.PropertyDescriptorDTO;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ReportingTaskDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-03T16:29:45.931+01:00")
public class ReportingTaskDTO {
  @SerializedName("id")
  private String id = null;

  @SerializedName("versionedComponentId")
  private String versionedComponentId = null;

  @SerializedName("parentGroupId")
  private String parentGroupId = null;

  @SerializedName("position")
  private PositionDTO position = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("bundle")
  private BundleDTO bundle = null;

  /**
   * The state of the reporting task.
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    RUNNING("RUNNING"),
    
    STOPPED("STOPPED"),
    
    DISABLED("DISABLED");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StateEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("state")
  private StateEnum state = null;

  @SerializedName("comments")
  private String comments = null;

  @SerializedName("persistsState")
  private Boolean persistsState = null;

  @SerializedName("restricted")
  private Boolean restricted = null;

  @SerializedName("deprecated")
  private Boolean deprecated = null;

  @SerializedName("multipleVersionsAvailable")
  private Boolean multipleVersionsAvailable = null;

  @SerializedName("schedulingPeriod")
  private String schedulingPeriod = null;

  @SerializedName("schedulingStrategy")
  private String schedulingStrategy = null;

  @SerializedName("defaultSchedulingPeriod")
  private Map<String, String> defaultSchedulingPeriod = null;

  @SerializedName("properties")
  @JsonAdapter(MapTypeAdapterFactory.class)
  private Map<String, String> properties = null;

  @SerializedName("descriptors")
  private Map<String, PropertyDescriptorDTO> descriptors = null;

  @SerializedName("customUiUrl")
  private String customUiUrl = null;

  @SerializedName("annotationData")
  private String annotationData = null;

  @SerializedName("validationErrors")
  private List<String> validationErrors = null;

  @SerializedName("activeThreadCount")
  private Integer activeThreadCount = null;

  @SerializedName("extensionMissing")
  private Boolean extensionMissing = null;

  public ReportingTaskDTO id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the component.
   * @return id
  **/
  @ApiModelProperty(value = "The id of the component.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ReportingTaskDTO versionedComponentId(String versionedComponentId) {
    this.versionedComponentId = versionedComponentId;
    return this;
  }

   /**
   * The ID of the corresponding component that is under version control
   * @return versionedComponentId
  **/
  @ApiModelProperty(value = "The ID of the corresponding component that is under version control")
  public String getVersionedComponentId() {
    return versionedComponentId;
  }

  public void setVersionedComponentId(String versionedComponentId) {
    this.versionedComponentId = versionedComponentId;
  }

  public ReportingTaskDTO parentGroupId(String parentGroupId) {
    this.parentGroupId = parentGroupId;
    return this;
  }

   /**
   * The id of parent process group of this component if applicable.
   * @return parentGroupId
  **/
  @ApiModelProperty(value = "The id of parent process group of this component if applicable.")
  public String getParentGroupId() {
    return parentGroupId;
  }

  public void setParentGroupId(String parentGroupId) {
    this.parentGroupId = parentGroupId;
  }

  public ReportingTaskDTO position(PositionDTO position) {
    this.position = position;
    return this;
  }

   /**
   * The position of this component in the UI if applicable.
   * @return position
  **/
  @ApiModelProperty(value = "The position of this component in the UI if applicable.")
  public PositionDTO getPosition() {
    return position;
  }

  public void setPosition(PositionDTO position) {
    this.position = position;
  }

  public ReportingTaskDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the reporting task.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the reporting task.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ReportingTaskDTO type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The fully qualified type of the reporting task.
   * @return type
  **/
  @ApiModelProperty(value = "The fully qualified type of the reporting task.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ReportingTaskDTO bundle(BundleDTO bundle) {
    this.bundle = bundle;
    return this;
  }

   /**
   * The details of the artifact that bundled this processor type.
   * @return bundle
  **/
  @ApiModelProperty(value = "The details of the artifact that bundled this processor type.")
  public BundleDTO getBundle() {
    return bundle;
  }

  public void setBundle(BundleDTO bundle) {
    this.bundle = bundle;
  }

  public ReportingTaskDTO state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * The state of the reporting task.
   * @return state
  **/
  @ApiModelProperty(value = "The state of the reporting task.")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public ReportingTaskDTO comments(String comments) {
    this.comments = comments;
    return this;
  }

   /**
   * The comments of the reporting task.
   * @return comments
  **/
  @ApiModelProperty(value = "The comments of the reporting task.")
  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }

  public ReportingTaskDTO persistsState(Boolean persistsState) {
    this.persistsState = persistsState;
    return this;
  }

   /**
   * Whether the reporting task persists state.
   * @return persistsState
  **/
  @ApiModelProperty(value = "Whether the reporting task persists state.")
  public Boolean isPersistsState() {
    return persistsState;
  }

  public void setPersistsState(Boolean persistsState) {
    this.persistsState = persistsState;
  }

  public ReportingTaskDTO restricted(Boolean restricted) {
    this.restricted = restricted;
    return this;
  }

   /**
   * Whether the reporting task requires elevated privileges.
   * @return restricted
  **/
  @ApiModelProperty(value = "Whether the reporting task requires elevated privileges.")
  public Boolean isRestricted() {
    return restricted;
  }

  public void setRestricted(Boolean restricted) {
    this.restricted = restricted;
  }

  public ReportingTaskDTO deprecated(Boolean deprecated) {
    this.deprecated = deprecated;
    return this;
  }

   /**
   * Whether the reporting task has been deprecated.
   * @return deprecated
  **/
  @ApiModelProperty(value = "Whether the reporting task has been deprecated.")
  public Boolean isDeprecated() {
    return deprecated;
  }

  public void setDeprecated(Boolean deprecated) {
    this.deprecated = deprecated;
  }

  public ReportingTaskDTO multipleVersionsAvailable(Boolean multipleVersionsAvailable) {
    this.multipleVersionsAvailable = multipleVersionsAvailable;
    return this;
  }

   /**
   * Whether the reporting task has multiple versions available.
   * @return multipleVersionsAvailable
  **/
  @ApiModelProperty(value = "Whether the reporting task has multiple versions available.")
  public Boolean isMultipleVersionsAvailable() {
    return multipleVersionsAvailable;
  }

  public void setMultipleVersionsAvailable(Boolean multipleVersionsAvailable) {
    this.multipleVersionsAvailable = multipleVersionsAvailable;
  }

  public ReportingTaskDTO schedulingPeriod(String schedulingPeriod) {
    this.schedulingPeriod = schedulingPeriod;
    return this;
  }

   /**
   * The frequency with which to schedule the reporting task. The format of the value willd epend on the valud of the schedulingStrategy.
   * @return schedulingPeriod
  **/
  @ApiModelProperty(value = "The frequency with which to schedule the reporting task. The format of the value willd epend on the valud of the schedulingStrategy.")
  public String getSchedulingPeriod() {
    return schedulingPeriod;
  }

  public void setSchedulingPeriod(String schedulingPeriod) {
    this.schedulingPeriod = schedulingPeriod;
  }

  public ReportingTaskDTO schedulingStrategy(String schedulingStrategy) {
    this.schedulingStrategy = schedulingStrategy;
    return this;
  }

   /**
   * The scheduling strategy that determines how the schedulingPeriod value should be interpreted.
   * @return schedulingStrategy
  **/
  @ApiModelProperty(value = "The scheduling strategy that determines how the schedulingPeriod value should be interpreted.")
  public String getSchedulingStrategy() {
    return schedulingStrategy;
  }

  public void setSchedulingStrategy(String schedulingStrategy) {
    this.schedulingStrategy = schedulingStrategy;
  }

  public ReportingTaskDTO defaultSchedulingPeriod(Map<String, String> defaultSchedulingPeriod) {
    this.defaultSchedulingPeriod = defaultSchedulingPeriod;
    return this;
  }

  public ReportingTaskDTO putDefaultSchedulingPeriodItem(String key, String defaultSchedulingPeriodItem) {
    if (this.defaultSchedulingPeriod == null) {
      this.defaultSchedulingPeriod = new HashMap<String, String>();
    }
    this.defaultSchedulingPeriod.put(key, defaultSchedulingPeriodItem);
    return this;
  }

   /**
   * The default scheduling period for the different scheduling strategies.
   * @return defaultSchedulingPeriod
  **/
  @ApiModelProperty(value = "The default scheduling period for the different scheduling strategies.")
  public Map<String, String> getDefaultSchedulingPeriod() {
    return defaultSchedulingPeriod;
  }

  public void setDefaultSchedulingPeriod(Map<String, String> defaultSchedulingPeriod) {
    this.defaultSchedulingPeriod = defaultSchedulingPeriod;
  }

  public ReportingTaskDTO properties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }

  public ReportingTaskDTO putPropertiesItem(String key, String propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<String, String>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * The properties of the reporting task.
   * @return properties
  **/
  @ApiModelProperty(value = "The properties of the reporting task.")
  public Map<String, String> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, String> properties) {
    this.properties = properties;
  }

  public ReportingTaskDTO descriptors(Map<String, PropertyDescriptorDTO> descriptors) {
    this.descriptors = descriptors;
    return this;
  }

  public ReportingTaskDTO putDescriptorsItem(String key, PropertyDescriptorDTO descriptorsItem) {
    if (this.descriptors == null) {
      this.descriptors = new HashMap<String, PropertyDescriptorDTO>();
    }
    this.descriptors.put(key, descriptorsItem);
    return this;
  }

   /**
   * The descriptors for the reporting tasks properties.
   * @return descriptors
  **/
  @ApiModelProperty(value = "The descriptors for the reporting tasks properties.")
  public Map<String, PropertyDescriptorDTO> getDescriptors() {
    return descriptors;
  }

  public void setDescriptors(Map<String, PropertyDescriptorDTO> descriptors) {
    this.descriptors = descriptors;
  }

  public ReportingTaskDTO customUiUrl(String customUiUrl) {
    this.customUiUrl = customUiUrl;
    return this;
  }

   /**
   * The URL for the custom configuration UI for the reporting task.
   * @return customUiUrl
  **/
  @ApiModelProperty(value = "The URL for the custom configuration UI for the reporting task.")
  public String getCustomUiUrl() {
    return customUiUrl;
  }

  public void setCustomUiUrl(String customUiUrl) {
    this.customUiUrl = customUiUrl;
  }

  public ReportingTaskDTO annotationData(String annotationData) {
    this.annotationData = annotationData;
    return this;
  }

   /**
   * The annotation data for the repoting task. This is how the custom UI relays configuration to the reporting task.
   * @return annotationData
  **/
  @ApiModelProperty(value = "The annotation data for the repoting task. This is how the custom UI relays configuration to the reporting task.")
  public String getAnnotationData() {
    return annotationData;
  }

  public void setAnnotationData(String annotationData) {
    this.annotationData = annotationData;
  }

  public ReportingTaskDTO validationErrors(List<String> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }

  public ReportingTaskDTO addValidationErrorsItem(String validationErrorsItem) {
    if (this.validationErrors == null) {
      this.validationErrors = new ArrayList<String>();
    }
    this.validationErrors.add(validationErrorsItem);
    return this;
  }

   /**
   * Gets the validation errors from the reporting task. These validation errors represent the problems with the reporting task that must be resolved before it can be scheduled to run.
   * @return validationErrors
  **/
  @ApiModelProperty(value = "Gets the validation errors from the reporting task. These validation errors represent the problems with the reporting task that must be resolved before it can be scheduled to run.")
  public List<String> getValidationErrors() {
    return validationErrors;
  }

  public void setValidationErrors(List<String> validationErrors) {
    this.validationErrors = validationErrors;
  }

  public ReportingTaskDTO activeThreadCount(Integer activeThreadCount) {
    this.activeThreadCount = activeThreadCount;
    return this;
  }

   /**
   * The number of active threads for the reporting task.
   * @return activeThreadCount
  **/
  @ApiModelProperty(value = "The number of active threads for the reporting task.")
  public Integer getActiveThreadCount() {
    return activeThreadCount;
  }

  public void setActiveThreadCount(Integer activeThreadCount) {
    this.activeThreadCount = activeThreadCount;
  }

  public ReportingTaskDTO extensionMissing(Boolean extensionMissing) {
    this.extensionMissing = extensionMissing;
    return this;
  }

   /**
   * Whether the underlying extension is missing.
   * @return extensionMissing
  **/
  @ApiModelProperty(value = "Whether the underlying extension is missing.")
  public Boolean isExtensionMissing() {
    return extensionMissing;
  }

  public void setExtensionMissing(Boolean extensionMissing) {
    this.extensionMissing = extensionMissing;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportingTaskDTO reportingTaskDTO = (ReportingTaskDTO) o;
    return Objects.equals(this.id, reportingTaskDTO.id) &&
        Objects.equals(this.versionedComponentId, reportingTaskDTO.versionedComponentId) &&
        Objects.equals(this.parentGroupId, reportingTaskDTO.parentGroupId) &&
        Objects.equals(this.position, reportingTaskDTO.position) &&
        Objects.equals(this.name, reportingTaskDTO.name) &&
        Objects.equals(this.type, reportingTaskDTO.type) &&
        Objects.equals(this.bundle, reportingTaskDTO.bundle) &&
        Objects.equals(this.state, reportingTaskDTO.state) &&
        Objects.equals(this.comments, reportingTaskDTO.comments) &&
        Objects.equals(this.persistsState, reportingTaskDTO.persistsState) &&
        Objects.equals(this.restricted, reportingTaskDTO.restricted) &&
        Objects.equals(this.deprecated, reportingTaskDTO.deprecated) &&
        Objects.equals(this.multipleVersionsAvailable, reportingTaskDTO.multipleVersionsAvailable) &&
        Objects.equals(this.schedulingPeriod, reportingTaskDTO.schedulingPeriod) &&
        Objects.equals(this.schedulingStrategy, reportingTaskDTO.schedulingStrategy) &&
        Objects.equals(this.defaultSchedulingPeriod, reportingTaskDTO.defaultSchedulingPeriod) &&
        Objects.equals(this.properties, reportingTaskDTO.properties) &&
        Objects.equals(this.descriptors, reportingTaskDTO.descriptors) &&
        Objects.equals(this.customUiUrl, reportingTaskDTO.customUiUrl) &&
        Objects.equals(this.annotationData, reportingTaskDTO.annotationData) &&
        Objects.equals(this.validationErrors, reportingTaskDTO.validationErrors) &&
        Objects.equals(this.activeThreadCount, reportingTaskDTO.activeThreadCount) &&
        Objects.equals(this.extensionMissing, reportingTaskDTO.extensionMissing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, versionedComponentId, parentGroupId, position, name, type, bundle, state, comments, persistsState, restricted, deprecated, multipleVersionsAvailable, schedulingPeriod, schedulingStrategy, defaultSchedulingPeriod, properties, descriptors, customUiUrl, annotationData, validationErrors, activeThreadCount, extensionMissing);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportingTaskDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    versionedComponentId: ").append(toIndentedString(versionedComponentId)).append("\n");
    sb.append("    parentGroupId: ").append(toIndentedString(parentGroupId)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    bundle: ").append(toIndentedString(bundle)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    persistsState: ").append(toIndentedString(persistsState)).append("\n");
    sb.append("    restricted: ").append(toIndentedString(restricted)).append("\n");
    sb.append("    deprecated: ").append(toIndentedString(deprecated)).append("\n");
    sb.append("    multipleVersionsAvailable: ").append(toIndentedString(multipleVersionsAvailable)).append("\n");
    sb.append("    schedulingPeriod: ").append(toIndentedString(schedulingPeriod)).append("\n");
    sb.append("    schedulingStrategy: ").append(toIndentedString(schedulingStrategy)).append("\n");
    sb.append("    defaultSchedulingPeriod: ").append(toIndentedString(defaultSchedulingPeriod)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    descriptors: ").append(toIndentedString(descriptors)).append("\n");
    sb.append("    customUiUrl: ").append(toIndentedString(customUiUrl)).append("\n");
    sb.append("    annotationData: ").append(toIndentedString(annotationData)).append("\n");
    sb.append("    validationErrors: ").append(toIndentedString(validationErrors)).append("\n");
    sb.append("    activeThreadCount: ").append(toIndentedString(activeThreadCount)).append("\n");
    sb.append("    extensionMissing: ").append(toIndentedString(extensionMissing)).append("\n");
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

