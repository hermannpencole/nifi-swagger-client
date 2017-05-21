
# UpdateControllerServiceReferenceRequestEntity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The identifier of the Controller Service. |  [optional]
**state** | [**StateEnum**](#StateEnum) | The new state of the references for the controller service. |  [optional]
**referencingComponentRevisions** | [**Map&lt;String, RevisionDTO&gt;**](RevisionDTO.md) | The revisions for all referencing components. |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
ENABLED | &quot;ENABLED&quot;
DISABLED | &quot;DISABLED&quot;
RUNNING | &quot;RUNNING&quot;
STOPPED | &quot;STOPPED&quot;



