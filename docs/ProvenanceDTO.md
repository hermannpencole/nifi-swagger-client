
# ProvenanceDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The id of the provenance query. |  [optional]
**uri** | **String** | The URI for this query. Used for obtaining/deleting the request at a later time |  [optional]
**submissionTime** | **String** | The timestamp when the query was submitted. |  [optional]
**expiration** | **String** | The timestamp when the query will expire. |  [optional]
**percentCompleted** | **Integer** | The current percent complete. |  [optional]
**finished** | **Boolean** | Whether the query has finished. |  [optional]
**request** | [**ProvenanceRequestDTO**](ProvenanceRequestDTO.md) | The provenance request. |  [optional]
**results** | [**ProvenanceResultsDTO**](ProvenanceResultsDTO.md) | The provenance results. |  [optional]



