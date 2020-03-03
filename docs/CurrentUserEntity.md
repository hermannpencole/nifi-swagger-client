
# CurrentUserEntity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identity** | **String** | The user identity being serialized. |  [optional]
**anonymous** | **Boolean** | Whether the current user is anonymous. |  [optional]
**provenancePermissions** | [**PermissionsDTO**](PermissionsDTO.md) | Permissions for querying provenance. |  [optional]
**countersPermissions** | [**PermissionsDTO**](PermissionsDTO.md) | Permissions for accessing counters. |  [optional]
**tenantsPermissions** | [**PermissionsDTO**](PermissionsDTO.md) | Permissions for accessing tenants. |  [optional]
**controllerPermissions** | [**PermissionsDTO**](PermissionsDTO.md) | Permissions for accessing the controller. |  [optional]
**policiesPermissions** | [**PermissionsDTO**](PermissionsDTO.md) | Permissions for accessing the policies. |  [optional]
**systemPermissions** | [**PermissionsDTO**](PermissionsDTO.md) | Permissions for accessing system. |  [optional]
**restrictedComponentsPermissions** | [**PermissionsDTO**](PermissionsDTO.md) | Permissions for accessing restricted components. Note: the read permission are not used and will always be false. |  [optional]
**canVersionFlows** | **Boolean** | Whether the current user can version flows. |  [optional]



