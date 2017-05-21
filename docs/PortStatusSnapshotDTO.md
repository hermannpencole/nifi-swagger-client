
# PortStatusSnapshotDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The id of the port. |  [optional]
**groupId** | **String** | The id of the parent process group of the port. |  [optional]
**name** | **String** | The name of the port. |  [optional]
**activeThreadCount** | **Integer** | The active thread count for the port. |  [optional]
**flowFilesIn** | **Integer** | The number of FlowFiles that have been accepted in the last 5 minutes. |  [optional]
**bytesIn** | **Long** | The size of hte FlowFiles that have been accepted in the last 5 minutes. |  [optional]
**input** | **String** | The count/size of flowfiles that have been accepted in the last 5 minutes. |  [optional]
**flowFilesOut** | **Integer** | The number of FlowFiles that have been processed in the last 5 minutes. |  [optional]
**bytesOut** | **Long** | The number of bytes that have been processed in the last 5 minutes. |  [optional]
**output** | **String** | The count/size of flowfiles that have been processed in the last 5 minutes. |  [optional]
**transmitting** | **Boolean** | Whether the port has incoming or outgoing connections to a remote NiFi. |  [optional]
**runStatus** | **String** | The run status of the port. |  [optional]



