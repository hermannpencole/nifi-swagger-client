# ControllerApi

All URIs are relative to *http://localhost/nifi-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBulletin**](ControllerApi.md#createBulletin) | **POST** /controller/bulletin | Creates a new bulletin
[**createControllerService**](ControllerApi.md#createControllerService) | **POST** /controller/controller-services | Creates a new controller service
[**createRegistryClient**](ControllerApi.md#createRegistryClient) | **POST** /controller/registry-clients | Creates a new registry client
[**createReportingTask**](ControllerApi.md#createReportingTask) | **POST** /controller/reporting-tasks | Creates a new reporting task
[**deleteHistory**](ControllerApi.md#deleteHistory) | **DELETE** /controller/history | Purges history
[**deleteNode**](ControllerApi.md#deleteNode) | **DELETE** /controller/cluster/nodes/{id} | Removes a node from the cluster
[**deleteRegistryClient**](ControllerApi.md#deleteRegistryClient) | **DELETE** /controller/registry-clients/{id} | Deletes a registry client
[**getCluster**](ControllerApi.md#getCluster) | **GET** /controller/cluster | Gets the contents of the cluster
[**getControllerConfig**](ControllerApi.md#getControllerConfig) | **GET** /controller/config | Retrieves the configuration for this NiFi Controller
[**getNode**](ControllerApi.md#getNode) | **GET** /controller/cluster/nodes/{id} | Gets a node in the cluster
[**getRegistryClient**](ControllerApi.md#getRegistryClient) | **GET** /controller/registry-clients/{id} | Gets a registry client
[**getRegistryClients**](ControllerApi.md#getRegistryClients) | **GET** /controller/registry-clients | Gets the listing of available registry clients
[**updateControllerConfig**](ControllerApi.md#updateControllerConfig) | **PUT** /controller/config | Retrieves the configuration for this NiFi
[**updateNode**](ControllerApi.md#updateNode) | **PUT** /controller/cluster/nodes/{id} | Updates a node in the cluster
[**updateRegistryClient**](ControllerApi.md#updateRegistryClient) | **PUT** /controller/registry-clients/{id} | Updates a registry client


<a name="createBulletin"></a>
# **createBulletin**
> BulletinEntity createBulletin(body)

Creates a new bulletin



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.ControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ControllerApi apiInstance = new ControllerApi();
BulletinEntity body = new BulletinEntity(); // BulletinEntity | The reporting task configuration details.
try {
    BulletinEntity result = apiInstance.createBulletin(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ControllerApi#createBulletin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BulletinEntity**](BulletinEntity.md)| The reporting task configuration details. |

### Return type

[**BulletinEntity**](BulletinEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createControllerService"></a>
# **createControllerService**
> ControllerServiceEntity createControllerService(body)

Creates a new controller service



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.ControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ControllerApi apiInstance = new ControllerApi();
ControllerServiceEntity body = new ControllerServiceEntity(); // ControllerServiceEntity | The controller service configuration details.
try {
    ControllerServiceEntity result = apiInstance.createControllerService(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ControllerApi#createControllerService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ControllerServiceEntity**](ControllerServiceEntity.md)| The controller service configuration details. |

### Return type

[**ControllerServiceEntity**](ControllerServiceEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createRegistryClient"></a>
# **createRegistryClient**
> RegistryClientEntity createRegistryClient(body)

Creates a new registry client



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.ControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ControllerApi apiInstance = new ControllerApi();
RegistryClientEntity body = new RegistryClientEntity(); // RegistryClientEntity | The registry configuration details.
try {
    RegistryClientEntity result = apiInstance.createRegistryClient(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ControllerApi#createRegistryClient");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RegistryClientEntity**](RegistryClientEntity.md)| The registry configuration details. |

### Return type

[**RegistryClientEntity**](RegistryClientEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createReportingTask"></a>
# **createReportingTask**
> ReportingTaskEntity createReportingTask(body)

Creates a new reporting task



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.ControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ControllerApi apiInstance = new ControllerApi();
ReportingTaskEntity body = new ReportingTaskEntity(); // ReportingTaskEntity | The reporting task configuration details.
try {
    ReportingTaskEntity result = apiInstance.createReportingTask(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ControllerApi#createReportingTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ReportingTaskEntity**](ReportingTaskEntity.md)| The reporting task configuration details. |

### Return type

[**ReportingTaskEntity**](ReportingTaskEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteHistory"></a>
# **deleteHistory**
> HistoryEntity deleteHistory(endDate)

Purges history



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.ControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ControllerApi apiInstance = new ControllerApi();
String endDate = "endDate_example"; // String | Purge actions before this date/time.
try {
    HistoryEntity result = apiInstance.deleteHistory(endDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ControllerApi#deleteHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **endDate** | **String**| Purge actions before this date/time. |

### Return type

[**HistoryEntity**](HistoryEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="deleteNode"></a>
# **deleteNode**
> NodeEntity deleteNode(id)

Removes a node from the cluster



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.ControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ControllerApi apiInstance = new ControllerApi();
String id = "id_example"; // String | The node id.
try {
    NodeEntity result = apiInstance.deleteNode(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ControllerApi#deleteNode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The node id. |

### Return type

[**NodeEntity**](NodeEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="deleteRegistryClient"></a>
# **deleteRegistryClient**
> RegistryClientEntity deleteRegistryClient(id, version, clientId)

Deletes a registry client



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.ControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ControllerApi apiInstance = new ControllerApi();
String id = "id_example"; // String | The registry id.
String version = "version_example"; // String | The revision is used to verify the client is working with the latest version of the flow.
String clientId = "clientId_example"; // String | If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response.
try {
    RegistryClientEntity result = apiInstance.deleteRegistryClient(id, version, clientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ControllerApi#deleteRegistryClient");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The registry id. |
 **version** | **String**| The revision is used to verify the client is working with the latest version of the flow. | [optional]
 **clientId** | **String**| If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. | [optional]

### Return type

[**RegistryClientEntity**](RegistryClientEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getCluster"></a>
# **getCluster**
> ClusterEntity getCluster()

Gets the contents of the cluster

Returns the contents of the cluster including all nodes and their status.

### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.ControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ControllerApi apiInstance = new ControllerApi();
try {
    ClusterEntity result = apiInstance.getCluster();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ControllerApi#getCluster");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ClusterEntity**](ClusterEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getControllerConfig"></a>
# **getControllerConfig**
> ControllerConfigurationEntity getControllerConfig()

Retrieves the configuration for this NiFi Controller



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.ControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ControllerApi apiInstance = new ControllerApi();
try {
    ControllerConfigurationEntity result = apiInstance.getControllerConfig();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ControllerApi#getControllerConfig");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ControllerConfigurationEntity**](ControllerConfigurationEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getNode"></a>
# **getNode**
> NodeEntity getNode(id)

Gets a node in the cluster



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.ControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ControllerApi apiInstance = new ControllerApi();
String id = "id_example"; // String | The node id.
try {
    NodeEntity result = apiInstance.getNode(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ControllerApi#getNode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The node id. |

### Return type

[**NodeEntity**](NodeEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getRegistryClient"></a>
# **getRegistryClient**
> RegistryClientEntity getRegistryClient(id)

Gets a registry client



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.ControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ControllerApi apiInstance = new ControllerApi();
String id = "id_example"; // String | The registry id.
try {
    RegistryClientEntity result = apiInstance.getRegistryClient(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ControllerApi#getRegistryClient");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The registry id. |

### Return type

[**RegistryClientEntity**](RegistryClientEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getRegistryClients"></a>
# **getRegistryClients**
> RegistryClientsEntity getRegistryClients()

Gets the listing of available registry clients



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.ControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ControllerApi apiInstance = new ControllerApi();
try {
    RegistryClientsEntity result = apiInstance.getRegistryClients();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ControllerApi#getRegistryClients");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**RegistryClientsEntity**](RegistryClientsEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="updateControllerConfig"></a>
# **updateControllerConfig**
> ControllerConfigurationEntity updateControllerConfig(body)

Retrieves the configuration for this NiFi



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.ControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ControllerApi apiInstance = new ControllerApi();
ControllerConfigurationEntity body = new ControllerConfigurationEntity(); // ControllerConfigurationEntity | The controller configuration.
try {
    ControllerConfigurationEntity result = apiInstance.updateControllerConfig(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ControllerApi#updateControllerConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ControllerConfigurationEntity**](ControllerConfigurationEntity.md)| The controller configuration. |

### Return type

[**ControllerConfigurationEntity**](ControllerConfigurationEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateNode"></a>
# **updateNode**
> NodeEntity updateNode(id, body)

Updates a node in the cluster



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.ControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ControllerApi apiInstance = new ControllerApi();
String id = "id_example"; // String | The node id.
NodeEntity body = new NodeEntity(); // NodeEntity | The node configuration. The only configuration that will be honored at this endpoint is the status.
try {
    NodeEntity result = apiInstance.updateNode(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ControllerApi#updateNode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The node id. |
 **body** | [**NodeEntity**](NodeEntity.md)| The node configuration. The only configuration that will be honored at this endpoint is the status. |

### Return type

[**NodeEntity**](NodeEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRegistryClient"></a>
# **updateRegistryClient**
> RegistryClientEntity updateRegistryClient(id, body)

Updates a registry client



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.ControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ControllerApi apiInstance = new ControllerApi();
String id = "id_example"; // String | The registry id.
RegistryClientEntity body = new RegistryClientEntity(); // RegistryClientEntity | The registry configuration details.
try {
    RegistryClientEntity result = apiInstance.updateRegistryClient(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ControllerApi#updateRegistryClient");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The registry id. |
 **body** | [**RegistryClientEntity**](RegistryClientEntity.md)| The registry configuration details. |

### Return type

[**RegistryClientEntity**](RegistryClientEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

