
# LineageRequestDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eventId** | **Long** | The event id that was used to generate this lineage, if applicable. The event id is allowed for any type of lineageRequestType. If the lineageRequestType is FLOWFILE and the flowfile uuid is also included in the request, the event id will be ignored. |  [optional]
**lineageRequestType** | [**LineageRequestTypeEnum**](#LineageRequestTypeEnum) | The type of lineage request. PARENTS will return the lineage for the flowfiles that are parents of the specified event. CHILDREN will return the lineage for the flowfiles that are children of the specified event. FLOWFILE will return the lineage for the specified flowfile. |  [optional]
**uuid** | **String** | The flowfile uuid that was used to generate the lineage. The flowfile uuid is only allowed when the lineageRequestType is FLOWFILE and will take precedence over event id. |  [optional]
**clusterNodeId** | **String** | The id of the node where this lineage originated if clustered. |  [optional]


<a name="LineageRequestTypeEnum"></a>
## Enum: LineageRequestTypeEnum
Name | Value
---- | -----
PARENTS | &quot;PARENTS&quot;
CHILDREN | &quot;CHILDREN&quot;
AND_FLOWFILE | &quot;and FLOWFILE&quot;



