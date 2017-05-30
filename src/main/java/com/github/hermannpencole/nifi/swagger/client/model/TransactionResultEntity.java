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
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * TransactionResultEntity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-30T11:46:30.825+02:00")
public class TransactionResultEntity {
  @SerializedName("flowFileSent")
  private Integer flowFileSent = null;

  @SerializedName("responseCode")
  private Integer responseCode = null;

  @SerializedName("message")
  private String message = null;

  public TransactionResultEntity flowFileSent(Integer flowFileSent) {
    this.flowFileSent = flowFileSent;
    return this;
  }

   /**
   * Get flowFileSent
   * @return flowFileSent
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getFlowFileSent() {
    return flowFileSent;
  }

  public void setFlowFileSent(Integer flowFileSent) {
    this.flowFileSent = flowFileSent;
  }

  public TransactionResultEntity responseCode(Integer responseCode) {
    this.responseCode = responseCode;
    return this;
  }

   /**
   * Get responseCode
   * @return responseCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getResponseCode() {
    return responseCode;
  }

  public void setResponseCode(Integer responseCode) {
    this.responseCode = responseCode;
  }

  public TransactionResultEntity message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionResultEntity transactionResultEntity = (TransactionResultEntity) o;
    return Objects.equals(this.flowFileSent, transactionResultEntity.flowFileSent) &&
        Objects.equals(this.responseCode, transactionResultEntity.responseCode) &&
        Objects.equals(this.message, transactionResultEntity.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flowFileSent, responseCode, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionResultEntity {\n");
    
    sb.append("    flowFileSent: ").append(toIndentedString(flowFileSent)).append("\n");
    sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

