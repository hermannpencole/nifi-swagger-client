
# SystemDiagnosticsSnapshotDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**totalNonHeap** | **String** | Total size of non heap. |  [optional]
**totalNonHeapBytes** | **Long** | Total number of bytes allocated to the JVM not used for heap |  [optional]
**usedNonHeap** | **String** | Amount of use non heap. |  [optional]
**usedNonHeapBytes** | **Long** | Total number of bytes used by the JVM not in the heap space |  [optional]
**freeNonHeap** | **String** | Amount of free non heap. |  [optional]
**freeNonHeapBytes** | **Long** | Total number of free non-heap bytes available to the JVM |  [optional]
**maxNonHeap** | **String** | Maximum size of non heap. |  [optional]
**maxNonHeapBytes** | **Long** | The maximum number of bytes that the JVM can use for non-heap purposes |  [optional]
**nonHeapUtilization** | **String** | Utilization of non heap. |  [optional]
**totalHeap** | **String** | Total size of heap. |  [optional]
**totalHeapBytes** | **Long** | The total number of bytes that are available for the JVM heap to use |  [optional]
**usedHeap** | **String** | Amount of used heap. |  [optional]
**usedHeapBytes** | **Long** | The number of bytes of JVM heap that are currently being used |  [optional]
**freeHeap** | **String** | Amount of free heap. |  [optional]
**freeHeapBytes** | **Long** | The number of bytes that are allocated to the JVM heap but not currently being used |  [optional]
**maxHeap** | **String** | Maximum size of heap. |  [optional]
**maxHeapBytes** | **Long** | The maximum number of bytes that can be used by the JVM |  [optional]
**heapUtilization** | **String** | Utilization of heap. |  [optional]
**availableProcessors** | **Integer** | Number of available processors if supported by the underlying system. |  [optional]
**processorLoadAverage** | **Double** | The processor load average if supported by the underlying system. |  [optional]
**totalThreads** | **Integer** | Total number of threads. |  [optional]
**daemonThreads** | **Integer** | Number of daemon threads. |  [optional]
**uptime** | **String** | The uptime of the Java virtual machine |  [optional]
**flowFileRepositoryStorageUsage** | [**StorageUsageDTO**](StorageUsageDTO.md) | The flowfile repository storage usage. |  [optional]
**contentRepositoryStorageUsage** | [**List&lt;StorageUsageDTO&gt;**](StorageUsageDTO.md) | The content repository storage usage. |  [optional]
**provenanceRepositoryStorageUsage** | [**List&lt;StorageUsageDTO&gt;**](StorageUsageDTO.md) | The provenance repository storage usage. |  [optional]
**garbageCollection** | [**List&lt;GarbageCollectionDTO&gt;**](GarbageCollectionDTO.md) | The garbage collection details. |  [optional]
**statsLastRefreshed** | **String** | When the diagnostics were generated. |  [optional]
**versionInfo** | [**VersionInfoDTO**](VersionInfoDTO.md) | The nifi, os, java, and build version information |  [optional]



