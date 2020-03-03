
# FlowFileDTO

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
**attributes** | **Map&lt;String, String&gt;** | The FlowFile attributes. |  [optional]
**contentClaimSection** | **String** | The section in which the content claim lives. |  [optional]
**contentClaimContainer** | **String** | The container in which the content claim lives. |  [optional]
**contentClaimIdentifier** | **String** | The identifier of the content claim. |  [optional]
**contentClaimOffset** | **Long** | The offset into the content claim where the flowfile&#39;s content begins. |  [optional]
**contentClaimFileSize** | **String** | The file size of the content claim formatted. |  [optional]
**contentClaimFileSizeBytes** | **Long** | The file size of the content claim in bytes. |  [optional]
**penalized** | **Boolean** | If the FlowFile is penalized. |  [optional]



