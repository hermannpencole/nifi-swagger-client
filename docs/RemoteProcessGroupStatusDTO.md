
# RemoteProcessGroupStatusDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**groupId** | **String** | The unique ID of the process group that the Processor belongs to |  [optional]
**id** | **String** | The unique ID of the Processor |  [optional]
**name** | **String** | The name of the remote process group. |  [optional]
**targetUri** | **String** | The URI of the target system. |  [optional]
**transmissionStatus** | **String** | The transmission status of the remote process group. |  [optional]
**statsLastRefreshed** | [**DateTime**](DateTime.md) | The time the status for the process group was last refreshed. |  [optional]
**aggregateSnapshot** | [**RemoteProcessGroupStatusSnapshotDTO**](RemoteProcessGroupStatusSnapshotDTO.md) | A status snapshot that represents the aggregate stats of all nodes in the cluster. If the NiFi instance is a standalone instance, rather than a cluster, this represents the stats of the single instance. |  [optional]
**nodeSnapshots** | [**List&lt;NodeRemoteProcessGroupStatusSnapshotDTO&gt;**](NodeRemoteProcessGroupStatusSnapshotDTO.md) | A status snapshot for each node in the cluster. If the NiFi instance is a standalone instance, rather than a cluster, this may be null. |  [optional]



