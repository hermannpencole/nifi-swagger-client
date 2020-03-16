# VersionsApi

All URIs are relative to *http://localhost/nifi-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createVersionControlRequest**](VersionsApi.md#createVersionControlRequest) | **POST** /versions/active-requests | Creates a request so that a Process Group can be placed under Version Control or have its Version Control configuration changed. Creating this request will prevent any other threads from simultaneously saving local changes to Version Control. It will not, however, actually save the local flow to the Flow Registry. A POST to /versions/process-groups/{id} should be used to initiate saving of the local flow to the Flow Registry.
[**deleteRevertRequest**](VersionsApi.md#deleteRevertRequest) | **DELETE** /versions/revert-requests/{id} | Deletes the Revert Request with the given ID. After a request is created via a POST to /versions/revert-requests/process-groups/{id}, it is expected that the client will properly clean up the request by DELETE&#39;ing it, once the Revert process has completed. If the request is deleted before the request completes, then the Revert request will finish the step that it is currently performing and then will cancel any subsequent steps.
[**deleteUpdateRequest**](VersionsApi.md#deleteUpdateRequest) | **DELETE** /versions/update-requests/{id} | Deletes the Update Request with the given ID. After a request is created via a POST to /versions/update-requests/process-groups/{id}, it is expected that the client will properly clean up the request by DELETE&#39;ing it, once the Update process has completed. If the request is deleted before the request completes, then the Update request will finish the step that it is currently performing and then will cancel any subsequent steps.
[**deleteVersionControlRequest**](VersionsApi.md#deleteVersionControlRequest) | **DELETE** /versions/active-requests/{id} | Deletes the Version Control Request with the given ID. This will allow other threads to save flows to the Flow Registry. See also the documentation for POSTing to /versions/active-requests for information regarding why this is done.
[**getRevertRequest**](VersionsApi.md#getRevertRequest) | **GET** /versions/revert-requests/{id} | Returns the Revert Request with the given ID. Once a Revert Request has been created by performing a POST to /versions/revert-requests/process-groups/{id}, that request can subsequently be retrieved via this endpoint, and the request that is fetched will contain the updated state, such as percent complete, the current state of the request, and any failures.
[**getUpdateRequest**](VersionsApi.md#getUpdateRequest) | **GET** /versions/update-requests/{id} | Returns the Update Request with the given ID. Once an Update Request has been created by performing a POST to /versions/update-requests/process-groups/{id}, that request can subsequently be retrieved via this endpoint, and the request that is fetched will contain the updated state, such as percent complete, the current state of the request, and any failures.
[**getVersionInformation**](VersionsApi.md#getVersionInformation) | **GET** /versions/process-groups/{id} | Gets the Version Control information for a process group
[**initiateRevertFlowVersion**](VersionsApi.md#initiateRevertFlowVersion) | **POST** /versions/revert-requests/process-groups/{id} | For a Process Group that is already under Version Control, this will initiate the action of reverting any local changes that have been made to the Process Group since it was last synchronized with the Flow Registry. This will result in the flow matching the Versioned Flow that exists in the Flow Registry. This can be a lengthy process, as it will stop any Processors and disable any Controller Services necessary to perform the action and then restart them. As a result, the endpoint will immediately return a VersionedFlowUpdateRequestEntity, and the process of updating the flow will occur asynchronously in the background. The client may then periodically poll the status of the request by issuing a GET request to /versions/revert-requests/{requestId}. Once the request is completed, the client is expected to issue a DELETE request to /versions/revert-requests/{requestId}.
[**initiateVersionControlUpdate**](VersionsApi.md#initiateVersionControlUpdate) | **POST** /versions/update-requests/process-groups/{id} | For a Process Group that is already under Version Control, this will initiate the action of changing from a specific version of the flow in the Flow Registry to a different version of the flow. This can be a lengthy process, as it will stop any Processors and disable any Controller Services necessary to perform the action and then restart them. As a result, the endpoint will immediately return a VersionedFlowUpdateRequestEntity, and the process of updating the flow will occur asynchronously in the background. The client may then periodically poll the status of the request by issuing a GET request to /versions/update-requests/{requestId}. Once the request is completed, the client is expected to issue a DELETE request to /versions/update-requests/{requestId}.
[**saveToFlowRegistry**](VersionsApi.md#saveToFlowRegistry) | **POST** /versions/process-groups/{id} | Begins version controlling the Process Group with the given ID or commits changes to the Versioned Flow, depending on if the provided VersionControlInformation includes a flowId
[**stopVersionControl**](VersionsApi.md#stopVersionControl) | **DELETE** /versions/process-groups/{id} | Stops version controlling the Process Group with the given ID. The Process Group will no longer track to any Versioned Flow.
[**updateFlowVersion**](VersionsApi.md#updateFlowVersion) | **PUT** /versions/process-groups/{id} | For a Process Group that is already under Version Control, this will update the version of the flow to a different version. This endpoint expects that the given snapshot will not modify any Processor that is currently running or any Controller Service that is enabled.
[**updateVersionControlRequest**](VersionsApi.md#updateVersionControlRequest) | **PUT** /versions/active-requests/{id} | Updates the request with the given ID


<a name="createVersionControlRequest"></a>
# **createVersionControlRequest**
> String createVersionControlRequest(body)

Creates a request so that a Process Group can be placed under Version Control or have its Version Control configuration changed. Creating this request will prevent any other threads from simultaneously saving local changes to Version Control. It will not, however, actually save the local flow to the Flow Registry. A POST to /versions/process-groups/{id} should be used to initiate saving of the local flow to the Flow Registry.

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.VersionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

VersionsApi apiInstance = new VersionsApi();
CreateActiveRequestEntity body = new CreateActiveRequestEntity(); // CreateActiveRequestEntity | The versioned flow details.
try {
    String result = apiInstance.createVersionControlRequest(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VersionsApi#createVersionControlRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateActiveRequestEntity**](CreateActiveRequestEntity.md)| The versioned flow details. |

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain

<a name="deleteRevertRequest"></a>
# **deleteRevertRequest**
> VersionedFlowUpdateRequestEntity deleteRevertRequest(id)

Deletes the Revert Request with the given ID. After a request is created via a POST to /versions/revert-requests/process-groups/{id}, it is expected that the client will properly clean up the request by DELETE&#39;ing it, once the Revert process has completed. If the request is deleted before the request completes, then the Revert request will finish the step that it is currently performing and then will cancel any subsequent steps.

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.VersionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

VersionsApi apiInstance = new VersionsApi();
String id = "id_example"; // String | The ID of the Revert Request
try {
    VersionedFlowUpdateRequestEntity result = apiInstance.deleteRevertRequest(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VersionsApi#deleteRevertRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the Revert Request |

### Return type

[**VersionedFlowUpdateRequestEntity**](VersionedFlowUpdateRequestEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="deleteUpdateRequest"></a>
# **deleteUpdateRequest**
> VersionedFlowUpdateRequestEntity deleteUpdateRequest(id)

Deletes the Update Request with the given ID. After a request is created via a POST to /versions/update-requests/process-groups/{id}, it is expected that the client will properly clean up the request by DELETE&#39;ing it, once the Update process has completed. If the request is deleted before the request completes, then the Update request will finish the step that it is currently performing and then will cancel any subsequent steps.

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.VersionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

VersionsApi apiInstance = new VersionsApi();
String id = "id_example"; // String | The ID of the Update Request
try {
    VersionedFlowUpdateRequestEntity result = apiInstance.deleteUpdateRequest(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VersionsApi#deleteUpdateRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the Update Request |

### Return type

[**VersionedFlowUpdateRequestEntity**](VersionedFlowUpdateRequestEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="deleteVersionControlRequest"></a>
# **deleteVersionControlRequest**
> deleteVersionControlRequest(id)

Deletes the Version Control Request with the given ID. This will allow other threads to save flows to the Flow Registry. See also the documentation for POSTing to /versions/active-requests for information regarding why this is done.

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.VersionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

VersionsApi apiInstance = new VersionsApi();
String id = "id_example"; // String | The request ID.
try {
    apiInstance.deleteVersionControlRequest(id);
} catch (ApiException e) {
    System.err.println("Exception when calling VersionsApi#deleteVersionControlRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The request ID. |

### Return type

null (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getRevertRequest"></a>
# **getRevertRequest**
> VersionedFlowUpdateRequestEntity getRevertRequest(id)

Returns the Revert Request with the given ID. Once a Revert Request has been created by performing a POST to /versions/revert-requests/process-groups/{id}, that request can subsequently be retrieved via this endpoint, and the request that is fetched will contain the updated state, such as percent complete, the current state of the request, and any failures.

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.VersionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

VersionsApi apiInstance = new VersionsApi();
String id = "id_example"; // String | The ID of the Revert Request
try {
    VersionedFlowUpdateRequestEntity result = apiInstance.getRevertRequest(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VersionsApi#getRevertRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the Revert Request |

### Return type

[**VersionedFlowUpdateRequestEntity**](VersionedFlowUpdateRequestEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getUpdateRequest"></a>
# **getUpdateRequest**
> VersionedFlowUpdateRequestEntity getUpdateRequest(id)

Returns the Update Request with the given ID. Once an Update Request has been created by performing a POST to /versions/update-requests/process-groups/{id}, that request can subsequently be retrieved via this endpoint, and the request that is fetched will contain the updated state, such as percent complete, the current state of the request, and any failures.

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.VersionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

VersionsApi apiInstance = new VersionsApi();
String id = "id_example"; // String | The ID of the Update Request
try {
    VersionedFlowUpdateRequestEntity result = apiInstance.getUpdateRequest(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VersionsApi#getUpdateRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the Update Request |

### Return type

[**VersionedFlowUpdateRequestEntity**](VersionedFlowUpdateRequestEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getVersionInformation"></a>
# **getVersionInformation**
> VersionControlInformationEntity getVersionInformation(id)

Gets the Version Control information for a process group

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.VersionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

VersionsApi apiInstance = new VersionsApi();
String id = "id_example"; // String | The process group id.
try {
    VersionControlInformationEntity result = apiInstance.getVersionInformation(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VersionsApi#getVersionInformation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |

### Return type

[**VersionControlInformationEntity**](VersionControlInformationEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="initiateRevertFlowVersion"></a>
# **initiateRevertFlowVersion**
> VersionedFlowUpdateRequestEntity initiateRevertFlowVersion(id, body)

For a Process Group that is already under Version Control, this will initiate the action of reverting any local changes that have been made to the Process Group since it was last synchronized with the Flow Registry. This will result in the flow matching the Versioned Flow that exists in the Flow Registry. This can be a lengthy process, as it will stop any Processors and disable any Controller Services necessary to perform the action and then restart them. As a result, the endpoint will immediately return a VersionedFlowUpdateRequestEntity, and the process of updating the flow will occur asynchronously in the background. The client may then periodically poll the status of the request by issuing a GET request to /versions/revert-requests/{requestId}. Once the request is completed, the client is expected to issue a DELETE request to /versions/revert-requests/{requestId}.

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.VersionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

VersionsApi apiInstance = new VersionsApi();
String id = "id_example"; // String | The process group id.
VersionControlInformationEntity body = new VersionControlInformationEntity(); // VersionControlInformationEntity | The controller service configuration details.
try {
    VersionedFlowUpdateRequestEntity result = apiInstance.initiateRevertFlowVersion(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VersionsApi#initiateRevertFlowVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |
 **body** | [**VersionControlInformationEntity**](VersionControlInformationEntity.md)| The controller service configuration details. |

### Return type

[**VersionedFlowUpdateRequestEntity**](VersionedFlowUpdateRequestEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="initiateVersionControlUpdate"></a>
# **initiateVersionControlUpdate**
> VersionedFlowUpdateRequestEntity initiateVersionControlUpdate(id, body)

For a Process Group that is already under Version Control, this will initiate the action of changing from a specific version of the flow in the Flow Registry to a different version of the flow. This can be a lengthy process, as it will stop any Processors and disable any Controller Services necessary to perform the action and then restart them. As a result, the endpoint will immediately return a VersionedFlowUpdateRequestEntity, and the process of updating the flow will occur asynchronously in the background. The client may then periodically poll the status of the request by issuing a GET request to /versions/update-requests/{requestId}. Once the request is completed, the client is expected to issue a DELETE request to /versions/update-requests/{requestId}.

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.VersionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

VersionsApi apiInstance = new VersionsApi();
String id = "id_example"; // String | The process group id.
VersionControlInformationEntity body = new VersionControlInformationEntity(); // VersionControlInformationEntity | The controller service configuration details.
try {
    VersionedFlowUpdateRequestEntity result = apiInstance.initiateVersionControlUpdate(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VersionsApi#initiateVersionControlUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |
 **body** | [**VersionControlInformationEntity**](VersionControlInformationEntity.md)| The controller service configuration details. |

### Return type

[**VersionedFlowUpdateRequestEntity**](VersionedFlowUpdateRequestEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="saveToFlowRegistry"></a>
# **saveToFlowRegistry**
> VersionControlInformationEntity saveToFlowRegistry(id, body)

Begins version controlling the Process Group with the given ID or commits changes to the Versioned Flow, depending on if the provided VersionControlInformation includes a flowId

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.VersionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

VersionsApi apiInstance = new VersionsApi();
String id = "id_example"; // String | The process group id.
StartVersionControlRequestEntity body = new StartVersionControlRequestEntity(); // StartVersionControlRequestEntity | The versioned flow details.
try {
    VersionControlInformationEntity result = apiInstance.saveToFlowRegistry(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VersionsApi#saveToFlowRegistry");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |
 **body** | [**StartVersionControlRequestEntity**](StartVersionControlRequestEntity.md)| The versioned flow details. |

### Return type

[**VersionControlInformationEntity**](VersionControlInformationEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="stopVersionControl"></a>
# **stopVersionControl**
> VersionControlInformationEntity stopVersionControl(id, version, clientId)

Stops version controlling the Process Group with the given ID. The Process Group will no longer track to any Versioned Flow.

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.VersionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

VersionsApi apiInstance = new VersionsApi();
String id = "id_example"; // String | The process group id.
String version = "version_example"; // String | The version is used to verify the client is working with the latest version of the flow.
String clientId = "clientId_example"; // String | If the client id is not specified, a new one will be generated. This value (whether specified or generated) is included in the response.
try {
    VersionControlInformationEntity result = apiInstance.stopVersionControl(id, version, clientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VersionsApi#stopVersionControl");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |
 **version** | **String**| The version is used to verify the client is working with the latest version of the flow. | [optional]
 **clientId** | **String**| If the client id is not specified, a new one will be generated. This value (whether specified or generated) is included in the response. | [optional]

### Return type

[**VersionControlInformationEntity**](VersionControlInformationEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="updateFlowVersion"></a>
# **updateFlowVersion**
> VersionControlInformationEntity updateFlowVersion(id, body)

For a Process Group that is already under Version Control, this will update the version of the flow to a different version. This endpoint expects that the given snapshot will not modify any Processor that is currently running or any Controller Service that is enabled.

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.VersionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

VersionsApi apiInstance = new VersionsApi();
String id = "id_example"; // String | The process group id.
VersionedFlowSnapshotEntity body = new VersionedFlowSnapshotEntity(); // VersionedFlowSnapshotEntity | The controller service configuration details.
try {
    VersionControlInformationEntity result = apiInstance.updateFlowVersion(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VersionsApi#updateFlowVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |
 **body** | [**VersionedFlowSnapshotEntity**](VersionedFlowSnapshotEntity.md)| The controller service configuration details. |

### Return type

[**VersionControlInformationEntity**](VersionControlInformationEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateVersionControlRequest"></a>
# **updateVersionControlRequest**
> VersionControlInformationEntity updateVersionControlRequest(id, body)

Updates the request with the given ID

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.VersionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

VersionsApi apiInstance = new VersionsApi();
String id = "id_example"; // String | The request ID.
VersionControlComponentMappingEntity body = new VersionControlComponentMappingEntity(); // VersionControlComponentMappingEntity | The version control component mapping.
try {
    VersionControlInformationEntity result = apiInstance.updateVersionControlRequest(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VersionsApi#updateVersionControlRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The request ID. |
 **body** | [**VersionControlComponentMappingEntity**](VersionControlComponentMappingEntity.md)| The version control component mapping. |

### Return type

[**VersionControlInformationEntity**](VersionControlInformationEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

