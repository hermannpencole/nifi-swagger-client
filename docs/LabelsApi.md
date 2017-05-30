# LabelsApi

All URIs are relative to *http://localhost/nifi-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getLabel**](LabelsApi.md#getLabel) | **GET** /labels/{id} | Gets a label
[**removeLabel**](LabelsApi.md#removeLabel) | **DELETE** /labels/{id} | Deletes a label
[**updateLabel**](LabelsApi.md#updateLabel) | **PUT** /labels/{id} | Updates a label


<a name="getLabel"></a>
# **getLabel**
> LabelEntity getLabel(id)

Gets a label



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.LabelsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

LabelsApi apiInstance = new LabelsApi();
String id = "id_example"; // String | The label id.
try {
    LabelEntity result = apiInstance.getLabel(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LabelsApi#getLabel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The label id. |

### Return type

[**LabelEntity**](LabelEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="removeLabel"></a>
# **removeLabel**
> LabelEntity removeLabel(id, version, clientId)

Deletes a label



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.LabelsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

LabelsApi apiInstance = new LabelsApi();
String id = "id_example"; // String | The label id.
Object version = null; // Object | The revision is used to verify the client is working with the latest version of the flow.
Object clientId = null; // Object | If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response.
try {
    LabelEntity result = apiInstance.removeLabel(id, version, clientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LabelsApi#removeLabel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The label id. |
 **version** | [**Object**](.md)| The revision is used to verify the client is working with the latest version of the flow. | [optional]
 **clientId** | [**Object**](.md)| If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. | [optional]

### Return type

[**LabelEntity**](LabelEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="updateLabel"></a>
# **updateLabel**
> LabelEntity updateLabel(id, body)

Updates a label



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.LabelsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

LabelsApi apiInstance = new LabelsApi();
String id = "id_example"; // String | The label id.
LabelEntity body = new LabelEntity(); // LabelEntity | The label configuraiton details.
try {
    LabelEntity result = apiInstance.updateLabel(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LabelsApi#updateLabel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The label id. |
 **body** | [**LabelEntity**](LabelEntity.md)| The label configuraiton details. | [optional]

### Return type

[**LabelEntity**](LabelEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

