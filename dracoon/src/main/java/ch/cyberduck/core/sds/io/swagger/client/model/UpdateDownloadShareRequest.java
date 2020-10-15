/*
 * DRACOON API
 * REST Web Services for DRACOON<br>built at: 2020-10-14 12:14:23<br><br>This page provides an overview of all available and documented DRACOON APIs, which are grouped by tags.<br>Each tag provides a collection of APIs that are intended for a specific area of the DRACOON.<br><br><a title='Developer Information' href='https://developer.dracoon.com'>Developer Information</a>&emsp;&emsp;<a title='Get SDKs on GitHub' href='https://github.com/dracoon'>Get SDKs on GitHub</a><br><br><a title='Terms of service' href='https://www.dracoon.com/terms/general-terms-and-conditions/'>Terms of service</a>
 *
 * OpenAPI spec version: 4.24.0-SNAPSHOT
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package ch.cyberduck.core.sds.io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import ch.cyberduck.core.sds.io.swagger.client.model.ObjectExpiration;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * Request model for updating a Download Share
 */
@Schema(description = "Request model for updating a Download Share")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-10-15T15:35:23.522373+02:00[Europe/Zurich]")
public class UpdateDownloadShareRequest {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("expiration")
  private ObjectExpiration expiration = null;

  @JsonProperty("notes")
  private String notes = null;

  @JsonProperty("internalNotes")
  private String internalNotes = null;

  @JsonProperty("showCreatorName")
  private Boolean showCreatorName = null;

  @JsonProperty("showCreatorUsername")
  private Boolean showCreatorUsername = null;

  @JsonProperty("maxDownloads")
  private Integer maxDownloads = null;

  @JsonProperty("textMessageRecipients")
  private List<String> textMessageRecipients = null;

  @JsonProperty("receiverLanguage")
  private String receiverLanguage = null;

  @JsonProperty("defaultCountry")
  private String defaultCountry = null;

  @JsonProperty("resetPassword")
  private Boolean resetPassword = null;

  @JsonProperty("resetMaxDownloads")
  private Boolean resetMaxDownloads = null;

  @JsonProperty("notifyCreator")
  private Boolean notifyCreator = null;

  public UpdateDownloadShareRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Alias name
   * @return name
  **/
  @Schema(description = "Alias name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UpdateDownloadShareRequest password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Access password, not allowed for encrypted shares
   * @return password
  **/
  @Schema(description = "Access password, not allowed for encrypted shares")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public UpdateDownloadShareRequest expiration(ObjectExpiration expiration) {
    this.expiration = expiration;
    return this;
  }

   /**
   * Get expiration
   * @return expiration
  **/
  @Schema(description = "")
  public ObjectExpiration getExpiration() {
    return expiration;
  }

  public void setExpiration(ObjectExpiration expiration) {
    this.expiration = expiration;
  }

  public UpdateDownloadShareRequest notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * User notes
   * @return notes
  **/
  @Schema(description = "User notes")
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public UpdateDownloadShareRequest internalNotes(String internalNotes) {
    this.internalNotes = internalNotes;
    return this;
  }

   /**
   * &amp;#128640; Since v4.11.0  Internal notes
   * @return internalNotes
  **/
  @Schema(description = "&#128640; Since v4.11.0  Internal notes")
  public String getInternalNotes() {
    return internalNotes;
  }

  public void setInternalNotes(String internalNotes) {
    this.internalNotes = internalNotes;
  }

  public UpdateDownloadShareRequest showCreatorName(Boolean showCreatorName) {
    this.showCreatorName = showCreatorName;
    return this;
  }

   /**
   * Show creator first and last name.
   * @return showCreatorName
  **/
  @Schema(description = "Show creator first and last name.")
  public Boolean isShowCreatorName() {
    return showCreatorName;
  }

  public void setShowCreatorName(Boolean showCreatorName) {
    this.showCreatorName = showCreatorName;
  }

  public UpdateDownloadShareRequest showCreatorUsername(Boolean showCreatorUsername) {
    this.showCreatorUsername = showCreatorUsername;
    return this;
  }

   /**
   * Show creator email address.
   * @return showCreatorUsername
  **/
  @Schema(description = "Show creator email address.")
  public Boolean isShowCreatorUsername() {
    return showCreatorUsername;
  }

  public void setShowCreatorUsername(Boolean showCreatorUsername) {
    this.showCreatorUsername = showCreatorUsername;
  }

  public UpdateDownloadShareRequest maxDownloads(Integer maxDownloads) {
    this.maxDownloads = maxDownloads;
    return this;
  }

   /**
   * Max allowed downloads
   * @return maxDownloads
  **/
  @Schema(description = "Max allowed downloads")
  public Integer getMaxDownloads() {
    return maxDownloads;
  }

  public void setMaxDownloads(Integer maxDownloads) {
    this.maxDownloads = maxDownloads;
  }

  public UpdateDownloadShareRequest textMessageRecipients(List<String> textMessageRecipients) {
    this.textMessageRecipients = textMessageRecipients;
    return this;
  }

  public UpdateDownloadShareRequest addTextMessageRecipientsItem(String textMessageRecipientsItem) {
    if (this.textMessageRecipients == null) {
      this.textMessageRecipients = new ArrayList<>();
    }
    this.textMessageRecipients.add(textMessageRecipientsItem);
    return this;
  }

   /**
   * List of recipient FQTNs  E.123 / E.164 Format
   * @return textMessageRecipients
  **/
  @Schema(description = "List of recipient FQTNs  E.123 / E.164 Format")
  public List<String> getTextMessageRecipients() {
    return textMessageRecipients;
  }

  public void setTextMessageRecipients(List<String> textMessageRecipients) {
    this.textMessageRecipients = textMessageRecipients;
  }

  public UpdateDownloadShareRequest receiverLanguage(String receiverLanguage) {
    this.receiverLanguage = receiverLanguage;
    return this;
  }

   /**
   * Language tag for messages to receiver
   * @return receiverLanguage
  **/
  @Schema(description = "Language tag for messages to receiver")
  public String getReceiverLanguage() {
    return receiverLanguage;
  }

  public void setReceiverLanguage(String receiverLanguage) {
    this.receiverLanguage = receiverLanguage;
  }

  public UpdateDownloadShareRequest defaultCountry(String defaultCountry) {
    this.defaultCountry = defaultCountry;
    return this;
  }

   /**
   * Country shorthand symbol (cf. ISO 3166-2)
   * @return defaultCountry
  **/
  @Schema(description = "Country shorthand symbol (cf. ISO 3166-2)")
  public String getDefaultCountry() {
    return defaultCountry;
  }

  public void setDefaultCountry(String defaultCountry) {
    this.defaultCountry = defaultCountry;
  }

  public UpdateDownloadShareRequest resetPassword(Boolean resetPassword) {
    this.resetPassword = resetPassword;
    return this;
  }

   /**
   * Set &#x27;true&#x27; to reset &#x27;password&#x27; for Download Share.
   * @return resetPassword
  **/
  @Schema(description = "Set 'true' to reset 'password' for Download Share.")
  public Boolean isResetPassword() {
    return resetPassword;
  }

  public void setResetPassword(Boolean resetPassword) {
    this.resetPassword = resetPassword;
  }

  public UpdateDownloadShareRequest resetMaxDownloads(Boolean resetMaxDownloads) {
    this.resetMaxDownloads = resetMaxDownloads;
    return this;
  }

   /**
   * Set &#x27;true&#x27; to reset &#x27;maxDownloads&#x27; for Download Share.
   * @return resetMaxDownloads
  **/
  @Schema(description = "Set 'true' to reset 'maxDownloads' for Download Share.")
  public Boolean isResetMaxDownloads() {
    return resetMaxDownloads;
  }

  public void setResetMaxDownloads(Boolean resetMaxDownloads) {
    this.resetMaxDownloads = resetMaxDownloads;
  }

  public UpdateDownloadShareRequest notifyCreator(Boolean notifyCreator) {
    this.notifyCreator = notifyCreator;
    return this;
  }

   /**
   * &amp;#128679; Deprecated since v4.20.0  Notify creator on every download.
   * @return notifyCreator
  **/
  @Schema(description = "&#128679; Deprecated since v4.20.0  Notify creator on every download.")
  public Boolean isNotifyCreator() {
    return notifyCreator;
  }

  public void setNotifyCreator(Boolean notifyCreator) {
    this.notifyCreator = notifyCreator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateDownloadShareRequest updateDownloadShareRequest = (UpdateDownloadShareRequest) o;
    return Objects.equals(this.name, updateDownloadShareRequest.name) &&
        Objects.equals(this.password, updateDownloadShareRequest.password) &&
        Objects.equals(this.expiration, updateDownloadShareRequest.expiration) &&
        Objects.equals(this.notes, updateDownloadShareRequest.notes) &&
        Objects.equals(this.internalNotes, updateDownloadShareRequest.internalNotes) &&
        Objects.equals(this.showCreatorName, updateDownloadShareRequest.showCreatorName) &&
        Objects.equals(this.showCreatorUsername, updateDownloadShareRequest.showCreatorUsername) &&
        Objects.equals(this.maxDownloads, updateDownloadShareRequest.maxDownloads) &&
        Objects.equals(this.textMessageRecipients, updateDownloadShareRequest.textMessageRecipients) &&
        Objects.equals(this.receiverLanguage, updateDownloadShareRequest.receiverLanguage) &&
        Objects.equals(this.defaultCountry, updateDownloadShareRequest.defaultCountry) &&
        Objects.equals(this.resetPassword, updateDownloadShareRequest.resetPassword) &&
        Objects.equals(this.resetMaxDownloads, updateDownloadShareRequest.resetMaxDownloads) &&
        Objects.equals(this.notifyCreator, updateDownloadShareRequest.notifyCreator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, password, expiration, notes, internalNotes, showCreatorName, showCreatorUsername, maxDownloads, textMessageRecipients, receiverLanguage, defaultCountry, resetPassword, resetMaxDownloads, notifyCreator);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateDownloadShareRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    internalNotes: ").append(toIndentedString(internalNotes)).append("\n");
    sb.append("    showCreatorName: ").append(toIndentedString(showCreatorName)).append("\n");
    sb.append("    showCreatorUsername: ").append(toIndentedString(showCreatorUsername)).append("\n");
    sb.append("    maxDownloads: ").append(toIndentedString(maxDownloads)).append("\n");
    sb.append("    textMessageRecipients: ").append(toIndentedString(textMessageRecipients)).append("\n");
    sb.append("    receiverLanguage: ").append(toIndentedString(receiverLanguage)).append("\n");
    sb.append("    defaultCountry: ").append(toIndentedString(defaultCountry)).append("\n");
    sb.append("    resetPassword: ").append(toIndentedString(resetPassword)).append("\n");
    sb.append("    resetMaxDownloads: ").append(toIndentedString(resetMaxDownloads)).append("\n");
    sb.append("    notifyCreator: ").append(toIndentedString(notifyCreator)).append("\n");
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
