
# UserGroupDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The id of the component. |  [optional]
**versionedComponentId** | **String** | The ID of the corresponding component that is under version control |  [optional]
**parentGroupId** | **String** | The id of parent process group of this component if applicable. |  [optional]
**position** | [**PositionDTO**](PositionDTO.md) | The position of this component in the UI if applicable. |  [optional]
**identity** | **String** | The identity of the tenant. |  [optional]
**configurable** | **Boolean** | Whether this tenant is configurable. |  [optional]
**users** | [**List&lt;TenantEntity&gt;**](TenantEntity.md) | The users that belong to the user group. |  [optional]
**accessPolicies** | [**List&lt;AccessPolicyEntity&gt;**](AccessPolicyEntity.md) | The access policies this user group belongs to. This field was incorrectly defined as an AccessPolicyEntity. For compatibility reasons the field will remain of this type, however only the fields that are present in the AccessPolicySummaryEntity will be populated here. |  [optional]



