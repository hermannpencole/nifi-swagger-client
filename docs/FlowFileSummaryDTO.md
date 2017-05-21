
# FlowFileSummaryDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uri** | **String** | The URI that can be used to access this FlowFile. |  [optional]
**uuid** | **String** | The FlowFile UUID. |  [optional]
**filename** | **String** | The FlowFile filename. |  [optional]
**position** | **Integer** | The FlowFile&#39;s position in the queue. |  [optional]
**size** | **Long** | The FlowFile file size. |  [optional]
**queuedDuration** | **Long** | How long this FlowFile has been enqueued. |  [optional]
**lineageDuration** | **Long** | Duration since the FlowFile&#39;s greatest ancestor entered the flow. |  [optional]
**clusterNodeId** | **String** | The id of the node where this FlowFile resides. |  [optional]
**clusterNodeAddress** | **String** | The label for the node where this FlowFile resides. |  [optional]
**penalized** | **Boolean** | If the FlowFile is penalized. |  [optional]



