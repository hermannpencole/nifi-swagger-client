# ProvenanceApi

All URIs are relative to *http://localhost/nifi-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteLineage**](ProvenanceApi.md#deleteLineage) | **DELETE** /provenance/lineage/{id} | Deletes a lineage query
[**deleteProvenance**](ProvenanceApi.md#deleteProvenance) | **DELETE** /provenance/{id} | Deletes a provenance query
[**getLineage**](ProvenanceApi.md#getLineage) | **GET** /provenance/lineage/{id} | Gets a lineage query
[**getProvenance**](ProvenanceApi.md#getProvenance) | **GET** /provenance/{id} | Gets a provenance query
[**getSearchOptions**](ProvenanceApi.md#getSearchOptions) | **GET** /provenance/search-options | Gets the searchable attributes for provenance events
[**submitLineageRequest**](ProvenanceApi.md#submitLineageRequest) | **POST** /provenance/lineage | Submits a lineage query
[**submitProvenanceRequest**](ProvenanceApi.md#submitProvenanceRequest) | **POST** /provenance | Submits a provenance query


<a name="deleteLineage"></a>
# **deleteLineage**
> LineageEntity deleteLineage(id, clusterNodeId)

Deletes a lineage query



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.ProvenanceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ProvenanceApi apiInstance = new ProvenanceApi();
String id = "id_example"; // String | The id of the lineage query.
String clusterNodeId = "clusterNodeId_example"; // String | The id of the node where this query exists if clustered.
try {
    LineageEntity result = apiInstance.deleteLineage(id, clusterNodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProvenanceApi#deleteLineage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the lineage query. |
 **clusterNodeId** | **String**| The id of the node where this query exists if clustered. | [optional]

### Return type

[**LineageEntity**](LineageEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="deleteProvenance"></a>
# **deleteProvenance**
> ProvenanceEntity deleteProvenance(id, clusterNodeId)

Deletes a provenance query



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.ProvenanceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ProvenanceApi apiInstance = new ProvenanceApi();
String id = "id_example"; // String | The id of the provenance query.
String clusterNodeId = "clusterNodeId_example"; // String | The id of the node where this query exists if clustered.
try {
    ProvenanceEntity result = apiInstance.deleteProvenance(id, clusterNodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProvenanceApi#deleteProvenance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the provenance query. |
 **clusterNodeId** | **String**| The id of the node where this query exists if clustered. | [optional]

### Return type

[**ProvenanceEntity**](ProvenanceEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getLineage"></a>
# **getLineage**
> LineageEntity getLineage(id, clusterNodeId)

Gets a lineage query



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.ProvenanceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ProvenanceApi apiInstance = new ProvenanceApi();
String id = "id_example"; // String | The id of the lineage query.
String clusterNodeId = "clusterNodeId_example"; // String | The id of the node where this query exists if clustered.
try {
    LineageEntity result = apiInstance.getLineage(id, clusterNodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProvenanceApi#getLineage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the lineage query. |
 **clusterNodeId** | **String**| The id of the node where this query exists if clustered. | [optional]

### Return type

[**LineageEntity**](LineageEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getProvenance"></a>
# **getProvenance**
> ProvenanceEntity getProvenance(id, clusterNodeId, summarize, incrementalResults)

Gets a provenance query



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.ProvenanceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ProvenanceApi apiInstance = new ProvenanceApi();
String id = "id_example"; // String | The id of the provenance query.
String clusterNodeId = "clusterNodeId_example"; // String | The id of the node where this query exists if clustered.
Boolean summarize = true; // Boolean | Whether or not incremental results are returned. If false, provenance events are only returned once the query completes. This property is true by default.
Boolean incrementalResults = true; // Boolean | Whether or not to summarize provenance events returned. This property is false by default.
try {
    ProvenanceEntity result = apiInstance.getProvenance(id, clusterNodeId, summarize, incrementalResults);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProvenanceApi#getProvenance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the provenance query. |
 **clusterNodeId** | **String**| The id of the node where this query exists if clustered. | [optional]
 **summarize** | **Boolean**| Whether or not incremental results are returned. If false, provenance events are only returned once the query completes. This property is true by default. | [optional]
 **incrementalResults** | **Boolean**| Whether or not to summarize provenance events returned. This property is false by default. | [optional]

### Return type

[**ProvenanceEntity**](ProvenanceEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getSearchOptions"></a>
# **getSearchOptions**
> ProvenanceOptionsEntity getSearchOptions()

Gets the searchable attributes for provenance events



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.ProvenanceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ProvenanceApi apiInstance = new ProvenanceApi();
try {
    ProvenanceOptionsEntity result = apiInstance.getSearchOptions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProvenanceApi#getSearchOptions");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ProvenanceOptionsEntity**](ProvenanceOptionsEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="submitLineageRequest"></a>
# **submitLineageRequest**
> LineageEntity submitLineageRequest(body)

Submits a lineage query

Lineage queries may be long running so this endpoint submits a request. The response will include the current state of the query. If the request is not completed the URI in the response can be used at a later time to get the updated state of the query. Once the query has completed the lineage request should be deleted by the client who originally submitted it.

### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.ProvenanceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ProvenanceApi apiInstance = new ProvenanceApi();
LineageEntity body = new LineageEntity(); // LineageEntity | The lineage query details.
try {
    LineageEntity result = apiInstance.submitLineageRequest(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProvenanceApi#submitLineageRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LineageEntity**](LineageEntity.md)| The lineage query details. |

### Return type

[**LineageEntity**](LineageEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="submitProvenanceRequest"></a>
# **submitProvenanceRequest**
> ProvenanceEntity submitProvenanceRequest(body)

Submits a provenance query

Provenance queries may be long running so this endpoint submits a request. The response will include the current state of the query. If the request is not completed the URI in the response can be used at a later time to get the updated state of the query. Once the query has completed the provenance request should be deleted by the client who originally submitted it.

### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.ProvenanceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ProvenanceApi apiInstance = new ProvenanceApi();
ProvenanceEntity body = new ProvenanceEntity(); // ProvenanceEntity | The provenance query details.
try {
    ProvenanceEntity result = apiInstance.submitProvenanceRequest(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProvenanceApi#submitProvenanceRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ProvenanceEntity**](ProvenanceEntity.md)| The provenance query details. |

### Return type

[**ProvenanceEntity**](ProvenanceEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

