
# ProcessGroupStatusSnapshotDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The id of the process group. |  [optional]
**name** | **String** | The name of this process group. |  [optional]
**connectionStatusSnapshots** | [**List&lt;ConnectionStatusSnapshotEntity&gt;**](ConnectionStatusSnapshotEntity.md) | The status of all conenctions in the process group. |  [optional]
**processorStatusSnapshots** | [**List&lt;ProcessorStatusSnapshotEntity&gt;**](ProcessorStatusSnapshotEntity.md) | The status of all processors in the process group. |  [optional]
**processGroupStatusSnapshots** | [**List&lt;ProcessGroupStatusSnapshotEntity&gt;**](ProcessGroupStatusSnapshotEntity.md) | The status of all process groups in the process group. |  [optional]
**remoteProcessGroupStatusSnapshots** | [**List&lt;RemoteProcessGroupStatusSnapshotEntity&gt;**](RemoteProcessGroupStatusSnapshotEntity.md) | The status of all remote process groups in the process group. |  [optional]
**inputPortStatusSnapshots** | [**List&lt;PortStatusSnapshotEntity&gt;**](PortStatusSnapshotEntity.md) | The status of all input ports in the process group. |  [optional]
**outputPortStatusSnapshots** | [**List&lt;PortStatusSnapshotEntity&gt;**](PortStatusSnapshotEntity.md) | The status of all output ports in the process group. |  [optional]
**flowFilesIn** | **Integer** | The number of FlowFiles that have come into this ProcessGroup in the last 5 minutes |  [optional]
**bytesIn** | **Long** | The number of bytes that have come into this ProcessGroup in the last 5 minutes |  [optional]
**input** | **String** | The input count/size for the process group in the last 5 minutes (pretty printed). |  [optional]
**flowFilesQueued** | **Integer** | The number of FlowFiles that are queued up in this ProcessGroup right now |  [optional]
**bytesQueued** | **Long** | The number of bytes that are queued up in this ProcessGroup right now |  [optional]
**queued** | **String** | The count/size that is queued in the the process group. |  [optional]
**queuedCount** | **String** | The count that is queued for the process group. |  [optional]
**queuedSize** | **String** | The size that is queued for the process group. |  [optional]
**bytesRead** | **Long** | The number of bytes read by components in this ProcessGroup in the last 5 minutes |  [optional]
**read** | **String** | The number of bytes read in the last 5 minutes. |  [optional]
**bytesWritten** | **Long** | The number of bytes written by components in this ProcessGroup in the last 5 minutes |  [optional]
**written** | **String** | The number of bytes written in the last 5 minutes. |  [optional]
**flowFilesOut** | **Integer** | The number of FlowFiles transferred out of this ProcessGroup in the last 5 minutes |  [optional]
**bytesOut** | **Long** | The number of bytes transferred out of this ProcessGroup in the last 5 minutes |  [optional]
**output** | **String** | The output count/size for the process group in the last 5 minutes. |  [optional]
**flowFilesTransferred** | **Integer** | The number of FlowFiles transferred in this ProcessGroup in the last 5 minutes |  [optional]
**bytesTransferred** | **Long** | The number of bytes transferred in this ProcessGroup in the last 5 minutes |  [optional]
**transferred** | **String** | The count/size transferred to/frome queues in the process group in the last 5 minutes. |  [optional]
**bytesReceived** | **Long** | The number of bytes received from external sources by components within this ProcessGroup in the last 5 minutes |  [optional]
**flowFilesReceived** | **Integer** | The number of FlowFiles received from external sources by components within this ProcessGroup in the last 5 minutes |  [optional]
**received** | **String** | The count/size sent to the process group in the last 5 minutes. |  [optional]
**bytesSent** | **Long** | The number of bytes sent to an external sink by components within this ProcessGroup in the last 5 minutes |  [optional]
**flowFilesSent** | **Integer** | The number of FlowFiles sent to an external sink by components within this ProcessGroup in the last 5 minutes |  [optional]
**sent** | **String** | The count/size sent from this process group in the last 5 minutes. |  [optional]
**activeThreadCount** | **Integer** | The active thread count for this process group. |  [optional]



