# AccessApi

All URIs are relative to *http://localhost/nifi-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAccessToken**](AccessApi.md#createAccessToken) | **POST** /access/token | Creates a token for accessing the REST API via username/password
[**createAccessTokenFromTicket**](AccessApi.md#createAccessTokenFromTicket) | **POST** /access/kerberos | Creates a token for accessing the REST API via Kerberos ticket exchange / SPNEGO negotiation
[**createDownloadToken**](AccessApi.md#createDownloadToken) | **POST** /access/download-token | Creates a single use access token for downloading FlowFile content.
[**createUiExtensionToken**](AccessApi.md#createUiExtensionToken) | **POST** /access/ui-extension-token | Creates a single use access token for accessing a NiFi UI extension.
[**getAccessStatus**](AccessApi.md#getAccessStatus) | **GET** /access | Gets the status the client&#39;s access
[**getLoginConfig**](AccessApi.md#getLoginConfig) | **GET** /access/config | Retrieves the access configuration for this NiFi
[**knoxCallback**](AccessApi.md#knoxCallback) | **GET** /access/knox/callback | Redirect/callback URI for processing the result of the Apache Knox login sequence.
[**knoxRequest**](AccessApi.md#knoxRequest) | **GET** /access/knox/request | Initiates a request to authenticate through Apache Knox.
[**oidcCallback**](AccessApi.md#oidcCallback) | **GET** /access/oidc/callback | Redirect/callback URI for processing the result of the OpenId Connect login sequence.
[**oidcExchange**](AccessApi.md#oidcExchange) | **POST** /access/oidc/exchange | Retrieves a JWT following a successful login sequence using the configured OpenId Connect provider.
[**oidcRequest**](AccessApi.md#oidcRequest) | **GET** /access/oidc/request | Initiates a request to authenticate through the configured OpenId Connect provider.


<a name="createAccessToken"></a>
# **createAccessToken**
> String createAccessToken(username, password)

Creates a token for accessing the REST API via username/password

The token returned is formatted as a JSON Web Token (JWT). The token is base64 encoded and comprised of three parts. The header, the body, and the signature. The expiration of the token is a contained within the body. The token can be used in the Authorization header in the format &#39;Authorization: Bearer &lt;token&gt;&#39;.

### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.client.AccessApi;


AccessApi apiInstance = new AccessApi();
String username = "username_example"; // String | 
String password = "password_example"; // String | 
try {
    String result = apiInstance.createAccessToken(username, password);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessApi#createAccessToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  | [optional]
 **password** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: text/plain

<a name="createAccessTokenFromTicket"></a>
# **createAccessTokenFromTicket**
> String createAccessTokenFromTicket()

Creates a token for accessing the REST API via Kerberos ticket exchange / SPNEGO negotiation

The token returned is formatted as a JSON Web Token (JWT). The token is base64 encoded and comprised of three parts. The header, the body, and the signature. The expiration of the token is a contained within the body. The token can be used in the Authorization header in the format &#39;Authorization: Bearer &lt;token&gt;&#39;.

### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.client.AccessApi;


AccessApi apiInstance = new AccessApi();
try {
    String result = apiInstance.createAccessTokenFromTicket();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessApi#createAccessTokenFromTicket");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: text/plain

<a name="createDownloadToken"></a>
# **createDownloadToken**
> String createDownloadToken()

Creates a single use access token for downloading FlowFile content.

The token returned is a base64 encoded string. It is valid for a single request up to five minutes from being issued. It is used as a query parameter name &#39;access_token&#39;.

### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.client.AccessApi;


AccessApi apiInstance = new AccessApi();
try {
    String result = apiInstance.createDownloadToken();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessApi#createDownloadToken");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: text/plain

<a name="createUiExtensionToken"></a>
# **createUiExtensionToken**
> String createUiExtensionToken()

Creates a single use access token for accessing a NiFi UI extension.

The token returned is a base64 encoded string. It is valid for a single request up to five minutes from being issued. It is used as a query parameter name &#39;access_token&#39;.

### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.client.AccessApi;


AccessApi apiInstance = new AccessApi();
try {
    String result = apiInstance.createUiExtensionToken();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessApi#createUiExtensionToken");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: text/plain

<a name="getAccessStatus"></a>
# **getAccessStatus**
> AccessStatusEntity getAccessStatus()

Gets the status the client&#39;s access

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.client.AccessApi;


AccessApi apiInstance = new AccessApi();
try {
    AccessStatusEntity result = apiInstance.getAccessStatus();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessApi#getAccessStatus");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AccessStatusEntity**](AccessStatusEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getLoginConfig"></a>
# **getLoginConfig**
> AccessConfigurationEntity getLoginConfig()

Retrieves the access configuration for this NiFi



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.client.AccessApi;


AccessApi apiInstance = new AccessApi();
try {
    AccessConfigurationEntity result = apiInstance.getLoginConfig();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessApi#getLoginConfig");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AccessConfigurationEntity**](AccessConfigurationEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="knoxCallback"></a>
# **knoxCallback**
> knoxCallback()

Redirect/callback URI for processing the result of the Apache Knox login sequence.

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.client.AccessApi;


AccessApi apiInstance = new AccessApi();
try {
    apiInstance.knoxCallback();
} catch (ApiException e) {
    System.err.println("Exception when calling AccessApi#knoxCallback");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="knoxRequest"></a>
# **knoxRequest**
> knoxRequest()

Initiates a request to authenticate through Apache Knox.

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.client.AccessApi;


AccessApi apiInstance = new AccessApi();
try {
    apiInstance.knoxRequest();
} catch (ApiException e) {
    System.err.println("Exception when calling AccessApi#knoxRequest");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="oidcCallback"></a>
# **oidcCallback**
> oidcCallback()

Redirect/callback URI for processing the result of the OpenId Connect login sequence.

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.client.AccessApi;


AccessApi apiInstance = new AccessApi();
try {
    apiInstance.oidcCallback();
} catch (ApiException e) {
    System.err.println("Exception when calling AccessApi#oidcCallback");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="oidcExchange"></a>
# **oidcExchange**
> String oidcExchange()

Retrieves a JWT following a successful login sequence using the configured OpenId Connect provider.

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.client.AccessApi;


AccessApi apiInstance = new AccessApi();
try {
    String result = apiInstance.oidcExchange();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessApi#oidcExchange");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: text/plain

<a name="oidcRequest"></a>
# **oidcRequest**
> oidcRequest()

Initiates a request to authenticate through the configured OpenId Connect provider.

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.client.AccessApi;


AccessApi apiInstance = new AccessApi();
try {
    apiInstance.oidcRequest();
} catch (ApiException e) {
    System.err.println("Exception when calling AccessApi#oidcRequest");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

