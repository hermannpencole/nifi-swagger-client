
# LineageDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The id of this lineage query. |  [optional]
**uri** | **String** | The URI for this lineage query for later retrieval and deletion. |  [optional]
**submissionTime** | **String** | When the lineage query was submitted. |  [optional]
**expiration** | **String** | When the lineage query will expire. |  [optional]
**percentCompleted** | **Integer** | The percent complete for the lineage query. |  [optional]
**finished** | **Boolean** | Whether the lineage query has finished. |  [optional]
**request** | [**LineageRequestDTO**](LineageRequestDTO.md) | The initial lineage result. |  [optional]
**results** | [**LineageResultsDTO**](LineageResultsDTO.md) | The results of the lineage query. |  [optional]



