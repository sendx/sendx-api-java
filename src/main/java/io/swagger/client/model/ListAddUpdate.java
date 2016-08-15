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


/**
 * ListAddUpdate
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-08-15T11:32:24.408Z")
public class ListAddUpdate   {
  @SerializedName("encryptedId")
  private String encryptedId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("type")
  private Integer type = null;

  @SerializedName("thankyou_from_email")
  private String thankyouFromEmail = null;

  @SerializedName("thankyouMailSubject")
  private String thankyouMailSubject = null;

  @SerializedName("thankyouMailMessage")
  private String thankyouMailMessage = null;

  @SerializedName("confirm_from_email")
  private String confirmFromEmail = null;

  @SerializedName("confirmMailSubject")
  private String confirmMailSubject = null;

  @SerializedName("confirmMailMessage")
  private String confirmMailMessage = null;

  @SerializedName("goodbye_from_email")
  private String goodbyeFromEmail = null;

  @SerializedName("goodbyeMailSubject")
  private String goodbyeMailSubject = null;

  @SerializedName("goodbyeMailMessage")
  private String goodbyeMailMessage = null;

  @SerializedName("sendThankYouMail")
  private Boolean sendThankYouMail = null;

  @SerializedName("sendConfirmUnsubscribeMail")
  private Boolean sendConfirmUnsubscribeMail = null;

  @SerializedName("subscribeSuccessPage")
  private String subscribeSuccessPage = null;

  @SerializedName("confirmSuccessPage")
  private String confirmSuccessPage = null;

  @SerializedName("unsubscribeSuccessPage")
  private String unsubscribeSuccessPage = null;

  @SerializedName("team_id")
  private Integer teamId = null;

  @SerializedName("subscribed")
  private Integer subscribed = null;

  @SerializedName("confirmed")
  private Integer confirmed = null;

  @SerializedName("unsubscribed")
  private Integer unsubscribed = null;

  @SerializedName("bounced")
  private Integer bounced = null;

  @SerializedName("marked_spam")
  private Integer markedSpam = null;

  public ListAddUpdate encryptedId(String encryptedId) {
    this.encryptedId = encryptedId;
    return this;
  }

   /**
   * Get encryptedId
   * @return encryptedId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEncryptedId() {
    return encryptedId;
  }

  public void setEncryptedId(String encryptedId) {
    this.encryptedId = encryptedId;
  }

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

  public ListAddUpdate sendThankYouMail(Boolean sendThankYouMail) {
    this.sendThankYouMail = sendThankYouMail;
    return this;
  }

   /**
   * Get sendThankYouMail
   * @return sendThankYouMail
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getSendThankYouMail() {
    return sendThankYouMail;
  }

  public void setSendThankYouMail(Boolean sendThankYouMail) {
    this.sendThankYouMail = sendThankYouMail;
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

  public ListAddUpdate subscribed(Integer subscribed) {
    this.subscribed = subscribed;
    return this;
  }

   /**
   * Get subscribed
   * @return subscribed
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getSubscribed() {
    return subscribed;
  }

  public void setSubscribed(Integer subscribed) {
    this.subscribed = subscribed;
  }

  public ListAddUpdate confirmed(Integer confirmed) {
    this.confirmed = confirmed;
    return this;
  }

   /**
   * Get confirmed
   * @return confirmed
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getConfirmed() {
    return confirmed;
  }

  public void setConfirmed(Integer confirmed) {
    this.confirmed = confirmed;
  }

  public ListAddUpdate unsubscribed(Integer unsubscribed) {
    this.unsubscribed = unsubscribed;
    return this;
  }

   /**
   * Get unsubscribed
   * @return unsubscribed
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getUnsubscribed() {
    return unsubscribed;
  }

  public void setUnsubscribed(Integer unsubscribed) {
    this.unsubscribed = unsubscribed;
  }

  public ListAddUpdate bounced(Integer bounced) {
    this.bounced = bounced;
    return this;
  }

   /**
   * Get bounced
   * @return bounced
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getBounced() {
    return bounced;
  }

  public void setBounced(Integer bounced) {
    this.bounced = bounced;
  }

  public ListAddUpdate markedSpam(Integer markedSpam) {
    this.markedSpam = markedSpam;
    return this;
  }

   /**
   * Get markedSpam
   * @return markedSpam
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getMarkedSpam() {
    return markedSpam;
  }

  public void setMarkedSpam(Integer markedSpam) {
    this.markedSpam = markedSpam;
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
    return Objects.equals(this.encryptedId, listAddUpdate.encryptedId) &&
        Objects.equals(this.name, listAddUpdate.name) &&
        Objects.equals(this.type, listAddUpdate.type) &&
        Objects.equals(this.thankyouFromEmail, listAddUpdate.thankyouFromEmail) &&
        Objects.equals(this.thankyouMailSubject, listAddUpdate.thankyouMailSubject) &&
        Objects.equals(this.thankyouMailMessage, listAddUpdate.thankyouMailMessage) &&
        Objects.equals(this.confirmFromEmail, listAddUpdate.confirmFromEmail) &&
        Objects.equals(this.confirmMailSubject, listAddUpdate.confirmMailSubject) &&
        Objects.equals(this.confirmMailMessage, listAddUpdate.confirmMailMessage) &&
        Objects.equals(this.goodbyeFromEmail, listAddUpdate.goodbyeFromEmail) &&
        Objects.equals(this.goodbyeMailSubject, listAddUpdate.goodbyeMailSubject) &&
        Objects.equals(this.goodbyeMailMessage, listAddUpdate.goodbyeMailMessage) &&
        Objects.equals(this.sendThankYouMail, listAddUpdate.sendThankYouMail) &&
        Objects.equals(this.sendConfirmUnsubscribeMail, listAddUpdate.sendConfirmUnsubscribeMail) &&
        Objects.equals(this.subscribeSuccessPage, listAddUpdate.subscribeSuccessPage) &&
        Objects.equals(this.confirmSuccessPage, listAddUpdate.confirmSuccessPage) &&
        Objects.equals(this.unsubscribeSuccessPage, listAddUpdate.unsubscribeSuccessPage) &&
        Objects.equals(this.teamId, listAddUpdate.teamId) &&
        Objects.equals(this.subscribed, listAddUpdate.subscribed) &&
        Objects.equals(this.confirmed, listAddUpdate.confirmed) &&
        Objects.equals(this.unsubscribed, listAddUpdate.unsubscribed) &&
        Objects.equals(this.bounced, listAddUpdate.bounced) &&
        Objects.equals(this.markedSpam, listAddUpdate.markedSpam);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encryptedId, name, type, thankyouFromEmail, thankyouMailSubject, thankyouMailMessage, confirmFromEmail, confirmMailSubject, confirmMailMessage, goodbyeFromEmail, goodbyeMailSubject, goodbyeMailMessage, sendThankYouMail, sendConfirmUnsubscribeMail, subscribeSuccessPage, confirmSuccessPage, unsubscribeSuccessPage, teamId, subscribed, confirmed, unsubscribed, bounced, markedSpam);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListAddUpdate {\n");
    
    sb.append("    encryptedId: ").append(toIndentedString(encryptedId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    thankyouFromEmail: ").append(toIndentedString(thankyouFromEmail)).append("\n");
    sb.append("    thankyouMailSubject: ").append(toIndentedString(thankyouMailSubject)).append("\n");
    sb.append("    thankyouMailMessage: ").append(toIndentedString(thankyouMailMessage)).append("\n");
    sb.append("    confirmFromEmail: ").append(toIndentedString(confirmFromEmail)).append("\n");
    sb.append("    confirmMailSubject: ").append(toIndentedString(confirmMailSubject)).append("\n");
    sb.append("    confirmMailMessage: ").append(toIndentedString(confirmMailMessage)).append("\n");
    sb.append("    goodbyeFromEmail: ").append(toIndentedString(goodbyeFromEmail)).append("\n");
    sb.append("    goodbyeMailSubject: ").append(toIndentedString(goodbyeMailSubject)).append("\n");
    sb.append("    goodbyeMailMessage: ").append(toIndentedString(goodbyeMailMessage)).append("\n");
    sb.append("    sendThankYouMail: ").append(toIndentedString(sendThankYouMail)).append("\n");
    sb.append("    sendConfirmUnsubscribeMail: ").append(toIndentedString(sendConfirmUnsubscribeMail)).append("\n");
    sb.append("    subscribeSuccessPage: ").append(toIndentedString(subscribeSuccessPage)).append("\n");
    sb.append("    confirmSuccessPage: ").append(toIndentedString(confirmSuccessPage)).append("\n");
    sb.append("    unsubscribeSuccessPage: ").append(toIndentedString(unsubscribeSuccessPage)).append("\n");
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
    sb.append("    subscribed: ").append(toIndentedString(subscribed)).append("\n");
    sb.append("    confirmed: ").append(toIndentedString(confirmed)).append("\n");
    sb.append("    unsubscribed: ").append(toIndentedString(unsubscribed)).append("\n");
    sb.append("    bounced: ").append(toIndentedString(bounced)).append("\n");
    sb.append("    markedSpam: ").append(toIndentedString(markedSpam)).append("\n");
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

