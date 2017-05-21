
# ListingRequestDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The id for this listing request. |  [optional]
**uri** | **String** | The URI for future requests to this listing request. |  [optional]
**submissionTime** | **String** | The timestamp when the query was submitted. |  [optional]
**lastUpdated** | **String** | The last time this listing request was updated. |  [optional]
**percentCompleted** | **Integer** | The current percent complete. |  [optional]
**finished** | **Boolean** | Whether the query has finished. |  [optional]
**failureReason** | **String** | The reason, if any, that this listing request failed. |  [optional]
**maxResults** | **Integer** | The maximum number of FlowFileSummary objects to return |  [optional]
**state** | **String** | The current state of the listing request. |  [optional]
**queueSize** | [**QueueSizeDTO**](QueueSizeDTO.md) | The size of the queue |  [optional]
**flowFileSummaries** | [**List&lt;FlowFileSummaryDTO&gt;**](FlowFileSummaryDTO.md) | The FlowFile summaries. The summaries will be populated once the request has completed. |  [optional]
**destinationRunning** | **Boolean** | Whether the destination of the connection is running |  [optional]
**sourceRunning** | **Boolean** | Whether the source of the connection is running |  [optional]



