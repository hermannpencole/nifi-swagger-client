
# NodeStatusSnapshotsDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**nodeId** | **String** | The id of the node. |  [optional]
**address** | **String** | The node&#39;s host/ip address. |  [optional]
**apiPort** | **Integer** | The port the node is listening for API requests. |  [optional]
**statusSnapshots** | [**List&lt;StatusSnapshotDTO&gt;**](StatusSnapshotDTO.md) | A list of StatusSnapshotDTO objects that provide the actual metric values for the component for this node. |  [optional]



