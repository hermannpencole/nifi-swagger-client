
# ConnectableDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The id of the connectable component. | 
**versionedComponentId** | **String** | The ID of the corresponding component that is under version control |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The type of component the connectable is. | 
**groupId** | **String** | The id of the group that the connectable component resides in | 
**name** | **String** | The name of the connectable component |  [optional]
**running** | **Boolean** | Reflects the current state of the connectable component. |  [optional]
**transmitting** | **Boolean** | If the connectable component represents a remote port, indicates if the target is configured to transmit. |  [optional]
**exists** | **Boolean** | If the connectable component represents a remote port, indicates if the target exists. |  [optional]
**comments** | **String** | The comments for the connectable component. |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
PROCESSOR | &quot;PROCESSOR&quot;
REMOTE_INPUT_PORT | &quot;REMOTE_INPUT_PORT&quot;
REMOTE_OUTPUT_PORT | &quot;REMOTE_OUTPUT_PORT&quot;
INPUT_PORT | &quot;INPUT_PORT&quot;
OUTPUT_PORT | &quot;OUTPUT_PORT&quot;
FUNNEL | &quot;FUNNEL&quot;



