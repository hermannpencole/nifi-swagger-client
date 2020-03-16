
# AccessPolicyDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The id of the component. |  [optional]
**versionedComponentId** | **String** | The ID of the corresponding component that is under version control |  [optional]
**parentGroupId** | **String** | The id of parent process group of this component if applicable. |  [optional]
**position** | [**PositionDTO**](PositionDTO.md) | The position of this component in the UI if applicable. |  [optional]
**resource** | **String** | The resource for this access policy. |  [optional]
**action** | [**ActionEnum**](#ActionEnum) | The action associated with this access policy. |  [optional]
**componentReference** | [**ComponentReferenceEntity**](ComponentReferenceEntity.md) | Component this policy references if applicable. |  [optional]
**configurable** | **Boolean** | Whether this policy is configurable. |  [optional]
**users** | [**List&lt;TenantEntity&gt;**](TenantEntity.md) | The set of user IDs associated with this access policy. |  [optional]
**userGroups** | [**List&lt;TenantEntity&gt;**](TenantEntity.md) | The set of user group IDs associated with this access policy. |  [optional]


<a name="ActionEnum"></a>
## Enum: ActionEnum
Name | Value
---- | -----
READ | &quot;READ&quot;
WRITE | &quot;WRITE&quot;



