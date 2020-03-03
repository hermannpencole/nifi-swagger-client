
# VersionedFlow

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**link** | [**Link**](Link.md) | An WebLink to this entity. |  [optional]
**identifier** | **String** | An ID to uniquely identify this object. |  [optional]
**name** | **String** | The name of the item. |  [optional]
**description** | **String** | A description of the item. |  [optional]
**bucketIdentifier** | **String** | The identifier of the bucket this items belongs to. |  [optional]
**bucketName** | **String** | The name of the bucket this items belongs to. |  [optional]
**createdTimestamp** | **Long** | The timestamp of when the item was created. |  [optional]
**modifiedTimestamp** | **Long** | The timestamp of when the item was last modified. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The type of item. | 
**permissions** | [**Permissions**](Permissions.md) | The access that the current user has to the bucket containing this item. |  [optional]
**versionCount** | **Long** | The number of versions of this flow. |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
FLOW | &quot;Flow&quot;



