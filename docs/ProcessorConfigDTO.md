
# ProcessorConfigDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**properties** | **Map&lt;String, String&gt;** | The properties for the processor. Properties whose value is not set will only contain the property name. |  [optional]
**descriptors** | [**Map&lt;String, PropertyDescriptorDTO&gt;**](PropertyDescriptorDTO.md) | Descriptors for the processor&#39;s properties. |  [optional]
**schedulingPeriod** | **String** | The frequency with which to schedule the processor. The format of the value will depend on th value of schedulingStrategy. |  [optional]
**schedulingStrategy** | **String** | Indcates whether the prcessor should be scheduled to run in event or timer driven mode. |  [optional]
**penaltyDuration** | **String** | The amout of time that is used when the process penalizes a flowfile. |  [optional]
**yieldDuration** | **String** | The amount of time that must elapse before this processor is scheduled again after yielding. |  [optional]
**bulletinLevel** | **String** | The level at which the processor will report bulletins. |  [optional]
**runDurationMillis** | **Long** | The run duration for the processor in milliseconds. |  [optional]
**concurrentlySchedulableTaskCount** | **Integer** | The number of tasks that should be concurrently schedule for the processor. If the processor doesn&#39;t allow parallol processing then any positive input will be ignored. |  [optional]
**autoTerminatedRelationships** | **List&lt;String&gt;** | The names of all relationships that cause a flow file to be terminated if the relationship is not connected elsewhere. This property differs from the &#39;isAutoTerminate&#39; property of the RelationshipDTO in that the RelationshipDTO is meant to depict the current configuration, whereas this property can be set in a DTO when updating a Processor in order to change which Relationships should be auto-terminated. |  [optional]
**comments** | **String** | The comments for the processor. |  [optional]
**customUiUrl** | **String** | The URL for the processor&#39;s custom configuration UI if applicable. |  [optional]
**lossTolerant** | **Boolean** | Whether the processor is loss tolerant. |  [optional]
**annotationData** | **String** | The annotation data for the processor used to relay configuration between a custom UI and the procesosr. |  [optional]
**defaultConcurrentTasks** | **Map&lt;String, String&gt;** | Maps default values for concurrent tasks for each applicable scheduling strategy. |  [optional]
**defaultSchedulingPeriod** | **Map&lt;String, String&gt;** | Maps default values for scheduling period for each applicable scheduling strategy. |  [optional]



