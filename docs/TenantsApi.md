# TenantsApi

All URIs are relative to *http://localhost/nifi-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUser**](TenantsApi.md#createUser) | **POST** /tenants/users | Creates a user
[**createUserGroup**](TenantsApi.md#createUserGroup) | **POST** /tenants/user-groups | Creates a user group
[**getUser**](TenantsApi.md#getUser) | **GET** /tenants/users/{id} | Gets a user
[**getUserGroup**](TenantsApi.md#getUserGroup) | **GET** /tenants/user-groups/{id} | Gets a user group
[**getUserGroups**](TenantsApi.md#getUserGroups) | **GET** /tenants/user-groups | Gets all user groups
[**getUsers**](TenantsApi.md#getUsers) | **GET** /tenants/users | Gets all users
[**removeUser**](TenantsApi.md#removeUser) | **DELETE** /tenants/users/{id} | Deletes a user
[**removeUserGroup**](TenantsApi.md#removeUserGroup) | **DELETE** /tenants/user-groups/{id} | Deletes a user group
[**searchTenants**](TenantsApi.md#searchTenants) | **GET** /tenants/search-results | Searches for a tenant with the specified identity
[**updateUser**](TenantsApi.md#updateUser) | **PUT** /tenants/users/{id} | Updates a user
[**updateUserGroup**](TenantsApi.md#updateUserGroup) | **PUT** /tenants/user-groups/{id} | Updates a user group


<a name="createUser"></a>
# **createUser**
> UserEntity createUser(body)

Creates a user

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.TenantsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

TenantsApi apiInstance = new TenantsApi();
UserEntity body = new UserEntity(); // UserEntity | The user configuration details.
try {
    UserEntity result = apiInstance.createUser(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TenantsApi#createUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UserEntity**](UserEntity.md)| The user configuration details. |

### Return type

[**UserEntity**](UserEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createUserGroup"></a>
# **createUserGroup**
> UserGroupEntity createUserGroup(body)

Creates a user group

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.TenantsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

TenantsApi apiInstance = new TenantsApi();
UserGroupEntity body = new UserGroupEntity(); // UserGroupEntity | The user group configuration details.
try {
    UserGroupEntity result = apiInstance.createUserGroup(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TenantsApi#createUserGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UserGroupEntity**](UserGroupEntity.md)| The user group configuration details. |

### Return type

[**UserGroupEntity**](UserGroupEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUser"></a>
# **getUser**
> UserEntity getUser(id)

Gets a user

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.TenantsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

TenantsApi apiInstance = new TenantsApi();
String id = "id_example"; // String | The user id.
try {
    UserEntity result = apiInstance.getUser(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TenantsApi#getUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The user id. |

### Return type

[**UserEntity**](UserEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getUserGroup"></a>
# **getUserGroup**
> UserGroupEntity getUserGroup(id)

Gets a user group

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.TenantsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

TenantsApi apiInstance = new TenantsApi();
String id = "id_example"; // String | The user group id.
try {
    UserGroupEntity result = apiInstance.getUserGroup(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TenantsApi#getUserGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The user group id. |

### Return type

[**UserGroupEntity**](UserGroupEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getUserGroups"></a>
# **getUserGroups**
> UserGroupsEntity getUserGroups()

Gets all user groups

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.TenantsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

TenantsApi apiInstance = new TenantsApi();
try {
    UserGroupsEntity result = apiInstance.getUserGroups();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TenantsApi#getUserGroups");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UserGroupsEntity**](UserGroupsEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getUsers"></a>
# **getUsers**
> UsersEntity getUsers()

Gets all users

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.TenantsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

TenantsApi apiInstance = new TenantsApi();
try {
    UsersEntity result = apiInstance.getUsers();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TenantsApi#getUsers");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UsersEntity**](UsersEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="removeUser"></a>
# **removeUser**
> UserEntity removeUser(id, version, clientId)

Deletes a user

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.TenantsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

TenantsApi apiInstance = new TenantsApi();
String id = "id_example"; // String | The user id.
String version = "version_example"; // String | The revision is used to verify the client is working with the latest version of the flow.
String clientId = "clientId_example"; // String | If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response.
try {
    UserEntity result = apiInstance.removeUser(id, version, clientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TenantsApi#removeUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The user id. |
 **version** | **String**| The revision is used to verify the client is working with the latest version of the flow. | [optional]
 **clientId** | **String**| If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. | [optional]

### Return type

[**UserEntity**](UserEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="removeUserGroup"></a>
# **removeUserGroup**
> UserGroupEntity removeUserGroup(id, version, clientId)

Deletes a user group

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.TenantsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

TenantsApi apiInstance = new TenantsApi();
String id = "id_example"; // String | The user group id.
String version = "version_example"; // String | The revision is used to verify the client is working with the latest version of the flow.
String clientId = "clientId_example"; // String | If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response.
try {
    UserGroupEntity result = apiInstance.removeUserGroup(id, version, clientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TenantsApi#removeUserGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The user group id. |
 **version** | **String**| The revision is used to verify the client is working with the latest version of the flow. | [optional]
 **clientId** | **String**| If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. | [optional]

### Return type

[**UserGroupEntity**](UserGroupEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="searchTenants"></a>
# **searchTenants**
> TenantsEntity searchTenants(q)

Searches for a tenant with the specified identity

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.TenantsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

TenantsApi apiInstance = new TenantsApi();
String q = "q_example"; // String | Identity to search for.
try {
    TenantsEntity result = apiInstance.searchTenants(q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TenantsApi#searchTenants");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **String**| Identity to search for. |

### Return type

[**TenantsEntity**](TenantsEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="updateUser"></a>
# **updateUser**
> UserEntity updateUser(id, body)

Updates a user

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.TenantsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

TenantsApi apiInstance = new TenantsApi();
String id = "id_example"; // String | The user id.
UserEntity body = new UserEntity(); // UserEntity | The user configuration details.
try {
    UserEntity result = apiInstance.updateUser(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TenantsApi#updateUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The user id. |
 **body** | [**UserEntity**](UserEntity.md)| The user configuration details. |

### Return type

[**UserEntity**](UserEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateUserGroup"></a>
# **updateUserGroup**
> UserGroupEntity updateUserGroup(id, body)

Updates a user group

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.TenantsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

TenantsApi apiInstance = new TenantsApi();
String id = "id_example"; // String | The user group id.
UserGroupEntity body = new UserGroupEntity(); // UserGroupEntity | The user group configuration details.
try {
    UserGroupEntity result = apiInstance.updateUserGroup(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TenantsApi#updateUserGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The user group id. |
 **body** | [**UserGroupEntity**](UserGroupEntity.md)| The user group configuration details. |

### Return type

[**UserGroupEntity**](UserGroupEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

