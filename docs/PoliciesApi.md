# PoliciesApi

All URIs are relative to *http://localhost/nifi-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAccessPolicy**](PoliciesApi.md#createAccessPolicy) | **POST** /policies | Creates an access policy
[**getAccessPolicy**](PoliciesApi.md#getAccessPolicy) | **GET** /policies/{id} | Gets an access policy
[**getAccessPolicyForResource**](PoliciesApi.md#getAccessPolicyForResource) | **GET** /policies/{action}/{resource} | Gets an access policy for the specified action and resource
[**removeAccessPolicy**](PoliciesApi.md#removeAccessPolicy) | **DELETE** /policies/{id} | Deletes an access policy
[**updateAccessPolicy**](PoliciesApi.md#updateAccessPolicy) | **PUT** /policies/{id} | Updates a access policy


<a name="createAccessPolicy"></a>
# **createAccessPolicy**
> AccessPolicyEntity createAccessPolicy(body)

Creates an access policy



### Example
```java
// Import classes:
//import fr.hpencole.nifi.swagger.ApiClient;
//import fr.hpencole.nifi.swagger.ApiException;
//import fr.hpencole.nifi.swagger.Configuration;
//import fr.hpencole.nifi.swagger.auth.*;
//import fr.hpencole.nifi.swagger.client.PoliciesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

PoliciesApi apiInstance = new PoliciesApi();
AccessPolicyEntity body = new AccessPolicyEntity(); // AccessPolicyEntity | The access policy configuration details.
try {
    AccessPolicyEntity result = apiInstance.createAccessPolicy(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoliciesApi#createAccessPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AccessPolicyEntity**](AccessPolicyEntity.md)| The access policy configuration details. |

### Return type

[**AccessPolicyEntity**](AccessPolicyEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAccessPolicy"></a>
# **getAccessPolicy**
> AccessPolicyEntity getAccessPolicy(id)

Gets an access policy



### Example
```java
// Import classes:
//import fr.hpencole.nifi.swagger.ApiClient;
//import fr.hpencole.nifi.swagger.ApiException;
//import fr.hpencole.nifi.swagger.Configuration;
//import fr.hpencole.nifi.swagger.auth.*;
//import fr.hpencole.nifi.swagger.client.PoliciesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

PoliciesApi apiInstance = new PoliciesApi();
String id = "id_example"; // String | The access policy id.
try {
    AccessPolicyEntity result = apiInstance.getAccessPolicy(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoliciesApi#getAccessPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The access policy id. |

### Return type

[**AccessPolicyEntity**](AccessPolicyEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getAccessPolicyForResource"></a>
# **getAccessPolicyForResource**
> AccessPolicyEntity getAccessPolicyForResource(action, resource)

Gets an access policy for the specified action and resource

Will return the effective policy if no component specific policy exists for the specified action and resource. Must have Read permissions to the policy with the desired action and resource. Permissions for the policy that is returned will be indicated in the response. This means the client could be authorized to get the policy for a given component but the effective policy may be inherited from an ancestor Process Group. If the client does not have permissions to that policy, the response will not include the policy and the permissions in the response will be marked accordingly. If the client does not have permissions to the policy of the desired action and resource a 403 response will be returned.

### Example
```java
// Import classes:
//import fr.hpencole.nifi.swagger.ApiClient;
//import fr.hpencole.nifi.swagger.ApiException;
//import fr.hpencole.nifi.swagger.Configuration;
//import fr.hpencole.nifi.swagger.auth.*;
//import fr.hpencole.nifi.swagger.client.PoliciesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

PoliciesApi apiInstance = new PoliciesApi();
String action = "action_example"; // String | The request action.
String resource = "resource_example"; // String | The resource of the policy.
try {
    AccessPolicyEntity result = apiInstance.getAccessPolicyForResource(action, resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoliciesApi#getAccessPolicyForResource");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **action** | **String**| The request action. | [enum: read, write]
 **resource** | **String**| The resource of the policy. |

### Return type

[**AccessPolicyEntity**](AccessPolicyEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="removeAccessPolicy"></a>
# **removeAccessPolicy**
> AccessPolicyEntity removeAccessPolicy(id, version, clientId)

Deletes an access policy



### Example
```java
// Import classes:
//import fr.hpencole.nifi.swagger.ApiClient;
//import fr.hpencole.nifi.swagger.ApiException;
//import fr.hpencole.nifi.swagger.Configuration;
//import fr.hpencole.nifi.swagger.auth.*;
//import fr.hpencole.nifi.swagger.client.PoliciesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

PoliciesApi apiInstance = new PoliciesApi();
String id = "id_example"; // String | The access policy id.
String version = "version_example"; // String | The revision is used to verify the client is working with the latest version of the flow.
String clientId = "clientId_example"; // String | If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response.
try {
    AccessPolicyEntity result = apiInstance.removeAccessPolicy(id, version, clientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoliciesApi#removeAccessPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The access policy id. |
 **version** | **String**| The revision is used to verify the client is working with the latest version of the flow. | [optional]
 **clientId** | **String**| If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. | [optional]

### Return type

[**AccessPolicyEntity**](AccessPolicyEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="updateAccessPolicy"></a>
# **updateAccessPolicy**
> AccessPolicyEntity updateAccessPolicy(id, body)

Updates a access policy



### Example
```java
// Import classes:
//import fr.hpencole.nifi.swagger.ApiClient;
//import fr.hpencole.nifi.swagger.ApiException;
//import fr.hpencole.nifi.swagger.Configuration;
//import fr.hpencole.nifi.swagger.auth.*;
//import fr.hpencole.nifi.swagger.client.PoliciesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

PoliciesApi apiInstance = new PoliciesApi();
String id = "id_example"; // String | The access policy id.
AccessPolicyEntity body = new AccessPolicyEntity(); // AccessPolicyEntity | The access policy configuration details.
try {
    AccessPolicyEntity result = apiInstance.updateAccessPolicy(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoliciesApi#updateAccessPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The access policy id. |
 **body** | [**AccessPolicyEntity**](AccessPolicyEntity.md)| The access policy configuration details. |

### Return type

[**AccessPolicyEntity**](AccessPolicyEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

