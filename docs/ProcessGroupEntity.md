
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
**runningCount** | **Integer** | The number of running componetns in this process group. |  [optional]
**stoppedCount** | **Integer** | The number of stopped components in the process group. |  [optional]
**invalidCount** | **Integer** | The number of invalid components in the process group. |  [optional]
**disabledCount** | **Integer** | The number of disabled components in the process group. |  [optional]
**activeRemotePortCount** | **Integer** | The number of active remote ports in the process group. |  [optional]
**inactiveRemotePortCount** | **Integer** | The number of inactive remote ports in the process group. |  [optional]
**inputPortCount** | **Integer** | The number of input ports in the process group. |  [optional]
**outputPortCount** | **Integer** | The number of output ports in the process group. |  [optional]



