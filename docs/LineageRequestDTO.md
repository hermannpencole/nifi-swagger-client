
# LineageRequestDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eventId** | **Long** |  |  [optional]
**lineageRequestType** | [**LineageRequestTypeEnum**](#LineageRequestTypeEnum) | The type of lineage request. PARENTS will return the lineage for the flowfiles that are parents of the specified event. CHILDREN will return the lineage for the flowfiles that are children of the specified event. FLOWFILE will return the lineage for the specified flowfile. |  [optional]
**uuid** | **String** | The uuid that was used to generate the lineage. |  [optional]
**clusterNodeId** | **String** | The id of the node where this lineage originated if clustered. |  [optional]


<a name="LineageRequestTypeEnum"></a>
## Enum: LineageRequestTypeEnum
Name | Value
---- | -----
PARENTS | &quot;PARENTS&quot;
CHILDREN | &quot;CHILDREN&quot;
FLOWFILE | &quot;FLOWFILE&quot;
AND_FLOWFILE | &quot;and FLOWFILE&quot;



