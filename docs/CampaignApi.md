# CampaignApi

All URIs are relative to *http://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**campaignCampaignIdDelete**](CampaignApi.md#campaignCampaignIdDelete) | **DELETE** /campaign/{campaignId} | Deletes a campaign
[**campaignCampaignIdGet**](CampaignApi.md#campaignCampaignIdGet) | **GET** /campaign/{campaignId} | Find campaign by ID
[**campaignCampaignIdPut**](CampaignApi.md#campaignCampaignIdPut) | **PUT** /campaign/{campaignId} | Update a campaign by ID
[**campaignGet**](CampaignApi.md#campaignGet) | **GET** /campaign | Get information about all campaigns
[**campaignPost**](CampaignApi.md#campaignPost) | **POST** /campaign | Add a new campaign


<a name="campaignCampaignIdDelete"></a>
# **campaignCampaignIdDelete**
> campaignCampaignIdDelete(apiKey, campaignId)

Deletes a campaign



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CampaignApi;


CampaignApi apiInstance = new CampaignApi();
String apiKey = "apiKey_example"; // String | 
Long campaignId = 789L; // Long | Campaign ID to delete
try {
    apiInstance.campaignCampaignIdDelete(apiKey, campaignId);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignApi#campaignCampaignIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**|  |
 **campaignId** | **Long**| Campaign ID to delete |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="campaignCampaignIdGet"></a>
# **campaignCampaignIdGet**
> Campaign campaignCampaignIdGet(apiKey, campaignId)

Find campaign by ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CampaignApi;


CampaignApi apiInstance = new CampaignApi();
String apiKey = "apiKey_example"; // String | 
Long campaignId = 789L; // Long | ID of campaign that needs to be fetched
try {
    Campaign result = apiInstance.campaignCampaignIdGet(apiKey, campaignId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignApi#campaignCampaignIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**|  |
 **campaignId** | **Long**| ID of campaign that needs to be fetched |

### Return type

[**Campaign**](Campaign.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="campaignCampaignIdPut"></a>
# **campaignCampaignIdPut**
> InlineResponse2002 campaignCampaignIdPut(apiKey, campaignId, body)

Update a campaign by ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CampaignApi;


CampaignApi apiInstance = new CampaignApi();
String apiKey = "apiKey_example"; // String | 
Long campaignId = 789L; // Long | ID of campaign that needs to be updated
CampaignAddUpdate body = new CampaignAddUpdate(); // CampaignAddUpdate | Campaign object that needs to be added
try {
    InlineResponse2002 result = apiInstance.campaignCampaignIdPut(apiKey, campaignId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignApi#campaignCampaignIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**|  |
 **campaignId** | **Long**| ID of campaign that needs to be updated |
 **body** | [**CampaignAddUpdate**](CampaignAddUpdate.md)| Campaign object that needs to be added |

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="campaignGet"></a>
# **campaignGet**
> InlineResponse200 campaignGet(apiKey)

Get information about all campaigns



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CampaignApi;


CampaignApi apiInstance = new CampaignApi();
String apiKey = "apiKey_example"; // String | 
try {
    InlineResponse200 result = apiInstance.campaignGet(apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignApi#campaignGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**|  |

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="campaignPost"></a>
# **campaignPost**
> InlineResponse2001 campaignPost(apiKey, body)

Add a new campaign



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CampaignApi;


CampaignApi apiInstance = new CampaignApi();
String apiKey = "apiKey_example"; // String | 
CampaignAddUpdate body = new CampaignAddUpdate(); // CampaignAddUpdate | Campaign object that needs to be added
try {
    InlineResponse2001 result = apiInstance.campaignPost(apiKey, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignApi#campaignPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**|  |
 **body** | [**CampaignAddUpdate**](CampaignAddUpdate.md)| Campaign object that needs to be added |

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

