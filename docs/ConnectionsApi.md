# ConnectionsApi

All URIs are relative to *http://localhost/nifi-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteConnection**](ConnectionsApi.md#deleteConnection) | **DELETE** /connections/{id} | Deletes a connection
[**getConnection**](ConnectionsApi.md#getConnection) | **GET** /connections/{id} | Gets a connection
[**updateConnection**](ConnectionsApi.md#updateConnection) | **PUT** /connections/{id} | Updates a connection


<a name="deleteConnection"></a>
# **deleteConnection**
> ConnectionEntity deleteConnection(id, version, clientId)

Deletes a connection



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.ConnectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ConnectionsApi apiInstance = new ConnectionsApi();
String id = "id_example"; // String | The connection id.
Object version = null; // Object | The revision is used to verify the client is working with the latest version of the flow.
Object clientId = null; // Object | If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response.
try {
    ConnectionEntity result = apiInstance.deleteConnection(id, version, clientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectionsApi#deleteConnection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The connection id. |
 **version** | [**Object**](.md)| The revision is used to verify the client is working with the latest version of the flow. | [optional]
 **clientId** | [**Object**](.md)| If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. | [optional]

### Return type

[**ConnectionEntity**](ConnectionEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getConnection"></a>
# **getConnection**
> ConnectionEntity getConnection(id)

Gets a connection



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.ConnectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ConnectionsApi apiInstance = new ConnectionsApi();
String id = "id_example"; // String | The connection id.
try {
    ConnectionEntity result = apiInstance.getConnection(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectionsApi#getConnection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The connection id. |

### Return type

[**ConnectionEntity**](ConnectionEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="updateConnection"></a>
# **updateConnection**
> ConnectionEntity updateConnection(id, body)

Updates a connection



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.ConnectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ConnectionsApi apiInstance = new ConnectionsApi();
String id = "id_example"; // String | The connection id.
ConnectionEntity body = new ConnectionEntity(); // ConnectionEntity | The connection configuration details.
try {
    ConnectionEntity result = apiInstance.updateConnection(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectionsApi#updateConnection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The connection id. |
 **body** | [**ConnectionEntity**](ConnectionEntity.md)| The connection configuration details. | [optional]

### Return type

[**ConnectionEntity**](ConnectionEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

