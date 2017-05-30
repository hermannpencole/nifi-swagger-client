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
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * ControllerServiceReferencingComponentsEntity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-30T10:58:58.550+02:00")
public class ControllerServiceReferencingComponentsEntity {
  @SerializedName("controllerServiceReferencingComponents")
  private List<ControllerServiceReferencingComponentEntity> controllerServiceReferencingComponents = new ArrayList<ControllerServiceReferencingComponentEntity>();

  public ControllerServiceReferencingComponentsEntity controllerServiceReferencingComponents(List<ControllerServiceReferencingComponentEntity> controllerServiceReferencingComponents) {
    this.controllerServiceReferencingComponents = controllerServiceReferencingComponents;
    return this;
  }

  public ControllerServiceReferencingComponentsEntity addControllerServiceReferencingComponentsItem(ControllerServiceReferencingComponentEntity controllerServiceReferencingComponentsItem) {
    this.controllerServiceReferencingComponents.add(controllerServiceReferencingComponentsItem);
    return this;
  }

   /**
   * Get controllerServiceReferencingComponents
   * @return controllerServiceReferencingComponents
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<ControllerServiceReferencingComponentEntity> getControllerServiceReferencingComponents() {
    return controllerServiceReferencingComponents;
  }

  public void setControllerServiceReferencingComponents(List<ControllerServiceReferencingComponentEntity> controllerServiceReferencingComponents) {
    this.controllerServiceReferencingComponents = controllerServiceReferencingComponents;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ControllerServiceReferencingComponentsEntity controllerServiceReferencingComponentsEntity = (ControllerServiceReferencingComponentsEntity) o;
    return Objects.equals(this.controllerServiceReferencingComponents, controllerServiceReferencingComponentsEntity.controllerServiceReferencingComponents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(controllerServiceReferencingComponents);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ControllerServiceReferencingComponentsEntity {\n");
    
    sb.append("    controllerServiceReferencingComponents: ").append(toIndentedString(controllerServiceReferencingComponents)).append("\n");
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

