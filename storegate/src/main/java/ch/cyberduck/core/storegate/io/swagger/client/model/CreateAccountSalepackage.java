/*
 * Storegate.Web
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v4
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ch.cyberduck.core.storegate.io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * A CreateAccountSalepackageRequest object
 */
@ApiModel(description = "A CreateAccountSalepackageRequest object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-08T17:57:06.518+02:00")
public class CreateAccountSalepackage {
  @JsonProperty("partnerId")
  private String partnerId = null;

  @JsonProperty("retailerId")
  private String retailerId = null;

  @JsonProperty("salepackageId")
  private String salepackageId = null;

  @JsonProperty("trialId")
  private String trialId = null;

  @JsonProperty("campaignId")
  private String campaignId = null;

  @JsonProperty("storageId")
  private String storageId = null;

  @JsonProperty("multiId")
  private String multiId = null;

  @JsonProperty("backupId")
  private String backupId = null;

  @JsonProperty("syncId")
  private String syncId = null;

  @JsonProperty("bankIDId")
  private String bankIDId = null;

  public CreateAccountSalepackage partnerId(String partnerId) {
    this.partnerId = partnerId;
    return this;
  }

   /**
   * PartnerId
   * @return partnerId
  **/
  @ApiModelProperty(value = "PartnerId")
  public String getPartnerId() {
    return partnerId;
  }

  public void setPartnerId(String partnerId) {
    this.partnerId = partnerId;
  }

  public CreateAccountSalepackage retailerId(String retailerId) {
    this.retailerId = retailerId;
    return this;
  }

   /**
   * Optional RetailerId
   * @return retailerId
  **/
  @ApiModelProperty(value = "Optional RetailerId")
  public String getRetailerId() {
    return retailerId;
  }

  public void setRetailerId(String retailerId) {
    this.retailerId = retailerId;
  }

  public CreateAccountSalepackage salepackageId(String salepackageId) {
    this.salepackageId = salepackageId;
    return this;
  }

   /**
   * SalepackageId
   * @return salepackageId
  **/
  @ApiModelProperty(value = "SalepackageId")
  public String getSalepackageId() {
    return salepackageId;
  }

  public void setSalepackageId(String salepackageId) {
    this.salepackageId = salepackageId;
  }

  public CreateAccountSalepackage trialId(String trialId) {
    this.trialId = trialId;
    return this;
  }

   /**
   * Optional TrialId
   * @return trialId
  **/
  @ApiModelProperty(value = "Optional TrialId")
  public String getTrialId() {
    return trialId;
  }

  public void setTrialId(String trialId) {
    this.trialId = trialId;
  }

  public CreateAccountSalepackage campaignId(String campaignId) {
    this.campaignId = campaignId;
    return this;
  }

   /**
   * Optional CampaignId
   * @return campaignId
  **/
  @ApiModelProperty(value = "Optional CampaignId")
  public String getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(String campaignId) {
    this.campaignId = campaignId;
  }

  public CreateAccountSalepackage storageId(String storageId) {
    this.storageId = storageId;
    return this;
  }

   /**
   * Optional StorageId
   * @return storageId
  **/
  @ApiModelProperty(value = "Optional StorageId")
  public String getStorageId() {
    return storageId;
  }

  public void setStorageId(String storageId) {
    this.storageId = storageId;
  }

  public CreateAccountSalepackage multiId(String multiId) {
    this.multiId = multiId;
    return this;
  }

   /**
   * Optional MultiId
   * @return multiId
  **/
  @ApiModelProperty(value = "Optional MultiId")
  public String getMultiId() {
    return multiId;
  }

  public void setMultiId(String multiId) {
    this.multiId = multiId;
  }

  public CreateAccountSalepackage backupId(String backupId) {
    this.backupId = backupId;
    return this;
  }

   /**
   * Optional BackupId
   * @return backupId
  **/
  @ApiModelProperty(value = "Optional BackupId")
  public String getBackupId() {
    return backupId;
  }

  public void setBackupId(String backupId) {
    this.backupId = backupId;
  }

  public CreateAccountSalepackage syncId(String syncId) {
    this.syncId = syncId;
    return this;
  }

   /**
   * Optional SyncId
   * @return syncId
  **/
  @ApiModelProperty(value = "Optional SyncId")
  public String getSyncId() {
    return syncId;
  }

  public void setSyncId(String syncId) {
    this.syncId = syncId;
  }

  public CreateAccountSalepackage bankIDId(String bankIDId) {
    this.bankIDId = bankIDId;
    return this;
  }

   /**
   * Optional BankIDId
   * @return bankIDId
  **/
  @ApiModelProperty(value = "Optional BankIDId")
  public String getBankIDId() {
    return bankIDId;
  }

  public void setBankIDId(String bankIDId) {
    this.bankIDId = bankIDId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAccountSalepackage createAccountSalepackage = (CreateAccountSalepackage) o;
    return Objects.equals(this.partnerId, createAccountSalepackage.partnerId) &&
        Objects.equals(this.retailerId, createAccountSalepackage.retailerId) &&
        Objects.equals(this.salepackageId, createAccountSalepackage.salepackageId) &&
        Objects.equals(this.trialId, createAccountSalepackage.trialId) &&
        Objects.equals(this.campaignId, createAccountSalepackage.campaignId) &&
        Objects.equals(this.storageId, createAccountSalepackage.storageId) &&
        Objects.equals(this.multiId, createAccountSalepackage.multiId) &&
        Objects.equals(this.backupId, createAccountSalepackage.backupId) &&
        Objects.equals(this.syncId, createAccountSalepackage.syncId) &&
        Objects.equals(this.bankIDId, createAccountSalepackage.bankIDId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partnerId, retailerId, salepackageId, trialId, campaignId, storageId, multiId, backupId, syncId, bankIDId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAccountSalepackage {\n");
    
    sb.append("    partnerId: ").append(toIndentedString(partnerId)).append("\n");
    sb.append("    retailerId: ").append(toIndentedString(retailerId)).append("\n");
    sb.append("    salepackageId: ").append(toIndentedString(salepackageId)).append("\n");
    sb.append("    trialId: ").append(toIndentedString(trialId)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    storageId: ").append(toIndentedString(storageId)).append("\n");
    sb.append("    multiId: ").append(toIndentedString(multiId)).append("\n");
    sb.append("    backupId: ").append(toIndentedString(backupId)).append("\n");
    sb.append("    syncId: ").append(toIndentedString(syncId)).append("\n");
    sb.append("    bankIDId: ").append(toIndentedString(bankIDId)).append("\n");
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

