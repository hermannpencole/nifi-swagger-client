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
import com.github.hermannpencole.nifi.swagger.client.model.PositionDTO;
import com.github.hermannpencole.nifi.swagger.client.model.TenantEntity;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * AccessPolicyDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-30T10:58:58.550+02:00")
public class AccessPolicyDTO {
  @SerializedName("id")
  private String id = null;

  @SerializedName("parentGroupId")
  private String parentGroupId = null;

  @SerializedName("position")
  private PositionDTO position = null;

  @SerializedName("resource")
  private String resource = null;

  /**
   * The action associated with this access policy.
   */
  public enum ActionEnum {
    @SerializedName("READ")
    READ("READ"),
    
    @SerializedName("WRITE")
    WRITE("WRITE");

    private String value;

    ActionEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("action")
  private ActionEnum action = null;

  @SerializedName("users")
  private List<TenantEntity> users = new ArrayList<TenantEntity>();

  @SerializedName("userGroups")
  private List<TenantEntity> userGroups = new ArrayList<TenantEntity>();

  public AccessPolicyDTO id(String id) {
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

  public AccessPolicyDTO parentGroupId(String parentGroupId) {
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

  public AccessPolicyDTO position(PositionDTO position) {
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

  public AccessPolicyDTO resource(String resource) {
    this.resource = resource;
    return this;
  }

   /**
   * The resource for this access policy.
   * @return resource
  **/
  @ApiModelProperty(example = "null", value = "The resource for this access policy.")
  public String getResource() {
    return resource;
  }

  public void setResource(String resource) {
    this.resource = resource;
  }

  public AccessPolicyDTO action(ActionEnum action) {
    this.action = action;
    return this;
  }

   /**
   * The action associated with this access policy.
   * @return action
  **/
  @ApiModelProperty(example = "null", value = "The action associated with this access policy.")
  public ActionEnum getAction() {
    return action;
  }

  public void setAction(ActionEnum action) {
    this.action = action;
  }

  public AccessPolicyDTO users(List<TenantEntity> users) {
    this.users = users;
    return this;
  }

  public AccessPolicyDTO addUsersItem(TenantEntity usersItem) {
    this.users.add(usersItem);
    return this;
  }

   /**
   * The set of user IDs associated with this access policy.
   * @return users
  **/
  @ApiModelProperty(example = "null", value = "The set of user IDs associated with this access policy.")
  public List<TenantEntity> getUsers() {
    return users;
  }

  public void setUsers(List<TenantEntity> users) {
    this.users = users;
  }

  public AccessPolicyDTO userGroups(List<TenantEntity> userGroups) {
    this.userGroups = userGroups;
    return this;
  }

  public AccessPolicyDTO addUserGroupsItem(TenantEntity userGroupsItem) {
    this.userGroups.add(userGroupsItem);
    return this;
  }

   /**
   * The set of user group IDs associated with this access policy.
   * @return userGroups
  **/
  @ApiModelProperty(example = "null", value = "The set of user group IDs associated with this access policy.")
  public List<TenantEntity> getUserGroups() {
    return userGroups;
  }

  public void setUserGroups(List<TenantEntity> userGroups) {
    this.userGroups = userGroups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessPolicyDTO accessPolicyDTO = (AccessPolicyDTO) o;
    return Objects.equals(this.id, accessPolicyDTO.id) &&
        Objects.equals(this.parentGroupId, accessPolicyDTO.parentGroupId) &&
        Objects.equals(this.position, accessPolicyDTO.position) &&
        Objects.equals(this.resource, accessPolicyDTO.resource) &&
        Objects.equals(this.action, accessPolicyDTO.action) &&
        Objects.equals(this.users, accessPolicyDTO.users) &&
        Objects.equals(this.userGroups, accessPolicyDTO.userGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, parentGroupId, position, resource, action, users, userGroups);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessPolicyDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parentGroupId: ").append(toIndentedString(parentGroupId)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    userGroups: ").append(toIndentedString(userGroups)).append("\n");
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

