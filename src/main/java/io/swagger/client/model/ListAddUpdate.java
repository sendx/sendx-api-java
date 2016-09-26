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


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * ListAddUpdate
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-09-26T03:51:53.133Z")
public class ListAddUpdate   {
  @SerializedName("name")
  private String name = null;

  @SerializedName("type")
  private Integer type = null;

  @SerializedName("thankyou_from_name")
  private String thankyouFromName = null;

  @SerializedName("thankyou_from_email")
  private String thankyouFromEmail = null;

  @SerializedName("thankyou_mail_subject")
  private String thankyouMailSubject = null;

  @SerializedName("thankyou_mail_message")
  private String thankyouMailMessage = null;

  @SerializedName("confirm_from_name")
  private String confirmFromName = null;

  @SerializedName("confirm_from_email")
  private String confirmFromEmail = null;

  @SerializedName("confirm_mail_subject")
  private String confirmMailSubject = null;

  @SerializedName("confirm_mail_message")
  private String confirmMailMessage = null;

  @SerializedName("goodbye_from_name")
  private String goodbyeFromName = null;

  @SerializedName("goodbye_from_email")
  private String goodbyeFromEmail = null;

  @SerializedName("goodbye_mail_subject")
  private String goodbyeMailSubject = null;

  @SerializedName("goodbye_mail_message")
  private String goodbyeMailMessage = null;

  @SerializedName("send_thankyou_mail")
  private Boolean sendThankyouMail = null;

  @SerializedName("send_confirm_unsubscribe_mail")
  private Boolean sendConfirmUnsubscribeMail = null;

  @SerializedName("subscribe_success_page")
  private String subscribeSuccessPage = null;

  @SerializedName("confirm_success_page")
  private String confirmSuccessPage = null;

  @SerializedName("unsubscribe_success_page")
  private String unsubscribeSuccessPage = null;

  @SerializedName("team_id")
  private Integer teamId = null;

  public ListAddUpdate name(String name) {
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

  public ListAddUpdate type(Integer type) {
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

  public ListAddUpdate thankyouFromName(String thankyouFromName) {
    this.thankyouFromName = thankyouFromName;
    return this;
  }

   /**
   * Get thankyouFromName
   * @return thankyouFromName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getThankyouFromName() {
    return thankyouFromName;
  }

  public void setThankyouFromName(String thankyouFromName) {
    this.thankyouFromName = thankyouFromName;
  }

  public ListAddUpdate thankyouFromEmail(String thankyouFromEmail) {
    this.thankyouFromEmail = thankyouFromEmail;
    return this;
  }

   /**
   * Get thankyouFromEmail
   * @return thankyouFromEmail
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getThankyouFromEmail() {
    return thankyouFromEmail;
  }

  public void setThankyouFromEmail(String thankyouFromEmail) {
    this.thankyouFromEmail = thankyouFromEmail;
  }

  public ListAddUpdate thankyouMailSubject(String thankyouMailSubject) {
    this.thankyouMailSubject = thankyouMailSubject;
    return this;
  }

   /**
   * Get thankyouMailSubject
   * @return thankyouMailSubject
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getThankyouMailSubject() {
    return thankyouMailSubject;
  }

  public void setThankyouMailSubject(String thankyouMailSubject) {
    this.thankyouMailSubject = thankyouMailSubject;
  }

  public ListAddUpdate thankyouMailMessage(String thankyouMailMessage) {
    this.thankyouMailMessage = thankyouMailMessage;
    return this;
  }

   /**
   * Get thankyouMailMessage
   * @return thankyouMailMessage
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getThankyouMailMessage() {
    return thankyouMailMessage;
  }

  public void setThankyouMailMessage(String thankyouMailMessage) {
    this.thankyouMailMessage = thankyouMailMessage;
  }

  public ListAddUpdate confirmFromName(String confirmFromName) {
    this.confirmFromName = confirmFromName;
    return this;
  }

   /**
   * Get confirmFromName
   * @return confirmFromName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getConfirmFromName() {
    return confirmFromName;
  }

  public void setConfirmFromName(String confirmFromName) {
    this.confirmFromName = confirmFromName;
  }

  public ListAddUpdate confirmFromEmail(String confirmFromEmail) {
    this.confirmFromEmail = confirmFromEmail;
    return this;
  }

   /**
   * Get confirmFromEmail
   * @return confirmFromEmail
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getConfirmFromEmail() {
    return confirmFromEmail;
  }

  public void setConfirmFromEmail(String confirmFromEmail) {
    this.confirmFromEmail = confirmFromEmail;
  }

  public ListAddUpdate confirmMailSubject(String confirmMailSubject) {
    this.confirmMailSubject = confirmMailSubject;
    return this;
  }

   /**
   * Get confirmMailSubject
   * @return confirmMailSubject
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getConfirmMailSubject() {
    return confirmMailSubject;
  }

  public void setConfirmMailSubject(String confirmMailSubject) {
    this.confirmMailSubject = confirmMailSubject;
  }

  public ListAddUpdate confirmMailMessage(String confirmMailMessage) {
    this.confirmMailMessage = confirmMailMessage;
    return this;
  }

   /**
   * Get confirmMailMessage
   * @return confirmMailMessage
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getConfirmMailMessage() {
    return confirmMailMessage;
  }

  public void setConfirmMailMessage(String confirmMailMessage) {
    this.confirmMailMessage = confirmMailMessage;
  }

  public ListAddUpdate goodbyeFromName(String goodbyeFromName) {
    this.goodbyeFromName = goodbyeFromName;
    return this;
  }

   /**
   * Get goodbyeFromName
   * @return goodbyeFromName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getGoodbyeFromName() {
    return goodbyeFromName;
  }

  public void setGoodbyeFromName(String goodbyeFromName) {
    this.goodbyeFromName = goodbyeFromName;
  }

  public ListAddUpdate goodbyeFromEmail(String goodbyeFromEmail) {
    this.goodbyeFromEmail = goodbyeFromEmail;
    return this;
  }

   /**
   * Get goodbyeFromEmail
   * @return goodbyeFromEmail
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getGoodbyeFromEmail() {
    return goodbyeFromEmail;
  }

  public void setGoodbyeFromEmail(String goodbyeFromEmail) {
    this.goodbyeFromEmail = goodbyeFromEmail;
  }

  public ListAddUpdate goodbyeMailSubject(String goodbyeMailSubject) {
    this.goodbyeMailSubject = goodbyeMailSubject;
    return this;
  }

   /**
   * Get goodbyeMailSubject
   * @return goodbyeMailSubject
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getGoodbyeMailSubject() {
    return goodbyeMailSubject;
  }

  public void setGoodbyeMailSubject(String goodbyeMailSubject) {
    this.goodbyeMailSubject = goodbyeMailSubject;
  }

  public ListAddUpdate goodbyeMailMessage(String goodbyeMailMessage) {
    this.goodbyeMailMessage = goodbyeMailMessage;
    return this;
  }

   /**
   * Get goodbyeMailMessage
   * @return goodbyeMailMessage
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getGoodbyeMailMessage() {
    return goodbyeMailMessage;
  }

  public void setGoodbyeMailMessage(String goodbyeMailMessage) {
    this.goodbyeMailMessage = goodbyeMailMessage;
  }

  public ListAddUpdate sendThankyouMail(Boolean sendThankyouMail) {
    this.sendThankyouMail = sendThankyouMail;
    return this;
  }

   /**
   * Get sendThankyouMail
   * @return sendThankyouMail
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getSendThankyouMail() {
    return sendThankyouMail;
  }

  public void setSendThankyouMail(Boolean sendThankyouMail) {
    this.sendThankyouMail = sendThankyouMail;
  }

  public ListAddUpdate sendConfirmUnsubscribeMail(Boolean sendConfirmUnsubscribeMail) {
    this.sendConfirmUnsubscribeMail = sendConfirmUnsubscribeMail;
    return this;
  }

   /**
   * Get sendConfirmUnsubscribeMail
   * @return sendConfirmUnsubscribeMail
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getSendConfirmUnsubscribeMail() {
    return sendConfirmUnsubscribeMail;
  }

  public void setSendConfirmUnsubscribeMail(Boolean sendConfirmUnsubscribeMail) {
    this.sendConfirmUnsubscribeMail = sendConfirmUnsubscribeMail;
  }

  public ListAddUpdate subscribeSuccessPage(String subscribeSuccessPage) {
    this.subscribeSuccessPage = subscribeSuccessPage;
    return this;
  }

   /**
   * Get subscribeSuccessPage
   * @return subscribeSuccessPage
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSubscribeSuccessPage() {
    return subscribeSuccessPage;
  }

  public void setSubscribeSuccessPage(String subscribeSuccessPage) {
    this.subscribeSuccessPage = subscribeSuccessPage;
  }

  public ListAddUpdate confirmSuccessPage(String confirmSuccessPage) {
    this.confirmSuccessPage = confirmSuccessPage;
    return this;
  }

   /**
   * Get confirmSuccessPage
   * @return confirmSuccessPage
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getConfirmSuccessPage() {
    return confirmSuccessPage;
  }

  public void setConfirmSuccessPage(String confirmSuccessPage) {
    this.confirmSuccessPage = confirmSuccessPage;
  }

  public ListAddUpdate unsubscribeSuccessPage(String unsubscribeSuccessPage) {
    this.unsubscribeSuccessPage = unsubscribeSuccessPage;
    return this;
  }

   /**
   * Get unsubscribeSuccessPage
   * @return unsubscribeSuccessPage
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUnsubscribeSuccessPage() {
    return unsubscribeSuccessPage;
  }

  public void setUnsubscribeSuccessPage(String unsubscribeSuccessPage) {
    this.unsubscribeSuccessPage = unsubscribeSuccessPage;
  }

  public ListAddUpdate teamId(Integer teamId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListAddUpdate listAddUpdate = (ListAddUpdate) o;
    return Objects.equals(this.name, listAddUpdate.name) &&
        Objects.equals(this.type, listAddUpdate.type) &&
        Objects.equals(this.thankyouFromName, listAddUpdate.thankyouFromName) &&
        Objects.equals(this.thankyouFromEmail, listAddUpdate.thankyouFromEmail) &&
        Objects.equals(this.thankyouMailSubject, listAddUpdate.thankyouMailSubject) &&
        Objects.equals(this.thankyouMailMessage, listAddUpdate.thankyouMailMessage) &&
        Objects.equals(this.confirmFromName, listAddUpdate.confirmFromName) &&
        Objects.equals(this.confirmFromEmail, listAddUpdate.confirmFromEmail) &&
        Objects.equals(this.confirmMailSubject, listAddUpdate.confirmMailSubject) &&
        Objects.equals(this.confirmMailMessage, listAddUpdate.confirmMailMessage) &&
        Objects.equals(this.goodbyeFromName, listAddUpdate.goodbyeFromName) &&
        Objects.equals(this.goodbyeFromEmail, listAddUpdate.goodbyeFromEmail) &&
        Objects.equals(this.goodbyeMailSubject, listAddUpdate.goodbyeMailSubject) &&
        Objects.equals(this.goodbyeMailMessage, listAddUpdate.goodbyeMailMessage) &&
        Objects.equals(this.sendThankyouMail, listAddUpdate.sendThankyouMail) &&
        Objects.equals(this.sendConfirmUnsubscribeMail, listAddUpdate.sendConfirmUnsubscribeMail) &&
        Objects.equals(this.subscribeSuccessPage, listAddUpdate.subscribeSuccessPage) &&
        Objects.equals(this.confirmSuccessPage, listAddUpdate.confirmSuccessPage) &&
        Objects.equals(this.unsubscribeSuccessPage, listAddUpdate.unsubscribeSuccessPage) &&
        Objects.equals(this.teamId, listAddUpdate.teamId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, thankyouFromName, thankyouFromEmail, thankyouMailSubject, thankyouMailMessage, confirmFromName, confirmFromEmail, confirmMailSubject, confirmMailMessage, goodbyeFromName, goodbyeFromEmail, goodbyeMailSubject, goodbyeMailMessage, sendThankyouMail, sendConfirmUnsubscribeMail, subscribeSuccessPage, confirmSuccessPage, unsubscribeSuccessPage, teamId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListAddUpdate {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    thankyouFromName: ").append(toIndentedString(thankyouFromName)).append("\n");
    sb.append("    thankyouFromEmail: ").append(toIndentedString(thankyouFromEmail)).append("\n");
    sb.append("    thankyouMailSubject: ").append(toIndentedString(thankyouMailSubject)).append("\n");
    sb.append("    thankyouMailMessage: ").append(toIndentedString(thankyouMailMessage)).append("\n");
    sb.append("    confirmFromName: ").append(toIndentedString(confirmFromName)).append("\n");
    sb.append("    confirmFromEmail: ").append(toIndentedString(confirmFromEmail)).append("\n");
    sb.append("    confirmMailSubject: ").append(toIndentedString(confirmMailSubject)).append("\n");
    sb.append("    confirmMailMessage: ").append(toIndentedString(confirmMailMessage)).append("\n");
    sb.append("    goodbyeFromName: ").append(toIndentedString(goodbyeFromName)).append("\n");
    sb.append("    goodbyeFromEmail: ").append(toIndentedString(goodbyeFromEmail)).append("\n");
    sb.append("    goodbyeMailSubject: ").append(toIndentedString(goodbyeMailSubject)).append("\n");
    sb.append("    goodbyeMailMessage: ").append(toIndentedString(goodbyeMailMessage)).append("\n");
    sb.append("    sendThankyouMail: ").append(toIndentedString(sendThankyouMail)).append("\n");
    sb.append("    sendConfirmUnsubscribeMail: ").append(toIndentedString(sendConfirmUnsubscribeMail)).append("\n");
    sb.append("    subscribeSuccessPage: ").append(toIndentedString(subscribeSuccessPage)).append("\n");
    sb.append("    confirmSuccessPage: ").append(toIndentedString(confirmSuccessPage)).append("\n");
    sb.append("    unsubscribeSuccessPage: ").append(toIndentedString(unsubscribeSuccessPage)).append("\n");
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
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

