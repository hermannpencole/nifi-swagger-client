
# PortStatusDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The id of the port. |  [optional]
**groupId** | **String** | The id of the parent process group of the port. |  [optional]
**name** | **String** | The name of the port. |  [optional]
**transmitting** | **Boolean** | Whether the port has incoming or outgoing connections to a remote NiFi. |  [optional]
**runStatus** | **String** | The run status of the port. |  [optional]
**statsLastRefreshed** | [**DateTime**](DateTime.md) | The time the status for the process group was last refreshed. |  [optional]
**aggregateSnapshot** | [**PortStatusSnapshotDTO**](PortStatusSnapshotDTO.md) | A status snapshot that represents the aggregate stats of all nodes in the cluster. If the NiFi instance is a standalone instance, rather than a cluster, this represents the stats of the single instance. |  [optional]
**nodeSnapshots** | [**List&lt;NodePortStatusSnapshotDTO&gt;**](NodePortStatusSnapshotDTO.md) | A status snapshot for each node in the cluster. If the NiFi instance is a standalone instance, rather than a cluster, this may be null. |  [optional]



