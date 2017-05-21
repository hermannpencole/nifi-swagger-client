
# ControllerDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The id of the NiFi. |  [optional]
**name** | **String** | The name of the NiFi. |  [optional]
**comments** | **String** | The comments for the NiFi. |  [optional]
**runningCount** | **Integer** | The number of running components in the NiFi. |  [optional]
**stoppedCount** | **Integer** | The number of stopped components in the NiFi. |  [optional]
**invalidCount** | **Integer** | The number of invalid components in the NiFi. |  [optional]
**disabledCount** | **Integer** | The number of disabled components in the NiFi. |  [optional]
**activeRemotePortCount** | **Integer** | The number of active remote ports contained in the NiFi. |  [optional]
**inactiveRemotePortCount** | **Integer** | The number of inactive remote ports contained in the NiFi. |  [optional]
**inputPortCount** | **Integer** | The number of input ports contained in the NiFi. |  [optional]
**outputPortCount** | **Integer** | The number of output ports in the NiFi. |  [optional]
**remoteSiteListeningPort** | **Integer** | The Socket Port on which this instance is listening for Remote Transfers of Flow Files. If this instance is not configured to receive Flow Files from remote instances, this will be null. |  [optional]
**remoteSiteHttpListeningPort** | **Integer** | The HTTP(S) Port on which this instance is listening for Remote Transfers of Flow Files. If this instance is not configured to receive Flow Files from remote instances, this will be null. |  [optional]
**siteToSiteSecure** | **Boolean** | Indicates whether or not Site-to-Site communications with this instance is secure (2-way authentication). |  [optional]
**instanceId** | **String** | If clustered, the id of the Cluster Manager, otherwise the id of the NiFi. |  [optional]
**inputPorts** | [**List&lt;PortDTO&gt;**](PortDTO.md) | The input ports available to send data to for the NiFi. |  [optional]
**outputPorts** | [**List&lt;PortDTO&gt;**](PortDTO.md) | The output ports available to received data from the NiFi. |  [optional]



