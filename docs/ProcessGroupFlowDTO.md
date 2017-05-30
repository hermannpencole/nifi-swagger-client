
# ProcessGroupFlowDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The id of the component. |  [optional]
**uri** | **String** | The URI for futures requests to the component. |  [optional]
**parentGroupId** | **String** | The id of parent process group of this component if applicable. |  [optional]
**breadcrumb** | [**FlowBreadcrumbEntity**](FlowBreadcrumbEntity.md) | The breadcrumb of the process group. |  [optional]
**flow** | [**FlowDTO**](FlowDTO.md) | The flow structure starting at this Process Group. |  [optional]
**lastRefreshed** | [**DateTime**](DateTime.md) | The time the flow for the process group was last refreshed. |  [optional]



