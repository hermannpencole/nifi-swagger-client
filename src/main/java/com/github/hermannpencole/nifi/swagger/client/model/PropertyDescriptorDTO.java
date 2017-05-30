/*
 * NiFi Rest Api
 * The Rest Api provides programmatic access to command and control a NiFi instance in real time. Start and                                              stop processors, monitor queues, query provenance data, and more. Each endpoint below includes a description,                                             definitions of the expected input and output, potential response codes, and the authorizations required                                             to invoke each service.
 *
 * OpenAPI spec version: 1.2.0
 * Contact: dev@nifi.apache.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.github.hermannpencole.nifi.swagger.client.model;

import java.util.Objects;
import com.github.hermannpencole.nifi.swagger.client.model.AllowableValueEntity;
import com.github.hermannpencole.nifi.swagger.client.model.BundleDTO;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * PropertyDescriptorDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-30T11:46:30.825+02:00")
public class PropertyDescriptorDTO {
  @SerializedName("name")
  private String name = null;

  @SerializedName("displayName")
  private String displayName = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("defaultValue")
  private String defaultValue = null;

  @SerializedName("allowableValues")
  private List<AllowableValueEntity> allowableValues = new ArrayList<AllowableValueEntity>();

  @SerializedName("required")
  private Boolean required = false;

  @SerializedName("sensitive")
  private Boolean sensitive = false;

  @SerializedName("dynamic")
  private Boolean dynamic = false;

  @SerializedName("supportsEl")
  private Boolean supportsEl = false;

  @SerializedName("identifiesControllerService")
  private String identifiesControllerService = null;

  @SerializedName("identifiesControllerServiceBundle")
  private BundleDTO identifiesControllerServiceBundle = null;

  public PropertyDescriptorDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name for the property.
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "The name for the property.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PropertyDescriptorDTO displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * The human readable name for the property.
   * @return displayName
  **/
  @ApiModelProperty(example = "null", value = "The human readable name for the property.")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public PropertyDescriptorDTO description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description for the property. Used to relay additional details to a user or provide a mechanism of documenting intent.
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "The description for the property. Used to relay additional details to a user or provide a mechanism of documenting intent.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PropertyDescriptorDTO defaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

   /**
   * The default value for the property.
   * @return defaultValue
  **/
  @ApiModelProperty(example = "null", value = "The default value for the property.")
  public String getDefaultValue() {
    return defaultValue;
  }

  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }

  public PropertyDescriptorDTO allowableValues(List<AllowableValueEntity> allowableValues) {
    this.allowableValues = allowableValues;
    return this;
  }

  public PropertyDescriptorDTO addAllowableValuesItem(AllowableValueEntity allowableValuesItem) {
    this.allowableValues.add(allowableValuesItem);
    return this;
  }

   /**
   * Allowable values for the property. If empty then the allowed values are not constrained.
   * @return allowableValues
  **/
  @ApiModelProperty(example = "null", value = "Allowable values for the property. If empty then the allowed values are not constrained.")
  public List<AllowableValueEntity> getAllowableValues() {
    return allowableValues;
  }

  public void setAllowableValues(List<AllowableValueEntity> allowableValues) {
    this.allowableValues = allowableValues;
  }

  public PropertyDescriptorDTO required(Boolean required) {
    this.required = required;
    return this;
  }

   /**
   * Whether the property is required.
   * @return required
  **/
  @ApiModelProperty(example = "null", value = "Whether the property is required.")
  public Boolean getRequired() {
    return required;
  }

  public void setRequired(Boolean required) {
    this.required = required;
  }

  public PropertyDescriptorDTO sensitive(Boolean sensitive) {
    this.sensitive = sensitive;
    return this;
  }

   /**
   * Whether the property is sensitive and protected whenever stored or represented.
   * @return sensitive
  **/
  @ApiModelProperty(example = "null", value = "Whether the property is sensitive and protected whenever stored or represented.")
  public Boolean getSensitive() {
    return sensitive;
  }

  public void setSensitive(Boolean sensitive) {
    this.sensitive = sensitive;
  }

  public PropertyDescriptorDTO dynamic(Boolean dynamic) {
    this.dynamic = dynamic;
    return this;
  }

   /**
   * Whether the property is dynamic (user-defined).
   * @return dynamic
  **/
  @ApiModelProperty(example = "null", value = "Whether the property is dynamic (user-defined).")
  public Boolean getDynamic() {
    return dynamic;
  }

  public void setDynamic(Boolean dynamic) {
    this.dynamic = dynamic;
  }

  public PropertyDescriptorDTO supportsEl(Boolean supportsEl) {
    this.supportsEl = supportsEl;
    return this;
  }

   /**
   * Whether the property supports expression language.
   * @return supportsEl
  **/
  @ApiModelProperty(example = "null", value = "Whether the property supports expression language.")
  public Boolean getSupportsEl() {
    return supportsEl;
  }

  public void setSupportsEl(Boolean supportsEl) {
    this.supportsEl = supportsEl;
  }

  public PropertyDescriptorDTO identifiesControllerService(String identifiesControllerService) {
    this.identifiesControllerService = identifiesControllerService;
    return this;
  }

   /**
   * If the property identifies a controller service this returns the fully qualified type.
   * @return identifiesControllerService
  **/
  @ApiModelProperty(example = "null", value = "If the property identifies a controller service this returns the fully qualified type.")
  public String getIdentifiesControllerService() {
    return identifiesControllerService;
  }

  public void setIdentifiesControllerService(String identifiesControllerService) {
    this.identifiesControllerService = identifiesControllerService;
  }

  public PropertyDescriptorDTO identifiesControllerServiceBundle(BundleDTO identifiesControllerServiceBundle) {
    this.identifiesControllerServiceBundle = identifiesControllerServiceBundle;
    return this;
  }

   /**
   * If the property identifies a controller service this returns the bundle of the type, null otherwise.
   * @return identifiesControllerServiceBundle
  **/
  @ApiModelProperty(example = "null", value = "If the property identifies a controller service this returns the bundle of the type, null otherwise.")
  public BundleDTO getIdentifiesControllerServiceBundle() {
    return identifiesControllerServiceBundle;
  }

  public void setIdentifiesControllerServiceBundle(BundleDTO identifiesControllerServiceBundle) {
    this.identifiesControllerServiceBundle = identifiesControllerServiceBundle;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PropertyDescriptorDTO propertyDescriptorDTO = (PropertyDescriptorDTO) o;
    return Objects.equals(this.name, propertyDescriptorDTO.name) &&
        Objects.equals(this.displayName, propertyDescriptorDTO.displayName) &&
        Objects.equals(this.description, propertyDescriptorDTO.description) &&
        Objects.equals(this.defaultValue, propertyDescriptorDTO.defaultValue) &&
        Objects.equals(this.allowableValues, propertyDescriptorDTO.allowableValues) &&
        Objects.equals(this.required, propertyDescriptorDTO.required) &&
        Objects.equals(this.sensitive, propertyDescriptorDTO.sensitive) &&
        Objects.equals(this.dynamic, propertyDescriptorDTO.dynamic) &&
        Objects.equals(this.supportsEl, propertyDescriptorDTO.supportsEl) &&
        Objects.equals(this.identifiesControllerService, propertyDescriptorDTO.identifiesControllerService) &&
        Objects.equals(this.identifiesControllerServiceBundle, propertyDescriptorDTO.identifiesControllerServiceBundle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, displayName, description, defaultValue, allowableValues, required, sensitive, dynamic, supportsEl, identifiesControllerService, identifiesControllerServiceBundle);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropertyDescriptorDTO {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    allowableValues: ").append(toIndentedString(allowableValues)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    sensitive: ").append(toIndentedString(sensitive)).append("\n");
    sb.append("    dynamic: ").append(toIndentedString(dynamic)).append("\n");
    sb.append("    supportsEl: ").append(toIndentedString(supportsEl)).append("\n");
    sb.append("    identifiesControllerService: ").append(toIndentedString(identifiesControllerService)).append("\n");
    sb.append("    identifiesControllerServiceBundle: ").append(toIndentedString(identifiesControllerServiceBundle)).append("\n");
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

