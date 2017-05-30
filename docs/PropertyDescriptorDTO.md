
# PropertyDescriptorDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name for the property. |  [optional]
**displayName** | **String** | The human readable name for the property. |  [optional]
**description** | **String** | The descriptoin for the property. Used to relay additional details to a user or provide a mechanism of documenting intent. |  [optional]
**defaultValue** | **String** | The default value for the property. |  [optional]
**allowableValues** | [**List&lt;AllowableValueEntity&gt;**](AllowableValueEntity.md) | Allowable values for the property. If empty then the allowed values are not constrained. |  [optional]
**required** | **Boolean** | Whether the property is required. |  [optional]
**sensitive** | **Boolean** | Whether the property is sensitive and protected whenever stored or represented. |  [optional]
**dynamic** | **Boolean** | Whether the property is dynamic (user-defined). |  [optional]
**supportsEl** | **Boolean** | Whether the property supports expression language. |  [optional]
**identifiesControllerService** | **String** | If the property identifies a controller service, this returns the fully qualified type. |  [optional]



