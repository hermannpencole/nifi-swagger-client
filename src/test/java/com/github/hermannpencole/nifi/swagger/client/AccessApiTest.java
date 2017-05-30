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
import com.github.hermannpencole.nifi.swagger.client.model.AccessConfigurationEntity;
import com.github.hermannpencole.nifi.swagger.client.model.AccessStatusEntity;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AccessApi
 */
@Ignore
public class AccessApiTest {

    private final AccessApi api = new AccessApi();

    
    /**
     * Creates a token for accessing the REST API via username/password
     *
     * The token returned is formatted as a JSON Web Token (JWT). The token is base64 encoded and comprised of three parts. The header, the body, and the signature. The expiration of the token is a contained within the body. The token can be used in the Authorization header in the format &#39;Authorization: Bearer &lt;token&gt;&#39;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAccessTokenTest() throws ApiException {
        String username = null;
        String password = null;
        String response = api.createAccessToken(username, password);

        // TODO: test validations
    }
    
    /**
     * Creates a token for accessing the REST API via Kerberos ticket exchange / SPNEGO negotiation
     *
     * The token returned is formatted as a JSON Web Token (JWT). The token is base64 encoded and comprised of three parts. The header, the body, and the signature. The expiration of the token is a contained within the body. The token can be used in the Authorization header in the format &#39;Authorization: Bearer &lt;token&gt;&#39;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAccessTokenFromTicketTest() throws ApiException {
        String response = api.createAccessTokenFromTicket();

        // TODO: test validations
    }
    
    /**
     * Creates a single use access token for downloading FlowFile content.
     *
     * The token returned is a base64 encoded string. It is valid for a single request up to five minutes from being issued. It is used as a query parameter name &#39;access_token&#39;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createDownloadTokenTest() throws ApiException {
        String response = api.createDownloadToken();

        // TODO: test validations
    }
    
    /**
     * Creates a single use access token for accessing a NiFi UI extension.
     *
     * The token returned is a base64 encoded string. It is valid for a single request up to five minutes from being issued. It is used as a query parameter name &#39;access_token&#39;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createUiExtensionTokenTest() throws ApiException {
        String response = api.createUiExtensionToken();

        // TODO: test validations
    }
    
    /**
     * Gets the status the client&#39;s access
     *
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAccessStatusTest() throws ApiException {
        AccessStatusEntity response = api.getAccessStatus();

        // TODO: test validations
    }
    
    /**
     * Retrieves the access configuration for this NiFi
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLoginConfigTest() throws ApiException {
        AccessConfigurationEntity response = api.getLoginConfig();

        // TODO: test validations
    }
    
}
