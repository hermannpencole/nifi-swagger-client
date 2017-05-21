
# NodeDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**nodeId** | **String** | The id of the node. |  [optional]
**address** | **String** | The node&#39;s host/ip address. |  [optional]
**apiPort** | **Integer** | The port the node is listening for API requests. |  [optional]
**status** | **String** | The node&#39;s status. |  [optional]
**heartbeat** | **String** | the time of the nodes&#39;s last heartbeat. |  [optional]
**connectionRequested** | **String** | The time of the node&#39;s last connection request. |  [optional]
**roles** | **List&lt;String&gt;** | The roles of this node. |  [optional]
**activeThreadCount** | **Integer** | The active threads for the NiFi on the node. |  [optional]
**queued** | **String** | The queue the NiFi on the node. |  [optional]
**events** | [**List&lt;NodeEventDTO&gt;**](NodeEventDTO.md) | The node&#39;s events. |  [optional]
**nodeStartTime** | **String** | The time at which this Node was last refreshed. |  [optional]



