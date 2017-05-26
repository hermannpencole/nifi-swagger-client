# SnippetsApi

All URIs are relative to *http://localhost/nifi-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSnippet**](SnippetsApi.md#createSnippet) | **POST** /snippets | Creates a snippet
[**deleteSnippet**](SnippetsApi.md#deleteSnippet) | **DELETE** /snippets/{id} | Deletes the components in a snippet and drops the snippet
[**updateSnippet**](SnippetsApi.md#updateSnippet) | **PUT** /snippets/{id} | Move&#39;s the components in this Snippet into a new Process Group and drops the snippet


<a name="createSnippet"></a>
# **createSnippet**
> SnippetEntity createSnippet(body)

Creates a snippet



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.SnippetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

SnippetsApi apiInstance = new SnippetsApi();
SnippetEntity body = new SnippetEntity(); // SnippetEntity | The snippet configuration details.
try {
    SnippetEntity result = apiInstance.createSnippet(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SnippetsApi#createSnippet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SnippetEntity**](SnippetEntity.md)| The snippet configuration details. |

### Return type

[**SnippetEntity**](SnippetEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSnippet"></a>
# **deleteSnippet**
> SnippetEntity deleteSnippet(id)

Deletes the components in a snippet and drops the snippet



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.SnippetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

SnippetsApi apiInstance = new SnippetsApi();
String id = "id_example"; // String | The snippet id.
try {
    SnippetEntity result = apiInstance.deleteSnippet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SnippetsApi#deleteSnippet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The snippet id. |

### Return type

[**SnippetEntity**](SnippetEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="updateSnippet"></a>
# **updateSnippet**
> SnippetEntity updateSnippet(id, body)

Move&#39;s the components in this Snippet into a new Process Group and drops the snippet



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.SnippetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

SnippetsApi apiInstance = new SnippetsApi();
String id = "id_example"; // String | The snippet id.
SnippetEntity body = new SnippetEntity(); // SnippetEntity | The snippet configuration details.
try {
    SnippetEntity result = apiInstance.updateSnippet(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SnippetsApi#updateSnippet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The snippet id. |
 **body** | [**SnippetEntity**](SnippetEntity.md)| The snippet configuration details. |

### Return type

[**SnippetEntity**](SnippetEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

