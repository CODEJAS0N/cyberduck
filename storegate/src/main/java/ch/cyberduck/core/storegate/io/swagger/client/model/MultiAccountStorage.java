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
import ch.cyberduck.core.storegate.io.swagger.client.model.AccountStorage;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-08T17:57:06.518+02:00")
public class MultiAccountStorage {
  @JsonProperty("usedCommon")
  private Long usedCommon = null;

  @JsonProperty("usedOthers")
  private Long usedOthers = null;

  @JsonProperty("users")
  private List<AccountStorage> users = null;

  @JsonProperty("usedMyFiles")
  private Long usedMyFiles = null;

  @JsonProperty("usedBackup")
  private Long usedBackup = null;

  @JsonProperty("usedVersions")
  private Long usedVersions = null;

  @JsonProperty("usedRecyclebin")
  private Long usedRecyclebin = null;

  @JsonProperty("accountId")
  private String accountId = null;

  @JsonProperty("size")
  private Long size = null;

  @JsonProperty("available")
  private Long available = null;

  @JsonProperty("used")
  private Long used = null;

  @JsonProperty("reserved")
  private Long reserved = null;

  @JsonProperty("totalUsed")
  private Long totalUsed = null;

  public MultiAccountStorage usedCommon(Long usedCommon) {
    this.usedCommon = usedCommon;
    return this;
  }

   /**
   * Used in common
   * @return usedCommon
  **/
  @ApiModelProperty(value = "Used in common")
  public Long getUsedCommon() {
    return usedCommon;
  }

  public void setUsedCommon(Long usedCommon) {
    this.usedCommon = usedCommon;
  }

  public MultiAccountStorage usedOthers(Long usedOthers) {
    this.usedOthers = usedOthers;
    return this;
  }

   /**
   * Used by other users
   * @return usedOthers
  **/
  @ApiModelProperty(value = "Used by other users")
  public Long getUsedOthers() {
    return usedOthers;
  }

  public void setUsedOthers(Long usedOthers) {
    this.usedOthers = usedOthers;
  }

  public MultiAccountStorage users(List<AccountStorage> users) {
    this.users = users;
    return this;
  }

  public MultiAccountStorage addUsersItem(AccountStorage usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<>();
    }
    this.users.add(usersItem);
    return this;
  }

   /**
   * List of users storage
   * @return users
  **/
  @ApiModelProperty(value = "List of users storage")
  public List<AccountStorage> getUsers() {
    return users;
  }

  public void setUsers(List<AccountStorage> users) {
    this.users = users;
  }

  public MultiAccountStorage usedMyFiles(Long usedMyFiles) {
    this.usedMyFiles = usedMyFiles;
    return this;
  }

   /**
   * Used in Files
   * @return usedMyFiles
  **/
  @ApiModelProperty(value = "Used in Files")
  public Long getUsedMyFiles() {
    return usedMyFiles;
  }

  public void setUsedMyFiles(Long usedMyFiles) {
    this.usedMyFiles = usedMyFiles;
  }

  public MultiAccountStorage usedBackup(Long usedBackup) {
    this.usedBackup = usedBackup;
    return this;
  }

   /**
   * Used in Backup
   * @return usedBackup
  **/
  @ApiModelProperty(value = "Used in Backup")
  public Long getUsedBackup() {
    return usedBackup;
  }

  public void setUsedBackup(Long usedBackup) {
    this.usedBackup = usedBackup;
  }

  public MultiAccountStorage usedVersions(Long usedVersions) {
    this.usedVersions = usedVersions;
    return this;
  }

   /**
   * Used by versions
   * @return usedVersions
  **/
  @ApiModelProperty(value = "Used by versions")
  public Long getUsedVersions() {
    return usedVersions;
  }

  public void setUsedVersions(Long usedVersions) {
    this.usedVersions = usedVersions;
  }

  public MultiAccountStorage usedRecyclebin(Long usedRecyclebin) {
    this.usedRecyclebin = usedRecyclebin;
    return this;
  }

   /**
   * Used in the recycle bin
   * @return usedRecyclebin
  **/
  @ApiModelProperty(value = "Used in the recycle bin")
  public Long getUsedRecyclebin() {
    return usedRecyclebin;
  }

  public void setUsedRecyclebin(Long usedRecyclebin) {
    this.usedRecyclebin = usedRecyclebin;
  }

  public MultiAccountStorage accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * The accountId
   * @return accountId
  **/
  @ApiModelProperty(value = "The accountId")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public MultiAccountStorage size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * The accounts total storage size.
   * @return size
  **/
  @ApiModelProperty(value = "The accounts total storage size.")
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public MultiAccountStorage available(Long available) {
    this.available = available;
    return this;
  }

   /**
   * Available storage for this user.
   * @return available
  **/
  @ApiModelProperty(value = "Available storage for this user.")
  public Long getAvailable() {
    return available;
  }

  public void setAvailable(Long available) {
    this.available = available;
  }

  public MultiAccountStorage used(Long used) {
    this.used = used;
    return this;
  }

   /**
   * Used storage by this user.
   * @return used
  **/
  @ApiModelProperty(value = "Used storage by this user.")
  public Long getUsed() {
    return used;
  }

  public void setUsed(Long used) {
    this.used = used;
  }

  public MultiAccountStorage reserved(Long reserved) {
    this.reserved = reserved;
    return this;
  }

   /**
   * Reserved storage for this user.
   * @return reserved
  **/
  @ApiModelProperty(value = "Reserved storage for this user.")
  public Long getReserved() {
    return reserved;
  }

  public void setReserved(Long reserved) {
    this.reserved = reserved;
  }

  public MultiAccountStorage totalUsed(Long totalUsed) {
    this.totalUsed = totalUsed;
    return this;
  }

   /**
   * Used storage by all user.
   * @return totalUsed
  **/
  @ApiModelProperty(value = "Used storage by all user.")
  public Long getTotalUsed() {
    return totalUsed;
  }

  public void setTotalUsed(Long totalUsed) {
    this.totalUsed = totalUsed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultiAccountStorage multiAccountStorage = (MultiAccountStorage) o;
    return Objects.equals(this.usedCommon, multiAccountStorage.usedCommon) &&
        Objects.equals(this.usedOthers, multiAccountStorage.usedOthers) &&
        Objects.equals(this.users, multiAccountStorage.users) &&
        Objects.equals(this.usedMyFiles, multiAccountStorage.usedMyFiles) &&
        Objects.equals(this.usedBackup, multiAccountStorage.usedBackup) &&
        Objects.equals(this.usedVersions, multiAccountStorage.usedVersions) &&
        Objects.equals(this.usedRecyclebin, multiAccountStorage.usedRecyclebin) &&
        Objects.equals(this.accountId, multiAccountStorage.accountId) &&
        Objects.equals(this.size, multiAccountStorage.size) &&
        Objects.equals(this.available, multiAccountStorage.available) &&
        Objects.equals(this.used, multiAccountStorage.used) &&
        Objects.equals(this.reserved, multiAccountStorage.reserved) &&
        Objects.equals(this.totalUsed, multiAccountStorage.totalUsed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(usedCommon, usedOthers, users, usedMyFiles, usedBackup, usedVersions, usedRecyclebin, accountId, size, available, used, reserved, totalUsed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultiAccountStorage {\n");
    
    sb.append("    usedCommon: ").append(toIndentedString(usedCommon)).append("\n");
    sb.append("    usedOthers: ").append(toIndentedString(usedOthers)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    usedMyFiles: ").append(toIndentedString(usedMyFiles)).append("\n");
    sb.append("    usedBackup: ").append(toIndentedString(usedBackup)).append("\n");
    sb.append("    usedVersions: ").append(toIndentedString(usedVersions)).append("\n");
    sb.append("    usedRecyclebin: ").append(toIndentedString(usedRecyclebin)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
    sb.append("    used: ").append(toIndentedString(used)).append("\n");
    sb.append("    reserved: ").append(toIndentedString(reserved)).append("\n");
    sb.append("    totalUsed: ").append(toIndentedString(totalUsed)).append("\n");
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

