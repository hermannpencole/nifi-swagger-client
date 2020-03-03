
# ProvenanceRequestDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**searchTerms** | **Map&lt;String, String&gt;** | The search terms used to perform the search. |  [optional]
**clusterNodeId** | **String** | The id of the node in the cluster where this provenance originated. |  [optional]
**startDate** | **String** | The earliest event time to include in the query. |  [optional]
**endDate** | **String** | The latest event time to include in the query. |  [optional]
**minimumFileSize** | **String** | The minimum file size to include in the query. |  [optional]
**maximumFileSize** | **String** | The maximum file size to include in the query. |  [optional]
**maxResults** | **Integer** | The maximum number of results to include. |  [optional]
**summarize** | **Boolean** | Whether or not to summarize provenance events returned. This property is false by default. |  [optional]
**incrementalResults** | **Boolean** | Whether or not incremental results are returned. If false, provenance events are only returned once the query completes. This property is true by default. |  [optional]



