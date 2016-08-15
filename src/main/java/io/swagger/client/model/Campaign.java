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


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * Campaign
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-08-15T11:32:24.408Z")
public class Campaign   {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("status")
  private Integer status = null;

  @SerializedName("type")
  private Integer type = null;

  @SerializedName("user_segment")
  private String userSegment = null;

  @SerializedName("campaign_segment")
  private String campaignSegment = null;

  @SerializedName("schedule_condition")
  private String scheduleCondition = null;

  @SerializedName("time_condition")
  private String timeCondition = null;

  @SerializedName("timezone")
  private String timezone = null;

  @SerializedName("team_id")
  private Integer teamId = null;

  @SerializedName("provider_id")
  private Integer providerId = null;

  @SerializedName("list_ids")
  private List<Integer> listIds = new ArrayList<Integer>();

  public Campaign id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Campaign name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Campaign status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public Campaign type(Integer type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }

  public Campaign userSegment(String userSegment) {
    this.userSegment = userSegment;
    return this;
  }

   /**
   * Get userSegment
   * @return userSegment
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUserSegment() {
    return userSegment;
  }

  public void setUserSegment(String userSegment) {
    this.userSegment = userSegment;
  }

  public Campaign campaignSegment(String campaignSegment) {
    this.campaignSegment = campaignSegment;
    return this;
  }

   /**
   * Get campaignSegment
   * @return campaignSegment
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCampaignSegment() {
    return campaignSegment;
  }

  public void setCampaignSegment(String campaignSegment) {
    this.campaignSegment = campaignSegment;
  }

  public Campaign scheduleCondition(String scheduleCondition) {
    this.scheduleCondition = scheduleCondition;
    return this;
  }

   /**
   * Get scheduleCondition
   * @return scheduleCondition
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getScheduleCondition() {
    return scheduleCondition;
  }

  public void setScheduleCondition(String scheduleCondition) {
    this.scheduleCondition = scheduleCondition;
  }

  public Campaign timeCondition(String timeCondition) {
    this.timeCondition = timeCondition;
    return this;
  }

   /**
   * Get timeCondition
   * @return timeCondition
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTimeCondition() {
    return timeCondition;
  }

  public void setTimeCondition(String timeCondition) {
    this.timeCondition = timeCondition;
  }

  public Campaign timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * Get timezone
   * @return timezone
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public Campaign teamId(Integer teamId) {
    this.teamId = teamId;
    return this;
  }

   /**
   * Get teamId
   * @return teamId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getTeamId() {
    return teamId;
  }

  public void setTeamId(Integer teamId) {
    this.teamId = teamId;
  }

  public Campaign providerId(Integer providerId) {
    this.providerId = providerId;
    return this;
  }

   /**
   * Get providerId
   * @return providerId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getProviderId() {
    return providerId;
  }

  public void setProviderId(Integer providerId) {
    this.providerId = providerId;
  }

  public Campaign listIds(List<Integer> listIds) {
    this.listIds = listIds;
    return this;
  }

  public Campaign addListIdsItem(Integer listIdsItem) {
    this.listIds.add(listIdsItem);
    return this;
  }

   /**
   * Get listIds
   * @return listIds
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Integer> getListIds() {
    return listIds;
  }

  public void setListIds(List<Integer> listIds) {
    this.listIds = listIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Campaign campaign = (Campaign) o;
    return Objects.equals(this.id, campaign.id) &&
        Objects.equals(this.name, campaign.name) &&
        Objects.equals(this.status, campaign.status) &&
        Objects.equals(this.type, campaign.type) &&
        Objects.equals(this.userSegment, campaign.userSegment) &&
        Objects.equals(this.campaignSegment, campaign.campaignSegment) &&
        Objects.equals(this.scheduleCondition, campaign.scheduleCondition) &&
        Objects.equals(this.timeCondition, campaign.timeCondition) &&
        Objects.equals(this.timezone, campaign.timezone) &&
        Objects.equals(this.teamId, campaign.teamId) &&
        Objects.equals(this.providerId, campaign.providerId) &&
        Objects.equals(this.listIds, campaign.listIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, status, type, userSegment, campaignSegment, scheduleCondition, timeCondition, timezone, teamId, providerId, listIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Campaign {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    userSegment: ").append(toIndentedString(userSegment)).append("\n");
    sb.append("    campaignSegment: ").append(toIndentedString(campaignSegment)).append("\n");
    sb.append("    scheduleCondition: ").append(toIndentedString(scheduleCondition)).append("\n");
    sb.append("    timeCondition: ").append(toIndentedString(timeCondition)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
    sb.append("    providerId: ").append(toIndentedString(providerId)).append("\n");
    sb.append("    listIds: ").append(toIndentedString(listIds)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
