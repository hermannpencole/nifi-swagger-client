# ProvenanceEventsApi

All URIs are relative to *http://localhost/nifi-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getInputContent**](ProvenanceEventsApi.md#getInputContent) | **GET** /provenance-events/{id}/content/input | Gets the input content for a provenance event
[**getOutputContent**](ProvenanceEventsApi.md#getOutputContent) | **GET** /provenance-events/{id}/content/output | Gets the output content for a provenance event
[**getProvenanceEvent**](ProvenanceEventsApi.md#getProvenanceEvent) | **GET** /provenance-events/{id} | Gets a provenance event
[**submitReplay**](ProvenanceEventsApi.md#submitReplay) | **POST** /provenance-events/replays | Replays content from a provenance event


<a name="getInputContent"></a>
# **getInputContent**
> StreamingOutput getInputContent(id, clusterNodeId)

Gets the input content for a provenance event



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.ProvenanceEventsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ProvenanceEventsApi apiInstance = new ProvenanceEventsApi();
String id = "id_example"; // String | The provenance event id.
String clusterNodeId = "clusterNodeId_example"; // String | The id of the node where the content exists if clustered.
try {
    StreamingOutput result = apiInstance.getInputContent(id, clusterNodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProvenanceEventsApi#getInputContent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The provenance event id. |
 **clusterNodeId** | **String**| The id of the node where the content exists if clustered. | [optional]

### Return type

[**StreamingOutput**](StreamingOutput.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="getOutputContent"></a>
# **getOutputContent**
> StreamingOutput getOutputContent(id, clusterNodeId)

Gets the output content for a provenance event



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.ProvenanceEventsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ProvenanceEventsApi apiInstance = new ProvenanceEventsApi();
String id = "id_example"; // String | The provenance event id.
String clusterNodeId = "clusterNodeId_example"; // String | The id of the node where the content exists if clustered.
try {
    StreamingOutput result = apiInstance.getOutputContent(id, clusterNodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProvenanceEventsApi#getOutputContent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The provenance event id. |
 **clusterNodeId** | **String**| The id of the node where the content exists if clustered. | [optional]

### Return type

[**StreamingOutput**](StreamingOutput.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="getProvenanceEvent"></a>
# **getProvenanceEvent**
> ProvenanceEventEntity getProvenanceEvent(id, clusterNodeId)

Gets a provenance event



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.ProvenanceEventsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ProvenanceEventsApi apiInstance = new ProvenanceEventsApi();
String id = "id_example"; // String | The provenance event id.
String clusterNodeId = "clusterNodeId_example"; // String | The id of the node where this event exists if clustered.
try {
    ProvenanceEventEntity result = apiInstance.getProvenanceEvent(id, clusterNodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProvenanceEventsApi#getProvenanceEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The provenance event id. |
 **clusterNodeId** | **String**| The id of the node where this event exists if clustered. | [optional]

### Return type

[**ProvenanceEventEntity**](ProvenanceEventEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="submitReplay"></a>
# **submitReplay**
> ProvenanceEventEntity submitReplay(body)

Replays content from a provenance event



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.ProvenanceEventsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ProvenanceEventsApi apiInstance = new ProvenanceEventsApi();
SubmitReplayRequestEntity body = new SubmitReplayRequestEntity(); // SubmitReplayRequestEntity | The replay request.
try {
    ProvenanceEventEntity result = apiInstance.submitReplay(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProvenanceEventsApi#submitReplay");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SubmitReplayRequestEntity**](SubmitReplayRequestEntity.md)| The replay request. |

### Return type

[**ProvenanceEventEntity**](ProvenanceEventEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

