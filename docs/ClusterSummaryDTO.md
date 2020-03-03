
# ClusterSummaryDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**connectedNodes** | **String** | When clustered, reports the number of nodes connected vs the number of nodes in the cluster. |  [optional]
**connectedNodeCount** | **Integer** | The number of nodes that are currently connected to the cluster |  [optional]
**totalNodeCount** | **Integer** | The number of nodes in the cluster, regardless of whether or not they are connected |  [optional]
**clustered** | **Boolean** | Whether this NiFi instance is clustered. |  [optional]
**connectedToCluster** | **Boolean** | Whether this NiFi instance is connected to a cluster. |  [optional]



