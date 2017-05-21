
# ProcessGroupStatusDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The ID of the Process Group |  [optional]
**name** | **String** | The name of the Process Group |  [optional]
**statsLastRefreshed** | **String** | The time the status for the process group was last refreshed. |  [optional]
**aggregateSnapshot** | [**ProcessGroupStatusSnapshotDTO**](ProcessGroupStatusSnapshotDTO.md) | The aggregate status of all nodes in the cluster |  [optional]
**nodeSnapshots** | [**List&lt;NodeProcessGroupStatusSnapshotDTO&gt;**](NodeProcessGroupStatusSnapshotDTO.md) | The status reported by each node in the cluster. If the NiFi instance is a standalone instance, rather than a clustered instance, this value may be null. |  [optional]



