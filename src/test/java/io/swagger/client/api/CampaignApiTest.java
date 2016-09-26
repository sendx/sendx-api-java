/**
 * SendX API
 * SendX is built on the simple tenet that users must have open access to their data. SendX API is the first step in that direction. To cite some examples:   - subscribe / unsubscribe a contact from a list   - Schedule campaign to a segment of users   - Trigger transactional emails   - Get / PUT / POST and DELETE operations on team, campaign, list, contact, report etc. and so on.  As companies grow big, custom use cases around email marketing also crop up. SendX API ensures that SendX platform is able to satisfy such unforeseen use cases. They may range from building custom reporting dashboard to tagging contacts with custom attributes or triggering emails based on recommendation algorithm.  We do our best to have all our URLs be [RESTful](http://en.wikipedia.org/wiki/Representational_state_transfer). Every endpoint (URL) may support one of four different http verbs. GET requests fetch information about an object, POST requests create objects, PUT requests update objects, and finally DELETE requests will delete objects.  Also all API calls besides:   - Subscribe / unsubscribe signup form required **api_key** to be passed as **header**   ### The Envelope Every response is contained by an envelope. That is, each response has a predictable set of keys with which you can expect to interact: ```json {     \"status\": \"200\",     \"message\": \"OK\",     \"data\"\": [        {          ...        },        .        .        .     ] } ```  #### Status The status key is used to communicate extra information about the response to the developer. If all goes well, you'll only ever see a code key with value 200. However, sometimes things go wrong, and in that case you might see a response like: ```json {     \"status\": \"404\" } ```  #### Data The data key is the meat of the response. It may be a list containing single object or multiple objects  #### Message This returns back human readable message. This is specially useful to make sense in case of error scenarios. 
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.Campaign;
import io.swagger.client.model.CampaignAddUpdate;
import io.swagger.client.model.InlineResponse2002;
import io.swagger.client.model.InlineResponse200;
import io.swagger.client.model.InlineResponse2001;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CampaignApi
 */
public class CampaignApiTest {

    private final CampaignApi api = new CampaignApi();

    
    /**
     * Deletes a campaign
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void campaignCampaignIdDeleteTest() throws ApiException {
        String apiKey = null;
        Long campaignId = null;
        // api.campaignCampaignIdDelete(apiKey, campaignId);

        // TODO: test validations
    }
    
    /**
     * Find campaign by ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void campaignCampaignIdGetTest() throws ApiException {
        String apiKey = null;
        Long campaignId = null;
        // Campaign response = api.campaignCampaignIdGet(apiKey, campaignId);

        // TODO: test validations
    }
    
    /**
     * Update a campaign by ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void campaignCampaignIdPutTest() throws ApiException {
        String apiKey = null;
        Long campaignId = null;
        CampaignAddUpdate body = null;
        // InlineResponse2002 response = api.campaignCampaignIdPut(apiKey, campaignId, body);

        // TODO: test validations
    }
    
    /**
     * Get information about all campaigns
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void campaignGetTest() throws ApiException {
        String apiKey = null;
        // InlineResponse200 response = api.campaignGet(apiKey);

        // TODO: test validations
    }
    
    /**
     * Add a new campaign
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void campaignPostTest() throws ApiException {
        String apiKey = null;
        CampaignAddUpdate body = null;
        // InlineResponse2001 response = api.campaignPost(apiKey, body);

        // TODO: test validations
    }
    
}
