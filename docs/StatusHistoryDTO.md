
# StatusHistoryDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**generated** | **String** | When the status history was generated. |  [optional]
**componentDetails** | **Map&lt;String, String&gt;** | A Map of key/value pairs that describe the component that the status history belongs to |  [optional]
**fieldDescriptors** | [**List&lt;StatusDescriptorDTO&gt;**](StatusDescriptorDTO.md) | The Descriptors that provide information on each of the metrics provided in the status history |  [optional]
**aggregateSnapshots** | [**List&lt;StatusSnapshotDTO&gt;**](StatusSnapshotDTO.md) | A list of StatusSnapshotDTO objects that provide the actual metric values for the component. If the NiFi instance is clustered, this will represent the aggregate status across all nodes. If the NiFi instance is not clustered, this will represent the status of the entire NiFi instance. |  [optional]
**nodeSnapshots** | [**List&lt;NodeStatusSnapshotsDTO&gt;**](NodeStatusSnapshotsDTO.md) | The NodeStatusSnapshotsDTO objects that provide the actual metric values for the component, for each node. If the NiFi instance is not clustered, this value will be null. |  [optional]



