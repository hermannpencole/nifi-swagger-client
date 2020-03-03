
# VersionedFlowUpdateRequestDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestId** | **String** | The unique ID of this request. |  [optional]
**processGroupId** | **String** | The unique ID of the Process Group that the variable registry belongs to |  [optional]
**uri** | **String** | The URI for future requests to this drop request. |  [optional]
**lastUpdated** | **String** | The last time this request was updated. |  [optional]
**complete** | **Boolean** | Whether or not this request has completed |  [optional]
**failureReason** | **String** | An explanation of why this request failed, or null if this request has not failed |  [optional]
**percentCompleted** | **Integer** | The percentage complete for the request, between 0 and 100 |  [optional]
**state** | **String** | The state of the request |  [optional]
**versionControlInformation** | [**VersionControlInformationDTO**](VersionControlInformationDTO.md) | The VersionControlInformation that describes where the Versioned Flow is located; this may not be populated until the request is completed. |  [optional]



