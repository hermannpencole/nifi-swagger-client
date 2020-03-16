
# VersionedRemoteGroupPort

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identifier** | **String** | The component&#39;s unique identifier |  [optional]
**name** | **String** | The component&#39;s name |  [optional]
**comments** | **String** | The user-supplied comments for the component |  [optional]
**position** | [**ThePositionOfAComponentOnTheGraph**](ThePositionOfAComponentOnTheGraph.md) | The component&#39;s position on the graph |  [optional]
**remoteGroupId** | **String** | The id of the remote process group that the port resides in. |  [optional]
**concurrentlySchedulableTaskCount** | **Integer** | The number of task that may transmit flowfiles to the target port concurrently. |  [optional]
**useCompression** | **Boolean** | Whether the flowfiles are compressed when sent to the target port. |  [optional]
**batchSize** | [**BatchSize**](BatchSize.md) | The batch settings for data transmission. |  [optional]
**componentType** | [**ComponentTypeEnum**](#ComponentTypeEnum) |  |  [optional]
**targetId** | **String** | The ID of the port on the target NiFi instance |  [optional]
**groupIdentifier** | **String** | The ID of the Process Group that this component belongs to |  [optional]


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



