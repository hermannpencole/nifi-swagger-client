
# CountersDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aggregateSnapshot** | [**CountersSnapshotDTO**](CountersSnapshotDTO.md) | A Counters snapshot that represents the aggregate values of all nodes in the cluster. If the NiFi instance is a standalone instance, rather than a cluster, this represents the stats of the single instance. |  [optional]
**nodeSnapshots** | [**List&lt;NodeCountersSnapshotDTO&gt;**](NodeCountersSnapshotDTO.md) | A Counters snapshot for each node in the cluster. If the NiFi instance is a standalone instance, rather than a cluster, this may be null. |  [optional]



