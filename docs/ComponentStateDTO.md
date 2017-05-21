
# ComponentStateDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**componentId** | **String** | The component identifier. |  [optional]
**stateDescription** | **String** | Description of the state this component persists. |  [optional]
**clusterState** | [**StateMapDTO**](StateMapDTO.md) | The cluster state for this component, or null if this NiFi is a standalone instance. |  [optional]
**localState** | [**StateMapDTO**](StateMapDTO.md) | The local state for this component. |  [optional]



