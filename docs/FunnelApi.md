# FunnelApi

All URIs are relative to *http://localhost/nifi-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFunnel**](FunnelApi.md#getFunnel) | **GET** /funnels/{id} | Gets a funnel
[**removeFunnel**](FunnelApi.md#removeFunnel) | **DELETE** /funnels/{id} | Deletes a funnel
[**updateFunnel**](FunnelApi.md#updateFunnel) | **PUT** /funnels/{id} | Updates a funnel


<a name="getFunnel"></a>
# **getFunnel**
> FunnelEntity getFunnel(id)

Gets a funnel



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.FunnelApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

FunnelApi apiInstance = new FunnelApi();
String id = "id_example"; // String | The funnel id.
try {
    FunnelEntity result = apiInstance.getFunnel(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FunnelApi#getFunnel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The funnel id. |

### Return type

[**FunnelEntity**](FunnelEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="removeFunnel"></a>
# **removeFunnel**
> FunnelEntity removeFunnel(id, version, clientId)

Deletes a funnel



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.FunnelApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

FunnelApi apiInstance = new FunnelApi();
String id = "id_example"; // String | The funnel id.
Object version = null; // Object | The revision is used to verify the client is working with the latest version of the flow.
Object clientId = null; // Object | If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response.
try {
    FunnelEntity result = apiInstance.removeFunnel(id, version, clientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FunnelApi#removeFunnel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The funnel id. |
 **version** | [**Object**](.md)| The revision is used to verify the client is working with the latest version of the flow. | [optional]
 **clientId** | [**Object**](.md)| If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. | [optional]

### Return type

[**FunnelEntity**](FunnelEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="updateFunnel"></a>
# **updateFunnel**
> FunnelEntity updateFunnel(id, body)

Updates a funnel



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.FunnelApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

FunnelApi apiInstance = new FunnelApi();
String id = "id_example"; // String | The funnel id.
FunnelEntity body = new FunnelEntity(); // FunnelEntity | The funnel configuration details.
try {
    FunnelEntity result = apiInstance.updateFunnel(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FunnelApi#updateFunnel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The funnel id. |
 **body** | [**FunnelEntity**](FunnelEntity.md)| The funnel configuration details. | [optional]

### Return type

[**FunnelEntity**](FunnelEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

