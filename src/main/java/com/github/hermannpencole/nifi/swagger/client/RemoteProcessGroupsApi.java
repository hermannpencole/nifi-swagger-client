/*
 * NiFi Rest Api
 * The Rest Api provides programmatic access to command and control a NiFi instance in real time. Start and                                              stop processors, monitor queues, query provenance data, and more. Each endpoint below includes a description,                                             definitions of the expected input and output, potential response codes, and the authorizations required                                             to invoke each service.
 *
 * OpenAPI spec version: 1.2.0
 * Contact: dev@nifi.apache.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.github.hermannpencole.nifi.swagger.client;

import com.github.hermannpencole.nifi.swagger.ApiCallback;
import com.github.hermannpencole.nifi.swagger.ApiClient;
import com.github.hermannpencole.nifi.swagger.ApiException;
import com.github.hermannpencole.nifi.swagger.ApiResponse;
import com.github.hermannpencole.nifi.swagger.Configuration;
import com.github.hermannpencole.nifi.swagger.Pair;
import com.github.hermannpencole.nifi.swagger.ProgressRequestBody;
import com.github.hermannpencole.nifi.swagger.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.github.hermannpencole.nifi.swagger.client.model.RemoteProcessGroupEntity;
import com.github.hermannpencole.nifi.swagger.client.model.RemoteProcessGroupPortEntity;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RemoteProcessGroupsApi {
    private ApiClient apiClient;

    public RemoteProcessGroupsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public RemoteProcessGroupsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for getRemoteProcessGroup */
    private com.squareup.okhttp.Call getRemoteProcessGroupCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/remote-process-groups/{id}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "*/*"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "auth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getRemoteProcessGroupValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getRemoteProcessGroup(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getRemoteProcessGroupCall(id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets a remote process group
     * 
     * @param id The remote process group id. (required)
     * @return RemoteProcessGroupEntity
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RemoteProcessGroupEntity getRemoteProcessGroup(String id) throws ApiException {
        ApiResponse<RemoteProcessGroupEntity> resp = getRemoteProcessGroupWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Gets a remote process group
     * 
     * @param id The remote process group id. (required)
     * @return ApiResponse&lt;RemoteProcessGroupEntity&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RemoteProcessGroupEntity> getRemoteProcessGroupWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = getRemoteProcessGroupValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<RemoteProcessGroupEntity>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets a remote process group (asynchronously)
     * 
     * @param id The remote process group id. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getRemoteProcessGroupAsync(String id, final ApiCallback<RemoteProcessGroupEntity> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getRemoteProcessGroupValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RemoteProcessGroupEntity>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for removeRemoteProcessGroup */
    private com.squareup.okhttp.Call removeRemoteProcessGroupCall(String id, String version, String clientId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/remote-process-groups/{id}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (version != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "version", version));
        if (clientId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "clientId", clientId));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "*/*"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "auth" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call removeRemoteProcessGroupValidateBeforeCall(String id, String version, String clientId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling removeRemoteProcessGroup(Async)");
        }
        
        
        com.squareup.okhttp.Call call = removeRemoteProcessGroupCall(id, version, clientId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Deletes a remote process group
     * 
     * @param id The remote process group id. (required)
     * @param version The revision is used to verify the client is working with the latest version of the flow. (optional)
     * @param clientId If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. (optional)
     * @return RemoteProcessGroupEntity
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RemoteProcessGroupEntity removeRemoteProcessGroup(String id, String version, String clientId) throws ApiException {
        ApiResponse<RemoteProcessGroupEntity> resp = removeRemoteProcessGroupWithHttpInfo(id, version, clientId);
        return resp.getData();
    }

    /**
     * Deletes a remote process group
     * 
     * @param id The remote process group id. (required)
     * @param version The revision is used to verify the client is working with the latest version of the flow. (optional)
     * @param clientId If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. (optional)
     * @return ApiResponse&lt;RemoteProcessGroupEntity&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RemoteProcessGroupEntity> removeRemoteProcessGroupWithHttpInfo(String id, String version, String clientId) throws ApiException {
        com.squareup.okhttp.Call call = removeRemoteProcessGroupValidateBeforeCall(id, version, clientId, null, null);
        Type localVarReturnType = new TypeToken<RemoteProcessGroupEntity>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Deletes a remote process group (asynchronously)
     * 
     * @param id The remote process group id. (required)
     * @param version The revision is used to verify the client is working with the latest version of the flow. (optional)
     * @param clientId If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call removeRemoteProcessGroupAsync(String id, String version, String clientId, final ApiCallback<RemoteProcessGroupEntity> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = removeRemoteProcessGroupValidateBeforeCall(id, version, clientId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RemoteProcessGroupEntity>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for updateRemoteProcessGroup */
    private com.squareup.okhttp.Call updateRemoteProcessGroupCall(String id, RemoteProcessGroupEntity body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/remote-process-groups/{id}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "auth" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateRemoteProcessGroupValidateBeforeCall(String id, RemoteProcessGroupEntity body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling updateRemoteProcessGroup(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling updateRemoteProcessGroup(Async)");
        }
        
        
        com.squareup.okhttp.Call call = updateRemoteProcessGroupCall(id, body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Updates a remote process group
     * 
     * @param id The remote process group id. (required)
     * @param body The remote process group. (required)
     * @return RemoteProcessGroupEntity
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RemoteProcessGroupEntity updateRemoteProcessGroup(String id, RemoteProcessGroupEntity body) throws ApiException {
        ApiResponse<RemoteProcessGroupEntity> resp = updateRemoteProcessGroupWithHttpInfo(id, body);
        return resp.getData();
    }

    /**
     * Updates a remote process group
     * 
     * @param id The remote process group id. (required)
     * @param body The remote process group. (required)
     * @return ApiResponse&lt;RemoteProcessGroupEntity&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RemoteProcessGroupEntity> updateRemoteProcessGroupWithHttpInfo(String id, RemoteProcessGroupEntity body) throws ApiException {
        com.squareup.okhttp.Call call = updateRemoteProcessGroupValidateBeforeCall(id, body, null, null);
        Type localVarReturnType = new TypeToken<RemoteProcessGroupEntity>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Updates a remote process group (asynchronously)
     * 
     * @param id The remote process group id. (required)
     * @param body The remote process group. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateRemoteProcessGroupAsync(String id, RemoteProcessGroupEntity body, final ApiCallback<RemoteProcessGroupEntity> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = updateRemoteProcessGroupValidateBeforeCall(id, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RemoteProcessGroupEntity>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for updateRemoteProcessGroupInputPort */
    private com.squareup.okhttp.Call updateRemoteProcessGroupInputPortCall(String id, String portId, RemoteProcessGroupPortEntity body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/remote-process-groups/{id}/input-ports/{port-id}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
        .replaceAll("\\{" + "port-id" + "\\}", apiClient.escapeString(portId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "auth" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateRemoteProcessGroupInputPortValidateBeforeCall(String id, String portId, RemoteProcessGroupPortEntity body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling updateRemoteProcessGroupInputPort(Async)");
        }
        
        // verify the required parameter 'portId' is set
        if (portId == null) {
            throw new ApiException("Missing the required parameter 'portId' when calling updateRemoteProcessGroupInputPort(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling updateRemoteProcessGroupInputPort(Async)");
        }
        
        
        com.squareup.okhttp.Call call = updateRemoteProcessGroupInputPortCall(id, portId, body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Updates a remote port
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     * @param id The remote process group id. (required)
     * @param portId The remote process group port id. (required)
     * @param body The remote process group port. (required)
     * @return RemoteProcessGroupPortEntity
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RemoteProcessGroupPortEntity updateRemoteProcessGroupInputPort(String id, String portId, RemoteProcessGroupPortEntity body) throws ApiException {
        ApiResponse<RemoteProcessGroupPortEntity> resp = updateRemoteProcessGroupInputPortWithHttpInfo(id, portId, body);
        return resp.getData();
    }

    /**
     * Updates a remote port
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     * @param id The remote process group id. (required)
     * @param portId The remote process group port id. (required)
     * @param body The remote process group port. (required)
     * @return ApiResponse&lt;RemoteProcessGroupPortEntity&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RemoteProcessGroupPortEntity> updateRemoteProcessGroupInputPortWithHttpInfo(String id, String portId, RemoteProcessGroupPortEntity body) throws ApiException {
        com.squareup.okhttp.Call call = updateRemoteProcessGroupInputPortValidateBeforeCall(id, portId, body, null, null);
        Type localVarReturnType = new TypeToken<RemoteProcessGroupPortEntity>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Updates a remote port (asynchronously)
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     * @param id The remote process group id. (required)
     * @param portId The remote process group port id. (required)
     * @param body The remote process group port. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateRemoteProcessGroupInputPortAsync(String id, String portId, RemoteProcessGroupPortEntity body, final ApiCallback<RemoteProcessGroupPortEntity> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = updateRemoteProcessGroupInputPortValidateBeforeCall(id, portId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RemoteProcessGroupPortEntity>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for updateRemoteProcessGroupOutputPort */
    private com.squareup.okhttp.Call updateRemoteProcessGroupOutputPortCall(String id, String portId, RemoteProcessGroupPortEntity body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/remote-process-groups/{id}/output-ports/{port-id}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
        .replaceAll("\\{" + "port-id" + "\\}", apiClient.escapeString(portId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "auth" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateRemoteProcessGroupOutputPortValidateBeforeCall(String id, String portId, RemoteProcessGroupPortEntity body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling updateRemoteProcessGroupOutputPort(Async)");
        }
        
        // verify the required parameter 'portId' is set
        if (portId == null) {
            throw new ApiException("Missing the required parameter 'portId' when calling updateRemoteProcessGroupOutputPort(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling updateRemoteProcessGroupOutputPort(Async)");
        }
        
        
        com.squareup.okhttp.Call call = updateRemoteProcessGroupOutputPortCall(id, portId, body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Updates a remote port
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     * @param id The remote process group id. (required)
     * @param portId The remote process group port id. (required)
     * @param body The remote process group port. (required)
     * @return RemoteProcessGroupPortEntity
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RemoteProcessGroupPortEntity updateRemoteProcessGroupOutputPort(String id, String portId, RemoteProcessGroupPortEntity body) throws ApiException {
        ApiResponse<RemoteProcessGroupPortEntity> resp = updateRemoteProcessGroupOutputPortWithHttpInfo(id, portId, body);
        return resp.getData();
    }

    /**
     * Updates a remote port
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     * @param id The remote process group id. (required)
     * @param portId The remote process group port id. (required)
     * @param body The remote process group port. (required)
     * @return ApiResponse&lt;RemoteProcessGroupPortEntity&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RemoteProcessGroupPortEntity> updateRemoteProcessGroupOutputPortWithHttpInfo(String id, String portId, RemoteProcessGroupPortEntity body) throws ApiException {
        com.squareup.okhttp.Call call = updateRemoteProcessGroupOutputPortValidateBeforeCall(id, portId, body, null, null);
        Type localVarReturnType = new TypeToken<RemoteProcessGroupPortEntity>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Updates a remote port (asynchronously)
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     * @param id The remote process group id. (required)
     * @param portId The remote process group port id. (required)
     * @param body The remote process group port. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateRemoteProcessGroupOutputPortAsync(String id, String portId, RemoteProcessGroupPortEntity body, final ApiCallback<RemoteProcessGroupPortEntity> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = updateRemoteProcessGroupOutputPortValidateBeforeCall(id, portId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RemoteProcessGroupPortEntity>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
