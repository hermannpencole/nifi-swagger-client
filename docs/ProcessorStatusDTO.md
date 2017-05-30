
# ProcessorStatusDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**groupId** | **String** | The unique ID of the process group that the Processor belongs to |  [optional]
**id** | **String** | The unique ID of the Processor |  [optional]
**name** | **String** | The name of the Processor |  [optional]
**type** | **String** | The type of the Processor |  [optional]
**runStatus** | **String** | The run status of the Processor |  [optional]
**statsLastRefreshed** | [**DateTime**](DateTime.md) | The timestamp of when the stats were last refreshed |  [optional]
**aggregateSnapshot** | [**ProcessorStatusSnapshotDTO**](ProcessorStatusSnapshotDTO.md) | A status snapshot that represents the aggregate stats of all nodes in the cluster. If the NiFi instance is a standalone instance, rather than a cluster, this represents the stats of the single instance. |  [optional]
**nodeSnapshots** | [**List&lt;NodeProcessorStatusSnapshotDTO&gt;**](NodeProcessorStatusSnapshotDTO.md) | A status snapshot for each node in the cluster. If the NiFi instance is a standalone instance, rather than a cluster, this may be null. |  [optional]



