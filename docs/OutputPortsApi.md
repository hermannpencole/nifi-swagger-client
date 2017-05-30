# OutputPortsApi

All URIs are relative to *http://localhost/nifi-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOutputPort**](OutputPortsApi.md#getOutputPort) | **GET** /output-ports/{id} | Gets an output port
[**removeOutputPort**](OutputPortsApi.md#removeOutputPort) | **DELETE** /output-ports/{id} | Deletes an output port
[**updateOutputPort**](OutputPortsApi.md#updateOutputPort) | **PUT** /output-ports/{id} | Updates an output port


<a name="getOutputPort"></a>
# **getOutputPort**
> PortEntity getOutputPort(id)

Gets an output port



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.OutputPortsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

OutputPortsApi apiInstance = new OutputPortsApi();
String id = "id_example"; // String | The output port id.
try {
    PortEntity result = apiInstance.getOutputPort(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutputPortsApi#getOutputPort");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The output port id. |

### Return type

[**PortEntity**](PortEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="removeOutputPort"></a>
# **removeOutputPort**
> PortEntity removeOutputPort(id, version, clientId)

Deletes an output port



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.OutputPortsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

OutputPortsApi apiInstance = new OutputPortsApi();
String id = "id_example"; // String | The output port id.
Object version = null; // Object | The revision is used to verify the client is working with the latest version of the flow.
Object clientId = null; // Object | If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response.
try {
    PortEntity result = apiInstance.removeOutputPort(id, version, clientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutputPortsApi#removeOutputPort");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The output port id. |
 **version** | [**Object**](.md)| The revision is used to verify the client is working with the latest version of the flow. | [optional]
 **clientId** | [**Object**](.md)| If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. | [optional]

### Return type

[**PortEntity**](PortEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="updateOutputPort"></a>
# **updateOutputPort**
> PortEntity updateOutputPort(id, body)

Updates an output port



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.OutputPortsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

OutputPortsApi apiInstance = new OutputPortsApi();
String id = "id_example"; // String | The output port id.
PortEntity body = new PortEntity(); // PortEntity | The output port configuration details.
try {
    PortEntity result = apiInstance.updateOutputPort(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutputPortsApi#updateOutputPort");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The output port id. |
 **body** | [**PortEntity**](PortEntity.md)| The output port configuration details. | [optional]

### Return type

[**PortEntity**](PortEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

