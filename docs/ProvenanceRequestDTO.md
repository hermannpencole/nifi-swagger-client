
# ProvenanceRequestDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**searchTerms** | **Map&lt;String, String&gt;** | The search terms used to perform the search. |  [optional]
**clusterNodeId** | **String** | The id of the node in the cluster where this provenance originated. |  [optional]
**startDate** | [**DateTime**](DateTime.md) | The earliest event time to include in the query. |  [optional]
**endDate** | [**DateTime**](DateTime.md) | The latest event time to include in the query. |  [optional]
**minimumFileSize** | **String** | The minimum file size to include in the query. |  [optional]
**maximumFileSize** | **String** | The maximum file size to include in the query. |  [optional]
**maxResults** | **Integer** | The maximum number of results to include. |  [optional]



