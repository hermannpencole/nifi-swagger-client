# nifi-swagger-client

Api Java client webservice for Nifi that build with swagger.

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.github.hermannpencole/nifi-swagger-client/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.github.hermannpencole/nifi-swagger-client)
[![Build Status](https://travis-ci.org/hermannpencole/nifi-swagger-client.svg?branch=master)](https://travis-ci.org/hermannpencole/nifi-swagger-client)

The client web Service accept authentication with OAuth2.

## Essential Information

### License

The license is Apache 2.0, see LICENSE-2.0.txt.

### Binary Releases

You can find published releases on Maven Central.

#### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.github.hermannpencole</groupId>
    <artifactId>nifi-swagger-client</artifactId>
    <version>1.1.0</version>
    <scope>compile</scope>
</dependency>
```

#### sbt users:

Add this dependency to your project's build file:

```
libraryDependencies += "com.github.hermannpencole" % "nifi-swagger-client" % "1.1.0"
```

#### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.github.hermannpencole:nifi-swagger-client:1.1.0"
```

#### Others

Link for direct download if you don't use a dependency manager:

- [http://central.maven.org/maven2/com/github/hermannpencole/nifi-swagger-client/](http://central.maven.org/maven2/com/github/hermannpencole/nifi-swagger-client/)

### Release Notes

The version of product correspond to the nifi api version.

1.1.0 is build with API Nifi 1.1.0



## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

Example Call with OAuth2 access token

```java

import com.github.hermannpencole.nifi.swagger.*;
import com.github.hermannpencole.nifi.swagger.auth.*;
import com.github.hermannpencole.nifi.swagger.client.model.*;
import com.github.hermannpencole.nifi.swagger.client.AccessApi;

import java.io.File;
import java.util.*;

public class AccessExample {

    public static void main(String[] args) {
        ApiClient client = new ApiClient().setBasePath("http://mynifi/nifi-api");

        AccessApi apiInstance = new AccessApi(client);
        String username = "username"; // String | 
        String password = "password"; // String | 
        try {
          String token = apiInstance.createAccessToken(username, password);
          client.setAccessToken(token);
          Configuration.setDefaultApiClient(client);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccessApi#createAccessToken");
            e.printStackTrace();
        }
    }
}
```

And after

```java
// Import classes:
//import com.github.hermannpencole.nifi.swagger.ApiClient;
//import com.github.hermannpencole.nifi.swagger.ApiException;
//import com.github.hermannpencole.nifi.swagger.Configuration;
//import com.github.hermannpencole.nifi.swagger.auth.*;
//import com.github.hermannpencole.nifi.swagger.client.FlowApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
FlowApi apiInstance = new FlowApi();
try {
    TemplatesEntity result = apiInstance.getTemplates();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getTemplates");
    e.printStackTrace();
}
```

### 

## Documentation for API Endpoints

All URIs are relative to *http://localhost/nifi-api*

| Class                    | Method                                   | HTTP request                             | Description                              |
| ------------------------ | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| *AccessApi*              | [**createAccessToken**](docs/AccessApi.md#createAccessToken) | **POST** /access/token                   | Creates a token for accessing the REST API via username/password |
| *AccessApi*              | [**createAccessTokenFromTicket**](docs/AccessApi.md#createAccessTokenFromTicket) | **POST** /access/kerberos                | Creates a token for accessing the REST API via Kerberos ticket exchange / SPNEGO negotiation |
| *AccessApi*              | [**createDownloadToken**](docs/AccessApi.md#createDownloadToken) | **POST** /access/download-token          | Creates a single use access token for downloading FlowFile content. |
| *AccessApi*              | [**createUiExtensionToken**](docs/AccessApi.md#createUiExtensionToken) | **POST** /access/ui-extension-token      | Creates a single use access token for accessing a NiFi UI extension. |
| *AccessApi*              | [**getAccessStatus**](docs/AccessApi.md#getAccessStatus) | **GET** /access                          | Gets the status the client&#39;s access  |
| *AccessApi*              | [**getLoginConfig**](docs/AccessApi.md#getLoginConfig) | **GET** /access/config                   | Retrieves the access configuration for this NiFi |
| *ConnectionsApi*         | [**deleteConnection**](docs/ConnectionsApi.md#deleteConnection) | **DELETE** /connections/{id}             | Deletes a connection                     |
| *ConnectionsApi*         | [**getConnection**](docs/ConnectionsApi.md#getConnection) | **GET** /connections/{id}                | Gets a connection                        |
| *ConnectionsApi*         | [**updateConnection**](docs/ConnectionsApi.md#updateConnection) | **PUT** /connections/{id}                | Updates a connection                     |
| *ControllerApi*          | [**createControllerService**](docs/ControllerApi.md#createControllerService) | **POST** /controller/controller-services | Creates a new controller service         |
| *ControllerApi*          | [**createReportingTask**](docs/ControllerApi.md#createReportingTask) | **POST** /controller/reporting-tasks     | Creates a new reporting task             |
| *ControllerApi*          | [**deleteHistory**](docs/ControllerApi.md#deleteHistory) | **DELETE** /controller/history           | Purges history                           |
| *ControllerApi*          | [**deleteNode**](docs/ControllerApi.md#deleteNode) | **DELETE** /controller/cluster/nodes/{id} | Removes a node from the cluster          |
| *ControllerApi*          | [**getCluster**](docs/ControllerApi.md#getCluster) | **GET** /controller/cluster              | Gets the contents of the cluster         |
| *ControllerApi*          | [**getControllerConfig**](docs/ControllerApi.md#getControllerConfig) | **GET** /controller/config               | Retrieves the configuration for this NiFi Controller |
| *ControllerApi*          | [**getNode**](docs/ControllerApi.md#getNode) | **GET** /controller/cluster/nodes/{id}   | Gets a node in the cluster               |
| *ControllerApi*          | [**updateControllerConfig**](docs/ControllerApi.md#updateControllerConfig) | **PUT** /controller/config               | Retrieves the configuration for this NiFi |
| *ControllerApi*          | [**updateNode**](docs/ControllerApi.md#updateNode) | **PUT** /controller/cluster/nodes/{id}   | Updates a node in the cluster            |
| *ControllerServicesApi*  | [**clearState**](docs/ControllerServicesApi.md#clearState) | **POST** /controller-services/{id}/state/clear-requests | Clears the state for a controller service |
| *ControllerServicesApi*  | [**getControllerService**](docs/ControllerServicesApi.md#getControllerService) | **GET** /controller-services/{id}        | Gets a controller service                |
| *ControllerServicesApi*  | [**getControllerServiceReferences**](docs/ControllerServicesApi.md#getControllerServiceReferences) | **GET** /controller-services/{id}/references | Gets a controller service                |
| *ControllerServicesApi*  | [**getPropertyDescriptor**](docs/ControllerServicesApi.md#getPropertyDescriptor) | **GET** /controller-services/{id}/descriptors | Gets a controller service property descriptor |
| *ControllerServicesApi*  | [**getState**](docs/ControllerServicesApi.md#getState) | **GET** /controller-services/{id}/state  | Gets the state for a controller service  |
| *ControllerServicesApi*  | [**removeControllerService**](docs/ControllerServicesApi.md#removeControllerService) | **DELETE** /controller-services/{id}     | Deletes a controller service             |
| *ControllerServicesApi*  | [**updateControllerService**](docs/ControllerServicesApi.md#updateControllerService) | **PUT** /controller-services/{id}        | Updates a controller service             |
| *ControllerServicesApi*  | [**updateControllerServiceReferences**](docs/ControllerServicesApi.md#updateControllerServiceReferences) | **PUT** /controller-services/{id}/references | Updates a controller services references |
| *CountersApi*            | [**getCounters**](docs/CountersApi.md#getCounters) | **GET** /counters                        | Gets the current counters for this NiFi  |
| *CountersApi*            | [**updateCounter**](docs/CountersApi.md#updateCounter) | **PUT** /counters/{id}                   | Updates the specified counter. This will reset the counter value to 0 |
| *DataTransferApi*        | [**commitInputPortTransaction**](docs/DataTransferApi.md#commitInputPortTransaction) | **DELETE** /data-transfer/input-ports/{portId}/transactions/{transactionId} | Commit or cancel the specified transaction |
| *DataTransferApi*        | [**commitOutputPortTransaction**](docs/DataTransferApi.md#commitOutputPortTransaction) | **DELETE** /data-transfer/output-ports/{portId}/transactions/{transactionId} | Commit or cancel the specified transaction |
| *DataTransferApi*        | [**createPortTransaction**](docs/DataTransferApi.md#createPortTransaction) | **POST** /data-transfer/{portType}/{portId}/transactions | Create a transaction to the specified output port or input port |
| *DataTransferApi*        | [**extendInputPortTransactionTTL**](docs/DataTransferApi.md#extendInputPortTransactionTTL) | **PUT** /data-transfer/input-ports/{portId}/transactions/{transactionId} | Extend transaction TTL                   |
| *DataTransferApi*        | [**extendOutputPortTransactionTTL**](docs/DataTransferApi.md#extendOutputPortTransactionTTL) | **PUT** /data-transfer/output-ports/{portId}/transactions/{transactionId} | Extend transaction TTL                   |
| *DataTransferApi*        | [**receiveFlowFiles**](docs/DataTransferApi.md#receiveFlowFiles) | **POST** /data-transfer/input-ports/{portId}/transactions/{transactionId}/flow-files | Transfer flow files to the input port    |
| *DataTransferApi*        | [**transferFlowFiles**](docs/DataTransferApi.md#transferFlowFiles) | **GET** /data-transfer/output-ports/{portId}/transactions/{transactionId}/flow-files | Transfer flow files from the output port |
| *FlowApi*                | [**generateClientId**](docs/FlowApi.md#generateClientId) | **GET** /flow/client-id                  | Generates a client id.                   |
| *FlowApi*                | [**getAboutInfo**](docs/FlowApi.md#getAboutInfo) | **GET** /flow/about                      | Retrieves details about this NiFi to put in the About dialog |
| *FlowApi*                | [**getAction**](docs/FlowApi.md#getAction) | **GET** /flow/history/{id}               | Gets an action                           |
| *FlowApi*                | [**getBanners**](docs/FlowApi.md#getBanners) | **GET** /flow/banners                    | Retrieves the banners for this NiFi      |
| *FlowApi*                | [**getBulletinBoard**](docs/FlowApi.md#getBulletinBoard) | **GET** /flow/bulletin-board             | Gets current bulletins                   |
| *FlowApi*                | [**getBulletins**](docs/FlowApi.md#getBulletins) | **GET** /flow/controller/bulletins       | Retrieves Controller level bulletins     |
| *FlowApi*                | [**getClusterSummary**](docs/FlowApi.md#getClusterSummary) | **GET** /flow/cluster/summary            | The cluster summary for this NiFi        |
| *FlowApi*                | [**getComponentHistory**](docs/FlowApi.md#getComponentHistory) | **GET** /flow/history/components/{componentId} | Gets configuration history for a component |
| *FlowApi*                | [**getConnectionStatus**](docs/FlowApi.md#getConnectionStatus) | **GET** /flow/connections/{id}/status    | Gets status for a connection             |
| *FlowApi*                | [**getConnectionStatusHistory**](docs/FlowApi.md#getConnectionStatusHistory) | **GET** /flow/connections/{id}/status/history | Gets the status history for a connection |
| *FlowApi*                | [**getControllerServiceTypes**](docs/FlowApi.md#getControllerServiceTypes) | **GET** /flow/controller-service-types   | Retrieves the types of controller services that this NiFi supports |
| *FlowApi*                | [**getControllerServicesFromController**](docs/FlowApi.md#getControllerServicesFromController) | **GET** /flow/controller/controller-services | Gets all controller services             |
| *FlowApi*                | [**getControllerServicesFromGroup**](docs/FlowApi.md#getControllerServicesFromGroup) | **GET** /flow/process-groups/{id}/controller-services | Gets all controller services             |
| *FlowApi*                | [**getControllerStatus**](docs/FlowApi.md#getControllerStatus) | **GET** /flow/status                     | Gets the current status of this NiFi     |
| *FlowApi*                | [**getCurrentUser**](docs/FlowApi.md#getCurrentUser) | **GET** /flow/current-user               | Retrieves the user identity of the user making the request |
| *FlowApi*                | [**getFlow**](docs/FlowApi.md#getFlow)   | **GET** /flow/process-groups/{id}        | Gets a process group                     |
| *FlowApi*                | [**getFlowConfig**](docs/FlowApi.md#getFlowConfig) | **GET** /flow/config                     | Retrieves the configuration for this NiFi flow |
| *FlowApi*                | [**getInputPortStatus**](docs/FlowApi.md#getInputPortStatus) | **GET** /flow/input-ports/{id}/status    | Gets status for an input port            |
| *FlowApi*                | [**getOutputPortStatus**](docs/FlowApi.md#getOutputPortStatus) | **GET** /flow/output-ports/{id}/status   | Gets status for an output port           |
| *FlowApi*                | [**getPrioritizers**](docs/FlowApi.md#getPrioritizers) | **GET** /flow/prioritizers               | Retrieves the types of prioritizers that this NiFi supports |
| *FlowApi*                | [**getProcessGroupStatus**](docs/FlowApi.md#getProcessGroupStatus) | **GET** /flow/process-groups/{id}/status | Gets the status for a process group      |
| *FlowApi*                | [**getProcessGroupStatusHistory**](docs/FlowApi.md#getProcessGroupStatusHistory) | **GET** /flow/process-groups/{id}/status/history | Gets status history for a remote process group |
| *FlowApi*                | [**getProcessorStatus**](docs/FlowApi.md#getProcessorStatus) | **GET** /flow/processors/{id}/status     | Gets status for a processor              |
| *FlowApi*                | [**getProcessorStatusHistory**](docs/FlowApi.md#getProcessorStatusHistory) | **GET** /flow/processors/{id}/status/history | Gets status history for a processor      |
| *FlowApi*                | [**getProcessorTypes**](docs/FlowApi.md#getProcessorTypes) | **GET** /flow/processor-types            | Retrieves the types of processors that this NiFi supports |
| *FlowApi*                | [**getRemoteProcessGroupStatus**](docs/FlowApi.md#getRemoteProcessGroupStatus) | **GET** /flow/remote-process-groups/{id}/status | Gets status for a remote process group   |
| *FlowApi*                | [**getRemoteProcessGroupStatusHistory**](docs/FlowApi.md#getRemoteProcessGroupStatusHistory) | **GET** /flow/remote-process-groups/{id}/status/history | Gets the status history                  |
| *FlowApi*                | [**getReportingTaskTypes**](docs/FlowApi.md#getReportingTaskTypes) | **GET** /flow/reporting-task-types       | Retrieves the types of reporting tasks that this NiFi supports |
| *FlowApi*                | [**getReportingTasks**](docs/FlowApi.md#getReportingTasks) | **GET** /flow/reporting-tasks            | Gets all reporting tasks                 |
| *FlowApi*                | [**getTemplates**](docs/FlowApi.md#getTemplates) | **GET** /flow/templates                  | Gets all templates                       |
| *FlowApi*                | [**queryHistory**](docs/FlowApi.md#queryHistory) | **GET** /flow/history                    | Gets configuration history               |
| *FlowApi*                | [**scheduleComponents**](docs/FlowApi.md#scheduleComponents) | **PUT** /flow/process-groups/{id}        | Schedule or unschedule comopnents in the specified Process Group. |
| *FlowApi*                | [**searchCluster**](docs/FlowApi.md#searchCluster) | **GET** /flow/cluster/search-results     | Searches the cluster for a node with the specified address |
| *FlowApi*                | [**searchFlow**](docs/FlowApi.md#searchFlow) | **GET** /flow/search-results             | Performs a search against this NiFi using the specified search term |
| *FlowfileQueuesApi*      | [**createDropRequest**](docs/FlowfileQueuesApi.md#createDropRequest) | **POST** /flowfile-queues/{id}/drop-requests | Creates a request to drop the contents of the queue in this connection. |
| *FlowfileQueuesApi*      | [**createFlowFileListing**](docs/FlowfileQueuesApi.md#createFlowFileListing) | **POST** /flowfile-queues/{id}/listing-requests | Lists the contents of the queue in this connection. |
| *FlowfileQueuesApi*      | [**deleteListingRequest**](docs/FlowfileQueuesApi.md#deleteListingRequest) | **DELETE** /flowfile-queues/{id}/listing-requests/{listing-request-id} | Cancels and/or removes a request to list the contents of this connection. |
| *FlowfileQueuesApi*      | [**downloadFlowFileContent**](docs/FlowfileQueuesApi.md#downloadFlowFileContent) | **GET** /flowfile-queues/{id}/flowfiles/{flowfile-uuid}/content | Gets the content for a FlowFile in a Connection. |
| *FlowfileQueuesApi*      | [**getDropRequest**](docs/FlowfileQueuesApi.md#getDropRequest) | **GET** /flowfile-queues/{id}/drop-requests/{drop-request-id} | Gets the current status of a drop request for the specified connection. |
| *FlowfileQueuesApi*      | [**getFlowFile**](docs/FlowfileQueuesApi.md#getFlowFile) | **GET** /flowfile-queues/{id}/flowfiles/{flowfile-uuid} | Gets a FlowFile from a Connection.       |
| *FlowfileQueuesApi*      | [**getListingRequest**](docs/FlowfileQueuesApi.md#getListingRequest) | **GET** /flowfile-queues/{id}/listing-requests/{listing-request-id} | Gets the current status of a listing request for the specified connection. |
| *FlowfileQueuesApi*      | [**removeDropRequest**](docs/FlowfileQueuesApi.md#removeDropRequest) | **DELETE** /flowfile-queues/{id}/drop-requests/{drop-request-id} | Cancels and/or removes a request to drop the contents of this connection. |
| *FunnelApi*              | [**getFunnel**](docs/FunnelApi.md#getFunnel) | **GET** /funnels/{id}                    | Gets a funnel                            |
| *FunnelApi*              | [**removeFunnel**](docs/FunnelApi.md#removeFunnel) | **DELETE** /funnels/{id}                 | Deletes a funnel                         |
| *FunnelApi*              | [**updateFunnel**](docs/FunnelApi.md#updateFunnel) | **PUT** /funnels/{id}                    | Updates a funnel                         |
| *InputPortsApi*          | [**getInputPort**](docs/InputPortsApi.md#getInputPort) | **GET** /input-ports/{id}                | Gets an input port                       |
| *InputPortsApi*          | [**removeInputPort**](docs/InputPortsApi.md#removeInputPort) | **DELETE** /input-ports/{id}             | Deletes an input port                    |
| *InputPortsApi*          | [**updateInputPort**](docs/InputPortsApi.md#updateInputPort) | **PUT** /input-ports/{id}                | Updates an input port                    |
| *LabelsApi*              | [**getLabel**](docs/LabelsApi.md#getLabel) | **GET** /labels/{id}                     | Gets a label                             |
| *LabelsApi*              | [**removeLabel**](docs/LabelsApi.md#removeLabel) | **DELETE** /labels/{id}                  | Deletes a label                          |
| *LabelsApi*              | [**updateLabel**](docs/LabelsApi.md#updateLabel) | **PUT** /labels/{id}                     | Updates a label                          |
| *OutputPortsApi*         | [**getOutputPort**](docs/OutputPortsApi.md#getOutputPort) | **GET** /output-ports/{id}               | Gets an output port                      |
| *OutputPortsApi*         | [**removeOutputPort**](docs/OutputPortsApi.md#removeOutputPort) | **DELETE** /output-ports/{id}            | Deletes an output port                   |
| *OutputPortsApi*         | [**updateOutputPort**](docs/OutputPortsApi.md#updateOutputPort) | **PUT** /output-ports/{id}               | Updates an output port                   |
| *PoliciesApi*            | [**createAccessPolicy**](docs/PoliciesApi.md#createAccessPolicy) | **POST** /policies                       | Creates an access policy                 |
| *PoliciesApi*            | [**getAccessPolicy**](docs/PoliciesApi.md#getAccessPolicy) | **GET** /policies/{id}                   | Gets an access policy                    |
| *PoliciesApi*            | [**getAccessPolicyForResource**](docs/PoliciesApi.md#getAccessPolicyForResource) | **GET** /policies/{action}/{resource}    | Gets an access policy for the specified action and resource |
| *PoliciesApi*            | [**removeAccessPolicy**](docs/PoliciesApi.md#removeAccessPolicy) | **DELETE** /policies/{id}                | Deletes an access policy                 |
| *PoliciesApi*            | [**updateAccessPolicy**](docs/PoliciesApi.md#updateAccessPolicy) | **PUT** /policies/{id}                   | Updates a access policy                  |
| *ProcessGroupsApi*       | [**copySnippet**](docs/ProcessGroupsApi.md#copySnippet) | **POST** /process-groups/{id}/snippet-instance | Copies a snippet                         |
| *ProcessGroupsApi*       | [**createConnection**](docs/ProcessGroupsApi.md#createConnection) | **POST** /process-groups/{id}/connections | Creates a connection                     |
| *ProcessGroupsApi*       | [**createControllerService**](docs/ProcessGroupsApi.md#createControllerService) | **POST** /process-groups/{id}/controller-services | Creates a new controller service         |
| *ProcessGroupsApi*       | [**createFunnel**](docs/ProcessGroupsApi.md#createFunnel) | **POST** /process-groups/{id}/funnels    | Creates a funnel                         |
| *ProcessGroupsApi*       | [**createInputPort**](docs/ProcessGroupsApi.md#createInputPort) | **POST** /process-groups/{id}/input-ports | Creates an input port                    |
| *ProcessGroupsApi*       | [**createLabel**](docs/ProcessGroupsApi.md#createLabel) | **POST** /process-groups/{id}/labels     | Creates a label                          |
| *ProcessGroupsApi*       | [**createOutputPort**](docs/ProcessGroupsApi.md#createOutputPort) | **POST** /process-groups/{id}/output-ports | Creates an output port                   |
| *ProcessGroupsApi*       | [**createProcessGroup**](docs/ProcessGroupsApi.md#createProcessGroup) | **POST** /process-groups/{id}/process-groups | Creates a process group                  |
| *ProcessGroupsApi*       | [**createProcessor**](docs/ProcessGroupsApi.md#createProcessor) | **POST** /process-groups/{id}/processors | Creates a new processor                  |
| *ProcessGroupsApi*       | [**createRemoteProcessGroup**](docs/ProcessGroupsApi.md#createRemoteProcessGroup) | **POST** /process-groups/{id}/remote-process-groups | Creates a new process group              |
| *ProcessGroupsApi*       | [**createTemplate**](docs/ProcessGroupsApi.md#createTemplate) | **POST** /process-groups/{id}/templates  | Creates a template                       |
| *ProcessGroupsApi*       | [**getConnections**](docs/ProcessGroupsApi.md#getConnections) | **GET** /process-groups/{id}/connections | Gets all connections                     |
| *ProcessGroupsApi*       | [**getFunnels**](docs/ProcessGroupsApi.md#getFunnels) | **GET** /process-groups/{id}/funnels     | Gets all funnels                         |
| *ProcessGroupsApi*       | [**getInputPorts**](docs/ProcessGroupsApi.md#getInputPorts) | **GET** /process-groups/{id}/input-ports | Gets all input ports                     |
| *ProcessGroupsApi*       | [**getLabels**](docs/ProcessGroupsApi.md#getLabels) | **GET** /process-groups/{id}/labels      | Gets all labels                          |
| *ProcessGroupsApi*       | [**getOutputPorts**](docs/ProcessGroupsApi.md#getOutputPorts) | **GET** /process-groups/{id}/output-ports | Gets all output ports                    |
| *ProcessGroupsApi*       | [**getProcessGroup**](docs/ProcessGroupsApi.md#getProcessGroup) | **GET** /process-groups/{id}             | Gets a process group                     |
| *ProcessGroupsApi*       | [**getProcessGroups**](docs/ProcessGroupsApi.md#getProcessGroups) | **GET** /process-groups/{id}/process-groups | Gets all process groups                  |
| *ProcessGroupsApi*       | [**getProcessors**](docs/ProcessGroupsApi.md#getProcessors) | **GET** /process-groups/{id}/processors  | Gets all processors                      |
| *ProcessGroupsApi*       | [**getRemoteProcessGroups**](docs/ProcessGroupsApi.md#getRemoteProcessGroups) | **GET** /process-groups/{id}/remote-process-groups | Gets all remote process groups           |
| *ProcessGroupsApi*       | [**importTemplate**](docs/ProcessGroupsApi.md#importTemplate) | **POST** /process-groups/{id}/templates/import | Imports a template                       |
| *ProcessGroupsApi*       | [**instantiateTemplate**](docs/ProcessGroupsApi.md#instantiateTemplate) | **POST** /process-groups/{id}/template-instance | Instantiates a template                  |
| *ProcessGroupsApi*       | [**removeProcessGroup**](docs/ProcessGroupsApi.md#removeProcessGroup) | **DELETE** /process-groups/{id}          | Deletes a process group                  |
| *ProcessGroupsApi*       | [**updateProcessGroup**](docs/ProcessGroupsApi.md#updateProcessGroup) | **PUT** /process-groups/{id}             | Updates a process group                  |
| *ProcessGroupsApi*       | [**uploadTemplate**](docs/ProcessGroupsApi.md#uploadTemplate) | **POST** /process-groups/{id}/templates/upload | Uploads a template                       |
| *ProcessorsApi*          | [**clearState**](docs/ProcessorsApi.md#clearState) | **POST** /processors/{id}/state/clear-requests | Clears the state for a processor         |
| *ProcessorsApi*          | [**deleteProcessor**](docs/ProcessorsApi.md#deleteProcessor) | **DELETE** /processors/{id}              | Deletes a processor                      |
| *ProcessorsApi*          | [**getProcessor**](docs/ProcessorsApi.md#getProcessor) | **GET** /processors/{id}                 | Gets a processor                         |
| *ProcessorsApi*          | [**getPropertyDescriptor**](docs/ProcessorsApi.md#getPropertyDescriptor) | **GET** /processors/{id}/descriptors     | Gets the descriptor for a processor property |
| *ProcessorsApi*          | [**getState**](docs/ProcessorsApi.md#getState) | **GET** /processors/{id}/state           | Gets the state for a processor           |
| *ProcessorsApi*          | [**updateProcessor**](docs/ProcessorsApi.md#updateProcessor) | **PUT** /processors/{id}                 | Updates a processor                      |
| *ProvenanceApi*          | [**deleteLineage**](docs/ProvenanceApi.md#deleteLineage) | **DELETE** /provenance/lineage/{id}      | Deletes a lineage query                  |
| *ProvenanceApi*          | [**deleteProvenance**](docs/ProvenanceApi.md#deleteProvenance) | **DELETE** /provenance/{id}              | Deletes a provenance query               |
| *ProvenanceApi*          | [**getLineage**](docs/ProvenanceApi.md#getLineage) | **GET** /provenance/lineage/{id}         | Gets a lineage query                     |
| *ProvenanceApi*          | [**getProvenance**](docs/ProvenanceApi.md#getProvenance) | **GET** /provenance/{id}                 | Gets a provenance query                  |
| *ProvenanceApi*          | [**getSearchOptions**](docs/ProvenanceApi.md#getSearchOptions) | **GET** /provenance/search-options       | Gets the searchable attributes for provenance events |
| *ProvenanceApi*          | [**submitLineageRequest**](docs/ProvenanceApi.md#submitLineageRequest) | **POST** /provenance/lineage             | Submits a lineage query                  |
| *ProvenanceApi*          | [**submitProvenanceRequest**](docs/ProvenanceApi.md#submitProvenanceRequest) | **POST** /provenance                     | Submits a provenance query               |
| *ProvenanceEventsApi*    | [**getInputContent**](docs/ProvenanceEventsApi.md#getInputContent) | **GET** /provenance-events/{id}/content/input | Gets the input content for a provenance event |
| *ProvenanceEventsApi*    | [**getOutputContent**](docs/ProvenanceEventsApi.md#getOutputContent) | **GET** /provenance-events/{id}/content/output | Gets the output content for a provenance event |
| *ProvenanceEventsApi*    | [**getProvenanceEvent**](docs/ProvenanceEventsApi.md#getProvenanceEvent) | **GET** /provenance-events/{id}          | Gets a provenance event                  |
| *ProvenanceEventsApi*    | [**submitReplay**](docs/ProvenanceEventsApi.md#submitReplay) | **POST** /provenance-events/replays      | Replays content from a provenance event  |
| *RemoteProcessGroupsApi* | [**getRemoteProcessGroup**](docs/RemoteProcessGroupsApi.md#getRemoteProcessGroup) | **GET** /remote-process-groups/{id}      | Gets a remote process group              |
| *RemoteProcessGroupsApi* | [**removeRemoteProcessGroup**](docs/RemoteProcessGroupsApi.md#removeRemoteProcessGroup) | **DELETE** /remote-process-groups/{id}   | Deletes a remote process group           |
| *RemoteProcessGroupsApi* | [**updateRemoteProcessGroup**](docs/RemoteProcessGroupsApi.md#updateRemoteProcessGroup) | **PUT** /remote-process-groups/{id}      | Updates a remote process group           |
| *RemoteProcessGroupsApi* | [**updateRemoteProcessGroupInputPort**](docs/RemoteProcessGroupsApi.md#updateRemoteProcessGroupInputPort) | **PUT** /remote-process-groups/{id}/input-ports/{port-id} | Updates a remote port                    |
| *RemoteProcessGroupsApi* | [**updateRemoteProcessGroupOutputPort**](docs/RemoteProcessGroupsApi.md#updateRemoteProcessGroupOutputPort) | **PUT** /remote-process-groups/{id}/output-ports/{port-id} | Updates a remote port                    |
| *ReportingTasksApi*      | [**clearState**](docs/ReportingTasksApi.md#clearState) | **POST** /reporting-tasks/{id}/state/clear-requests | Clears the state for a reporting task    |
| *ReportingTasksApi*      | [**getPropertyDescriptor**](docs/ReportingTasksApi.md#getPropertyDescriptor) | **GET** /reporting-tasks/{id}/descriptors | Gets a reporting task property descriptor |
| *ReportingTasksApi*      | [**getReportingTask**](docs/ReportingTasksApi.md#getReportingTask) | **GET** /reporting-tasks/{id}            | Gets a reporting task                    |
| *ReportingTasksApi*      | [**getState**](docs/ReportingTasksApi.md#getState) | **GET** /reporting-tasks/{id}/state      | Gets the state for a reporting task      |
| *ReportingTasksApi*      | [**removeReportingTask**](docs/ReportingTasksApi.md#removeReportingTask) | **DELETE** /reporting-tasks/{id}         | Deletes a reporting task                 |
| *ReportingTasksApi*      | [**updateReportingTask**](docs/ReportingTasksApi.md#updateReportingTask) | **PUT** /reporting-tasks/{id}            | Updates a reporting task                 |
| *ResourcesApi*           | [**getResources**](docs/ResourcesApi.md#getResources) | **GET** /resources                       | Gets the available resources that support access/authorization policies |
| *SiteToSiteApi*          | [**getPeers**](docs/SiteToSiteApi.md#getPeers) | **GET** /site-to-site/peers              | Returns the available Peers and its status of this NiFi |
| *SiteToSiteApi*          | [**getSiteToSiteDetails**](docs/SiteToSiteApi.md#getSiteToSiteDetails) | **GET** /site-to-site                    | Returns the details about this NiFi necessary to communicate via site to site |
| *SnippetsApi*            | [**createSnippet**](docs/SnippetsApi.md#createSnippet) | **POST** /snippets                       | Creates a snippet                        |
| *SnippetsApi*            | [**deleteSnippet**](docs/SnippetsApi.md#deleteSnippet) | **DELETE** /snippets/{id}                | Deletes the components in a snippet and drops the snippet |
| *SnippetsApi*            | [**updateSnippet**](docs/SnippetsApi.md#updateSnippet) | **PUT** /snippets/{id}                   | Move&#39;s the components in this Snippet into a new Process Group and drops the snippet |
| *SystemDiagnosticsApi*   | [**getSystemDiagnostics**](docs/SystemDiagnosticsApi.md#getSystemDiagnostics) | **GET** /system-diagnostics              | Gets the diagnostics for the system NiFi is running on |
| *TemplatesApi*           | [**exportTemplate**](docs/TemplatesApi.md#exportTemplate) | **GET** /templates/{id}/download         | Exports a template                       |
| *TemplatesApi*           | [**removeTemplate**](docs/TemplatesApi.md#removeTemplate) | **DELETE** /templates/{id}               | Deletes a template                       |
| *TenantsApi*             | [**createUser**](docs/TenantsApi.md#createUser) | **POST** /tenants/users                  | Creates a user                           |
| *TenantsApi*             | [**createUserGroup**](docs/TenantsApi.md#createUserGroup) | **POST** /tenants/user-groups            | Creates a user group                     |
| *TenantsApi*             | [**getUser**](docs/TenantsApi.md#getUser) | **GET** /tenants/users/{id}              | Gets a user                              |
| *TenantsApi*             | [**getUserGroup**](docs/TenantsApi.md#getUserGroup) | **GET** /tenants/user-groups/{id}        | Gets a user group                        |
| *TenantsApi*             | [**getUserGroups**](docs/TenantsApi.md#getUserGroups) | **GET** /tenants/user-groups             | Gets all user groups                     |
| *TenantsApi*             | [**getUsers**](docs/TenantsApi.md#getUsers) | **GET** /tenants/users                   | Gets all users                           |
| *TenantsApi*             | [**removeUser**](docs/TenantsApi.md#removeUser) | **DELETE** /tenants/users/{id}           | Deletes a user                           |
| *TenantsApi*             | [**removeUserGroup**](docs/TenantsApi.md#removeUserGroup) | **DELETE** /tenants/user-groups/{id}     | Deletes a user group                     |
| *TenantsApi*             | [**searchCluster**](docs/TenantsApi.md#searchCluster) | **GET** /tenants/search-results          | Searches for a tenant with the specified identity |
| *TenantsApi*             | [**updateUser**](docs/TenantsApi.md#updateUser) | **PUT** /tenants/users/{id}              | Updates a user                           |
| *TenantsApi*             | [**updateUserGroup**](docs/TenantsApi.md#updateUserGroup) | **PUT** /tenants/user-groups/{id}        | Updates a user group                     |


## Documentation for Models

 - [AboutDTO](docs/AboutDTO.md)
 - [AboutEntity](docs/AboutEntity.md)
 - [AccessConfigurationDTO](docs/AccessConfigurationDTO.md)
 - [AccessConfigurationEntity](docs/AccessConfigurationEntity.md)
 - [AccessPolicyDTO](docs/AccessPolicyDTO.md)
 - [AccessPolicyEntity](docs/AccessPolicyEntity.md)
 - [AccessPolicySummaryDTO](docs/AccessPolicySummaryDTO.md)
 - [AccessPolicySummaryEntity](docs/AccessPolicySummaryEntity.md)
 - [AccessStatusDTO](docs/AccessStatusDTO.md)
 - [AccessStatusEntity](docs/AccessStatusEntity.md)
 - [ActionDTO](docs/ActionDTO.md)
 - [ActionDetailsDTO](docs/ActionDetailsDTO.md)
 - [ActionEntity](docs/ActionEntity.md)
 - [AllowableValueDTO](docs/AllowableValueDTO.md)
 - [AllowableValueEntity](docs/AllowableValueEntity.md)
 - [AttributeDTO](docs/AttributeDTO.md)
 - [BannerDTO](docs/BannerDTO.md)
 - [BannerEntity](docs/BannerEntity.md)
 - [BulletinBoardDTO](docs/BulletinBoardDTO.md)
 - [BulletinBoardEntity](docs/BulletinBoardEntity.md)
 - [BulletinDTO](docs/BulletinDTO.md)
 - [BulletinEntity](docs/BulletinEntity.md)
 - [ClusteSummaryEntity](docs/ClusteSummaryEntity.md)
 - [ClusterDTO](docs/ClusterDTO.md)
 - [ClusterEntity](docs/ClusterEntity.md)
 - [ClusterSearchResultsEntity](docs/ClusterSearchResultsEntity.md)
 - [ClusterSummaryDTO](docs/ClusterSummaryDTO.md)
 - [ComponentDetailsDTO](docs/ComponentDetailsDTO.md)
 - [ComponentHistoryDTO](docs/ComponentHistoryDTO.md)
 - [ComponentHistoryEntity](docs/ComponentHistoryEntity.md)
 - [ComponentReferenceDTO](docs/ComponentReferenceDTO.md)
 - [ComponentReferenceEntity](docs/ComponentReferenceEntity.md)
 - [ComponentSearchResultDTO](docs/ComponentSearchResultDTO.md)
 - [ComponentStateDTO](docs/ComponentStateDTO.md)
 - [ConnectableDTO](docs/ConnectableDTO.md)
 - [ConnectionDTO](docs/ConnectionDTO.md)
 - [ConnectionEntity](docs/ConnectionEntity.md)
 - [ConnectionStatusDTO](docs/ConnectionStatusDTO.md)
 - [ConnectionStatusEntity](docs/ConnectionStatusEntity.md)
 - [ConnectionStatusSnapshotDTO](docs/ConnectionStatusSnapshotDTO.md)
 - [ConnectionStatusSnapshotEntity](docs/ConnectionStatusSnapshotEntity.md)
 - [ConnectionsEntity](docs/ConnectionsEntity.md)
 - [ControllerBulletinsEntity](docs/ControllerBulletinsEntity.md)
 - [ControllerConfigurationDTO](docs/ControllerConfigurationDTO.md)
 - [ControllerConfigurationEntity](docs/ControllerConfigurationEntity.md)
 - [ControllerDTO](docs/ControllerDTO.md)
 - [ControllerEntity](docs/ControllerEntity.md)
 - [ControllerServiceDTO](docs/ControllerServiceDTO.md)
 - [ControllerServiceEntity](docs/ControllerServiceEntity.md)
 - [ControllerServiceReferencingComponentDTO](docs/ControllerServiceReferencingComponentDTO.md)
 - [ControllerServiceReferencingComponentEntity](docs/ControllerServiceReferencingComponentEntity.md)
 - [ControllerServiceReferencingComponentsEntity](docs/ControllerServiceReferencingComponentsEntity.md)
 - [ControllerServiceTypesEntity](docs/ControllerServiceTypesEntity.md)
 - [ControllerServicesEntity](docs/ControllerServicesEntity.md)
 - [ControllerStatusDTO](docs/ControllerStatusDTO.md)
 - [ControllerStatusEntity](docs/ControllerStatusEntity.md)
 - [CopySnippetRequestEntity](docs/CopySnippetRequestEntity.md)
 - [CounterDTO](docs/CounterDTO.md)
 - [CounterEntity](docs/CounterEntity.md)
 - [CountersDTO](docs/CountersDTO.md)
 - [CountersEntity](docs/CountersEntity.md)
 - [CountersSnapshotDTO](docs/CountersSnapshotDTO.md)
 - [CreateTemplateRequestEntity](docs/CreateTemplateRequestEntity.md)
 - [CurrentUserEntity](docs/CurrentUserEntity.md)
 - [DimensionsDTO](docs/DimensionsDTO.md)
 - [DocumentedTypeDTO](docs/DocumentedTypeDTO.md)
 - [DropRequestDTO](docs/DropRequestDTO.md)
 - [DropRequestEntity](docs/DropRequestEntity.md)
 - [FlowBreadcrumbDTO](docs/FlowBreadcrumbDTO.md)
 - [FlowBreadcrumbEntity](docs/FlowBreadcrumbEntity.md)
 - [FlowConfigurationDTO](docs/FlowConfigurationDTO.md)
 - [FlowConfigurationEntity](docs/FlowConfigurationEntity.md)
 - [FlowDTO](docs/FlowDTO.md)
 - [FlowEntity](docs/FlowEntity.md)
 - [FlowFileSummaryDTO](docs/FlowFileSummaryDTO.md)
 - [FlowSnippetDTO](docs/FlowSnippetDTO.md)
 - [FlowSnippetEntity](docs/FlowSnippetEntity.md)
 - [FunnelDTO](docs/FunnelDTO.md)
 - [FunnelEntity](docs/FunnelEntity.md)
 - [FunnelsEntity](docs/FunnelsEntity.md)
 - [GarbageCollectionDTO](docs/GarbageCollectionDTO.md)
 - [HistoryDTO](docs/HistoryDTO.md)
 - [HistoryEntity](docs/HistoryEntity.md)
 - [InputPortsEntity](docs/InputPortsEntity.md)
 - [InstantiateTemplateRequestEntity](docs/InstantiateTemplateRequestEntity.md)
 - [LabelDTO](docs/LabelDTO.md)
 - [LabelEntity](docs/LabelEntity.md)
 - [LabelsEntity](docs/LabelsEntity.md)
 - [LineageDTO](docs/LineageDTO.md)
 - [LineageEntity](docs/LineageEntity.md)
 - [LineageRequestDTO](docs/LineageRequestDTO.md)
 - [LineageResultsDTO](docs/LineageResultsDTO.md)
 - [ListingRequestDTO](docs/ListingRequestDTO.md)
 - [ListingRequestEntity](docs/ListingRequestEntity.md)
 - [NodeConnectionStatusSnapshotDTO](docs/NodeConnectionStatusSnapshotDTO.md)
 - [NodeCountersSnapshotDTO](docs/NodeCountersSnapshotDTO.md)
 - [NodeDTO](docs/NodeDTO.md)
 - [NodeEntity](docs/NodeEntity.md)
 - [NodeEventDTO](docs/NodeEventDTO.md)
 - [NodePortStatusSnapshotDTO](docs/NodePortStatusSnapshotDTO.md)
 - [NodeProcessGroupStatusSnapshotDTO](docs/NodeProcessGroupStatusSnapshotDTO.md)
 - [NodeProcessorStatusSnapshotDTO](docs/NodeProcessorStatusSnapshotDTO.md)
 - [NodeRemoteProcessGroupStatusSnapshotDTO](docs/NodeRemoteProcessGroupStatusSnapshotDTO.md)
 - [NodeSearchResultDTO](docs/NodeSearchResultDTO.md)
 - [NodeStatusSnapshotsDTO](docs/NodeStatusSnapshotsDTO.md)
 - [NodeSystemDiagnosticsSnapshotDTO](docs/NodeSystemDiagnosticsSnapshotDTO.md)
 - [OutputPortsEntity](docs/OutputPortsEntity.md)
 - [PeerDTO](docs/PeerDTO.md)
 - [PeersEntity](docs/PeersEntity.md)
 - [PermissionsDTO](docs/PermissionsDTO.md)
 - [PortDTO](docs/PortDTO.md)
 - [PortEntity](docs/PortEntity.md)
 - [PortStatusDTO](docs/PortStatusDTO.md)
 - [PortStatusEntity](docs/PortStatusEntity.md)
 - [PortStatusSnapshotDTO](docs/PortStatusSnapshotDTO.md)
 - [PortStatusSnapshotEntity](docs/PortStatusSnapshotEntity.md)
 - [PositionDTO](docs/PositionDTO.md)
 - [PreviousValueDTO](docs/PreviousValueDTO.md)
 - [PrioritizerTypesEntity](docs/PrioritizerTypesEntity.md)
 - [ProcessGroupDTO](docs/ProcessGroupDTO.md)
 - [ProcessGroupEntity](docs/ProcessGroupEntity.md)
 - [ProcessGroupFlowDTO](docs/ProcessGroupFlowDTO.md)
 - [ProcessGroupFlowEntity](docs/ProcessGroupFlowEntity.md)
 - [ProcessGroupStatusDTO](docs/ProcessGroupStatusDTO.md)
 - [ProcessGroupStatusEntity](docs/ProcessGroupStatusEntity.md)
 - [ProcessGroupStatusSnapshotDTO](docs/ProcessGroupStatusSnapshotDTO.md)
 - [ProcessGroupStatusSnapshotEntity](docs/ProcessGroupStatusSnapshotEntity.md)
 - [ProcessorConfigDTO](docs/ProcessorConfigDTO.md)
 - [ProcessorDTO](docs/ProcessorDTO.md)
 - [ProcessorEntity](docs/ProcessorEntity.md)
 - [ProcessorStatusDTO](docs/ProcessorStatusDTO.md)
 - [ProcessorStatusEntity](docs/ProcessorStatusEntity.md)
 - [ProcessorStatusSnapshotDTO](docs/ProcessorStatusSnapshotDTO.md)
 - [ProcessorStatusSnapshotEntity](docs/ProcessorStatusSnapshotEntity.md)
 - [ProcessorTypesEntity](docs/ProcessorTypesEntity.md)
 - [ProcessorsEntity](docs/ProcessorsEntity.md)
 - [PropertyDescriptorDTO](docs/PropertyDescriptorDTO.md)
 - [PropertyDescriptorEntity](docs/PropertyDescriptorEntity.md)
 - [PropertyHistoryDTO](docs/PropertyHistoryDTO.md)
 - [ProvenanceDTO](docs/ProvenanceDTO.md)
 - [ProvenanceEntity](docs/ProvenanceEntity.md)
 - [ProvenanceEventDTO](docs/ProvenanceEventDTO.md)
 - [ProvenanceEventEntity](docs/ProvenanceEventEntity.md)
 - [ProvenanceLinkDTO](docs/ProvenanceLinkDTO.md)
 - [ProvenanceNodeDTO](docs/ProvenanceNodeDTO.md)
 - [ProvenanceOptionsDTO](docs/ProvenanceOptionsDTO.md)
 - [ProvenanceOptionsEntity](docs/ProvenanceOptionsEntity.md)
 - [ProvenanceRequestDTO](docs/ProvenanceRequestDTO.md)
 - [ProvenanceResultsDTO](docs/ProvenanceResultsDTO.md)
 - [ProvenanceSearchableFieldDTO](docs/ProvenanceSearchableFieldDTO.md)
 - [QueueSizeDTO](docs/QueueSizeDTO.md)
 - [RelationshipDTO](docs/RelationshipDTO.md)
 - [RemoteProcessGroupContentsDTO](docs/RemoteProcessGroupContentsDTO.md)
 - [RemoteProcessGroupDTO](docs/RemoteProcessGroupDTO.md)
 - [RemoteProcessGroupEntity](docs/RemoteProcessGroupEntity.md)
 - [RemoteProcessGroupPortDTO](docs/RemoteProcessGroupPortDTO.md)
 - [RemoteProcessGroupPortEntity](docs/RemoteProcessGroupPortEntity.md)
 - [RemoteProcessGroupStatusDTO](docs/RemoteProcessGroupStatusDTO.md)
 - [RemoteProcessGroupStatusSnapshotDTO](docs/RemoteProcessGroupStatusSnapshotDTO.md)
 - [RemoteProcessGroupStatusSnapshotEntity](docs/RemoteProcessGroupStatusSnapshotEntity.md)
 - [RemoteProcessGroupsEntity](docs/RemoteProcessGroupsEntity.md)
 - [ReportingTaskDTO](docs/ReportingTaskDTO.md)
 - [ReportingTaskEntity](docs/ReportingTaskEntity.md)
 - [ReportingTaskTypesEntity](docs/ReportingTaskTypesEntity.md)
 - [ReportingTasksEntity](docs/ReportingTasksEntity.md)
 - [ResourceDTO](docs/ResourceDTO.md)
 - [ResourcesEntity](docs/ResourcesEntity.md)
 - [RevisionDTO](docs/RevisionDTO.md)
 - [ScheduleComponentsEntity](docs/ScheduleComponentsEntity.md)
 - [SearchResultsDTO](docs/SearchResultsDTO.md)
 - [SearchResultsEntity](docs/SearchResultsEntity.md)
 - [SnippetDTO](docs/SnippetDTO.md)
 - [SnippetEntity](docs/SnippetEntity.md)
 - [StateEntryDTO](docs/StateEntryDTO.md)
 - [StateMapDTO](docs/StateMapDTO.md)
 - [StatusDescriptorDTO](docs/StatusDescriptorDTO.md)
 - [StatusHistoryDTO](docs/StatusHistoryDTO.md)
 - [StatusHistoryEntity](docs/StatusHistoryEntity.md)
 - [StatusSnapshotDTO](docs/StatusSnapshotDTO.md)
 - [StorageUsageDTO](docs/StorageUsageDTO.md)
 - [StreamingOutput](docs/StreamingOutput.md)
 - [SubmitReplayRequestEntity](docs/SubmitReplayRequestEntity.md)
 - [SystemDiagnosticsDTO](docs/SystemDiagnosticsDTO.md)
 - [SystemDiagnosticsEntity](docs/SystemDiagnosticsEntity.md)
 - [SystemDiagnosticsSnapshotDTO](docs/SystemDiagnosticsSnapshotDTO.md)
 - [TemplateDTO](docs/TemplateDTO.md)
 - [TemplateEntity](docs/TemplateEntity.md)
 - [TemplatesEntity](docs/TemplatesEntity.md)
 - [TenantDTO](docs/TenantDTO.md)
 - [TenantEntity](docs/TenantEntity.md)
 - [TenantsEntity](docs/TenantsEntity.md)
 - [TransactionResultEntity](docs/TransactionResultEntity.md)
 - [UpdateControllerServiceReferenceRequestEntity](docs/UpdateControllerServiceReferenceRequestEntity.md)
 - [UserDTO](docs/UserDTO.md)
 - [UserEntity](docs/UserEntity.md)
 - [UserGroupDTO](docs/UserGroupDTO.md)
 - [UserGroupEntity](docs/UserGroupEntity.md)
 - [UserGroupsEntity](docs/UserGroupsEntity.md)
 - [UsersEntity](docs/UsersEntity.md)
 - [VersionInfoDTO](docs/VersionInfoDTO.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### auth

- **Type**: OAuth
- **Flow**: implicit

  ​


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Building api

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

### Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

## Author

hermannpencole@yahoo.fr

