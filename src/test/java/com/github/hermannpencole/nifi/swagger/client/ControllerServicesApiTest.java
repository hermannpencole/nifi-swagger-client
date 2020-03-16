/*
 * NiFi Rest Api
 * The Rest Api provides programmatic access to command and control a NiFi instance in real time. Start and                                              stop processors, monitor queues, query provenance data, and more. Each endpoint below includes a description,                                             definitions of the expected input and output, potential response codes, and the authorizations required                                             to invoke each service.
 *
 * OpenAPI spec version: 1.5.0
 * Contact: dev@nifi.apache.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.github.hermannpencole.nifi.swagger.client;

import com.github.hermannpencole.nifi.swagger.ApiException;
import com.github.hermannpencole.nifi.swagger.client.model.ComponentStateEntity;
import com.github.hermannpencole.nifi.swagger.client.model.ControllerServiceEntity;
import com.github.hermannpencole.nifi.swagger.client.model.ControllerServiceReferencingComponentsEntity;
import com.github.hermannpencole.nifi.swagger.client.model.PropertyDescriptorEntity;
import com.github.hermannpencole.nifi.swagger.client.model.UpdateControllerServiceReferenceRequestEntity;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ControllerServicesApi
 */
@Ignore
public class ControllerServicesApiTest {

    private final ControllerServicesApi api = new ControllerServicesApi();

    
    /**
     * Clears the state for a controller service
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void clearStateTest() throws ApiException {
        String id = null;
        ComponentStateEntity response = api.clearState(id);

        // TODO: test validations
    }
    
    /**
     * Gets a controller service
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getControllerServiceTest() throws ApiException {
        String id = null;
        ControllerServiceEntity response = api.getControllerService(id);

        // TODO: test validations
    }
    
    /**
     * Gets a controller service
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getControllerServiceReferencesTest() throws ApiException {
        String id = null;
        ControllerServiceReferencingComponentsEntity response = api.getControllerServiceReferences(id);

        // TODO: test validations
    }
    
    /**
     * Gets a controller service property descriptor
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPropertyDescriptorTest() throws ApiException {
        String id = null;
        String propertyName = null;
        PropertyDescriptorEntity response = api.getPropertyDescriptor(id, propertyName);

        // TODO: test validations
    }
    
    /**
     * Gets the state for a controller service
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStateTest() throws ApiException {
        String id = null;
        ComponentStateEntity response = api.getState(id);

        // TODO: test validations
    }
    
    /**
     * Deletes a controller service
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeControllerServiceTest() throws ApiException {
        String id = null;
        String version = null;
        String clientId = null;
        ControllerServiceEntity response = api.removeControllerService(id, version, clientId);

        // TODO: test validations
    }
    
    /**
     * Updates a controller service
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateControllerServiceTest() throws ApiException {
        String id = null;
        ControllerServiceEntity body = null;
        ControllerServiceEntity response = api.updateControllerService(id, body);

        // TODO: test validations
    }
    
    /**
     * Updates a controller services references
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateControllerServiceReferencesTest() throws ApiException {
        String id = null;
        UpdateControllerServiceReferenceRequestEntity body = null;
        ControllerServiceReferencingComponentsEntity response = api.updateControllerServiceReferences(id, body);

        // TODO: test validations
    }
    
}
