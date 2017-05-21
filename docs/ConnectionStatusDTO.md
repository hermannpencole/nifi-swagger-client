
# ConnectionStatusDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The ID of the connection |  [optional]
**groupId** | **String** | The ID of the Process Group that the connection belongs to |  [optional]
**name** | **String** | The name of the connection |  [optional]
**statsLastRefreshed** | **String** | The timestamp of when the stats were last refreshed |  [optional]
**sourceId** | **String** | The ID of the source component |  [optional]
**sourceName** | **String** | The name of the source component |  [optional]
**destinationId** | **String** | The ID of the destination component |  [optional]
**destinationName** | **String** | The name of the destination component |  [optional]
**aggregateSnapshot** | [**ConnectionStatusSnapshotDTO**](ConnectionStatusSnapshotDTO.md) | The status snapshot that represents the aggregate stats of the cluster |  [optional]
**nodeSnapshots** | [**List&lt;NodeConnectionStatusSnapshotDTO&gt;**](NodeConnectionStatusSnapshotDTO.md) | A list of status snapshots for each node |  [optional]



