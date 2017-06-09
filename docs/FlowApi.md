# FlowApi

All URIs are relative to *http://localhost/nifi-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**generateClientId**](FlowApi.md#generateClientId) | **GET** /flow/client-id | Generates a client id.
[**getAboutInfo**](FlowApi.md#getAboutInfo) | **GET** /flow/about | Retrieves details about this NiFi to put in the About dialog
[**getAction**](FlowApi.md#getAction) | **GET** /flow/history/{id} | Gets an action
[**getBanners**](FlowApi.md#getBanners) | **GET** /flow/banners | Retrieves the banners for this NiFi
[**getBulletinBoard**](FlowApi.md#getBulletinBoard) | **GET** /flow/bulletin-board | Gets current bulletins
[**getBulletins**](FlowApi.md#getBulletins) | **GET** /flow/controller/bulletins | Retrieves Controller level bulletins
[**getClusterSummary**](FlowApi.md#getClusterSummary) | **GET** /flow/cluster/summary | The cluster summary for this NiFi
[**getComponentHistory**](FlowApi.md#getComponentHistory) | **GET** /flow/history/components/{componentId} | Gets configuration history for a component
[**getConnectionStatus**](FlowApi.md#getConnectionStatus) | **GET** /flow/connections/{id}/status | Gets status for a connection
[**getConnectionStatusHistory**](FlowApi.md#getConnectionStatusHistory) | **GET** /flow/connections/{id}/status/history | Gets the status history for a connection
[**getControllerServiceTypes**](FlowApi.md#getControllerServiceTypes) | **GET** /flow/controller-service-types | Retrieves the types of controller services that this NiFi supports
[**getControllerServicesFromController**](FlowApi.md#getControllerServicesFromController) | **GET** /flow/controller/controller-services | Gets all controller services
[**getControllerServicesFromGroup**](FlowApi.md#getControllerServicesFromGroup) | **GET** /flow/process-groups/{id}/controller-services | Gets all controller services
[**getControllerStatus**](FlowApi.md#getControllerStatus) | **GET** /flow/status | Gets the current status of this NiFi
[**getCurrentUser**](FlowApi.md#getCurrentUser) | **GET** /flow/current-user | Retrieves the user identity of the user making the request
[**getFlow**](FlowApi.md#getFlow) | **GET** /flow/process-groups/{id} | Gets a process group
[**getFlowConfig**](FlowApi.md#getFlowConfig) | **GET** /flow/config | Retrieves the configuration for this NiFi flow
[**getInputPortStatus**](FlowApi.md#getInputPortStatus) | **GET** /flow/input-ports/{id}/status | Gets status for an input port
[**getOutputPortStatus**](FlowApi.md#getOutputPortStatus) | **GET** /flow/output-ports/{id}/status | Gets status for an output port
[**getPrioritizers**](FlowApi.md#getPrioritizers) | **GET** /flow/prioritizers | Retrieves the types of prioritizers that this NiFi supports
[**getProcessGroupStatus**](FlowApi.md#getProcessGroupStatus) | **GET** /flow/process-groups/{id}/status | Gets the status for a process group
[**getProcessGroupStatusHistory**](FlowApi.md#getProcessGroupStatusHistory) | **GET** /flow/process-groups/{id}/status/history | Gets status history for a remote process group
[**getProcessorStatus**](FlowApi.md#getProcessorStatus) | **GET** /flow/processors/{id}/status | Gets status for a processor
[**getProcessorStatusHistory**](FlowApi.md#getProcessorStatusHistory) | **GET** /flow/processors/{id}/status/history | Gets status history for a processor
[**getProcessorTypes**](FlowApi.md#getProcessorTypes) | **GET** /flow/processor-types | Retrieves the types of processors that this NiFi supports
[**getRemoteProcessGroupStatus**](FlowApi.md#getRemoteProcessGroupStatus) | **GET** /flow/remote-process-groups/{id}/status | Gets status for a remote process group
[**getRemoteProcessGroupStatusHistory**](FlowApi.md#getRemoteProcessGroupStatusHistory) | **GET** /flow/remote-process-groups/{id}/status/history | Gets the status history
[**getReportingTaskTypes**](FlowApi.md#getReportingTaskTypes) | **GET** /flow/reporting-task-types | Retrieves the types of reporting tasks that this NiFi supports
[**getReportingTasks**](FlowApi.md#getReportingTasks) | **GET** /flow/reporting-tasks | Gets all reporting tasks
[**getTemplates**](FlowApi.md#getTemplates) | **GET** /flow/templates | Gets all templates
[**queryHistory**](FlowApi.md#queryHistory) | **GET** /flow/history | Gets configuration history
[**scheduleComponents**](FlowApi.md#scheduleComponents) | **PUT** /flow/process-groups/{id} | Schedule or unschedule comopnents in the specified Process Group.
[**searchCluster**](FlowApi.md#searchCluster) | **GET** /flow/cluster/search-results | Searches the cluster for a node with the specified address
[**searchFlow**](FlowApi.md#searchFlow) | **GET** /flow/search-results | Performs a search against this NiFi using the specified search term


<a name="generateClientId"></a>
# **generateClientId**
> String generateClientId()

Generates a client id.



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.FlowApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

FlowApi apiInstance = new FlowApi();
try {
    String result = apiInstance.generateClientId();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#generateClientId");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: text/plain

<a name="getAboutInfo"></a>
# **getAboutInfo**
> AboutEntity getAboutInfo()

Retrieves details about this NiFi to put in the About dialog



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.FlowApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

FlowApi apiInstance = new FlowApi();
try {
    AboutEntity result = apiInstance.getAboutInfo();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getAboutInfo");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AboutEntity**](AboutEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getAction"></a>
# **getAction**
> ActionEntity getAction(id)

Gets an action

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.FlowApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

FlowApi apiInstance = new FlowApi();
String id = "id_example"; // String | The action id.
try {
    ActionEntity result = apiInstance.getAction(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getAction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The action id. |

### Return type

[**ActionEntity**](ActionEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getBanners"></a>
# **getBanners**
> BannerEntity getBanners()

Retrieves the banners for this NiFi



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.FlowApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

FlowApi apiInstance = new FlowApi();
try {
    BannerEntity result = apiInstance.getBanners();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getBanners");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**BannerEntity**](BannerEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getBulletinBoard"></a>
# **getBulletinBoard**
> BulletinBoardEntity getBulletinBoard(after, sourceName, message, sourceId, groupId, limit)

Gets current bulletins



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.FlowApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

FlowApi apiInstance = new FlowApi();
String after = "after_example"; // String | Includes bulletins with an id after this value.
String sourceName = "sourceName_example"; // String | Includes bulletins originating from this sources whose name match this regular expression.
String message = "message_example"; // String | Includes bulletins whose message that match this regular expression.
String sourceId = "sourceId_example"; // String | Includes bulletins originating from this sources whose id match this regular expression.
String groupId = "groupId_example"; // String | Includes bulletins originating from this sources whose group id match this regular expression.
String limit = "limit_example"; // String | The number of bulletins to limit the response to.
try {
    BulletinBoardEntity result = apiInstance.getBulletinBoard(after, sourceName, message, sourceId, groupId, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getBulletinBoard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **after** | **String**| Includes bulletins with an id after this value. | [optional]
 **sourceName** | **String**| Includes bulletins originating from this sources whose name match this regular expression. | [optional]
 **message** | **String**| Includes bulletins whose message that match this regular expression. | [optional]
 **sourceId** | **String**| Includes bulletins originating from this sources whose id match this regular expression. | [optional]
 **groupId** | **String**| Includes bulletins originating from this sources whose group id match this regular expression. | [optional]
 **limit** | **String**| The number of bulletins to limit the response to. | [optional]

### Return type

[**BulletinBoardEntity**](BulletinBoardEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getBulletins"></a>
# **getBulletins**
> ControllerBulletinsEntity getBulletins()

Retrieves Controller level bulletins



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.FlowApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

FlowApi apiInstance = new FlowApi();
try {
    ControllerBulletinsEntity result = apiInstance.getBulletins();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getBulletins");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ControllerBulletinsEntity**](ControllerBulletinsEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getClusterSummary"></a>
# **getClusterSummary**
> ClusteSummaryEntity getClusterSummary()

The cluster summary for this NiFi



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.FlowApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

FlowApi apiInstance = new FlowApi();
try {
    ClusteSummaryEntity result = apiInstance.getClusterSummary();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getClusterSummary");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ClusteSummaryEntity**](ClusteSummaryEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getComponentHistory"></a>
# **getComponentHistory**
> ComponentHistoryEntity getComponentHistory(componentId)

Gets configuration history for a component

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.FlowApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

FlowApi apiInstance = new FlowApi();
String componentId = "componentId_example"; // String | The component id.
try {
    ComponentHistoryEntity result = apiInstance.getComponentHistory(componentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getComponentHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **componentId** | **String**| The component id. |

### Return type

[**ComponentHistoryEntity**](ComponentHistoryEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getConnectionStatus"></a>
# **getConnectionStatus**
> ConnectionStatusEntity getConnectionStatus(id, nodewise, clusterNodeId)

Gets status for a connection



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.FlowApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

FlowApi apiInstance = new FlowApi();
String id = "id_example"; // String | The connection id.
Boolean nodewise = true; // Boolean | Whether or not to include the breakdown per node. Optional, defaults to false
String clusterNodeId = "clusterNodeId_example"; // String | The id of the node where to get the status.
try {
    ConnectionStatusEntity result = apiInstance.getConnectionStatus(id, nodewise, clusterNodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getConnectionStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The connection id. |
 **nodewise** | **Boolean**| Whether or not to include the breakdown per node. Optional, defaults to false | [optional]
 **clusterNodeId** | **String**| The id of the node where to get the status. | [optional]

### Return type

[**ConnectionStatusEntity**](ConnectionStatusEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getConnectionStatusHistory"></a>
# **getConnectionStatusHistory**
> StatusHistoryEntity getConnectionStatusHistory(id)

Gets the status history for a connection



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.FlowApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

FlowApi apiInstance = new FlowApi();
String id = "id_example"; // String | The connection id.
try {
    StatusHistoryEntity result = apiInstance.getConnectionStatusHistory(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getConnectionStatusHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The connection id. |

### Return type

[**StatusHistoryEntity**](StatusHistoryEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getControllerServiceTypes"></a>
# **getControllerServiceTypes**
> ControllerServiceTypesEntity getControllerServiceTypes(serviceType)

Retrieves the types of controller services that this NiFi supports

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.FlowApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

FlowApi apiInstance = new FlowApi();
String serviceType = "serviceType_example"; // String | If specified, will only return controller services of this type.
try {
    ControllerServiceTypesEntity result = apiInstance.getControllerServiceTypes(serviceType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getControllerServiceTypes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceType** | **String**| If specified, will only return controller services of this type. | [optional]

### Return type

[**ControllerServiceTypesEntity**](ControllerServiceTypesEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getControllerServicesFromController"></a>
# **getControllerServicesFromController**
> ControllerServicesEntity getControllerServicesFromController()

Gets all controller services



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.FlowApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

FlowApi apiInstance = new FlowApi();
try {
    ControllerServicesEntity result = apiInstance.getControllerServicesFromController();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getControllerServicesFromController");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ControllerServicesEntity**](ControllerServicesEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getControllerServicesFromGroup"></a>
# **getControllerServicesFromGroup**
> ControllerServicesEntity getControllerServicesFromGroup(id)

Gets all controller services



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.FlowApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

FlowApi apiInstance = new FlowApi();
String id = "id_example"; // String | The process group id.
try {
    ControllerServicesEntity result = apiInstance.getControllerServicesFromGroup(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getControllerServicesFromGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |

### Return type

[**ControllerServicesEntity**](ControllerServicesEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getControllerStatus"></a>
# **getControllerStatus**
> ControllerStatusEntity getControllerStatus()

Gets the current status of this NiFi



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.FlowApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

FlowApi apiInstance = new FlowApi();
try {
    ControllerStatusEntity result = apiInstance.getControllerStatus();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getControllerStatus");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ControllerStatusEntity**](ControllerStatusEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getCurrentUser"></a>
# **getCurrentUser**
> CurrentUserEntity getCurrentUser()

Retrieves the user identity of the user making the request



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.FlowApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

FlowApi apiInstance = new FlowApi();
try {
    CurrentUserEntity result = apiInstance.getCurrentUser();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getCurrentUser");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CurrentUserEntity**](CurrentUserEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getFlow"></a>
# **getFlow**
> ProcessGroupFlowEntity getFlow(id)

Gets a process group



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.FlowApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

FlowApi apiInstance = new FlowApi();
String id = "id_example"; // String | The process group id.
try {
    ProcessGroupFlowEntity result = apiInstance.getFlow(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getFlow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |

### Return type

[**ProcessGroupFlowEntity**](ProcessGroupFlowEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getFlowConfig"></a>
# **getFlowConfig**
> FlowConfigurationEntity getFlowConfig()

Retrieves the configuration for this NiFi flow



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.FlowApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

FlowApi apiInstance = new FlowApi();
try {
    FlowConfigurationEntity result = apiInstance.getFlowConfig();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getFlowConfig");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**FlowConfigurationEntity**](FlowConfigurationEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getInputPortStatus"></a>
# **getInputPortStatus**
> PortStatusEntity getInputPortStatus(id, nodewise, clusterNodeId)

Gets status for an input port



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.FlowApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

FlowApi apiInstance = new FlowApi();
String id = "id_example"; // String | The input port id.
Boolean nodewise = true; // Boolean | Whether or not to include the breakdown per node. Optional, defaults to false
String clusterNodeId = "clusterNodeId_example"; // String | The id of the node where to get the status.
try {
    PortStatusEntity result = apiInstance.getInputPortStatus(id, nodewise, clusterNodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getInputPortStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The input port id. |
 **nodewise** | **Boolean**| Whether or not to include the breakdown per node. Optional, defaults to false | [optional]
 **clusterNodeId** | **String**| The id of the node where to get the status. | [optional]

### Return type

[**PortStatusEntity**](PortStatusEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getOutputPortStatus"></a>
# **getOutputPortStatus**
> PortStatusEntity getOutputPortStatus(id, nodewise, clusterNodeId)

Gets status for an output port



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.FlowApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

FlowApi apiInstance = new FlowApi();
String id = "id_example"; // String | The output port id.
Boolean nodewise = true; // Boolean | Whether or not to include the breakdown per node. Optional, defaults to false
String clusterNodeId = "clusterNodeId_example"; // String | The id of the node where to get the status.
try {
    PortStatusEntity result = apiInstance.getOutputPortStatus(id, nodewise, clusterNodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getOutputPortStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The output port id. |
 **nodewise** | **Boolean**| Whether or not to include the breakdown per node. Optional, defaults to false | [optional]
 **clusterNodeId** | **String**| The id of the node where to get the status. | [optional]

### Return type

[**PortStatusEntity**](PortStatusEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getPrioritizers"></a>
# **getPrioritizers**
> PrioritizerTypesEntity getPrioritizers()

Retrieves the types of prioritizers that this NiFi supports

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.FlowApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

FlowApi apiInstance = new FlowApi();
try {
    PrioritizerTypesEntity result = apiInstance.getPrioritizers();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getPrioritizers");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PrioritizerTypesEntity**](PrioritizerTypesEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getProcessGroupStatus"></a>
# **getProcessGroupStatus**
> ProcessGroupStatusEntity getProcessGroupStatus(id, recursive, nodewise, clusterNodeId)

Gets the status for a process group

The status for a process group includes status for all descendent components. When invoked on the root group with recursive set to true, it will return the current status of every component in the flow.

### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.FlowApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

FlowApi apiInstance = new FlowApi();
String id = "id_example"; // String | The process group id.
Boolean recursive = true; // Boolean | Whether all descendant groups and the status of their content will be included. Optional, defaults to false
Boolean nodewise = true; // Boolean | Whether or not to include the breakdown per node. Optional, defaults to false
String clusterNodeId = "clusterNodeId_example"; // String | The id of the node where to get the status.
try {
    ProcessGroupStatusEntity result = apiInstance.getProcessGroupStatus(id, recursive, nodewise, clusterNodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getProcessGroupStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |
 **recursive** | **Boolean**| Whether all descendant groups and the status of their content will be included. Optional, defaults to false | [optional]
 **nodewise** | **Boolean**| Whether or not to include the breakdown per node. Optional, defaults to false | [optional]
 **clusterNodeId** | **String**| The id of the node where to get the status. | [optional]

### Return type

[**ProcessGroupStatusEntity**](ProcessGroupStatusEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getProcessGroupStatusHistory"></a>
# **getProcessGroupStatusHistory**
> StatusHistoryEntity getProcessGroupStatusHistory(id)

Gets status history for a remote process group



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.FlowApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

FlowApi apiInstance = new FlowApi();
String id = "id_example"; // String | The process group id.
try {
    StatusHistoryEntity result = apiInstance.getProcessGroupStatusHistory(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getProcessGroupStatusHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |

### Return type

[**StatusHistoryEntity**](StatusHistoryEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getProcessorStatus"></a>
# **getProcessorStatus**
> ProcessorStatusEntity getProcessorStatus(id, nodewise, clusterNodeId)

Gets status for a processor



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.FlowApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

FlowApi apiInstance = new FlowApi();
String id = "id_example"; // String | The processor id.
Boolean nodewise = true; // Boolean | Whether or not to include the breakdown per node. Optional, defaults to false
String clusterNodeId = "clusterNodeId_example"; // String | The id of the node where to get the status.
try {
    ProcessorStatusEntity result = apiInstance.getProcessorStatus(id, nodewise, clusterNodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getProcessorStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The processor id. |
 **nodewise** | **Boolean**| Whether or not to include the breakdown per node. Optional, defaults to false | [optional]
 **clusterNodeId** | **String**| The id of the node where to get the status. | [optional]

### Return type

[**ProcessorStatusEntity**](ProcessorStatusEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getProcessorStatusHistory"></a>
# **getProcessorStatusHistory**
> StatusHistoryEntity getProcessorStatusHistory(id)

Gets status history for a processor



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.FlowApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

FlowApi apiInstance = new FlowApi();
String id = "id_example"; // String | The processor id.
try {
    StatusHistoryEntity result = apiInstance.getProcessorStatusHistory(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getProcessorStatusHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The processor id. |

### Return type

[**StatusHistoryEntity**](StatusHistoryEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getProcessorTypes"></a>
# **getProcessorTypes**
> ProcessorTypesEntity getProcessorTypes()

Retrieves the types of processors that this NiFi supports

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.FlowApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

FlowApi apiInstance = new FlowApi();
try {
    ProcessorTypesEntity result = apiInstance.getProcessorTypes();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getProcessorTypes");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ProcessorTypesEntity**](ProcessorTypesEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getRemoteProcessGroupStatus"></a>
# **getRemoteProcessGroupStatus**
> ProcessorStatusEntity getRemoteProcessGroupStatus(id, nodewise, clusterNodeId)

Gets status for a remote process group



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.FlowApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

FlowApi apiInstance = new FlowApi();
String id = "id_example"; // String | The remote process group id.
Boolean nodewise = true; // Boolean | Whether or not to include the breakdown per node. Optional, defaults to false
String clusterNodeId = "clusterNodeId_example"; // String | The id of the node where to get the status.
try {
    ProcessorStatusEntity result = apiInstance.getRemoteProcessGroupStatus(id, nodewise, clusterNodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getRemoteProcessGroupStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The remote process group id. |
 **nodewise** | **Boolean**| Whether or not to include the breakdown per node. Optional, defaults to false | [optional]
 **clusterNodeId** | **String**| The id of the node where to get the status. | [optional]

### Return type

[**ProcessorStatusEntity**](ProcessorStatusEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getRemoteProcessGroupStatusHistory"></a>
# **getRemoteProcessGroupStatusHistory**
> StatusHistoryEntity getRemoteProcessGroupStatusHistory(id)

Gets the status history



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.FlowApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

FlowApi apiInstance = new FlowApi();
String id = "id_example"; // String | The remote process group id.
try {
    StatusHistoryEntity result = apiInstance.getRemoteProcessGroupStatusHistory(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getRemoteProcessGroupStatusHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The remote process group id. |

### Return type

[**StatusHistoryEntity**](StatusHistoryEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getReportingTaskTypes"></a>
# **getReportingTaskTypes**
> ReportingTaskTypesEntity getReportingTaskTypes()

Retrieves the types of reporting tasks that this NiFi supports

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.FlowApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

FlowApi apiInstance = new FlowApi();
try {
    ReportingTaskTypesEntity result = apiInstance.getReportingTaskTypes();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getReportingTaskTypes");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ReportingTaskTypesEntity**](ReportingTaskTypesEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getReportingTasks"></a>
# **getReportingTasks**
> ReportingTasksEntity getReportingTasks()

Gets all reporting tasks



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.FlowApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

FlowApi apiInstance = new FlowApi();
try {
    ReportingTasksEntity result = apiInstance.getReportingTasks();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getReportingTasks");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ReportingTasksEntity**](ReportingTasksEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getTemplates"></a>
# **getTemplates**
> TemplatesEntity getTemplates()

Gets all templates



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.FlowApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

FlowApi apiInstance = new FlowApi();
try {
    TemplatesEntity result = apiInstance.getTemplates();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getTemplates");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**TemplatesEntity**](TemplatesEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="queryHistory"></a>
# **queryHistory**
> HistoryEntity queryHistory(offset, count, sortColumn, sortOrder, startDate, endDate, userIdentity, sourceId)

Gets configuration history

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.FlowApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

FlowApi apiInstance = new FlowApi();
String offset = "offset_example"; // String | The offset into the result set.
String count = "count_example"; // String | The number of actions to return.
String sortColumn = "sortColumn_example"; // String | The field to sort on.
String sortOrder = "sortOrder_example"; // String | The direction to sort.
String startDate = "startDate_example"; // String | Include actions after this date.
String endDate = "endDate_example"; // String | Include actions before this date.
String userIdentity = "userIdentity_example"; // String | Include actions performed by this user.
String sourceId = "sourceId_example"; // String | Include actions on this component.
try {
    HistoryEntity result = apiInstance.queryHistory(offset, count, sortColumn, sortOrder, startDate, endDate, userIdentity, sourceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#queryHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **String**| The offset into the result set. |
 **count** | **String**| The number of actions to return. |
 **sortColumn** | **String**| The field to sort on. | [optional]
 **sortOrder** | **String**| The direction to sort. | [optional]
 **startDate** | **String**| Include actions after this date. | [optional]
 **endDate** | **String**| Include actions before this date. | [optional]
 **userIdentity** | **String**| Include actions performed by this user. | [optional]
 **sourceId** | **String**| Include actions on this component. | [optional]

### Return type

[**HistoryEntity**](HistoryEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="scheduleComponents"></a>
# **scheduleComponents**
> ScheduleComponentsEntity scheduleComponents(id, body)

Schedule or unschedule comopnents in the specified Process Group.



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.FlowApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

FlowApi apiInstance = new FlowApi();
String id = "id_example"; // String | The process group id.
ScheduleComponentsEntity body = new ScheduleComponentsEntity(); // ScheduleComponentsEntity | The request to schedule or unschedule. If the comopnents in the request are not specified, all authorized components will be considered.
try {
    ScheduleComponentsEntity result = apiInstance.scheduleComponents(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#scheduleComponents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |
 **body** | [**ScheduleComponentsEntity**](ScheduleComponentsEntity.md)| The request to schedule or unschedule. If the comopnents in the request are not specified, all authorized components will be considered. |

### Return type

[**ScheduleComponentsEntity**](ScheduleComponentsEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="searchCluster"></a>
# **searchCluster**
> ClusterSearchResultsEntity searchCluster(q)

Searches the cluster for a node with the specified address

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.FlowApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

FlowApi apiInstance = new FlowApi();
String q = "q_example"; // String | Node address to search for.
try {
    ClusterSearchResultsEntity result = apiInstance.searchCluster(q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#searchCluster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **String**| Node address to search for. |

### Return type

[**ClusterSearchResultsEntity**](ClusterSearchResultsEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="searchFlow"></a>
# **searchFlow**
> SearchResultsEntity searchFlow(q)

Performs a search against this NiFi using the specified search term

Only search results from authorized components will be returned.

### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.FlowApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

FlowApi apiInstance = new FlowApi();
String q = "q_example"; // String | 
try {
    SearchResultsEntity result = apiInstance.searchFlow(q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#searchFlow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **String**|  | [optional]

### Return type

[**SearchResultsEntity**](SearchResultsEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

