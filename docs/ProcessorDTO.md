
# ProcessorDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The id of the component. |  [optional]
**versionedComponentId** | **String** | The ID of the corresponding component that is under version control |  [optional]
**parentGroupId** | **String** | The id of parent process group of this component if applicable. |  [optional]
**position** | [**PositionDTO**](PositionDTO.md) | The position of this component in the UI if applicable. |  [optional]
**name** | **String** | The name of the processor. |  [optional]
**type** | **String** | The type of the processor. |  [optional]
**bundle** | [**BundleDTO**](BundleDTO.md) | The details of the artifact that bundled this processor type. |  [optional]
**state** | [**StateEnum**](#StateEnum) | The state of the processor |  [optional]
**style** | **Map&lt;String, String&gt;** | Styles for the processor (background-color : #eee). |  [optional]
**relationships** | [**List&lt;RelationshipDTO&gt;**](RelationshipDTO.md) | The available relationships that the processor currently supports. |  [optional]
**description** | **String** | The description of the processor. |  [optional]
**supportsParallelProcessing** | **Boolean** | Whether the processor supports parallel processing. |  [optional]
**supportsEventDriven** | **Boolean** | Whether the processor supports event driven scheduling. |  [optional]
**supportsBatching** | **Boolean** | Whether the processor supports batching. This makes the run duration settings available. |  [optional]
**persistsState** | **Boolean** | Whether the processor persists state. |  [optional]
**restricted** | **Boolean** | Whether the processor requires elevated privileges. |  [optional]
**deprecated** | **Boolean** | Whether the processor has been deprecated. |  [optional]
**multipleVersionsAvailable** | **Boolean** | Whether the processor has multiple versions available. |  [optional]
**inputRequirement** | **String** | The input requirement for this processor. |  [optional]
**config** | [**ProcessorConfigDTO**](ProcessorConfigDTO.md) | The configuration details for the processor. These details will be included in a response if the verbose flag is included in a request. |  [optional]
**validationErrors** | **List&lt;String&gt;** | The validation errors for the processor. These validation errors represent the problems with the processor that must be resolved before it can be started. |  [optional]
**extensionMissing** | **Boolean** | Whether the underlying extension is missing. |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
RUNNING | &quot;RUNNING&quot;
STOPPED | &quot;STOPPED&quot;
DISABLED | &quot;DISABLED&quot;



