
# RemoteProcessGroupStatusSnapshotDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The id of the remote process group. |  [optional]
**groupId** | **String** | The id of the parent process group the remote process group resides in. |  [optional]
**name** | **String** | The name of the remote process group. |  [optional]
**targetUri** | **String** | The URI of the target system. |  [optional]
**transmissionStatus** | **String** | The transmission status of the remote process group. |  [optional]
**activeThreadCount** | **Integer** | The number of active threads for the remote process group. |  [optional]
**flowFilesSent** | **Integer** | The number of FlowFiles sent to the remote process group in the last 5 minutes. |  [optional]
**bytesSent** | **Long** | The size of the FlowFiles sent to the remote process group in the last 5 minutes. |  [optional]
**sent** | **String** | The count/size of the flowfiles sent to the remote process group in the last 5 minutes. |  [optional]
**flowFilesReceived** | **Integer** | The number of FlowFiles received from the remote process group in the last 5 minutes. |  [optional]
**bytesReceived** | **Long** | The size of the FlowFiles received from the remote process group in the last 5 minutes. |  [optional]
**received** | **String** | The count/size of the flowfiles received from the remote process group in the last 5 minutes. |  [optional]



