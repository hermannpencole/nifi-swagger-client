
# InstantiateTemplateRequestEntity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**originX** | **Double** | The x coordinate of the origin of the bounding box where the new components will be placed. |  [optional]
**originY** | **Double** | The y coordinate of the origin of the bounding box where the new components will be placed. |  [optional]
**templateId** | **String** | The identifier of the template. |  [optional]
**encodingVersion** | **String** | The encoding version of the flow snippet. If not specified, this is automatically populated by the node receiving the user request. If the snippet is specified, the version will be the latest. If the snippet is not specified, the version will come from the underlying template. These details need to be replicated throughout the cluster to ensure consistency. |  [optional]
**snippet** | [**FlowSnippetDTO**](FlowSnippetDTO.md) | A flow snippet of the template contents. If not specified, this is automatically populated by the node receiving the user request. These details need to be replicated throughout the cluster to ensure consistency. |  [optional]



