
# DropRequestDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The id for this drop request. |  [optional]
**uri** | **String** | The URI for future requests to this drop request. |  [optional]
**submissionTime** | **String** | The timestamp when the query was submitted. |  [optional]
**lastUpdated** | **String** | The last time this drop request was updated. |  [optional]
**percentCompleted** | **Integer** | The current percent complete. |  [optional]
**finished** | **Boolean** | Whether the query has finished. |  [optional]
**failureReason** | **String** | The reason, if any, that this drop request failed. |  [optional]
**currentCount** | **Integer** | The number of flow files currently queued. |  [optional]
**currentSize** | **Long** | The size of flow files currently queued in bytes. |  [optional]
**current** | **String** | The count and size of flow files currently queued. |  [optional]
**originalCount** | **Integer** | The number of flow files to be dropped as a result of this request. |  [optional]
**originalSize** | **Long** | The size of flow files to be dropped as a result of this request in bytes. |  [optional]
**original** | **String** | The count and size of flow files to be dropped as a result of this request. |  [optional]
**droppedCount** | **Integer** | The number of flow files that have been dropped thus far. |  [optional]
**droppedSize** | **Long** | The size of flow files that have been dropped thus far in bytes. |  [optional]
**dropped** | **String** | The count and size of flow files that have been dropped thus far. |  [optional]
**state** | **String** | The current state of the drop request. |  [optional]



