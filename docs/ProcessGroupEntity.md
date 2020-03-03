
# ProcessGroupEntity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**revision** | [**RevisionDTO**](RevisionDTO.md) | The revision for this request/response. The revision is required for any mutable flow requests and is included in all responses. |  [optional]
**id** | **String** | The id of the component. |  [optional]
**uri** | **String** | The URI for futures requests to the component. |  [optional]
**position** | [**PositionDTO**](PositionDTO.md) | The position of this component in the UI if applicable. |  [optional]
**permissions** | [**PermissionsDTO**](PermissionsDTO.md) | The permissions for this component. |  [optional]
**bulletins** | [**List&lt;BulletinEntity&gt;**](BulletinEntity.md) | The bulletins for this component. |  [optional]
**component** | [**ProcessGroupDTO**](ProcessGroupDTO.md) |  |  [optional]
**status** | [**ProcessGroupStatusDTO**](ProcessGroupStatusDTO.md) | The status of the process group. |  [optional]
**versionedFlowSnapshot** | [**VersionedFlowSnapshot**](VersionedFlowSnapshot.md) | Returns the Versioned Flow that describes the contents of the Versioned Flow to be imported |  [optional]
**runningCount** | **Integer** | The number of running components in this process group. |  [optional]
**stoppedCount** | **Integer** | The number of stopped components in the process group. |  [optional]
**invalidCount** | **Integer** | The number of invalid components in the process group. |  [optional]
**disabledCount** | **Integer** | The number of disabled components in the process group. |  [optional]
**activeRemotePortCount** | **Integer** | The number of active remote ports in the process group. |  [optional]
**inactiveRemotePortCount** | **Integer** | The number of inactive remote ports in the process group. |  [optional]
**versionedFlowState** | [**VersionedFlowStateEnum**](#VersionedFlowStateEnum) | The current state of the Process Group, as it relates to the Versioned Flow |  [optional]
**upToDateCount** | **Integer** | The number of up to date versioned process groups in the process group. |  [optional]
**locallyModifiedCount** | **Integer** | The number of locally modified versioned process groups in the process group. |  [optional]
**staleCount** | **Integer** | The number of stale versioned process groups in the process group. |  [optional]
**locallyModifiedAndStaleCount** | **Integer** | The number of locally modified and stale versioned process groups in the process group. |  [optional]
**syncFailureCount** | **Integer** | The number of versioned process groups in the process group that are unable to sync to a registry. |  [optional]
**inputPortCount** | **Integer** | The number of input ports in the process group. |  [optional]
**outputPortCount** | **Integer** | The number of output ports in the process group. |  [optional]


<a name="VersionedFlowStateEnum"></a>
## Enum: VersionedFlowStateEnum
Name | Value
---- | -----
LOCALLY_MODIFIED_DESCENDANT | &quot;LOCALLY_MODIFIED_DESCENDANT&quot;
LOCALLY_MODIFIED | &quot;LOCALLY_MODIFIED&quot;
STALE | &quot;STALE&quot;
LOCALLY_MODIFIED_AND_STALE | &quot;LOCALLY_MODIFIED_AND_STALE&quot;
UP_TO_DATE | &quot;UP_TO_DATE&quot;



