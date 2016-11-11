/**
 * SendX API
 * SendX is built on the simple tenet that users must have open access to their data. SendX API is the first step in that direction. To cite some examples:   - Add new contacts or update them   - Adding/updating custom fields to each contact on the fly   - Add tracking information by adding tags to contacts  As companies grow big, custom use cases around email marketing also crop up. SendX API ensures that SendX platform is able to satisfy such unforeseen use cases. They may range from building custom reporting dashboard to tagging contacts with custom attributes or triggering emails based on recommendation algorithm.  We do our best to have all our URLs be [RESTful](http://en.wikipedia.org/wiki/Representational_state_transfer). Every endpoint (URL) may support one of four different http verbs. GET requests fetch information about an object, POST requests create objects, PUT requests update objects, and finally DELETE requests will delete objects.  Also all API calls besides:   - Subscribe / unsubscribe signup form required **api_key** to be passed as **header**   ### The Envelope Every response is contained by an envelope. That is, each response has a predictable set of keys with which you can expect to interact: ```json {     \"status\": \"200\",     \"message\": \"OK\",     \"data\"\": [        {          ...        },        .        .        .     ] } ```  #### Status The status key is used to communicate extra information about the response to the developer. If all goes well, you'll only ever see a code key with value 200. However, sometimes things go wrong, and in that case you might see a response like: ```json {     \"status\": \"404\" } ```  #### Data The data key is the meat of the response. It may be a list containing single object or multiple objects  #### Message This returns back human readable message. This is specially useful to make sense in case of error scenarios. 
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

import java.beans.Beans;
import java.util.Map;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Contact
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-11-02T08:10:29.251Z")
public class Contact   {
  @SerializedName("encryptedTeamId")
  private String encryptedTeamId = null;

  @SerializedName("firstName")
  private String firstName = null;

  @SerializedName("lastName")
  private String lastName = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("company")
  private String company = null;

  @SerializedName("birthday")
  private String birthday = null;

  @SerializedName("customFields")
  private Map<String, String> customFields = null;

  public Contact encryptedTeamId(String encryptedTeamId) {
    this.encryptedTeamId = encryptedTeamId;
    return this;
  }

   /**
   * Get encryptedTeamId
   * @return encryptedTeamId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEncryptedTeamId() {
    return encryptedTeamId;
  }

  public void setEncryptedTeamId(String encryptedTeamId) {
    this.encryptedTeamId = encryptedTeamId;
  }

  public Contact firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Contact lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Contact email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Contact company(String company) {
    this.company = company;
    return this;
  }

   /**
   * Get company
   * @return company
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public Contact birthday(String birthday) {
    this.birthday = birthday;
    return this;
  }

  /**
   * Get birthday
   * @return birthday
   **/
  @ApiModelProperty(example = "null", value = "")
  public String getBirthday() {
    return birthday;
  }

  public void setBirthday(String birthday) {
    this.birthday = birthday;
  }

  public Contact customFields(Map<String, String> customFields) {
    this.customFields = customFields;
    return this;
  }

  /**
   * Get customFields
   * @return customFields
   **/
  @ApiModelProperty(example = "null", value = "")
  public Map<String, String> getCustomFields() {
    return customFields;
  }

  public void setCustomFields(Map<String, String> customFields) {
    this.customFields = customFields;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Contact contact = (Contact) o;
    return Objects.equals(this.encryptedTeamId, contact.encryptedTeamId) &&
        Objects.equals(this.firstName, contact.firstName) &&
        Objects.equals(this.lastName, contact.lastName) &&
        Objects.equals(this.email, contact.email) &&
        Objects.equals(this.company, contact.company) &&
        Objects.equals(this.birthday, contact.birthday) &&
        Objects.equals(this.customFields, contact.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encryptedTeamId, firstName, lastName, email, company, birthday, customFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Contact {\n");
    
    sb.append("    encryptedTeamId: ").append(toIndentedString(encryptedTeamId)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    birthday: ").append(toIndentedString(birthday)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
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

