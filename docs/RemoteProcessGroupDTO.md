
# RemoteProcessGroupDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The id of the component. |  [optional]
**parentGroupId** | **String** | The id of parent process group of this component if applicable. |  [optional]
**position** | [**PositionDTO**](PositionDTO.md) | The position of this component in the UI if applicable. |  [optional]
**targetUri** | **String** | The target URI of the remote process group. |  [optional]
**targetSecure** | **Boolean** | Whether the target is running securely. |  [optional]
**name** | **String** | The name of the remote process group. |  [optional]
**comments** | **String** | The comments for the remote process group. |  [optional]
**communicationsTimeout** | **String** | The time period used for the timeout when commicating with the target. |  [optional]
**yieldDuration** | **String** | When yielding, this amount of time must elapse before the remote process group is scheduled again. |  [optional]
**transportProtocol** | **String** |  |  [optional]
**proxyHost** | **String** |  |  [optional]
**proxyPort** | **Integer** |  |  [optional]
**proxyUser** | **String** |  |  [optional]
**proxyPassword** | **String** |  |  [optional]
**authorizationIssues** | **List&lt;String&gt;** | Any remote authorization issues for the remote process group. |  [optional]
**transmitting** | **Boolean** | Whether the remote process group is actively transmitting. |  [optional]
**inputPortCount** | **Integer** | The number of remote input ports currently available on the target. |  [optional]
**outputPortCount** | **Integer** | The number of remote output ports currently available on the target. |  [optional]
**activeRemoteInputPortCount** | **Integer** | The number of active remote input ports. |  [optional]
**inactiveRemoteInputPortCount** | **Integer** | The number of inactive remote input ports. |  [optional]
**activeRemoteOutputPortCount** | **Integer** | The number of acitve remote output ports. |  [optional]
**inactiveRemoteOutputPortCount** | **Integer** | The number of inactive remote output ports. |  [optional]
**flowRefreshed** | [**DateTime**](DateTime.md) | The timestamp when this remote process group was last refreshed. |  [optional]
**contents** | [**RemoteProcessGroupContentsDTO**](RemoteProcessGroupContentsDTO.md) | The contents of the remote process group. Will contain available input/output ports. |  [optional]



