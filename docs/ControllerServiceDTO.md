
# ControllerServiceDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The id of the component. |  [optional]
**parentGroupId** | **String** | The id of parent process group of this component if applicable. |  [optional]
**position** | [**PositionDTO**](PositionDTO.md) | The position of this component in the UI if applicable. |  [optional]
**name** | **String** | The name of the controller service. |  [optional]
**type** | **String** | The type of the controller service. |  [optional]
**comments** | **String** | The comments for the controller service. |  [optional]
**state** | [**StateEnum**](#StateEnum) | The state of the controller service. |  [optional]
**persistsState** | **Boolean** | Whether the controller service persists state. |  [optional]
**properties** | **Map&lt;String, String&gt;** | The properties of the controller service. |  [optional]
**descriptors** | [**Map&lt;String, PropertyDescriptorDTO&gt;**](PropertyDescriptorDTO.md) | The descriptors for the controller service properties. |  [optional]
**customUiUrl** | **String** | The URL for the controller services custom configuration UI if applicable. |  [optional]
**annotationData** | **String** | The annontation for the controller service. This is how the custom UI relays configuration to the controller service. |  [optional]
**referencingComponents** | [**List&lt;ControllerServiceReferencingComponentEntity&gt;**](ControllerServiceReferencingComponentEntity.md) | All components referencing this controller service. |  [optional]
**validationErrors** | **List&lt;String&gt;** | The validation errors from the controller service. These validation errors represent the problems with the controller service that must be resolved before it can be enabled. |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
ENABLED | &quot;ENABLED&quot;
ENABLING | &quot;ENABLING&quot;
DISABLED | &quot;DISABLED&quot;
DISABLING | &quot;DISABLING&quot;



