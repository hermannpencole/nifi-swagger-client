
# PortDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The id of the component. |  [optional]
**parentGroupId** | **String** | The id of parent process group of this component if applicable. |  [optional]
**position** | [**PositionDTO**](PositionDTO.md) | The position of this component in the UI if applicable. |  [optional]
**name** | **String** | The name of the port. |  [optional]
**comments** | **String** | The comments for the port. |  [optional]
**state** | [**StateEnum**](#StateEnum) | The state of the port. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The type of port. |  [optional]
**transmitting** | **Boolean** | Whether the port has incoming or output connections to a remote NiFi. This is only applicable when the port is running in the root group. |  [optional]
**concurrentlySchedulableTaskCount** | **Integer** | The number of tasks that should be concurrently scheduled for the port. |  [optional]
**userAccessControl** | **List&lt;String&gt;** | The users that are allowed to access the port. |  [optional]
**groupAccessControl** | **List&lt;String&gt;** | The user groups that are allowed to access the port. |  [optional]
**validationErrors** | **List&lt;String&gt;** | Gets the validation errors from this port. These validation errors represent the problems with the port that must be resolved before it can be started. |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
RUNNING | &quot;RUNNING&quot;
STOPPED | &quot;STOPPED&quot;
DISABLED | &quot;DISABLED&quot;


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
INPUT_PORT | &quot;INPUT_PORT&quot;
OUTPUT_PORT | &quot;OUTPUT_PORT&quot;



