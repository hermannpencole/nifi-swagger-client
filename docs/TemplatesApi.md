# TemplatesApi

All URIs are relative to *http://localhost/nifi-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**exportTemplate**](TemplatesApi.md#exportTemplate) | **GET** /templates/{id}/download | Exports a template
[**removeTemplate**](TemplatesApi.md#removeTemplate) | **DELETE** /templates/{id} | Deletes a template


<a name="exportTemplate"></a>
# **exportTemplate**
> String exportTemplate(id)

Exports a template



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.TemplatesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

TemplatesApi apiInstance = new TemplatesApi();
String id = "id_example"; // String | The template id.
try {
    String result = apiInstance.exportTemplate(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplatesApi#exportTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The template id. |

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/xml

<a name="removeTemplate"></a>
# **removeTemplate**
> TemplateEntity removeTemplate(id)

Deletes a template



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.TemplatesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

TemplatesApi apiInstance = new TemplatesApi();
String id = "id_example"; // String | The template id.
try {
    TemplateEntity result = apiInstance.removeTemplate(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplatesApi#removeTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The template id. |

### Return type

[**TemplateEntity**](TemplateEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

