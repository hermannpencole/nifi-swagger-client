
# ControllerServiceReferencingComponentDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**groupId** | **String** | The group id for the component referencing a controller service. If this component is another controller service or a reporting task, this field is blank. |  [optional]
**id** | **String** | The id of the component referencing a controller service. |  [optional]
**name** | **String** | The name of the component referencing a controller service. |  [optional]
**type** | **String** | The type of the component referencing a controller service. |  [optional]
**state** | **String** | The state of a processor or reporting task referencing a controller service. If this component is another controller service, this field is blank. |  [optional]
**properties** | **Map&lt;String, String&gt;** | The properties for the component. |  [optional]
**descriptors** | [**Map&lt;String, PropertyDescriptorDTO&gt;**](PropertyDescriptorDTO.md) | The descriptors for the componet properties. |  [optional]
**validationErrors** | **List&lt;String&gt;** | The validation errors for the component. |  [optional]
**referenceType** | [**ReferenceTypeEnum**](#ReferenceTypeEnum) | The type of reference this is. |  [optional]
**activeThreadCount** | **Integer** | The number of active threads for the referencing component. |  [optional]
**referenceCycle** | **Boolean** | If the referencing component represents a controller service, this indicates whether it has already been represented in this hierarchy. |  [optional]
**referencingComponents** | [**Set**](Set.md) | If the referencing component represents a controller service, these are the components that referenc it. |  [optional]


<a name="ReferenceTypeEnum"></a>
## Enum: ReferenceTypeEnum
Name | Value
---- | -----
PROCESSOR | &quot;Processor&quot;
CONTROLLERSERVICE | &quot;ControllerService&quot;
OR_REPORTINGTASK | &quot;or ReportingTask&quot;



