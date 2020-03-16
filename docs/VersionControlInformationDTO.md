
# VersionControlInformationDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**groupId** | **String** | The ID of the Process Group that is under version control |  [optional]
**registryId** | **String** | The ID of the registry that the flow is stored in |  [optional]
**registryName** | **String** | The name of the registry that the flow is stored in |  [optional]
**bucketId** | **String** | The ID of the bucket that the flow is stored in |  [optional]
**bucketName** | **String** | The name of the bucket that the flow is stored in |  [optional]
**flowId** | **String** | The ID of the flow |  [optional]
**flowName** | **String** | The name of the flow |  [optional]
**flowDescription** | **String** | The description of the flow |  [optional]
**version** | **Integer** | The version of the flow |  [optional]
**state** | [**StateEnum**](#StateEnum) | The current state of the Process Group, as it relates to the Versioned Flow |  [optional]
**stateExplanation** | **String** | Explanation of why the group is in the specified state |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
LOCALLY_MODIFIED_DESCENDANT | &quot;LOCALLY_MODIFIED_DESCENDANT&quot;
LOCALLY_MODIFIED | &quot;LOCALLY_MODIFIED&quot;
STALE | &quot;STALE&quot;
LOCALLY_MODIFIED_AND_STALE | &quot;LOCALLY_MODIFIED_AND_STALE&quot;
UP_TO_DATE | &quot;UP_TO_DATE&quot;



