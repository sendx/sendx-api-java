/*
 * SendX REST API
 * **NOTE:** All API calls contain 2 parameters - 'api_key' and 'team_id'. These can be inferred from your settings page 'https://app.sendx.io/setting' under the sections 'Api Key' and 'Team Id' respectively.  SendX REST API has two methods:    * Identify   * Track    ## Identify API Method    Identify API Method is used to attach data to a visitor. If a contact is not yet created then we will create the contact. In case contact already exists then we update it.    **Example Request:**       ```json      {         email: \"john.doe@gmail.com\",         firstName: \"John\",         lastName: \"Doe\",         birthday: \"1989-03-03\",         customFields: {           \"Designation\": \"Software Engineer\",           \"Age\": \"27\",           \"Experience\": \"5\"         },         tags: [\"Developer\", \"API Team\"],      }   ```         Note that tags are an array of strings. In case they don't exist previously then API will create them and associate them with the contact.      Similarly if a custom field doesn't exist then it is first created and then associated with the contact along-with the corresponding value. In case custom field exists already then we simply update the value of it for the aforementioned contact.      We don't delete any of the properties based on identify call. What this means is that if for the same contact you did two API calls like:         **API Call A**        ```json      {         email: \"john.doe@gmail.com\",         firstName: \"John\",         birthday: \"1989-03-03\",         customFields: {           \"Designation\": \"Software Engineer\"         },         tags: [\"Developer\"],      }   ```         **API Call B**       ```json      {         email: \"john.doe@gmail.com\",         customFields: {           \"Age\": \"29\"         },         tags: [\"API Team\"],      }   ```         Then the final contact will have firstName as **John**, birthday as **1989-03-03** present. Also both tags **Developer** and **API Team** shall be present along with custom fields **Designation** and **Age**.         **Properties:**      * **firstName**: type string   * **lastName**: type string   * **email**: type string     * **company**: type string     * **birthday**: type string with format **YYYY-MM-DD** eg: 2016-11-21     * **customFields**: type map[string]string      * **tags**: type array of string          **Response:**       ```json      {         \"status\": \"200\",         \"message\": \"OK\",         \"data\": {           \"encryptedTeamId\": \"CLdh9Ig5GLIN1u8gTRvoja\",           \"encryptedId\": \"c9QF63nrBenCaAXe660byz\",           \"tags\": [             \"API Team\",             \"Tech\"           ],           \"firstName\": \"John\",           \"lastName\": \"Doe\",           \"email\": \"john.doe@gmail.com\",           \"company\": \"\",           \"birthday\": \"1989-03-03\",           \"customFields\": {             \"Age\": \"29\",             \"Designation\": \"Software Engineer\"           }           }        }   ```         ## Track API Method         Track API Method is used to associate **tags** with a contact. You can have automation rules based on tag addition and they will get executed. For eg:      * **On user registration** tag start onboarding drip for him / her.   * **Account Upgrade** tag start add user to paid user list and start account expansion drip.       **Response:**       ```json      {         \"status\": \"200\",         \"message\": \"OK\",         \"data\": \"success\"      }   ``` 
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
import io.swagger.client.model.Contact;

/**
 * ContactResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-11-20T16:21:28.898Z")
public class ContactResponse {
  @SerializedName("status")
  private String status = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("data")
  private Contact data = null;

  public ContactResponse status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ContactResponse message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ContactResponse data(Contact data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(example = "null", value = "")
  public Contact getData() {
    return data;
  }

  public void setData(Contact data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactResponse contactResponse = (ContactResponse) o;
    return Objects.equals(this.status, contactResponse.status) &&
        Objects.equals(this.message, contactResponse.message) &&
        Objects.equals(this.data, contactResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, message, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactResponse {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
