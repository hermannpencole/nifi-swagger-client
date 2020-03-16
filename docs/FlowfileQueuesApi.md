# FlowfileQueuesApi

All URIs are relative to *http://localhost/nifi-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDropRequest**](FlowfileQueuesApi.md#createDropRequest) | **POST** /flowfile-queues/{id}/drop-requests | Creates a request to drop the contents of the queue in this connection.
[**createFlowFileListing**](FlowfileQueuesApi.md#createFlowFileListing) | **POST** /flowfile-queues/{id}/listing-requests | Lists the contents of the queue in this connection.
[**deleteListingRequest**](FlowfileQueuesApi.md#deleteListingRequest) | **DELETE** /flowfile-queues/{id}/listing-requests/{listing-request-id} | Cancels and/or removes a request to list the contents of this connection.
[**downloadFlowFileContent**](FlowfileQueuesApi.md#downloadFlowFileContent) | **GET** /flowfile-queues/{id}/flowfiles/{flowfile-uuid}/content | Gets the content for a FlowFile in a Connection.
[**getDropRequest**](FlowfileQueuesApi.md#getDropRequest) | **GET** /flowfile-queues/{id}/drop-requests/{drop-request-id} | Gets the current status of a drop request for the specified connection.
[**getFlowFile**](FlowfileQueuesApi.md#getFlowFile) | **GET** /flowfile-queues/{id}/flowfiles/{flowfile-uuid} | Gets a FlowFile from a Connection.
[**getListingRequest**](FlowfileQueuesApi.md#getListingRequest) | **GET** /flowfile-queues/{id}/listing-requests/{listing-request-id} | Gets the current status of a listing request for the specified connection.
[**removeDropRequest**](FlowfileQueuesApi.md#removeDropRequest) | **DELETE** /flowfile-queues/{id}/drop-requests/{drop-request-id} | Cancels and/or removes a request to drop the contents of this connection.


<a name="createDropRequest"></a>
# **createDropRequest**
> DropRequestEntity createDropRequest(id)

Creates a request to drop the contents of the queue in this connection.



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.FlowfileQueuesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

FlowfileQueuesApi apiInstance = new FlowfileQueuesApi();
String id = "id_example"; // String | The connection id.
try {
    DropRequestEntity result = apiInstance.createDropRequest(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowfileQueuesApi#createDropRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The connection id. |

### Return type

[**DropRequestEntity**](DropRequestEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="createFlowFileListing"></a>
# **createFlowFileListing**
> ListingRequestEntity createFlowFileListing(id)

Lists the contents of the queue in this connection.



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.FlowfileQueuesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

FlowfileQueuesApi apiInstance = new FlowfileQueuesApi();
String id = "id_example"; // String | The connection id.
try {
    ListingRequestEntity result = apiInstance.createFlowFileListing(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowfileQueuesApi#createFlowFileListing");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The connection id. |

### Return type

[**ListingRequestEntity**](ListingRequestEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="deleteListingRequest"></a>
# **deleteListingRequest**
> ListingRequestEntity deleteListingRequest(id, listingRequestId)

Cancels and/or removes a request to list the contents of this connection.



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.FlowfileQueuesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

FlowfileQueuesApi apiInstance = new FlowfileQueuesApi();
String id = "id_example"; // String | The connection id.
String listingRequestId = "listingRequestId_example"; // String | The listing request id.
try {
    ListingRequestEntity result = apiInstance.deleteListingRequest(id, listingRequestId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowfileQueuesApi#deleteListingRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The connection id. |
 **listingRequestId** | **String**| The listing request id. |

### Return type

[**ListingRequestEntity**](ListingRequestEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="downloadFlowFileContent"></a>
# **downloadFlowFileContent**
> StreamingOutput downloadFlowFileContent(id, flowfileUuid, clientId, clusterNodeId)

Gets the content for a FlowFile in a Connection.



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.FlowfileQueuesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

FlowfileQueuesApi apiInstance = new FlowfileQueuesApi();
String id = "id_example"; // String | The connection id.
String flowfileUuid = "flowfileUuid_example"; // String | The flowfile uuid.
String clientId = "clientId_example"; // String | If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response.
String clusterNodeId = "clusterNodeId_example"; // String | The id of the node where the content exists if clustered.
try {
    StreamingOutput result = apiInstance.downloadFlowFileContent(id, flowfileUuid, clientId, clusterNodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowfileQueuesApi#downloadFlowFileContent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The connection id. |
 **flowfileUuid** | **String**| The flowfile uuid. |
 **clientId** | **String**| If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. | [optional]
 **clusterNodeId** | **String**| The id of the node where the content exists if clustered. | [optional]

### Return type

[**StreamingOutput**](StreamingOutput.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="getDropRequest"></a>
# **getDropRequest**
> DropRequestEntity getDropRequest(id, dropRequestId)

Gets the current status of a drop request for the specified connection.



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.FlowfileQueuesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

FlowfileQueuesApi apiInstance = new FlowfileQueuesApi();
String id = "id_example"; // String | The connection id.
String dropRequestId = "dropRequestId_example"; // String | The drop request id.
try {
    DropRequestEntity result = apiInstance.getDropRequest(id, dropRequestId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowfileQueuesApi#getDropRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The connection id. |
 **dropRequestId** | **String**| The drop request id. |

### Return type

[**DropRequestEntity**](DropRequestEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getFlowFile"></a>
# **getFlowFile**
> FlowFileEntity getFlowFile(id, flowfileUuid, clusterNodeId)

Gets a FlowFile from a Connection.



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.FlowfileQueuesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

FlowfileQueuesApi apiInstance = new FlowfileQueuesApi();
String id = "id_example"; // String | The connection id.
String flowfileUuid = "flowfileUuid_example"; // String | The flowfile uuid.
String clusterNodeId = "clusterNodeId_example"; // String | The id of the node where the content exists if clustered.
try {
    FlowFileEntity result = apiInstance.getFlowFile(id, flowfileUuid, clusterNodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowfileQueuesApi#getFlowFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The connection id. |
 **flowfileUuid** | **String**| The flowfile uuid. |
 **clusterNodeId** | **String**| The id of the node where the content exists if clustered. | [optional]

### Return type

[**FlowFileEntity**](FlowFileEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getListingRequest"></a>
# **getListingRequest**
> ListingRequestEntity getListingRequest(id, listingRequestId)

Gets the current status of a listing request for the specified connection.



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.FlowfileQueuesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

FlowfileQueuesApi apiInstance = new FlowfileQueuesApi();
String id = "id_example"; // String | The connection id.
String listingRequestId = "listingRequestId_example"; // String | The listing request id.
try {
    ListingRequestEntity result = apiInstance.getListingRequest(id, listingRequestId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowfileQueuesApi#getListingRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The connection id. |
 **listingRequestId** | **String**| The listing request id. |

### Return type

[**ListingRequestEntity**](ListingRequestEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="removeDropRequest"></a>
# **removeDropRequest**
> DropRequestEntity removeDropRequest(id, dropRequestId)

Cancels and/or removes a request to drop the contents of this connection.



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.FlowfileQueuesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

FlowfileQueuesApi apiInstance = new FlowfileQueuesApi();
String id = "id_example"; // String | The connection id.
String dropRequestId = "dropRequestId_example"; // String | The drop request id.
try {
    DropRequestEntity result = apiInstance.removeDropRequest(id, dropRequestId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowfileQueuesApi#removeDropRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The connection id. |
 **dropRequestId** | **String**| The drop request id. |

### Return type

[**DropRequestEntity**](DropRequestEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

