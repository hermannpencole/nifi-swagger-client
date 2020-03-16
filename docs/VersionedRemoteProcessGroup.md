
# VersionedRemoteProcessGroup

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identifier** | **String** | The component&#39;s unique identifier |  [optional]
**name** | **String** | The component&#39;s name |  [optional]
**comments** | **String** | The user-supplied comments for the component |  [optional]
**position** | [**ThePositionOfAComponentOnTheGraph**](ThePositionOfAComponentOnTheGraph.md) | The component&#39;s position on the graph |  [optional]
**targetUri** | **String** | The target URI of the remote process group. If target uri is not set, but uris are set, then returns the first url in the urls. If neither target uri nor uris are set, then returns null. |  [optional]
**targetUris** | **String** | The target URI of the remote process group. If target uris is not set but target uri is set, then returns the single target uri. If neither target uris nor target uri is set, then returns null. |  [optional]
**communicationsTimeout** | **String** | The time period used for the timeout when communicating with the target. |  [optional]
**yieldDuration** | **String** | When yielding, this amount of time must elapse before the remote process group is scheduled again. |  [optional]
**transportProtocol** | [**TransportProtocolEnum**](#TransportProtocolEnum) | The Transport Protocol that is used for Site-to-Site communications |  [optional]
**localNetworkInterface** | **String** | The local network interface to send/receive data. If not specified, any local address is used. If clustered, all nodes must have an interface with this identifier. |  [optional]
**proxyHost** | **String** |  |  [optional]
**proxyPort** | **Integer** |  |  [optional]
**proxyUser** | **String** |  |  [optional]
**inputPorts** | [**List&lt;VersionedRemoteGroupPort&gt;**](VersionedRemoteGroupPort.md) | A Set of Input Ports that can be connected to, in order to send data to the remote NiFi instance |  [optional]
**outputPorts** | [**List&lt;VersionedRemoteGroupPort&gt;**](VersionedRemoteGroupPort.md) | A Set of Output Ports that can be connected to, in order to pull data from the remote NiFi instance |  [optional]
**componentType** | [**ComponentTypeEnum**](#ComponentTypeEnum) |  |  [optional]
**groupIdentifier** | **String** | The ID of the Process Group that this component belongs to |  [optional]


<a name="TransportProtocolEnum"></a>
## Enum: TransportProtocolEnum
Name | Value
---- | -----
RAW | &quot;RAW&quot;
HTTP | &quot;HTTP&quot;


<a name="ComponentTypeEnum"></a>
## Enum: ComponentTypeEnum
Name | Value
---- | -----
CONNECTION | &quot;CONNECTION&quot;
PROCESSOR | &quot;PROCESSOR&quot;
PROCESS_GROUP | &quot;PROCESS_GROUP&quot;
REMOTE_PROCESS_GROUP | &quot;REMOTE_PROCESS_GROUP&quot;
INPUT_PORT | &quot;INPUT_PORT&quot;
OUTPUT_PORT | &quot;OUTPUT_PORT&quot;
REMOTE_INPUT_PORT | &quot;REMOTE_INPUT_PORT&quot;
REMOTE_OUTPUT_PORT | &quot;REMOTE_OUTPUT_PORT&quot;
FUNNEL | &quot;FUNNEL&quot;
LABEL | &quot;LABEL&quot;
CONTROLLER_SERVICE | &quot;CONTROLLER_SERVICE&quot;



