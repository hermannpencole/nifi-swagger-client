
# VariableRegistryUpdateRequestDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestId** | **String** | The unique ID of this request. |  [optional]
**processGroupId** | **String** | The unique ID of the Process Group that the variable registry belongs to |  [optional]
**uri** | **String** | The URI for future requests to this drop request. |  [optional]
**submissionTime** | **String** | The time at which this request was submitted. |  [optional]
**lastUpdated** | **String** | The last time this request was updated. |  [optional]
**complete** | **Boolean** | Whether or not this request has completed |  [optional]
**failureReason** | **String** | An explanation of why this request failed, or null if this request has not failed |  [optional]
**updateSteps** | [**List&lt;VariableRegistryUpdateStepDTO&gt;**](VariableRegistryUpdateStepDTO.md) | The steps that are required in order to complete the request, along with the status of each |  [optional]
**affectedComponents** | [**List&lt;AffectedComponentEntity&gt;**](AffectedComponentEntity.md) | A set of all components that will be affected if the value of this variable is changed |  [optional]



