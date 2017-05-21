
# ConnectionDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The id of the component. |  [optional]
**parentGroupId** | **String** | The id of parent process group of this component if applicable. |  [optional]
**position** | [**PositionDTO**](PositionDTO.md) | The position of this component in the UI if applicable. |  [optional]
**source** | [**ConnectableDTO**](ConnectableDTO.md) | The source of the connection. |  [optional]
**destination** | [**ConnectableDTO**](ConnectableDTO.md) | The destination of the connection. |  [optional]
**name** | **String** | The name of the connection. |  [optional]
**labelIndex** | **Integer** | The index of the bend point where to place the connection label. |  [optional]
**getzIndex** | **Long** | The z index of the connection. |  [optional]
**selectedRelationships** | **List&lt;String&gt;** | The selected relationship that comprise the connection. |  [optional]
**availableRelationships** | **List&lt;String&gt;** | The relationships that the source of the connection currently supports. |  [optional]
**backPressureObjectThreshold** | **Long** | The object count threshold for determining when back pressure is applied. Updating this value is a passive change in the sense that it won&#39;t impact whether existing files over the limit are affected but it does help feeder processors to stop pushing too much into this work queue. |  [optional]
**backPressureDataSizeThreshold** | **String** | The object data size threshold for determining when back pressure is applied. Updating this value is a passive change in the sense that it won&#39;t impact whether existing files over the limit are affected but it does help feeder processors to stop pushing too much into this work queue. |  [optional]
**flowFileExpiration** | **String** | The amount of time a flow file may be in the flow before it will be automatically aged out of the flow. Once a flow file reaches this age it will be terminated from the flow the next time a processor attempts to start work on it. |  [optional]
**prioritizers** | **List&lt;String&gt;** | The comparators used to prioritize the queue. |  [optional]
**bends** | [**List&lt;PositionDTO&gt;**](PositionDTO.md) | The bend points on the connection. |  [optional]



