# DataTransferApi

All URIs are relative to *http://localhost/nifi-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**commitInputPortTransaction**](DataTransferApi.md#commitInputPortTransaction) | **DELETE** /data-transfer/input-ports/{portId}/transactions/{transactionId} | Commit or cancel the specified transaction
[**commitOutputPortTransaction**](DataTransferApi.md#commitOutputPortTransaction) | **DELETE** /data-transfer/output-ports/{portId}/transactions/{transactionId} | Commit or cancel the specified transaction
[**createPortTransaction**](DataTransferApi.md#createPortTransaction) | **POST** /data-transfer/{portType}/{portId}/transactions | Create a transaction to the specified output port or input port
[**extendInputPortTransactionTTL**](DataTransferApi.md#extendInputPortTransactionTTL) | **PUT** /data-transfer/input-ports/{portId}/transactions/{transactionId} | Extend transaction TTL
[**extendOutputPortTransactionTTL**](DataTransferApi.md#extendOutputPortTransactionTTL) | **PUT** /data-transfer/output-ports/{portId}/transactions/{transactionId} | Extend transaction TTL
[**receiveFlowFiles**](DataTransferApi.md#receiveFlowFiles) | **POST** /data-transfer/input-ports/{portId}/transactions/{transactionId}/flow-files | Transfer flow files to the input port
[**transferFlowFiles**](DataTransferApi.md#transferFlowFiles) | **GET** /data-transfer/output-ports/{portId}/transactions/{transactionId}/flow-files | Transfer flow files from the output port


<a name="commitInputPortTransaction"></a>
# **commitInputPortTransaction**
> TransactionResultEntity commitInputPortTransaction(responseCode, portId, transactionId)

Commit or cancel the specified transaction



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.DataTransferApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

DataTransferApi apiInstance = new DataTransferApi();
Integer responseCode = 56; // Integer | The response code. Available values are BAD_CHECKSUM(19), CONFIRM_TRANSACTION(12) or CANCEL_TRANSACTION(15).
String portId = "portId_example"; // String | The input port id.
String transactionId = "transactionId_example"; // String | The transaction id.
try {
    TransactionResultEntity result = apiInstance.commitInputPortTransaction(responseCode, portId, transactionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataTransferApi#commitInputPortTransaction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **responseCode** | **Integer**| The response code. Available values are BAD_CHECKSUM(19), CONFIRM_TRANSACTION(12) or CANCEL_TRANSACTION(15). |
 **portId** | **String**| The input port id. |
 **transactionId** | **String**| The transaction id. |

### Return type

[**TransactionResultEntity**](TransactionResultEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/octet-stream
 - **Accept**: application/json

<a name="commitOutputPortTransaction"></a>
# **commitOutputPortTransaction**
> TransactionResultEntity commitOutputPortTransaction(responseCode, checksum, portId, transactionId)

Commit or cancel the specified transaction



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.DataTransferApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

DataTransferApi apiInstance = new DataTransferApi();
Integer responseCode = 56; // Integer | The response code. Available values are CONFIRM_TRANSACTION(12) or CANCEL_TRANSACTION(15).
String checksum = "checksum_example"; // String | A checksum calculated at client side using CRC32 to check flow file content integrity. It must match with the value calculated at server side.
String portId = "portId_example"; // String | The output port id.
String transactionId = "transactionId_example"; // String | The transaction id.
try {
    TransactionResultEntity result = apiInstance.commitOutputPortTransaction(responseCode, checksum, portId, transactionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataTransferApi#commitOutputPortTransaction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **responseCode** | **Integer**| The response code. Available values are CONFIRM_TRANSACTION(12) or CANCEL_TRANSACTION(15). |
 **checksum** | **String**| A checksum calculated at client side using CRC32 to check flow file content integrity. It must match with the value calculated at server side. |
 **portId** | **String**| The output port id. |
 **transactionId** | **String**| The transaction id. |

### Return type

[**TransactionResultEntity**](TransactionResultEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/octet-stream
 - **Accept**: application/json

<a name="createPortTransaction"></a>
# **createPortTransaction**
> TransactionResultEntity createPortTransaction(portType, portId)

Create a transaction to the specified output port or input port



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.DataTransferApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

DataTransferApi apiInstance = new DataTransferApi();
String portType = "portType_example"; // String | The port type.
String portId = "portId_example"; // String | 
try {
    TransactionResultEntity result = apiInstance.createPortTransaction(portType, portId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataTransferApi#createPortTransaction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portType** | **String**| The port type. | [enum: input-ports, output-ports]
 **portId** | **String**|  |

### Return type

[**TransactionResultEntity**](TransactionResultEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="extendInputPortTransactionTTL"></a>
# **extendInputPortTransactionTTL**
> TransactionResultEntity extendInputPortTransactionTTL(portId, transactionId)

Extend transaction TTL



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.DataTransferApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

DataTransferApi apiInstance = new DataTransferApi();
String portId = "portId_example"; // String | 
String transactionId = "transactionId_example"; // String | 
try {
    TransactionResultEntity result = apiInstance.extendInputPortTransactionTTL(portId, transactionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataTransferApi#extendInputPortTransactionTTL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portId** | **String**|  |
 **transactionId** | **String**|  |

### Return type

[**TransactionResultEntity**](TransactionResultEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="extendOutputPortTransactionTTL"></a>
# **extendOutputPortTransactionTTL**
> TransactionResultEntity extendOutputPortTransactionTTL(portId, transactionId)

Extend transaction TTL



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.DataTransferApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

DataTransferApi apiInstance = new DataTransferApi();
String portId = "portId_example"; // String | 
String transactionId = "transactionId_example"; // String | 
try {
    TransactionResultEntity result = apiInstance.extendOutputPortTransactionTTL(portId, transactionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataTransferApi#extendOutputPortTransactionTTL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portId** | **String**|  |
 **transactionId** | **String**|  |

### Return type

[**TransactionResultEntity**](TransactionResultEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="receiveFlowFiles"></a>
# **receiveFlowFiles**
> String receiveFlowFiles(portId, transactionId)

Transfer flow files to the input port



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.DataTransferApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

DataTransferApi apiInstance = new DataTransferApi();
String portId = "portId_example"; // String | The input port id.
String transactionId = "transactionId_example"; // String | 
try {
    String result = apiInstance.receiveFlowFiles(portId, transactionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataTransferApi#receiveFlowFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portId** | **String**| The input port id. |
 **transactionId** | **String**|  |

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/octet-stream
 - **Accept**: text/plain

<a name="transferFlowFiles"></a>
# **transferFlowFiles**
> StreamingOutput transferFlowFiles(portId, transactionId)

Transfer flow files from the output port



### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.DataTransferApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

DataTransferApi apiInstance = new DataTransferApi();
String portId = "portId_example"; // String | The output port id.
String transactionId = "transactionId_example"; // String | 
try {
    StreamingOutput result = apiInstance.transferFlowFiles(portId, transactionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataTransferApi#transferFlowFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portId** | **String**| The output port id. |
 **transactionId** | **String**|  |

### Return type

[**StreamingOutput**](StreamingOutput.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/octet-stream

