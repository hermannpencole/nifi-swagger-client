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
import com.github.hermannpencole.nifi.swagger.client.model.ControllerServiceEntity;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ControllerServicesEntity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-03T16:29:45.931+01:00")
public class ControllerServicesEntity {
  @SerializedName("currentTime")
  private String currentTime = null;

  @SerializedName("controllerServices")
  private List<ControllerServiceEntity> controllerServices = null;

  public ControllerServicesEntity currentTime(String currentTime) {
    this.currentTime = currentTime;
    return this;
  }

   /**
   * The current time on the system.
   * @return currentTime
  **/
  @ApiModelProperty(value = "The current time on the system.")
  public String getCurrentTime() {
    return currentTime;
  }

  public void setCurrentTime(String currentTime) {
    this.currentTime = currentTime;
  }

  public ControllerServicesEntity controllerServices(List<ControllerServiceEntity> controllerServices) {
    this.controllerServices = controllerServices;
    return this;
  }

  public ControllerServicesEntity addControllerServicesItem(ControllerServiceEntity controllerServicesItem) {
    if (this.controllerServices == null) {
      this.controllerServices = new ArrayList<ControllerServiceEntity>();
    }
    this.controllerServices.add(controllerServicesItem);
    return this;
  }

   /**
   * Get controllerServices
   * @return controllerServices
  **/
  @ApiModelProperty(value = "")
  public List<ControllerServiceEntity> getControllerServices() {
    return controllerServices;
  }

  public void setControllerServices(List<ControllerServiceEntity> controllerServices) {
    this.controllerServices = controllerServices;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ControllerServicesEntity controllerServicesEntity = (ControllerServicesEntity) o;
    return Objects.equals(this.currentTime, controllerServicesEntity.currentTime) &&
        Objects.equals(this.controllerServices, controllerServicesEntity.controllerServices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentTime, controllerServices);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ControllerServicesEntity {\n");
    
    sb.append("    currentTime: ").append(toIndentedString(currentTime)).append("\n");
    sb.append("    controllerServices: ").append(toIndentedString(controllerServices)).append("\n");
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

