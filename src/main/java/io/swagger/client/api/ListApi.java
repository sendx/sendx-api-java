/**
 * SendX API
 * SendX is built on the simple tenet that users must have open access to their data. SendX API is the first step in that direction. To cite some examples:   - subscribe / unsubscribe a contact from a list   - Schedule campaign to a segment of users   - Trigger transactional emails   - Get / PUT / POST and DELETE operations on team, campaign, list, contact, report etc. and so on.  As companies grow big, custom use cases around email marketing also crop up. SendX API ensures   that SendX platform is able to satisfy such unforeseen use cases. They may range from building     custom reporting dashboard to tagging contacts with custom attributes or triggering emails based on recommendation algorithm.  We do our best to have all our URLs be [RESTful](http://en.wikipedia.org/wiki/Representational_state_transfer). Every endpoint (URL) may support one of four different http verbs. GET requests fetch information about an object, POST requests create objects, PUT requests update objects, and finally DELETE requests will delete objects.  Also all API calls besides:   - Subscribe / unsubscribe signup form  required **api_key** to be passed as **header**   ### The Envelope Every response is contained by an envelope. That is, each response has a predictable set of keys with which you can expect to interact: ```json {     \"status\": \"200\",      \"message\": \"OK\",     \"data\"\": [        {          ...        },        .        .        .     ] } ```  #### Status  The status key is used to communicate extra information about the response to the developer. If all goes well, you'll only ever see a code key with value 200. However, sometimes things go wrong, and in that case you might see a response like: ```json {     \"status\": \"404\" } ```  #### Data  The data key is the meat of the response. It may be a list containing single object or multiple objects  #### Message  This returns back human readable message. This is specially useful to make sense in case of error scenarios. 
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

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import io.swagger.client.model.InlineResponse2007;
import io.swagger.client.model.DeepListEmailContact;
import io.swagger.client.model.InlineResponse2002;
import io.swagger.client.model.ListAddUpdate;
import io.swagger.client.model.InlineResponse2008;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListApi {
    private ApiClient apiClient;

    public ListApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ListApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for listGet */
    private com.squareup.okhttp.Call listGetCall(String apiKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'apiKey' is set
        if (apiKey == null) {
            throw new ApiException("Missing the required parameter 'apiKey' when calling listGet(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/list".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (apiKey != null)
        localVarHeaderParams.put("api_key", apiClient.parameterToString(apiKey));

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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Get information about all lists
     * 
     * @param apiKey  (required)
     * @return InlineResponse2007
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse2007 listGet(String apiKey) throws ApiException {
        ApiResponse<InlineResponse2007> resp = listGetWithHttpInfo(apiKey);
        return resp.getData();
    }

    /**
     * Get information about all lists
     * 
     * @param apiKey  (required)
     * @return ApiResponse&lt;InlineResponse2007&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse2007> listGetWithHttpInfo(String apiKey) throws ApiException {
        com.squareup.okhttp.Call call = listGetCall(apiKey, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse2007>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get information about all lists (asynchronously)
     * 
     * @param apiKey  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listGetAsync(String apiKey, final ApiCallback<InlineResponse2007> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listGetCall(apiKey, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse2007>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for listListIdContactsGet */
    private com.squareup.okhttp.Call listListIdContactsGetCall(String apiKey, Long listId, Integer limit, Integer offset, String contactType, String search, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'apiKey' is set
        if (apiKey == null) {
            throw new ApiException("Missing the required parameter 'apiKey' when calling listListIdContactsGet(Async)");
        }
        
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new ApiException("Missing the required parameter 'listId' when calling listListIdContactsGet(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/list/{listId}/contacts".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "listId" + "\\}", apiClient.escapeString(listId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
        if (contactType != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "contact_type", contactType));
        if (search != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "search", search));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (apiKey != null)
        localVarHeaderParams.put("api_key", apiClient.parameterToString(apiKey));

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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Find contacts belonging to a list
     * 
     * @param apiKey  (required)
     * @param listId ID of list that needs to be fetched (required)
     * @param limit Maximum number of contacts to be returned. Note that limit maximum value is 100 and default value is 10. (optional)
     * @param offset Offset from where we contacts should be retrieved. Default value is 0. (optional)
     * @param contactType Can be any of the following - all, confirmed, unconfirmed, unsubscribed, bounced, markedspam. Default contact_type is all (optional)
     * @param search search term which shall be run against contact&#39;s first name, last name and email. (optional)
     * @return List&lt;DeepListEmailContact&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<DeepListEmailContact> listListIdContactsGet(String apiKey, Long listId, Integer limit, Integer offset, String contactType, String search) throws ApiException {
        ApiResponse<List<DeepListEmailContact>> resp = listListIdContactsGetWithHttpInfo(apiKey, listId, limit, offset, contactType, search);
        return resp.getData();
    }

    /**
     * Find contacts belonging to a list
     * 
     * @param apiKey  (required)
     * @param listId ID of list that needs to be fetched (required)
     * @param limit Maximum number of contacts to be returned. Note that limit maximum value is 100 and default value is 10. (optional)
     * @param offset Offset from where we contacts should be retrieved. Default value is 0. (optional)
     * @param contactType Can be any of the following - all, confirmed, unconfirmed, unsubscribed, bounced, markedspam. Default contact_type is all (optional)
     * @param search search term which shall be run against contact&#39;s first name, last name and email. (optional)
     * @return ApiResponse&lt;List&lt;DeepListEmailContact&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<DeepListEmailContact>> listListIdContactsGetWithHttpInfo(String apiKey, Long listId, Integer limit, Integer offset, String contactType, String search) throws ApiException {
        com.squareup.okhttp.Call call = listListIdContactsGetCall(apiKey, listId, limit, offset, contactType, search, null, null);
        Type localVarReturnType = new TypeToken<List<DeepListEmailContact>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Find contacts belonging to a list (asynchronously)
     * 
     * @param apiKey  (required)
     * @param listId ID of list that needs to be fetched (required)
     * @param limit Maximum number of contacts to be returned. Note that limit maximum value is 100 and default value is 10. (optional)
     * @param offset Offset from where we contacts should be retrieved. Default value is 0. (optional)
     * @param contactType Can be any of the following - all, confirmed, unconfirmed, unsubscribed, bounced, markedspam. Default contact_type is all (optional)
     * @param search search term which shall be run against contact&#39;s first name, last name and email. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listListIdContactsGetAsync(String apiKey, Long listId, Integer limit, Integer offset, String contactType, String search, final ApiCallback<List<DeepListEmailContact>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listListIdContactsGetCall(apiKey, listId, limit, offset, contactType, search, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<DeepListEmailContact>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for listListIdDelete */
    private com.squareup.okhttp.Call listListIdDeleteCall(String apiKey, Long listId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'apiKey' is set
        if (apiKey == null) {
            throw new ApiException("Missing the required parameter 'apiKey' when calling listListIdDelete(Async)");
        }
        
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new ApiException("Missing the required parameter 'listId' when calling listListIdDelete(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/list/{listId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "listId" + "\\}", apiClient.escapeString(listId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (apiKey != null)
        localVarHeaderParams.put("api_key", apiClient.parameterToString(apiKey));

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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Deletes a list
     * 
     * @param apiKey  (required)
     * @param listId List ID to delete (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void listListIdDelete(String apiKey, Long listId) throws ApiException {
        listListIdDeleteWithHttpInfo(apiKey, listId);
    }

    /**
     * Deletes a list
     * 
     * @param apiKey  (required)
     * @param listId List ID to delete (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> listListIdDeleteWithHttpInfo(String apiKey, Long listId) throws ApiException {
        com.squareup.okhttp.Call call = listListIdDeleteCall(apiKey, listId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Deletes a list (asynchronously)
     * 
     * @param apiKey  (required)
     * @param listId List ID to delete (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listListIdDeleteAsync(String apiKey, Long listId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listListIdDeleteCall(apiKey, listId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for listListIdGet */
    private com.squareup.okhttp.Call listListIdGetCall(String apiKey, Long listId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'apiKey' is set
        if (apiKey == null) {
            throw new ApiException("Missing the required parameter 'apiKey' when calling listListIdGet(Async)");
        }
        
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new ApiException("Missing the required parameter 'listId' when calling listListIdGet(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/list/{listId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "listId" + "\\}", apiClient.escapeString(listId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (apiKey != null)
        localVarHeaderParams.put("api_key", apiClient.parameterToString(apiKey));

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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Find list by ID
     * 
     * @param apiKey  (required)
     * @param listId ID of list that needs to be fetched (required)
     * @return List
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List listListIdGet(String apiKey, Long listId) throws ApiException {
        ApiResponse<List> resp = listListIdGetWithHttpInfo(apiKey, listId);
        return resp.getData();
    }

    /**
     * Find list by ID
     * 
     * @param apiKey  (required)
     * @param listId ID of list that needs to be fetched (required)
     * @return ApiResponse&lt;List&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List> listListIdGetWithHttpInfo(String apiKey, Long listId) throws ApiException {
        com.squareup.okhttp.Call call = listListIdGetCall(apiKey, listId, null, null);
        Type localVarReturnType = new TypeToken<List>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Find list by ID (asynchronously)
     * 
     * @param apiKey  (required)
     * @param listId ID of list that needs to be fetched (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listListIdGetAsync(String apiKey, Long listId, final ApiCallback<List> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listListIdGetCall(apiKey, listId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for listListIdPut */
    private com.squareup.okhttp.Call listListIdPutCall(String apiKey, Long listId, ListAddUpdate body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'apiKey' is set
        if (apiKey == null) {
            throw new ApiException("Missing the required parameter 'apiKey' when calling listListIdPut(Async)");
        }
        
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new ApiException("Missing the required parameter 'listId' when calling listListIdPut(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling listListIdPut(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/list/{listId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "listId" + "\\}", apiClient.escapeString(listId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (apiKey != null)
        localVarHeaderParams.put("api_key", apiClient.parameterToString(apiKey));

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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Update a list by ID
     * 
     * @param apiKey  (required)
     * @param listId ID of list that needs to be updated (required)
     * @param body List object that needs to be added (required)
     * @return InlineResponse2002
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse2002 listListIdPut(String apiKey, Long listId, ListAddUpdate body) throws ApiException {
        ApiResponse<InlineResponse2002> resp = listListIdPutWithHttpInfo(apiKey, listId, body);
        return resp.getData();
    }

    /**
     * Update a list by ID
     * 
     * @param apiKey  (required)
     * @param listId ID of list that needs to be updated (required)
     * @param body List object that needs to be added (required)
     * @return ApiResponse&lt;InlineResponse2002&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse2002> listListIdPutWithHttpInfo(String apiKey, Long listId, ListAddUpdate body) throws ApiException {
        com.squareup.okhttp.Call call = listListIdPutCall(apiKey, listId, body, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse2002>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update a list by ID (asynchronously)
     * 
     * @param apiKey  (required)
     * @param listId ID of list that needs to be updated (required)
     * @param body List object that needs to be added (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listListIdPutAsync(String apiKey, Long listId, ListAddUpdate body, final ApiCallback<InlineResponse2002> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listListIdPutCall(apiKey, listId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse2002>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for listPost */
    private com.squareup.okhttp.Call listPostCall(String apiKey, ListAddUpdate body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'apiKey' is set
        if (apiKey == null) {
            throw new ApiException("Missing the required parameter 'apiKey' when calling listPost(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling listPost(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/list".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (apiKey != null)
        localVarHeaderParams.put("api_key", apiClient.parameterToString(apiKey));

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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Add a new list
     * 
     * @param apiKey  (required)
     * @param body List object that needs to be added (required)
     * @return InlineResponse2008
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse2008 listPost(String apiKey, ListAddUpdate body) throws ApiException {
        ApiResponse<InlineResponse2008> resp = listPostWithHttpInfo(apiKey, body);
        return resp.getData();
    }

    /**
     * Add a new list
     * 
     * @param apiKey  (required)
     * @param body List object that needs to be added (required)
     * @return ApiResponse&lt;InlineResponse2008&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse2008> listPostWithHttpInfo(String apiKey, ListAddUpdate body) throws ApiException {
        com.squareup.okhttp.Call call = listPostCall(apiKey, body, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse2008>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Add a new list (asynchronously)
     * 
     * @param apiKey  (required)
     * @param body List object that needs to be added (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listPostAsync(String apiKey, ListAddUpdate body, final ApiCallback<InlineResponse2008> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listPostCall(apiKey, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse2008>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
