# ReportingTasksApi

All URIs are relative to *http://localhost/nifi-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**clearState**](ReportingTasksApi.md#clearState) | **POST** /reporting-tasks/{id}/state/clear-requests | Clears the state for a reporting task
[**getPropertyDescriptor**](ReportingTasksApi.md#getPropertyDescriptor) | **GET** /reporting-tasks/{id}/descriptors | Gets a reporting task property descriptor
[**getReportingTask**](ReportingTasksApi.md#getReportingTask) | **GET** /reporting-tasks/{id} | Gets a reporting task
[**getState**](ReportingTasksApi.md#getState) | **GET** /reporting-tasks/{id}/state | Gets the state for a reporting task
[**removeReportingTask**](ReportingTasksApi.md#removeReportingTask) | **DELETE** /reporting-tasks/{id} | Deletes a reporting task
[**updateReportingTask**](ReportingTasksApi.md#updateReportingTask) | **PUT** /reporting-tasks/{id} | Updates a reporting task


<a name="clearState"></a>
# **clearState**
> ComponentStateDTO clearState(id)

Clears the state for a reporting task



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.ReportingTasksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ReportingTasksApi apiInstance = new ReportingTasksApi();
String id = "id_example"; // String | The reporting task id.
try {
    ComponentStateDTO result = apiInstance.clearState(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportingTasksApi#clearState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The reporting task id. |

### Return type

[**ComponentStateDTO**](ComponentStateDTO.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getPropertyDescriptor"></a>
# **getPropertyDescriptor**
> PropertyDescriptorEntity getPropertyDescriptor(id, propertyName)

Gets a reporting task property descriptor



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.ReportingTasksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ReportingTasksApi apiInstance = new ReportingTasksApi();
String id = "id_example"; // String | The reporting task id.
String propertyName = "propertyName_example"; // String | The property name.
try {
    PropertyDescriptorEntity result = apiInstance.getPropertyDescriptor(id, propertyName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportingTasksApi#getPropertyDescriptor");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The reporting task id. |
 **propertyName** | **String**| The property name. |

### Return type

[**PropertyDescriptorEntity**](PropertyDescriptorEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getReportingTask"></a>
# **getReportingTask**
> ReportingTaskEntity getReportingTask(id)

Gets a reporting task



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.ReportingTasksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ReportingTasksApi apiInstance = new ReportingTasksApi();
String id = "id_example"; // String | The reporting task id.
try {
    ReportingTaskEntity result = apiInstance.getReportingTask(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportingTasksApi#getReportingTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The reporting task id. |

### Return type

[**ReportingTaskEntity**](ReportingTaskEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getState"></a>
# **getState**
> ComponentStateDTO getState(id)

Gets the state for a reporting task



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.ReportingTasksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ReportingTasksApi apiInstance = new ReportingTasksApi();
String id = "id_example"; // String | The reporting task id.
try {
    ComponentStateDTO result = apiInstance.getState(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportingTasksApi#getState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The reporting task id. |

### Return type

[**ComponentStateDTO**](ComponentStateDTO.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="removeReportingTask"></a>
# **removeReportingTask**
> ReportingTaskEntity removeReportingTask(id, version, clientId)

Deletes a reporting task



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.ReportingTasksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ReportingTasksApi apiInstance = new ReportingTasksApi();
String id = "id_example"; // String | The reporting task id.
String version = "version_example"; // String | The revision is used to verify the client is working with the latest version of the flow.
String clientId = "clientId_example"; // String | If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response.
try {
    ReportingTaskEntity result = apiInstance.removeReportingTask(id, version, clientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportingTasksApi#removeReportingTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The reporting task id. |
 **version** | **String**| The revision is used to verify the client is working with the latest version of the flow. | [optional]
 **clientId** | **String**| If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. | [optional]

### Return type

[**ReportingTaskEntity**](ReportingTaskEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="updateReportingTask"></a>
# **updateReportingTask**
> ReportingTaskEntity updateReportingTask(id, body)

Updates a reporting task



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.ReportingTasksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ReportingTasksApi apiInstance = new ReportingTasksApi();
String id = "id_example"; // String | The reporting task id.
ReportingTaskEntity body = new ReportingTaskEntity(); // ReportingTaskEntity | The reporting task configuration details.
try {
    ReportingTaskEntity result = apiInstance.updateReportingTask(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportingTasksApi#updateReportingTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The reporting task id. |
 **body** | [**ReportingTaskEntity**](ReportingTaskEntity.md)| The reporting task configuration details. |

### Return type

[**ReportingTaskEntity**](ReportingTaskEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

