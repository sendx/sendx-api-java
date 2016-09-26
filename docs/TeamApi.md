# TeamApi

All URIs are relative to *http://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**teamGet**](TeamApi.md#teamGet) | **GET** /team | Get information about all teams
[**teamPost**](TeamApi.md#teamPost) | **POST** /team | Add a new team
[**teamTeamIdCampaignsGet**](TeamApi.md#teamTeamIdCampaignsGet) | **GET** /team/{teamId}/campaigns | Find campaigns of a team by ID
[**teamTeamIdContactsGet**](TeamApi.md#teamTeamIdContactsGet) | **GET** /team/{teamId}/contacts | Find contacts of a team by ID
[**teamTeamIdDelete**](TeamApi.md#teamTeamIdDelete) | **DELETE** /team/{teamId} | Deletes a team
[**teamTeamIdGet**](TeamApi.md#teamTeamIdGet) | **GET** /team/{teamId} | Find team by ID
[**teamTeamIdListsGet**](TeamApi.md#teamTeamIdListsGet) | **GET** /team/{teamId}/lists | Find lists of a team by ID
[**teamTeamIdPut**](TeamApi.md#teamTeamIdPut) | **PUT** /team/{teamId} | Update a team by ID
[**teamTeamIdTagsGet**](TeamApi.md#teamTeamIdTagsGet) | **GET** /team/{teamId}/tags | Find tags of a team by ID


<a name="teamGet"></a>
# **teamGet**
> InlineResponse20013 teamGet(apiKey)

Get information about all teams



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TeamApi;


TeamApi apiInstance = new TeamApi();
String apiKey = "apiKey_example"; // String | 
try {
    InlineResponse20013 result = apiInstance.teamGet(apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamApi#teamGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**|  |

### Return type

[**InlineResponse20013**](InlineResponse20013.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="teamPost"></a>
# **teamPost**
> InlineResponse20014 teamPost(apiKey, body)

Add a new team



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TeamApi;


TeamApi apiInstance = new TeamApi();
String apiKey = "apiKey_example"; // String | 
TeamAddUpdate body = new TeamAddUpdate(); // TeamAddUpdate | Team object that needs to be added
try {
    InlineResponse20014 result = apiInstance.teamPost(apiKey, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamApi#teamPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**|  |
 **body** | [**TeamAddUpdate**](TeamAddUpdate.md)| Team object that needs to be added |

### Return type

[**InlineResponse20014**](InlineResponse20014.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="teamTeamIdCampaignsGet"></a>
# **teamTeamIdCampaignsGet**
> List&lt;Campaign&gt; teamTeamIdCampaignsGet(apiKey, teamId)

Find campaigns of a team by ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TeamApi;


TeamApi apiInstance = new TeamApi();
String apiKey = "apiKey_example"; // String | 
Long teamId = 789L; // Long | ID of team whose campaigns need to be fetched
try {
    List<Campaign> result = apiInstance.teamTeamIdCampaignsGet(apiKey, teamId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamApi#teamTeamIdCampaignsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**|  |
 **teamId** | **Long**| ID of team whose campaigns need to be fetched |

### Return type

[**List&lt;Campaign&gt;**](Campaign.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="teamTeamIdContactsGet"></a>
# **teamTeamIdContactsGet**
> List&lt;DeepTeamEmailContact&gt; teamTeamIdContactsGet(apiKey, teamId, limit, offset, contactType, search)

Find contacts of a team by ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TeamApi;


TeamApi apiInstance = new TeamApi();
String apiKey = "apiKey_example"; // String | 
Long teamId = 789L; // Long | ID of team whose campaigns need to be fetched
Integer limit = 56; // Integer | Maximum number of contacts to be returned. Note that limit maximum value is 100 and default value is 10.
Integer offset = 56; // Integer | Offset from where we contacts should be retrieved. Default value is 0.
String contactType = "contactType_example"; // String | Can be any of the following - all, confirmed, unconfirmed, unsubscribed, bounced, markedspam. Default contact_type is all
String search = "search_example"; // String | search term which shall be run against contact's first name, last name and email.
try {
    List<DeepTeamEmailContact> result = apiInstance.teamTeamIdContactsGet(apiKey, teamId, limit, offset, contactType, search);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamApi#teamTeamIdContactsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**|  |
 **teamId** | **Long**| ID of team whose campaigns need to be fetched |
 **limit** | **Integer**| Maximum number of contacts to be returned. Note that limit maximum value is 100 and default value is 10. | [optional]
 **offset** | **Integer**| Offset from where we contacts should be retrieved. Default value is 0. | [optional]
 **contactType** | **String**| Can be any of the following - all, confirmed, unconfirmed, unsubscribed, bounced, markedspam. Default contact_type is all | [optional]
 **search** | **String**| search term which shall be run against contact&#39;s first name, last name and email. | [optional]

### Return type

[**List&lt;DeepTeamEmailContact&gt;**](DeepTeamEmailContact.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="teamTeamIdDelete"></a>
# **teamTeamIdDelete**
> teamTeamIdDelete(apiKey, teamId)

Deletes a team



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TeamApi;


TeamApi apiInstance = new TeamApi();
String apiKey = "apiKey_example"; // String | 
Long teamId = 789L; // Long | Team ID to delete
try {
    apiInstance.teamTeamIdDelete(apiKey, teamId);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamApi#teamTeamIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**|  |
 **teamId** | **Long**| Team ID to delete |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="teamTeamIdGet"></a>
# **teamTeamIdGet**
> Team teamTeamIdGet(apiKey, teamId)

Find team by ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TeamApi;


TeamApi apiInstance = new TeamApi();
String apiKey = "apiKey_example"; // String | 
Long teamId = 789L; // Long | ID of team that needs to be fetched
try {
    Team result = apiInstance.teamTeamIdGet(apiKey, teamId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamApi#teamTeamIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**|  |
 **teamId** | **Long**| ID of team that needs to be fetched |

### Return type

[**Team**](Team.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="teamTeamIdListsGet"></a>
# **teamTeamIdListsGet**
> List&lt;List&gt; teamTeamIdListsGet(apiKey, teamId)

Find lists of a team by ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TeamApi;


TeamApi apiInstance = new TeamApi();
String apiKey = "apiKey_example"; // String | 
Long teamId = 789L; // Long | ID of team whose campaigns need to be fetched
try {
    List<List> result = apiInstance.teamTeamIdListsGet(apiKey, teamId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamApi#teamTeamIdListsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**|  |
 **teamId** | **Long**| ID of team whose campaigns need to be fetched |

### Return type

[**List&lt;List&gt;**](List.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="teamTeamIdPut"></a>
# **teamTeamIdPut**
> InlineResponse2002 teamTeamIdPut(apiKey, teamId, body)

Update a team by ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TeamApi;


TeamApi apiInstance = new TeamApi();
String apiKey = "apiKey_example"; // String | 
Long teamId = 789L; // Long | ID of team that needs to be updated
TeamAddUpdate body = new TeamAddUpdate(); // TeamAddUpdate | Team object that needs to be added
try {
    InlineResponse2002 result = apiInstance.teamTeamIdPut(apiKey, teamId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamApi#teamTeamIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**|  |
 **teamId** | **Long**| ID of team that needs to be updated |
 **body** | [**TeamAddUpdate**](TeamAddUpdate.md)| Team object that needs to be added |

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="teamTeamIdTagsGet"></a>
# **teamTeamIdTagsGet**
> List&lt;Tag&gt; teamTeamIdTagsGet(apiKey, teamId)

Find tags of a team by ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TeamApi;


TeamApi apiInstance = new TeamApi();
String apiKey = "apiKey_example"; // String | 
Long teamId = 789L; // Long | ID of team whose campaigns need to be fetched
try {
    List<Tag> result = apiInstance.teamTeamIdTagsGet(apiKey, teamId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamApi#teamTeamIdTagsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**|  |
 **teamId** | **Long**| ID of team whose campaigns need to be fetched |

### Return type

[**List&lt;Tag&gt;**](Tag.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

