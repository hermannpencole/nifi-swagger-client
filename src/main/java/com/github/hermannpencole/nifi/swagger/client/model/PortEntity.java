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
import com.github.hermannpencole.nifi.swagger.client.model.BulletinEntity;
import com.github.hermannpencole.nifi.swagger.client.model.PermissionsDTO;
import com.github.hermannpencole.nifi.swagger.client.model.PortDTO;
import com.github.hermannpencole.nifi.swagger.client.model.PortStatusDTO;
import com.github.hermannpencole.nifi.swagger.client.model.PositionDTO;
import com.github.hermannpencole.nifi.swagger.client.model.RevisionDTO;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * PortEntity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-30T11:46:30.825+02:00")
public class PortEntity {
  @SerializedName("revision")
  private RevisionDTO revision = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("uri")
  private String uri = null;

  @SerializedName("position")
  private PositionDTO position = null;

  @SerializedName("permissions")
  private PermissionsDTO permissions = null;

  @SerializedName("bulletins")
  private List<BulletinEntity> bulletins = new ArrayList<BulletinEntity>();

  @SerializedName("component")
  private PortDTO component = null;

  @SerializedName("status")
  private PortStatusDTO status = null;

  @SerializedName("portType")
  private String portType = null;

  public PortEntity revision(RevisionDTO revision) {
    this.revision = revision;
    return this;
  }

   /**
   * The revision for this request/response. The revision is required for any mutable flow requests and is included in all responses.
   * @return revision
  **/
  @ApiModelProperty(example = "null", value = "The revision for this request/response. The revision is required for any mutable flow requests and is included in all responses.")
  public RevisionDTO getRevision() {
    return revision;
  }

  public void setRevision(RevisionDTO revision) {
    this.revision = revision;
  }

  public PortEntity id(String id) {
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

  public PortEntity uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * The URI for futures requests to the component.
   * @return uri
  **/
  @ApiModelProperty(example = "null", value = "The URI for futures requests to the component.")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public PortEntity position(PositionDTO position) {
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

  public PortEntity permissions(PermissionsDTO permissions) {
    this.permissions = permissions;
    return this;
  }

   /**
   * The permissions for this component.
   * @return permissions
  **/
  @ApiModelProperty(example = "null", value = "The permissions for this component.")
  public PermissionsDTO getPermissions() {
    return permissions;
  }

  public void setPermissions(PermissionsDTO permissions) {
    this.permissions = permissions;
  }

  public PortEntity bulletins(List<BulletinEntity> bulletins) {
    this.bulletins = bulletins;
    return this;
  }

  public PortEntity addBulletinsItem(BulletinEntity bulletinsItem) {
    this.bulletins.add(bulletinsItem);
    return this;
  }

   /**
   * The bulletins for this component.
   * @return bulletins
  **/
  @ApiModelProperty(example = "null", value = "The bulletins for this component.")
  public List<BulletinEntity> getBulletins() {
    return bulletins;
  }

  public void setBulletins(List<BulletinEntity> bulletins) {
    this.bulletins = bulletins;
  }

  public PortEntity component(PortDTO component) {
    this.component = component;
    return this;
  }

   /**
   * Get component
   * @return component
  **/
  @ApiModelProperty(example = "null", value = "")
  public PortDTO getComponent() {
    return component;
  }

  public void setComponent(PortDTO component) {
    this.component = component;
  }

  public PortEntity status(PortStatusDTO status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the port.
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "The status of the port.")
  public PortStatusDTO getStatus() {
    return status;
  }

  public void setStatus(PortStatusDTO status) {
    this.status = status;
  }

  public PortEntity portType(String portType) {
    this.portType = portType;
    return this;
  }

   /**
   * Get portType
   * @return portType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPortType() {
    return portType;
  }

  public void setPortType(String portType) {
    this.portType = portType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortEntity portEntity = (PortEntity) o;
    return Objects.equals(this.revision, portEntity.revision) &&
        Objects.equals(this.id, portEntity.id) &&
        Objects.equals(this.uri, portEntity.uri) &&
        Objects.equals(this.position, portEntity.position) &&
        Objects.equals(this.permissions, portEntity.permissions) &&
        Objects.equals(this.bulletins, portEntity.bulletins) &&
        Objects.equals(this.component, portEntity.component) &&
        Objects.equals(this.status, portEntity.status) &&
        Objects.equals(this.portType, portEntity.portType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(revision, id, uri, position, permissions, bulletins, component, status, portType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortEntity {\n");
    
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    bulletins: ").append(toIndentedString(bulletins)).append("\n");
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    portType: ").append(toIndentedString(portType)).append("\n");
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

