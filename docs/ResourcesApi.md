# ResourcesApi

All URIs are relative to *http://localhost/nifi-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getResources**](ResourcesApi.md#getResources) | **GET** /resources | Gets the available resources that support access/authorization policies


<a name="getResources"></a>
# **getResources**
> ResourcesEntity getResources()

Gets the available resources that support access/authorization policies



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.ResourcesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ResourcesApi apiInstance = new ResourcesApi();
try {
    ResourcesEntity result = apiInstance.getResources();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResourcesApi#getResources");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ResourcesEntity**](ResourcesEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

