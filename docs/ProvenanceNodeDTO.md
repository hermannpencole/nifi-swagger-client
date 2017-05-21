
# ProvenanceNodeDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The id of the node. |  [optional]
**flowFileUuid** | **String** | The uuid of the flowfile associated with the provenance event. |  [optional]
**parentUuids** | **List&lt;String&gt;** | The uuid of the parent flowfiles of the provenance event. |  [optional]
**childUuids** | **List&lt;String&gt;** | The uuid of the childrent flowfiles of the provenance event. |  [optional]
**clusterNodeIdentifier** | **String** | The identifier of the node that this event/flowfile originated from. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The type of the node. |  [optional]
**eventType** | **String** | If the type is EVENT, this is the type of event. |  [optional]
**millis** | **Long** | The timestamp of the node in milliseconds. |  [optional]
**timestamp** | **String** | The timestamp of the node formatted. |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
FLOWFILE | &quot;FLOWFILE&quot;
EVENT | &quot;EVENT&quot;



