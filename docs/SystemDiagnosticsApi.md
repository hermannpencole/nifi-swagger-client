# SystemDiagnosticsApi

All URIs are relative to *http://localhost/nifi-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSystemDiagnostics**](SystemDiagnosticsApi.md#getSystemDiagnostics) | **GET** /system-diagnostics | Gets the diagnostics for the system NiFi is running on


<a name="getSystemDiagnostics"></a>
# **getSystemDiagnostics**
> SystemDiagnosticsEntity getSystemDiagnostics(nodewise, clusterNodeId)

Gets the diagnostics for the system NiFi is running on



### Example
```java
// Import classes:
//import fr.hpencole.nifi.swagger.ApiClient;
//import fr.hpencole.nifi.swagger.ApiException;
//import fr.hpencole.nifi.swagger.Configuration;
//import fr.hpencole.nifi.swagger.auth.*;
//import fr.hpencole.nifi.swagger.client.SystemDiagnosticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

SystemDiagnosticsApi apiInstance = new SystemDiagnosticsApi();
Boolean nodewise = true; // Boolean | Whether or not to include the breakdown per node. Optional, defaults to false
String clusterNodeId = "clusterNodeId_example"; // String | The id of the node where to get the status.
try {
    SystemDiagnosticsEntity result = apiInstance.getSystemDiagnostics(nodewise, clusterNodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemDiagnosticsApi#getSystemDiagnostics");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodewise** | **Boolean**| Whether or not to include the breakdown per node. Optional, defaults to false | [optional]
 **clusterNodeId** | **String**| The id of the node where to get the status. | [optional]

### Return type

[**SystemDiagnosticsEntity**](SystemDiagnosticsEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

