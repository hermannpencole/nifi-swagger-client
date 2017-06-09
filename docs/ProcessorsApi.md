# ProcessorsApi

All URIs are relative to *http://localhost/nifi-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**clearState**](ProcessorsApi.md#clearState) | **POST** /processors/{id}/state/clear-requests | Clears the state for a processor
[**deleteProcessor**](ProcessorsApi.md#deleteProcessor) | **DELETE** /processors/{id} | Deletes a processor
[**getProcessor**](ProcessorsApi.md#getProcessor) | **GET** /processors/{id} | Gets a processor
[**getPropertyDescriptor**](ProcessorsApi.md#getPropertyDescriptor) | **GET** /processors/{id}/descriptors | Gets the descriptor for a processor property
[**getState**](ProcessorsApi.md#getState) | **GET** /processors/{id}/state | Gets the state for a processor
[**updateProcessor**](ProcessorsApi.md#updateProcessor) | **PUT** /processors/{id} | Updates a processor


<a name="clearState"></a>
# **clearState**
> ComponentStateDTO clearState(id)

Clears the state for a processor



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.ProcessorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ProcessorsApi apiInstance = new ProcessorsApi();
String id = "id_example"; // String | The processor id.
try {
    ComponentStateDTO result = apiInstance.clearState(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessorsApi#clearState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The processor id. |

### Return type

[**ComponentStateDTO**](ComponentStateDTO.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="deleteProcessor"></a>
# **deleteProcessor**
> ProcessorEntity deleteProcessor(id, version, clientId)

Deletes a processor



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.ProcessorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ProcessorsApi apiInstance = new ProcessorsApi();
String id = "id_example"; // String | The processor id.
String version = "version_example"; // String | The revision is used to verify the client is working with the latest version of the flow.
String clientId = "clientId_example"; // String | If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response.
try {
    ProcessorEntity result = apiInstance.deleteProcessor(id, version, clientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessorsApi#deleteProcessor");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The processor id. |
 **version** | **String**| The revision is used to verify the client is working with the latest version of the flow. | [optional]
 **clientId** | **String**| If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. | [optional]

### Return type

[**ProcessorEntity**](ProcessorEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getProcessor"></a>
# **getProcessor**
> ProcessorEntity getProcessor(id)

Gets a processor



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.ProcessorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ProcessorsApi apiInstance = new ProcessorsApi();
String id = "id_example"; // String | The processor id.
try {
    ProcessorEntity result = apiInstance.getProcessor(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessorsApi#getProcessor");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The processor id. |

### Return type

[**ProcessorEntity**](ProcessorEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getPropertyDescriptor"></a>
# **getPropertyDescriptor**
> PropertyDescriptorEntity getPropertyDescriptor(id, propertyName, clientId)

Gets the descriptor for a processor property



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.ProcessorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ProcessorsApi apiInstance = new ProcessorsApi();
String id = "id_example"; // String | The processor id.
String propertyName = "propertyName_example"; // String | The property name.
String clientId = "clientId_example"; // String | If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response.
try {
    PropertyDescriptorEntity result = apiInstance.getPropertyDescriptor(id, propertyName, clientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessorsApi#getPropertyDescriptor");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The processor id. |
 **propertyName** | **String**| The property name. |
 **clientId** | **String**| If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. | [optional]

### Return type

[**PropertyDescriptorEntity**](PropertyDescriptorEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getState"></a>
# **getState**
> ComponentStateDTO getState(id)

Gets the state for a processor



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.ProcessorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ProcessorsApi apiInstance = new ProcessorsApi();
String id = "id_example"; // String | The processor id.
try {
    ComponentStateDTO result = apiInstance.getState(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessorsApi#getState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The processor id. |

### Return type

[**ComponentStateDTO**](ComponentStateDTO.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="updateProcessor"></a>
# **updateProcessor**
> ProcessorEntity updateProcessor(id, body)

Updates a processor



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.ProcessorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ProcessorsApi apiInstance = new ProcessorsApi();
String id = "id_example"; // String | The processor id.
ProcessorEntity body = new ProcessorEntity(); // ProcessorEntity | The processor configuration details.
try {
    ProcessorEntity result = apiInstance.updateProcessor(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessorsApi#updateProcessor");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The processor id. |
 **body** | [**ProcessorEntity**](ProcessorEntity.md)| The processor configuration details. |

### Return type

[**ProcessorEntity**](ProcessorEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

