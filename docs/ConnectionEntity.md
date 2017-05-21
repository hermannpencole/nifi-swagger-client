
# ConnectionEntity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**revision** | [**RevisionDTO**](RevisionDTO.md) | The revision for this request/response. The revision is required for any mutable flow requests and is included in all responses. |  [optional]
**id** | **String** | The id of the component. |  [optional]
**uri** | **String** | The URI for futures requests to the component. |  [optional]
**position** | [**PositionDTO**](PositionDTO.md) | The position of this component in the UI if applicable. |  [optional]
**permissions** | [**PermissionsDTO**](PermissionsDTO.md) | The permissions for this component. |  [optional]
**bulletins** | [**List&lt;BulletinEntity&gt;**](BulletinEntity.md) | The bulletins for this component. |  [optional]
**component** | [**ConnectionDTO**](ConnectionDTO.md) |  |  [optional]
**status** | [**ConnectionStatusDTO**](ConnectionStatusDTO.md) | The status of the connection. |  [optional]
**bends** | [**List&lt;PositionDTO&gt;**](PositionDTO.md) | The bend points on the connection. |  [optional]
**labelIndex** | **Integer** | The index of the bend point where to place the connection label. |  [optional]
**getzIndex** | **Long** | The z index of the connection. |  [optional]
**sourceId** | **String** | The identifier of the source of this connection. |  [optional]
**sourceGroupId** | **String** | The identifier of the group of the source of this connection. |  [optional]
**sourceType** | [**SourceTypeEnum**](#SourceTypeEnum) | The type of component the source connectable is. | 
**destinationId** | **String** | The identifier of the destination of this connection. |  [optional]
**destinationGroupId** | **String** | The identifier of the group of the destination of this connection. |  [optional]
**destinationType** | [**DestinationTypeEnum**](#DestinationTypeEnum) | The type of component the destination connectable is. | 


<a name="SourceTypeEnum"></a>
## Enum: SourceTypeEnum
Name | Value
---- | -----
PROCESSOR | &quot;PROCESSOR&quot;
REMOTE_INPUT_PORT | &quot;REMOTE_INPUT_PORT&quot;
REMOTE_OUTPUT_PORT | &quot;REMOTE_OUTPUT_PORT&quot;
INPUT_PORT | &quot;INPUT_PORT&quot;
OUTPUT_PORT | &quot;OUTPUT_PORT&quot;
FUNNEL | &quot;FUNNEL&quot;


<a name="DestinationTypeEnum"></a>
## Enum: DestinationTypeEnum
Name | Value
---- | -----
PROCESSOR | &quot;PROCESSOR&quot;
REMOTE_INPUT_PORT | &quot;REMOTE_INPUT_PORT&quot;
REMOTE_OUTPUT_PORT | &quot;REMOTE_OUTPUT_PORT&quot;
INPUT_PORT | &quot;INPUT_PORT&quot;
OUTPUT_PORT | &quot;OUTPUT_PORT&quot;
FUNNEL | &quot;FUNNEL&quot;



