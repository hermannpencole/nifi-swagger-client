
# VersionedFunnel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identifier** | **String** | The component&#39;s unique identifier |  [optional]
**name** | **String** | The component&#39;s name |  [optional]
**comments** | **String** | The user-supplied comments for the component |  [optional]
**position** | [**ThePositionOfAComponentOnTheGraph**](ThePositionOfAComponentOnTheGraph.md) | The component&#39;s position on the graph |  [optional]
**componentType** | [**ComponentTypeEnum**](#ComponentTypeEnum) |  |  [optional]
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



