
# ConnectionStatusSnapshotDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The id of the connection. |  [optional]
**groupId** | **String** | The id of the process group the connection belongs to. |  [optional]
**name** | **String** | The name of the connection. |  [optional]
**sourceId** | **String** | The id of the source of the connection. |  [optional]
**sourceName** | **String** | The name of the source of the connection. |  [optional]
**destinationId** | **String** | The id of the destination of the connection. |  [optional]
**destinationName** | **String** | The name of the destination of the connection. |  [optional]
**flowFilesIn** | **Integer** | The number of FlowFiles that have come into the connection in the last 5 minutes. |  [optional]
**bytesIn** | **Long** | The size of the FlowFiles that have come into the connection in the last 5 minutes. |  [optional]
**input** | **String** | The input count/size for the connection in the last 5 minutes, pretty printed. |  [optional]
**flowFilesOut** | **Integer** | The number of FlowFiles that have left the connection in the last 5 minutes. |  [optional]
**bytesOut** | **Long** | The number of bytes that have left the connection in the last 5 minutes. |  [optional]
**output** | **String** | The output count/sie for the connection in the last 5 minutes, pretty printed. |  [optional]
**flowFilesQueued** | **Integer** | The number of FlowFiles that are currently queued in the connection. |  [optional]
**bytesQueued** | **Long** | The size of the FlowFiles that are currently queued in the connection. |  [optional]
**queued** | **String** | The total count and size of queued flowfiles formatted. |  [optional]
**queuedSize** | **String** | The total size of flowfiles that are queued formatted. |  [optional]
**queuedCount** | **String** | The number of flowfiles that are queued, pretty printed. |  [optional]



