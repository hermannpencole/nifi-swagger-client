/*
 * NiFi Rest Api
 * The Rest Api provides programmatic access to command and control a NiFi instance in real time. Start and                                              stop processors, monitor queues, query provenance data, and more. Each endpoint below includes a description,                                             definitions of the expected input and output, potential response codes, and the authorizations required                                             to invoke each service.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: dev@nifi.apache.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.github.hermannpencole.nifi.swagger.client;

import com.github.hermannpencole.nifi.swagger.ApiException;
import com.github.hermannpencole.nifi.swagger.client.model.ConnectionEntity;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ConnectionsApi
 */
@Ignore
public class ConnectionsApiTest {

    private final ConnectionsApi api = new ConnectionsApi();

    
    /**
     * Deletes a connection
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteConnectionTest() throws ApiException {
        String id = null;
        Object version = null;
        Object clientId = null;
        ConnectionEntity response = api.deleteConnection(id, version, clientId);

        // TODO: test validations
    }
    
    /**
     * Gets a connection
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getConnectionTest() throws ApiException {
        String id = null;
        ConnectionEntity response = api.getConnection(id);

        // TODO: test validations
    }
    
    /**
     * Updates a connection
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateConnectionTest() throws ApiException {
        String id = null;
        ConnectionEntity body = null;
        ConnectionEntity response = api.updateConnection(id, body);

        // TODO: test validations
    }
    
}
