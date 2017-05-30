# ControllerApi

All URIs are relative to *http://localhost/nifi-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createControllerService**](ControllerApi.md#createControllerService) | **POST** /controller/controller-services | Creates a new controller service
[**createReportingTask**](ControllerApi.md#createReportingTask) | **POST** /controller/reporting-tasks | Creates a new reporting task
[**deleteHistory**](ControllerApi.md#deleteHistory) | **DELETE** /controller/history | Purges history
[**deleteNode**](ControllerApi.md#deleteNode) | **DELETE** /controller/cluster/nodes/{id} | Removes a node from the cluster
[**getCluster**](ControllerApi.md#getCluster) | **GET** /controller/cluster | Gets the contents of the cluster
[**getControllerConfig**](ControllerApi.md#getControllerConfig) | **GET** /controller/config | Retrieves the configuration for this NiFi Controller
[**getNode**](ControllerApi.md#getNode) | **GET** /controller/cluster/nodes/{id} | Gets a node in the cluster
[**updateControllerConfig**](ControllerApi.md#updateControllerConfig) | **PUT** /controller/config | Retrieves the configuration for this NiFi
[**updateNode**](ControllerApi.md#updateNode) | **PUT** /controller/cluster/nodes/{id} | Updates a node in the cluster


<a name="createControllerService"></a>
# **createControllerService**
> ControllerServiceEntity createControllerService(body)

Creates a new controller service



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.ControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ControllerApi apiInstance = new ControllerApi();
ControllerServiceEntity body = new ControllerServiceEntity(); // ControllerServiceEntity | The controller service configuration details.
try {
    ControllerServiceEntity result = apiInstance.createControllerService(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ControllerApi#createControllerService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ControllerServiceEntity**](ControllerServiceEntity.md)| The controller service configuration details. | [optional]

### Return type

[**ControllerServiceEntity**](ControllerServiceEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createReportingTask"></a>
# **createReportingTask**
> ReportingTaskEntity createReportingTask(body)

Creates a new reporting task



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.ControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ControllerApi apiInstance = new ControllerApi();
ReportingTaskEntity body = new ReportingTaskEntity(); // ReportingTaskEntity | The reporting task configuration details.
try {
    ReportingTaskEntity result = apiInstance.createReportingTask(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ControllerApi#createReportingTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ReportingTaskEntity**](ReportingTaskEntity.md)| The reporting task configuration details. | [optional]

### Return type

[**ReportingTaskEntity**](ReportingTaskEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteHistory"></a>
# **deleteHistory**
> HistoryEntity deleteHistory(endDate)

Purges history



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.ControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ControllerApi apiInstance = new ControllerApi();
Object endDate = null; // Object | Purge actions before this date/time.
try {
    HistoryEntity result = apiInstance.deleteHistory(endDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ControllerApi#deleteHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **endDate** | [**Object**](.md)| Purge actions before this date/time. | [optional]

### Return type

[**HistoryEntity**](HistoryEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="deleteNode"></a>
# **deleteNode**
> NodeEntity deleteNode(id)

Removes a node from the cluster



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.ControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ControllerApi apiInstance = new ControllerApi();
String id = "id_example"; // String | The node id.
try {
    NodeEntity result = apiInstance.deleteNode(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ControllerApi#deleteNode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The node id. |

### Return type

[**NodeEntity**](NodeEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getCluster"></a>
# **getCluster**
> ClusterEntity getCluster()

Gets the contents of the cluster

Returns the contents of the cluster including all nodes and their status.

### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.ControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ControllerApi apiInstance = new ControllerApi();
try {
    ClusterEntity result = apiInstance.getCluster();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ControllerApi#getCluster");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ClusterEntity**](ClusterEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getControllerConfig"></a>
# **getControllerConfig**
> ControllerConfigurationEntity getControllerConfig()

Retrieves the configuration for this NiFi Controller



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.ControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ControllerApi apiInstance = new ControllerApi();
try {
    ControllerConfigurationEntity result = apiInstance.getControllerConfig();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ControllerApi#getControllerConfig");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ControllerConfigurationEntity**](ControllerConfigurationEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getNode"></a>
# **getNode**
> NodeEntity getNode(id)

Gets a node in the cluster



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.ControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ControllerApi apiInstance = new ControllerApi();
String id = "id_example"; // String | The node id.
try {
    NodeEntity result = apiInstance.getNode(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ControllerApi#getNode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The node id. |

### Return type

[**NodeEntity**](NodeEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="updateControllerConfig"></a>
# **updateControllerConfig**
> ControllerConfigurationEntity updateControllerConfig(body)

Retrieves the configuration for this NiFi



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.ControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ControllerApi apiInstance = new ControllerApi();
ControllerConfigurationEntity body = new ControllerConfigurationEntity(); // ControllerConfigurationEntity | The controller configuration.
try {
    ControllerConfigurationEntity result = apiInstance.updateControllerConfig(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ControllerApi#updateControllerConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ControllerConfigurationEntity**](ControllerConfigurationEntity.md)| The controller configuration. | [optional]

### Return type

[**ControllerConfigurationEntity**](ControllerConfigurationEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateNode"></a>
# **updateNode**
> NodeEntity updateNode(id, body)

Updates a node in the cluster



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.ControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ControllerApi apiInstance = new ControllerApi();
String id = "id_example"; // String | The node id.
NodeEntity body = new NodeEntity(); // NodeEntity | The node configuration. The only configuration that will be honored at this endpoint is the status or primary flag.
try {
    NodeEntity result = apiInstance.updateNode(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ControllerApi#updateNode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The node id. |
 **body** | [**NodeEntity**](NodeEntity.md)| The node configuration. The only configuration that will be honored at this endpoint is the status or primary flag. | [optional]

### Return type

[**NodeEntity**](NodeEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

