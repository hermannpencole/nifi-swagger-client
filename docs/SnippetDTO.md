
# SnippetDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The id of the snippet. |  [optional]
**uri** | **String** | The URI of the snippet. |  [optional]
**parentGroupId** | **String** | The group id for the components in the snippet. |  [optional]
**processGroups** | [**Map&lt;String, RevisionDTO&gt;**](RevisionDTO.md) | The ids of the process groups in this snippet. These ids will be populated within each response. They can be specified when creating a snippet. However, once a snippet has been created its contents cannot be modified (these ids are ignored during update requests). |  [optional]
**remoteProcessGroups** | [**Map&lt;String, RevisionDTO&gt;**](RevisionDTO.md) | The ids of the remote process groups in this snippet. These ids will be populated within each response. They can be specified when creating a snippet. However, once a snippet has been created its contents cannot be modified (these ids are ignored during update requests). |  [optional]
**processors** | [**Map&lt;String, RevisionDTO&gt;**](RevisionDTO.md) | The ids of the processors in this snippet. These ids will be populated within each response. They can be specified when creating a snippet. However, once a snippet has been created its contents cannot be modified (these ids are ignored during update requests). |  [optional]
**inputPorts** | [**Map&lt;String, RevisionDTO&gt;**](RevisionDTO.md) | The ids of the input ports in this snippet. These ids will be populated within each response. They can be specified when creating a snippet. However, once a snippet has been created its contents cannot be modified (these ids are ignored during update requests). |  [optional]
**outputPorts** | [**Map&lt;String, RevisionDTO&gt;**](RevisionDTO.md) | The ids of the output ports in this snippet. These ids will be populated within each response. They can be specified when creating a snippet. However, once a snippet has been created its contents cannot be modified (these ids are ignored during update requests). |  [optional]
**connections** | [**Map&lt;String, RevisionDTO&gt;**](RevisionDTO.md) | The ids of the connections in this snippet. These ids will be populated within each response. They can be specified when creating a snippet. However, once a snippet has been created its contents cannot be modified (these ids are ignored during update requests). |  [optional]
**labels** | [**Map&lt;String, RevisionDTO&gt;**](RevisionDTO.md) | The ids of the labels in this snippet. These ids will be populated within each response. They can be specified when creating a snippet. However, once a snippet has been created its contents cannot be modified (these ids are ignored during update requests). |  [optional]
**funnels** | [**Map&lt;String, RevisionDTO&gt;**](RevisionDTO.md) | The ids of the funnels in this snippet. These ids will be populated within each response. They can be specified when creating a snippet. However, once a snippet has been created its contents cannot be modified (these ids are ignored during update requests). |  [optional]



