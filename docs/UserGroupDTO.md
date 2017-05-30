
# UserGroupDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The id of the component. |  [optional]
**parentGroupId** | **String** | The id of parent process group of this component if applicable. |  [optional]
**position** | [**PositionDTO**](PositionDTO.md) | The position of this component in the UI if applicable. |  [optional]
**identity** | **String** | The identity of the tenant. |  [optional]
**users** | [**List&lt;TenantEntity&gt;**](TenantEntity.md) | The users that belong to the user group. |  [optional]
**accessPolicies** | [**List&lt;AccessPolicyEntity&gt;**](AccessPolicyEntity.md) | The access policies this user group belongs to. |  [optional]



