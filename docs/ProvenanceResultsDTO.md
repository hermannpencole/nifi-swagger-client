
# ProvenanceResultsDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**provenanceEvents** | [**List&lt;ProvenanceEventDTO&gt;**](ProvenanceEventDTO.md) | The provenance events that matched the search criteria. |  [optional]
**total** | **String** | The total number of results formatted. |  [optional]
**totalCount** | **Long** | The total number of results. |  [optional]
**generated** | **String** | Then the search was performed. |  [optional]
**oldestEvent** | **String** | The oldest event available in the provenance repository. |  [optional]
**timeOffset** | **Integer** | The time offset of the server that&#39;s used for event time. |  [optional]
**errors** | **List&lt;String&gt;** | Any errors that occurred while performing the provenance request. |  [optional]



