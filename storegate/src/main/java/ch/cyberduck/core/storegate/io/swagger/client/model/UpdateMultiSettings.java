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
 * Update a accounts multi settings. Properties that are null/undefined/missing are not updated
 */
@ApiModel(description = "Update a accounts multi settings. Properties that are null/undefined/missing are not updated")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-08T17:57:06.518+02:00")
public class UpdateMultiSettings {
  @JsonProperty("officeOnline")
  private Boolean officeOnline = null;

  @JsonProperty("recycleBin")
  private Boolean recycleBin = null;

  @JsonProperty("versions")
  private Integer versions = null;

  /**
   * Permission for common root
   */
  public enum CommonRootPermissionEnum {
    NUMBER_0(0),
    
    NUMBER_1(1),
    
    NUMBER_2(2),
    
    NUMBER_4(4),
    
    NUMBER_99(99),
    
    NUMBER_MINUS_1(-1);

    private Integer value;

    CommonRootPermissionEnum(Integer value) {
      this.value = value;
    }

    @JsonValue
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CommonRootPermissionEnum fromValue(String text) {
      for (CommonRootPermissionEnum b : CommonRootPermissionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("commonRootPermission")
  private CommonRootPermissionEnum commonRootPermission = null;

  @JsonProperty("extendedPermissions")
  private Boolean extendedPermissions = null;

  @JsonProperty("hideAlbums")
  private Boolean hideAlbums = null;

  @JsonProperty("hidePhotos")
  private Boolean hidePhotos = null;

  @JsonProperty("disableMoveFromCommon")
  private Boolean disableMoveFromCommon = null;

  @JsonProperty("allowShare")
  private Boolean allowShare = null;

  @JsonProperty("forceTwoFactor")
  private Boolean forceTwoFactor = null;

  @JsonProperty("eidRequired")
  private Boolean eidRequired = null;

  public UpdateMultiSettings officeOnline(Boolean officeOnline) {
    this.officeOnline = officeOnline;
    return this;
  }

   /**
   * Enable Office Online for entire subscription
   * @return officeOnline
  **/
  @ApiModelProperty(value = "Enable Office Online for entire subscription")
  public Boolean isOfficeOnline() {
    return officeOnline;
  }

  public void setOfficeOnline(Boolean officeOnline) {
    this.officeOnline = officeOnline;
  }

  public UpdateMultiSettings recycleBin(Boolean recycleBin) {
    this.recycleBin = recycleBin;
    return this;
  }

   /**
   * Indicates if the recycle bin is enabled.
   * @return recycleBin
  **/
  @ApiModelProperty(value = "Indicates if the recycle bin is enabled.")
  public Boolean isRecycleBin() {
    return recycleBin;
  }

  public void setRecycleBin(Boolean recycleBin) {
    this.recycleBin = recycleBin;
  }

  public UpdateMultiSettings versions(Integer versions) {
    this.versions = versions;
    return this;
  }

   /**
   * Number of versions keept in versioning.
   * @return versions
  **/
  @ApiModelProperty(value = "Number of versions keept in versioning.")
  public Integer getVersions() {
    return versions;
  }

  public void setVersions(Integer versions) {
    this.versions = versions;
  }

  public UpdateMultiSettings commonRootPermission(CommonRootPermissionEnum commonRootPermission) {
    this.commonRootPermission = commonRootPermission;
    return this;
  }

   /**
   * Permission for common root
   * @return commonRootPermission
  **/
  @ApiModelProperty(value = "Permission for common root")
  public CommonRootPermissionEnum getCommonRootPermission() {
    return commonRootPermission;
  }

  public void setCommonRootPermission(CommonRootPermissionEnum commonRootPermission) {
    this.commonRootPermission = commonRootPermission;
  }

  public UpdateMultiSettings extendedPermissions(Boolean extendedPermissions) {
    this.extendedPermissions = extendedPermissions;
    return this;
  }

   /**
   * Extended permissions in common
   * @return extendedPermissions
  **/
  @ApiModelProperty(value = "Extended permissions in common")
  public Boolean isExtendedPermissions() {
    return extendedPermissions;
  }

  public void setExtendedPermissions(Boolean extendedPermissions) {
    this.extendedPermissions = extendedPermissions;
  }

  public UpdateMultiSettings hideAlbums(Boolean hideAlbums) {
    this.hideAlbums = hideAlbums;
    return this;
  }

   /**
   * Extended permissions in common
   * @return hideAlbums
  **/
  @ApiModelProperty(value = "Extended permissions in common")
  public Boolean isHideAlbums() {
    return hideAlbums;
  }

  public void setHideAlbums(Boolean hideAlbums) {
    this.hideAlbums = hideAlbums;
  }

  public UpdateMultiSettings hidePhotos(Boolean hidePhotos) {
    this.hidePhotos = hidePhotos;
    return this;
  }

   /**
   * Extended permissions in common
   * @return hidePhotos
  **/
  @ApiModelProperty(value = "Extended permissions in common")
  public Boolean isHidePhotos() {
    return hidePhotos;
  }

  public void setHidePhotos(Boolean hidePhotos) {
    this.hidePhotos = hidePhotos;
  }

  public UpdateMultiSettings disableMoveFromCommon(Boolean disableMoveFromCommon) {
    this.disableMoveFromCommon = disableMoveFromCommon;
    return this;
  }

   /**
   * Extended permissions in common
   * @return disableMoveFromCommon
  **/
  @ApiModelProperty(value = "Extended permissions in common")
  public Boolean isDisableMoveFromCommon() {
    return disableMoveFromCommon;
  }

  public void setDisableMoveFromCommon(Boolean disableMoveFromCommon) {
    this.disableMoveFromCommon = disableMoveFromCommon;
  }

  public UpdateMultiSettings allowShare(Boolean allowShare) {
    this.allowShare = allowShare;
    return this;
  }

   /**
   * Allow share for all users
   * @return allowShare
  **/
  @ApiModelProperty(value = "Allow share for all users")
  public Boolean isAllowShare() {
    return allowShare;
  }

  public void setAllowShare(Boolean allowShare) {
    this.allowShare = allowShare;
  }

  public UpdateMultiSettings forceTwoFactor(Boolean forceTwoFactor) {
    this.forceTwoFactor = forceTwoFactor;
    return this;
  }

   /**
   * Force TwoFactor for all users
   * @return forceTwoFactor
  **/
  @ApiModelProperty(value = "Force TwoFactor for all users")
  public Boolean isForceTwoFactor() {
    return forceTwoFactor;
  }

  public void setForceTwoFactor(Boolean forceTwoFactor) {
    this.forceTwoFactor = forceTwoFactor;
  }

  public UpdateMultiSettings eidRequired(Boolean eidRequired) {
    this.eidRequired = eidRequired;
    return this;
  }

   /**
   * Force BankID for all users and shares
   * @return eidRequired
  **/
  @ApiModelProperty(value = "Force BankID for all users and shares")
  public Boolean isEidRequired() {
    return eidRequired;
  }

  public void setEidRequired(Boolean eidRequired) {
    this.eidRequired = eidRequired;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateMultiSettings updateMultiSettings = (UpdateMultiSettings) o;
    return Objects.equals(this.officeOnline, updateMultiSettings.officeOnline) &&
        Objects.equals(this.recycleBin, updateMultiSettings.recycleBin) &&
        Objects.equals(this.versions, updateMultiSettings.versions) &&
        Objects.equals(this.commonRootPermission, updateMultiSettings.commonRootPermission) &&
        Objects.equals(this.extendedPermissions, updateMultiSettings.extendedPermissions) &&
        Objects.equals(this.hideAlbums, updateMultiSettings.hideAlbums) &&
        Objects.equals(this.hidePhotos, updateMultiSettings.hidePhotos) &&
        Objects.equals(this.disableMoveFromCommon, updateMultiSettings.disableMoveFromCommon) &&
        Objects.equals(this.allowShare, updateMultiSettings.allowShare) &&
        Objects.equals(this.forceTwoFactor, updateMultiSettings.forceTwoFactor) &&
        Objects.equals(this.eidRequired, updateMultiSettings.eidRequired);
  }

  @Override
  public int hashCode() {
    return Objects.hash(officeOnline, recycleBin, versions, commonRootPermission, extendedPermissions, hideAlbums, hidePhotos, disableMoveFromCommon, allowShare, forceTwoFactor, eidRequired);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateMultiSettings {\n");
    
    sb.append("    officeOnline: ").append(toIndentedString(officeOnline)).append("\n");
    sb.append("    recycleBin: ").append(toIndentedString(recycleBin)).append("\n");
    sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
    sb.append("    commonRootPermission: ").append(toIndentedString(commonRootPermission)).append("\n");
    sb.append("    extendedPermissions: ").append(toIndentedString(extendedPermissions)).append("\n");
    sb.append("    hideAlbums: ").append(toIndentedString(hideAlbums)).append("\n");
    sb.append("    hidePhotos: ").append(toIndentedString(hidePhotos)).append("\n");
    sb.append("    disableMoveFromCommon: ").append(toIndentedString(disableMoveFromCommon)).append("\n");
    sb.append("    allowShare: ").append(toIndentedString(allowShare)).append("\n");
    sb.append("    forceTwoFactor: ").append(toIndentedString(forceTwoFactor)).append("\n");
    sb.append("    eidRequired: ").append(toIndentedString(eidRequired)).append("\n");
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

