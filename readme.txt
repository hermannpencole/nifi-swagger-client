The swagger.json is generated to \nifi-nar-bundles\nifi-framework-bundle\nifi-framework\nifi-web/nifi-web-api/target/swagger-ui/swagger.json on git://git.apache.org/nifi.

add
   "securityDefinitions": {   
    "auth": {
      "type": "oauth2",
      "authorizationUrl": "http://localhost/api/oauth/dialog",
      "flow": "implicit",
      "scopes": {
        "write:nifi": "modify nifi",
        "read:nifi": "read your nifi"
      }
    }
  },
  
  before "definitions" : {
	
and replace  "security" : [ { by  "security" : [ {"auth": [] }, {


java -jar swagger-codegen-cli-2.2.2.jar generate -i swagger.json -l java -o swagger --group-id com.github.hermannpencole --artifact-id nifi-swagger-client --artifact-version 1.1.0 --api-package com.github.hermannpencole.nifi.swagger.client --model-package com.github.hermannpencole.nifi.swagger.client.model

mvn install -Dadditionalparam=-Xdoclint:none

git cherry-pick c51913df179b8dd7192568a2f6b6fa2355216582