
# RemoteProcessGroupPortDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The id of the port. |  [optional]
**targetId** | **String** | The id of the target port. |  [optional]
**versionedComponentId** | **String** | The ID of the corresponding component that is under version control |  [optional]
**groupId** | **String** | The id of the remote process group that the port resides in. |  [optional]
**name** | **String** | The name of the target port. |  [optional]
**comments** | **String** | The comments as configured on the target port. |  [optional]
**concurrentlySchedulableTaskCount** | **Integer** | The number of task that may transmit flowfiles to the target port concurrently. |  [optional]
**transmitting** | **Boolean** | Whether the remote port is configured for transmission. |  [optional]
**useCompression** | **Boolean** | Whether the flowfiles are compressed when sent to the target port. |  [optional]
**exists** | **Boolean** | Whether the target port exists. |  [optional]
**targetRunning** | **Boolean** | Whether the target port is running. |  [optional]
**connected** | **Boolean** | Whether the port has either an incoming or outgoing connection. |  [optional]
**batchSettings** | [**BatchSettingsDTO**](BatchSettingsDTO.md) | The batch settings for data transmission. |  [optional]



