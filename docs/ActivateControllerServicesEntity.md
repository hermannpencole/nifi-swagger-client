
# ActivateControllerServicesEntity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The id of the ProcessGroup |  [optional]
**state** | [**StateEnum**](#StateEnum) | The desired state of the descendant components |  [optional]
**components** | [**Map&lt;String, RevisionDTO&gt;**](RevisionDTO.md) | Optional services to schedule. If not specified, all authorized descendant controller services will be used. |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
ENABLED | &quot;ENABLED&quot;
DISABLED | &quot;DISABLED&quot;



