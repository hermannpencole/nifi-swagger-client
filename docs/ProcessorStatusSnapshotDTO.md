
# ProcessorStatusSnapshotDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The id of the processor. |  [optional]
**groupId** | **String** | The id of the parent process group to which the processor belongs. |  [optional]
**name** | **String** | The name of the prcessor. |  [optional]
**type** | **String** | The type of the processor. |  [optional]
**runStatus** | [**RunStatusEnum**](#RunStatusEnum) | The state of the processor. |  [optional]
**bytesRead** | **Long** | The number of bytes read by this Processor in the last 5 mintues |  [optional]
**bytesWritten** | **Long** | The number of bytes written by this Processor in the last 5 minutes |  [optional]
**read** | **String** | The number of bytes read in the last 5 minutes. |  [optional]
**written** | **String** | The number of bytes written in the last 5 minutes. |  [optional]
**flowFilesIn** | **Integer** | The number of FlowFiles that have been accepted in the last 5 minutes |  [optional]
**bytesIn** | **Long** | The size of the FlowFiles that have been accepted in the last 5 minutes |  [optional]
**input** | **String** | The count/size of flowfiles that have been accepted in the last 5 minutes. |  [optional]
**flowFilesOut** | **Integer** | The number of FlowFiles transferred to a Connection in the last 5 minutes |  [optional]
**bytesOut** | **Long** | The size of the FlowFiles transferred to a Connection in the last 5 minutes |  [optional]
**output** | **String** | The count/size of flowfiles that have been processed in the last 5 minutes. |  [optional]
**taskCount** | **Integer** | The number of times this Processor has run in the last 5 minutes |  [optional]
**tasksDurationNanos** | **Long** | The number of nanoseconds that this Processor has spent running in the last 5 minutes |  [optional]
**tasks** | **String** | The total number of task this connectable has completed over the last 5 minutes. |  [optional]
**tasksDuration** | **String** | The total duration of all tasks for this connectable over the last 5 minutes. |  [optional]
**activeThreadCount** | **Integer** | The number of threads currently executing in the processor. |  [optional]


<a name="RunStatusEnum"></a>
## Enum: RunStatusEnum
Name | Value
---- | -----
RUNNING | &quot;RUNNING&quot;
STOPPED | &quot;STOPPED&quot;
DISABLED | &quot;DISABLED&quot;
INVALID | &quot;INVALID&quot;



