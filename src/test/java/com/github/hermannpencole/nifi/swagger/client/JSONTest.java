/*
 * NiFi Rest Api
 * The Rest Api provides programmatic access to command and control a NiFi instance in real time. Start and                                              stop processors, monitor queues, query provenance data, and more. Each endpoint below includes a description,                                             definitions of the expected input and output, potential response codes, and the authorizations required                                             to invoke each service.
 *
 * OpenAPI spec version: 1.1.0
 * Contact: dev@nifi.apache.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.github.hermannpencole.nifi.swagger.client;

import com.github.hermannpencole.nifi.swagger.ApiException;
import com.github.hermannpencole.nifi.swagger.JSON;
import com.github.hermannpencole.nifi.swagger.XML;
import com.github.hermannpencole.nifi.swagger.client.model.ProcessorConfigDTO;
import com.github.hermannpencole.nifi.swagger.client.model.TemplateEntity;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * API tests for AccessApi
 */
public class JSONTest {


    @Test
    public void serializeTest() throws ApiException, IOException {
        ProcessorConfigDTO conf = new ProcessorConfigDTO();
        Map<String, String> properties = new HashMap<>();
        properties.put("testNonNull", "nonNull");
        properties.put("testNull", null);
        conf.setProperties(properties);
       String result = new JSON().serialize(conf);
       assert(result != null);

    }



}
