
# ControllerStatusDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activeThreadCount** | **Integer** | The number of active threads in the NiFi. |  [optional]
**queued** | **String** | The number of flowfiles queued in the NiFi. |  [optional]
**flowFilesQueued** | **Integer** | The number of FlowFiles queued across the entire flow |  [optional]
**bytesQueued** | **Long** | The size of the FlowFiles queued across the entire flow |  [optional]
**runningCount** | **Integer** | The number of running components in the NiFi. |  [optional]
**stoppedCount** | **Integer** | The number of stopped components in the NiFi. |  [optional]
**invalidCount** | **Integer** | The number of invalid components in the NiFi. |  [optional]
**disabledCount** | **Integer** | The number of disabled components in the NiFi. |  [optional]
**activeRemotePortCount** | **Integer** | The number of active remote ports in the NiFi. |  [optional]
**inactiveRemotePortCount** | **Integer** | The number of inactive remote ports in the NiFi. |  [optional]
**upToDateCount** | **Integer** | The number of up to date versioned process groups in the NiFi. |  [optional]
**locallyModifiedCount** | **Integer** | The number of locally modified versioned process groups in the NiFi. |  [optional]
**staleCount** | **Integer** | The number of stale versioned process groups in the NiFi. |  [optional]
**locallyModifiedAndStaleCount** | **Integer** | The number of locally modified and stale versioned process groups in the NiFi. |  [optional]
**syncFailureCount** | **Integer** | The number of versioned process groups in the NiFi that are unable to sync to a registry. |  [optional]



