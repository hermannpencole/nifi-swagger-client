
# AffectedComponentDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**processGroupId** | **String** | The UUID of the Process Group that this component is in |  [optional]
**id** | **String** | The UUID of this component |  [optional]
**referenceType** | [**ReferenceTypeEnum**](#ReferenceTypeEnum) | The type of this component |  [optional]
**name** | **String** | The name of this component. |  [optional]
**state** | **String** | The scheduled state of a processor or reporting task referencing a controller service. If this component is another controller service, this field represents the controller service state. |  [optional]
**activeThreadCount** | **Integer** | The number of active threads for the referencing component. |  [optional]
**validationErrors** | **List&lt;String&gt;** | The validation errors for the component. |  [optional]


<a name="ReferenceTypeEnum"></a>
## Enum: ReferenceTypeEnum
Name | Value
---- | -----
PROCESSOR | &quot;PROCESSOR&quot;
CONTROLLER_SERVICE | &quot;CONTROLLER_SERVICE&quot;
INPUT_PORT | &quot;INPUT_PORT&quot;
OUTPUT_PORT | &quot;OUTPUT_PORT&quot;
REMOTE_INPUT_PORT | &quot;REMOTE_INPUT_PORT&quot;
REMOTE_OUTPUT_PORT | &quot;REMOTE_OUTPUT_PORT&quot;



