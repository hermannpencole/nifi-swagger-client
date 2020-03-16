
# VersionedProcessGroup

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identifier** | **String** | The component&#39;s unique identifier |  [optional]
**name** | **String** | The component&#39;s name |  [optional]
**comments** | **String** | The user-supplied comments for the component |  [optional]
**position** | [**ThePositionOfAComponentOnTheGraph**](ThePositionOfAComponentOnTheGraph.md) | The component&#39;s position on the graph |  [optional]
**processGroups** | [**List&lt;VersionedProcessGroup&gt;**](VersionedProcessGroup.md) | The child Process Groups |  [optional]
**remoteProcessGroups** | [**List&lt;VersionedRemoteProcessGroup&gt;**](VersionedRemoteProcessGroup.md) | The Remote Process Groups |  [optional]
**processors** | [**List&lt;VersionedProcessor&gt;**](VersionedProcessor.md) | The Processors |  [optional]
**inputPorts** | [**List&lt;VersionedPort&gt;**](VersionedPort.md) | The Input Ports |  [optional]
**outputPorts** | [**List&lt;VersionedPort&gt;**](VersionedPort.md) | The Output Ports |  [optional]
**connections** | [**List&lt;VersionedConnection&gt;**](VersionedConnection.md) | The Connections |  [optional]
**labels** | [**List&lt;VersionedLabel&gt;**](VersionedLabel.md) | The Labels |  [optional]
**funnels** | [**List&lt;VersionedFunnel&gt;**](VersionedFunnel.md) | The Funnels |  [optional]
**controllerServices** | [**List&lt;VersionedControllerService&gt;**](VersionedControllerService.md) | The Controller Services |  [optional]
**versionedFlowCoordinates** | [**VersionedFlowCoordinates**](VersionedFlowCoordinates.md) | The coordinates where the remote flow is stored, or null if the Process Group is not directly under Version Control |  [optional]
**variables** | **Map&lt;String, String&gt;** | The Variables in the Variable Registry for this Process Group (not including any ancestor or descendant Process Groups) |  [optional]
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



