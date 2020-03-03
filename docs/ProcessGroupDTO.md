
# ProcessGroupDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The id of the component. |  [optional]
**versionedComponentId** | **String** | The ID of the corresponding component that is under version control |  [optional]
**parentGroupId** | **String** | The id of parent process group of this component if applicable. |  [optional]
**position** | [**PositionDTO**](PositionDTO.md) | The position of this component in the UI if applicable. |  [optional]
**name** | **String** | The name of the process group. |  [optional]
**comments** | **String** | The comments for the process group. |  [optional]
**variables** | **Map&lt;String, String&gt;** | The variables that are configured for the Process Group. Note that this map contains only those variables that are defined on this Process Group and not any variables that are defined in the parent Process Group, etc. I.e., this Map will not contain all variables that are accessible by components in this Process Group by rather only the variables that are defined for this Process Group itself. |  [optional]
**versionControlInformation** | [**VersionControlInformationDTO**](VersionControlInformationDTO.md) | The Version Control information that indicates which Flow Registry, and where in the Flow Registry, this Process Group is tracking to; or null if this Process Group is not under version control |  [optional]
**runningCount** | **Integer** | The number of running components in this process group. |  [optional]
**stoppedCount** | **Integer** | The number of stopped components in the process group. |  [optional]
**invalidCount** | **Integer** | The number of invalid components in the process group. |  [optional]
**disabledCount** | **Integer** | The number of disabled components in the process group. |  [optional]
**activeRemotePortCount** | **Integer** | The number of active remote ports in the process group. |  [optional]
**inactiveRemotePortCount** | **Integer** | The number of inactive remote ports in the process group. |  [optional]
**upToDateCount** | **Integer** | The number of up to date versioned process groups in the process group. |  [optional]
**locallyModifiedCount** | **Integer** | The number of locally modified versioned process groups in the process group. |  [optional]
**staleCount** | **Integer** | The number of stale versioned process groups in the process group. |  [optional]
**locallyModifiedAndStaleCount** | **Integer** | The number of locally modified and stale versioned process groups in the process group. |  [optional]
**syncFailureCount** | **Integer** | The number of versioned process groups in the process group that are unable to sync to a registry. |  [optional]
**inputPortCount** | **Integer** | The number of input ports in the process group. |  [optional]
**outputPortCount** | **Integer** | The number of output ports in the process group. |  [optional]
**contents** | [**FlowSnippetDTO**](FlowSnippetDTO.md) | The contents of this process group. |  [optional]



