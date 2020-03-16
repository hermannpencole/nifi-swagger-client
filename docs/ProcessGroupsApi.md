# ProcessGroupsApi

All URIs are relative to *http://localhost/nifi-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**copySnippet**](ProcessGroupsApi.md#copySnippet) | **POST** /process-groups/{id}/snippet-instance | Copies a snippet and discards it.
[**createConnection**](ProcessGroupsApi.md#createConnection) | **POST** /process-groups/{id}/connections | Creates a connection
[**createControllerService**](ProcessGroupsApi.md#createControllerService) | **POST** /process-groups/{id}/controller-services | Creates a new controller service
[**createFunnel**](ProcessGroupsApi.md#createFunnel) | **POST** /process-groups/{id}/funnels | Creates a funnel
[**createInputPort**](ProcessGroupsApi.md#createInputPort) | **POST** /process-groups/{id}/input-ports | Creates an input port
[**createLabel**](ProcessGroupsApi.md#createLabel) | **POST** /process-groups/{id}/labels | Creates a label
[**createOutputPort**](ProcessGroupsApi.md#createOutputPort) | **POST** /process-groups/{id}/output-ports | Creates an output port
[**createProcessGroup**](ProcessGroupsApi.md#createProcessGroup) | **POST** /process-groups/{id}/process-groups | Creates a process group
[**createProcessor**](ProcessGroupsApi.md#createProcessor) | **POST** /process-groups/{id}/processors | Creates a new processor
[**createRemoteProcessGroup**](ProcessGroupsApi.md#createRemoteProcessGroup) | **POST** /process-groups/{id}/remote-process-groups | Creates a new process group
[**createTemplate**](ProcessGroupsApi.md#createTemplate) | **POST** /process-groups/{id}/templates | Creates a template and discards the specified snippet.
[**deleteVariableRegistryUpdateRequest**](ProcessGroupsApi.md#deleteVariableRegistryUpdateRequest) | **DELETE** /process-groups/{groupId}/variable-registry/update-requests/{updateId} | Deletes an update request for a process group&#39;s variable registry. If the request is not yet complete, it will automatically be cancelled.
[**getConnections**](ProcessGroupsApi.md#getConnections) | **GET** /process-groups/{id}/connections | Gets all connections
[**getFunnels**](ProcessGroupsApi.md#getFunnels) | **GET** /process-groups/{id}/funnels | Gets all funnels
[**getInputPorts**](ProcessGroupsApi.md#getInputPorts) | **GET** /process-groups/{id}/input-ports | Gets all input ports
[**getLabels**](ProcessGroupsApi.md#getLabels) | **GET** /process-groups/{id}/labels | Gets all labels
[**getLocalModifications**](ProcessGroupsApi.md#getLocalModifications) | **GET** /process-groups/{id}/local-modifications | Gets a list of local modifications to the Process Group since it was last synchronized with the Flow Registry
[**getOutputPorts**](ProcessGroupsApi.md#getOutputPorts) | **GET** /process-groups/{id}/output-ports | Gets all output ports
[**getProcessGroup**](ProcessGroupsApi.md#getProcessGroup) | **GET** /process-groups/{id} | Gets a process group
[**getProcessGroups**](ProcessGroupsApi.md#getProcessGroups) | **GET** /process-groups/{id}/process-groups | Gets all process groups
[**getProcessors**](ProcessGroupsApi.md#getProcessors) | **GET** /process-groups/{id}/processors | Gets all processors
[**getRemoteProcessGroups**](ProcessGroupsApi.md#getRemoteProcessGroups) | **GET** /process-groups/{id}/remote-process-groups | Gets all remote process groups
[**getVariableRegistry**](ProcessGroupsApi.md#getVariableRegistry) | **GET** /process-groups/{id}/variable-registry | Gets a process group&#39;s variable registry
[**getVariableRegistryUpdateRequest**](ProcessGroupsApi.md#getVariableRegistryUpdateRequest) | **GET** /process-groups/{groupId}/variable-registry/update-requests/{updateId} | Gets a process group&#39;s variable registry
[**importTemplate**](ProcessGroupsApi.md#importTemplate) | **POST** /process-groups/{id}/templates/import | Imports a template
[**instantiateTemplate**](ProcessGroupsApi.md#instantiateTemplate) | **POST** /process-groups/{id}/template-instance | Instantiates a template
[**removeProcessGroup**](ProcessGroupsApi.md#removeProcessGroup) | **DELETE** /process-groups/{id} | Deletes a process group
[**submitUpdateVariableRegistryRequest**](ProcessGroupsApi.md#submitUpdateVariableRegistryRequest) | **POST** /process-groups/{id}/variable-registry/update-requests | Submits a request to update a process group&#39;s variable registry
[**updateProcessGroup**](ProcessGroupsApi.md#updateProcessGroup) | **PUT** /process-groups/{id} | Updates a process group
[**updateVariableRegistry**](ProcessGroupsApi.md#updateVariableRegistry) | **PUT** /process-groups/{id}/variable-registry | Updates the contents of a Process Group&#39;s variable Registry
[**uploadTemplate**](ProcessGroupsApi.md#uploadTemplate) | **POST** /process-groups/{id}/templates/upload | Uploads a template


<a name="copySnippet"></a>
# **copySnippet**
> FlowEntity copySnippet(id, body)

Copies a snippet and discards it.



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.ProcessGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ProcessGroupsApi apiInstance = new ProcessGroupsApi();
String id = "id_example"; // String | The process group id.
CopySnippetRequestEntity body = new CopySnippetRequestEntity(); // CopySnippetRequestEntity | The copy snippet request.
try {
    FlowEntity result = apiInstance.copySnippet(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessGroupsApi#copySnippet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |
 **body** | [**CopySnippetRequestEntity**](CopySnippetRequestEntity.md)| The copy snippet request. |

### Return type

[**FlowEntity**](FlowEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createConnection"></a>
# **createConnection**
> ConnectionEntity createConnection(id, body)

Creates a connection



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.ProcessGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ProcessGroupsApi apiInstance = new ProcessGroupsApi();
String id = "id_example"; // String | The process group id.
ConnectionEntity body = new ConnectionEntity(); // ConnectionEntity | The connection configuration details.
try {
    ConnectionEntity result = apiInstance.createConnection(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessGroupsApi#createConnection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |
 **body** | [**ConnectionEntity**](ConnectionEntity.md)| The connection configuration details. |

### Return type

[**ConnectionEntity**](ConnectionEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createControllerService"></a>
# **createControllerService**
> ControllerServiceEntity createControllerService(id, body)

Creates a new controller service



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.ProcessGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ProcessGroupsApi apiInstance = new ProcessGroupsApi();
String id = "id_example"; // String | The process group id.
ControllerServiceEntity body = new ControllerServiceEntity(); // ControllerServiceEntity | The controller service configuration details.
try {
    ControllerServiceEntity result = apiInstance.createControllerService(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessGroupsApi#createControllerService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |
 **body** | [**ControllerServiceEntity**](ControllerServiceEntity.md)| The controller service configuration details. |

### Return type

[**ControllerServiceEntity**](ControllerServiceEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createFunnel"></a>
# **createFunnel**
> FunnelEntity createFunnel(id, body)

Creates a funnel



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.ProcessGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ProcessGroupsApi apiInstance = new ProcessGroupsApi();
String id = "id_example"; // String | The process group id.
FunnelEntity body = new FunnelEntity(); // FunnelEntity | The funnel configuration details.
try {
    FunnelEntity result = apiInstance.createFunnel(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessGroupsApi#createFunnel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |
 **body** | [**FunnelEntity**](FunnelEntity.md)| The funnel configuration details. |

### Return type

[**FunnelEntity**](FunnelEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createInputPort"></a>
# **createInputPort**
> PortEntity createInputPort(id, body)

Creates an input port



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.ProcessGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ProcessGroupsApi apiInstance = new ProcessGroupsApi();
String id = "id_example"; // String | The process group id.
PortEntity body = new PortEntity(); // PortEntity | The input port configuration details.
try {
    PortEntity result = apiInstance.createInputPort(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessGroupsApi#createInputPort");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |
 **body** | [**PortEntity**](PortEntity.md)| The input port configuration details. |

### Return type

[**PortEntity**](PortEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createLabel"></a>
# **createLabel**
> LabelEntity createLabel(id, body)

Creates a label



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.ProcessGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ProcessGroupsApi apiInstance = new ProcessGroupsApi();
String id = "id_example"; // String | The process group id.
LabelEntity body = new LabelEntity(); // LabelEntity | The label configuration details.
try {
    LabelEntity result = apiInstance.createLabel(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessGroupsApi#createLabel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |
 **body** | [**LabelEntity**](LabelEntity.md)| The label configuration details. |

### Return type

[**LabelEntity**](LabelEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createOutputPort"></a>
# **createOutputPort**
> PortEntity createOutputPort(id, body)

Creates an output port



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.ProcessGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ProcessGroupsApi apiInstance = new ProcessGroupsApi();
String id = "id_example"; // String | The process group id.
PortEntity body = new PortEntity(); // PortEntity | The output port configuration.
try {
    PortEntity result = apiInstance.createOutputPort(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessGroupsApi#createOutputPort");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |
 **body** | [**PortEntity**](PortEntity.md)| The output port configuration. |

### Return type

[**PortEntity**](PortEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createProcessGroup"></a>
# **createProcessGroup**
> ProcessGroupEntity createProcessGroup(id, body)

Creates a process group



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.ProcessGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ProcessGroupsApi apiInstance = new ProcessGroupsApi();
String id = "id_example"; // String | The process group id.
ProcessGroupEntity body = new ProcessGroupEntity(); // ProcessGroupEntity | The process group configuration details.
try {
    ProcessGroupEntity result = apiInstance.createProcessGroup(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessGroupsApi#createProcessGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |
 **body** | [**ProcessGroupEntity**](ProcessGroupEntity.md)| The process group configuration details. |

### Return type

[**ProcessGroupEntity**](ProcessGroupEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createProcessor"></a>
# **createProcessor**
> ProcessorEntity createProcessor(id, body)

Creates a new processor



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.ProcessGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ProcessGroupsApi apiInstance = new ProcessGroupsApi();
String id = "id_example"; // String | The process group id.
ProcessorEntity body = new ProcessorEntity(); // ProcessorEntity | The processor configuration details.
try {
    ProcessorEntity result = apiInstance.createProcessor(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessGroupsApi#createProcessor");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |
 **body** | [**ProcessorEntity**](ProcessorEntity.md)| The processor configuration details. |

### Return type

[**ProcessorEntity**](ProcessorEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createRemoteProcessGroup"></a>
# **createRemoteProcessGroup**
> RemoteProcessGroupEntity createRemoteProcessGroup(id, body)

Creates a new process group



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.ProcessGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ProcessGroupsApi apiInstance = new ProcessGroupsApi();
String id = "id_example"; // String | The process group id.
RemoteProcessGroupEntity body = new RemoteProcessGroupEntity(); // RemoteProcessGroupEntity | The remote process group configuration details.
try {
    RemoteProcessGroupEntity result = apiInstance.createRemoteProcessGroup(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessGroupsApi#createRemoteProcessGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |
 **body** | [**RemoteProcessGroupEntity**](RemoteProcessGroupEntity.md)| The remote process group configuration details. |

### Return type

[**RemoteProcessGroupEntity**](RemoteProcessGroupEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createTemplate"></a>
# **createTemplate**
> TemplateEntity createTemplate(id, body)

Creates a template and discards the specified snippet.



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.ProcessGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ProcessGroupsApi apiInstance = new ProcessGroupsApi();
String id = "id_example"; // String | The process group id.
CreateTemplateRequestEntity body = new CreateTemplateRequestEntity(); // CreateTemplateRequestEntity | The create template request.
try {
    TemplateEntity result = apiInstance.createTemplate(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessGroupsApi#createTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |
 **body** | [**CreateTemplateRequestEntity**](CreateTemplateRequestEntity.md)| The create template request. |

### Return type

[**TemplateEntity**](TemplateEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteVariableRegistryUpdateRequest"></a>
# **deleteVariableRegistryUpdateRequest**
> VariableRegistryUpdateRequestEntity deleteVariableRegistryUpdateRequest(groupId, updateId)

Deletes an update request for a process group&#39;s variable registry. If the request is not yet complete, it will automatically be cancelled.

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.ProcessGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ProcessGroupsApi apiInstance = new ProcessGroupsApi();
String groupId = "groupId_example"; // String | The process group id.
String updateId = "updateId_example"; // String | The ID of the Variable Registry Update Request
try {
    VariableRegistryUpdateRequestEntity result = apiInstance.deleteVariableRegistryUpdateRequest(groupId, updateId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessGroupsApi#deleteVariableRegistryUpdateRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**| The process group id. |
 **updateId** | **String**| The ID of the Variable Registry Update Request |

### Return type

[**VariableRegistryUpdateRequestEntity**](VariableRegistryUpdateRequestEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getConnections"></a>
# **getConnections**
> ConnectionsEntity getConnections(id)

Gets all connections



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.ProcessGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ProcessGroupsApi apiInstance = new ProcessGroupsApi();
String id = "id_example"; // String | The process group id.
try {
    ConnectionsEntity result = apiInstance.getConnections(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessGroupsApi#getConnections");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |

### Return type

[**ConnectionsEntity**](ConnectionsEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getFunnels"></a>
# **getFunnels**
> FunnelsEntity getFunnels(id)

Gets all funnels



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.ProcessGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ProcessGroupsApi apiInstance = new ProcessGroupsApi();
String id = "id_example"; // String | The process group id.
try {
    FunnelsEntity result = apiInstance.getFunnels(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessGroupsApi#getFunnels");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |

### Return type

[**FunnelsEntity**](FunnelsEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getInputPorts"></a>
# **getInputPorts**
> InputPortsEntity getInputPorts(id)

Gets all input ports



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.ProcessGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ProcessGroupsApi apiInstance = new ProcessGroupsApi();
String id = "id_example"; // String | The process group id.
try {
    InputPortsEntity result = apiInstance.getInputPorts(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessGroupsApi#getInputPorts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |

### Return type

[**InputPortsEntity**](InputPortsEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getLabels"></a>
# **getLabels**
> LabelsEntity getLabels(id)

Gets all labels



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.ProcessGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ProcessGroupsApi apiInstance = new ProcessGroupsApi();
String id = "id_example"; // String | The process group id.
try {
    LabelsEntity result = apiInstance.getLabels(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessGroupsApi#getLabels");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |

### Return type

[**LabelsEntity**](LabelsEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getLocalModifications"></a>
# **getLocalModifications**
> FlowComparisonEntity getLocalModifications(id)

Gets a list of local modifications to the Process Group since it was last synchronized with the Flow Registry



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.ProcessGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ProcessGroupsApi apiInstance = new ProcessGroupsApi();
String id = "id_example"; // String | The process group id.
try {
    FlowComparisonEntity result = apiInstance.getLocalModifications(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessGroupsApi#getLocalModifications");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |

### Return type

[**FlowComparisonEntity**](FlowComparisonEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getOutputPorts"></a>
# **getOutputPorts**
> OutputPortsEntity getOutputPorts(id)

Gets all output ports



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.ProcessGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ProcessGroupsApi apiInstance = new ProcessGroupsApi();
String id = "id_example"; // String | The process group id.
try {
    OutputPortsEntity result = apiInstance.getOutputPorts(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessGroupsApi#getOutputPorts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |

### Return type

[**OutputPortsEntity**](OutputPortsEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getProcessGroup"></a>
# **getProcessGroup**
> ProcessGroupEntity getProcessGroup(id)

Gets a process group



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.ProcessGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ProcessGroupsApi apiInstance = new ProcessGroupsApi();
String id = "id_example"; // String | The process group id.
try {
    ProcessGroupEntity result = apiInstance.getProcessGroup(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessGroupsApi#getProcessGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |

### Return type

[**ProcessGroupEntity**](ProcessGroupEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getProcessGroups"></a>
# **getProcessGroups**
> ProcessGroupsEntity getProcessGroups(id)

Gets all process groups



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.ProcessGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ProcessGroupsApi apiInstance = new ProcessGroupsApi();
String id = "id_example"; // String | The process group id.
try {
    ProcessGroupsEntity result = apiInstance.getProcessGroups(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessGroupsApi#getProcessGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |

### Return type

[**ProcessGroupsEntity**](ProcessGroupsEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getProcessors"></a>
# **getProcessors**
> ProcessorsEntity getProcessors(id, includeDescendantGroups)

Gets all processors



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.ProcessGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ProcessGroupsApi apiInstance = new ProcessGroupsApi();
String id = "id_example"; // String | The process group id.
Boolean includeDescendantGroups = false; // Boolean | Whether or not to include processors from descendant process groups
try {
    ProcessorsEntity result = apiInstance.getProcessors(id, includeDescendantGroups);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessGroupsApi#getProcessors");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |
 **includeDescendantGroups** | **Boolean**| Whether or not to include processors from descendant process groups | [optional] [default to false]

### Return type

[**ProcessorsEntity**](ProcessorsEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getRemoteProcessGroups"></a>
# **getRemoteProcessGroups**
> RemoteProcessGroupsEntity getRemoteProcessGroups(id)

Gets all remote process groups



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.ProcessGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ProcessGroupsApi apiInstance = new ProcessGroupsApi();
String id = "id_example"; // String | The process group id.
try {
    RemoteProcessGroupsEntity result = apiInstance.getRemoteProcessGroups(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessGroupsApi#getRemoteProcessGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |

### Return type

[**RemoteProcessGroupsEntity**](RemoteProcessGroupsEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getVariableRegistry"></a>
# **getVariableRegistry**
> VariableRegistryEntity getVariableRegistry(id, includeAncestorGroups)

Gets a process group&#39;s variable registry

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.ProcessGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ProcessGroupsApi apiInstance = new ProcessGroupsApi();
String id = "id_example"; // String | The process group id.
Boolean includeAncestorGroups = true; // Boolean | Whether or not to include ancestor groups
try {
    VariableRegistryEntity result = apiInstance.getVariableRegistry(id, includeAncestorGroups);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessGroupsApi#getVariableRegistry");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |
 **includeAncestorGroups** | **Boolean**| Whether or not to include ancestor groups | [optional] [default to true]

### Return type

[**VariableRegistryEntity**](VariableRegistryEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getVariableRegistryUpdateRequest"></a>
# **getVariableRegistryUpdateRequest**
> VariableRegistryUpdateRequestEntity getVariableRegistryUpdateRequest(groupId, updateId)

Gets a process group&#39;s variable registry

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.ProcessGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ProcessGroupsApi apiInstance = new ProcessGroupsApi();
String groupId = "groupId_example"; // String | The process group id.
String updateId = "updateId_example"; // String | The ID of the Variable Registry Update Request
try {
    VariableRegistryUpdateRequestEntity result = apiInstance.getVariableRegistryUpdateRequest(groupId, updateId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessGroupsApi#getVariableRegistryUpdateRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**| The process group id. |
 **updateId** | **String**| The ID of the Variable Registry Update Request |

### Return type

[**VariableRegistryUpdateRequestEntity**](VariableRegistryUpdateRequestEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="importTemplate"></a>
# **importTemplate**
> TemplateEntity importTemplate(id)

Imports a template



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.ProcessGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ProcessGroupsApi apiInstance = new ProcessGroupsApi();
String id = "id_example"; // String | The process group id.
try {
    TemplateEntity result = apiInstance.importTemplate(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessGroupsApi#importTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |

### Return type

[**TemplateEntity**](TemplateEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/xml
 - **Accept**: application/xml

<a name="instantiateTemplate"></a>
# **instantiateTemplate**
> FlowEntity instantiateTemplate(id, body)

Instantiates a template



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.ProcessGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ProcessGroupsApi apiInstance = new ProcessGroupsApi();
String id = "id_example"; // String | The process group id.
InstantiateTemplateRequestEntity body = new InstantiateTemplateRequestEntity(); // InstantiateTemplateRequestEntity | The instantiate template request.
try {
    FlowEntity result = apiInstance.instantiateTemplate(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessGroupsApi#instantiateTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |
 **body** | [**InstantiateTemplateRequestEntity**](InstantiateTemplateRequestEntity.md)| The instantiate template request. |

### Return type

[**FlowEntity**](FlowEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="removeProcessGroup"></a>
# **removeProcessGroup**
> ProcessGroupEntity removeProcessGroup(id, version, clientId)

Deletes a process group



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.ProcessGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ProcessGroupsApi apiInstance = new ProcessGroupsApi();
String id = "id_example"; // String | The process group id.
String version = "version_example"; // String | The revision is used to verify the client is working with the latest version of the flow.
String clientId = "clientId_example"; // String | If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response.
try {
    ProcessGroupEntity result = apiInstance.removeProcessGroup(id, version, clientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessGroupsApi#removeProcessGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |
 **version** | **String**| The revision is used to verify the client is working with the latest version of the flow. | [optional]
 **clientId** | **String**| If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. | [optional]

### Return type

[**ProcessGroupEntity**](ProcessGroupEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="submitUpdateVariableRegistryRequest"></a>
# **submitUpdateVariableRegistryRequest**
> VariableRegistryUpdateRequestEntity submitUpdateVariableRegistryRequest(id, body)

Submits a request to update a process group&#39;s variable registry

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.ProcessGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ProcessGroupsApi apiInstance = new ProcessGroupsApi();
String id = "id_example"; // String | The process group id.
VariableRegistryEntity body = new VariableRegistryEntity(); // VariableRegistryEntity | The variable registry configuration details.
try {
    VariableRegistryUpdateRequestEntity result = apiInstance.submitUpdateVariableRegistryRequest(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessGroupsApi#submitUpdateVariableRegistryRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |
 **body** | [**VariableRegistryEntity**](VariableRegistryEntity.md)| The variable registry configuration details. |

### Return type

[**VariableRegistryUpdateRequestEntity**](VariableRegistryUpdateRequestEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateProcessGroup"></a>
# **updateProcessGroup**
> ProcessGroupEntity updateProcessGroup(id, body)

Updates a process group



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.ProcessGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ProcessGroupsApi apiInstance = new ProcessGroupsApi();
String id = "id_example"; // String | The process group id.
ProcessGroupEntity body = new ProcessGroupEntity(); // ProcessGroupEntity | The process group configuration details.
try {
    ProcessGroupEntity result = apiInstance.updateProcessGroup(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessGroupsApi#updateProcessGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |
 **body** | [**ProcessGroupEntity**](ProcessGroupEntity.md)| The process group configuration details. |

### Return type

[**ProcessGroupEntity**](ProcessGroupEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateVariableRegistry"></a>
# **updateVariableRegistry**
> VariableRegistryEntity updateVariableRegistry(id, body)

Updates the contents of a Process Group&#39;s variable Registry

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.ProcessGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ProcessGroupsApi apiInstance = new ProcessGroupsApi();
String id = "id_example"; // String | The process group id.
VariableRegistryEntity body = new VariableRegistryEntity(); // VariableRegistryEntity | The variable registry configuration details.
try {
    VariableRegistryEntity result = apiInstance.updateVariableRegistry(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessGroupsApi#updateVariableRegistry");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |
 **body** | [**VariableRegistryEntity**](VariableRegistryEntity.md)| The variable registry configuration details. |

### Return type

[**VariableRegistryEntity**](VariableRegistryEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="uploadTemplate"></a>
# **uploadTemplate**
> TemplateEntity uploadTemplate(id)

Uploads a template



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.ProcessGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ProcessGroupsApi apiInstance = new ProcessGroupsApi();
String id = "id_example"; // String | The process group id.
try {
    TemplateEntity result = apiInstance.uploadTemplate(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessGroupsApi#uploadTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |

### Return type

[**TemplateEntity**](TemplateEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/xml

