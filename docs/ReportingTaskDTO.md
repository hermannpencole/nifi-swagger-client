
# ReportingTaskDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The id of the component. |  [optional]
**parentGroupId** | **String** | The id of parent process group of this component if applicable. |  [optional]
**position** | [**PositionDTO**](PositionDTO.md) | The position of this component in the UI if applicable. |  [optional]
**name** | **String** | The name of the reporting task. |  [optional]
**type** | **String** | The fully qualified type of the reporting task. |  [optional]
**state** | [**StateEnum**](#StateEnum) | The state of the reporting task. |  [optional]
**comments** | **String** | The comments of the reporting task. |  [optional]
**persistsState** | **Boolean** | Whether the reporting task persists state. |  [optional]
**schedulingPeriod** | **String** | The frequency with which to schedule the reporting task. The format of the value willd epend on the valud of the schedulingStrategy. |  [optional]
**schedulingStrategy** | **String** | The scheduling strategy that determines how the schedulingPeriod value should be interpreted. |  [optional]
**defaultSchedulingPeriod** | **Map&lt;String, String&gt;** | The default scheduling period for the different scheduling strategies. |  [optional]
**properties** | **Map&lt;String, String&gt;** | The properties of the reporting task. |  [optional]
**descriptors** | [**Map&lt;String, PropertyDescriptorDTO&gt;**](PropertyDescriptorDTO.md) | The descriptors for the reporting tasks properties. |  [optional]
**customUiUrl** | **String** | The URL for the custom configuration UI for the reporting task. |  [optional]
**annotationData** | **String** | The anntation data for the repoting task. This is how the custom UI relays configuration to the reporting task. |  [optional]
**validationErrors** | **List&lt;String&gt;** | Gets the validation errors from the reporting task. These validation errors represent the problems with the reporting task that must be resolved before it can be scheduled to run. |  [optional]
**activeThreadCount** | **Integer** | The number of active threads for the reporting task. |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
RUNNING | &quot;RUNNING&quot;
STOPPED | &quot;STOPPED&quot;
DISABLED | &quot;DISABLED&quot;



