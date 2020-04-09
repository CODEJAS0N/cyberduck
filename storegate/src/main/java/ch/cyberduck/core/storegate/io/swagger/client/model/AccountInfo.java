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
 * Information about the account.
 */
@ApiModel(description = "Information about the account.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-08T17:57:06.518+02:00")
public class AccountInfo {
  @JsonProperty("username")
  private String username = null;

  @JsonProperty("company")
  private String company = null;

  @JsonProperty("vatNumber")
  private String vatNumber = null;

  @JsonProperty("country")
  private String country = null;

  @JsonProperty("countryCode")
  private String countryCode = null;

  @JsonProperty("organizationNumber")
  private String organizationNumber = null;

  @JsonProperty("socialSecurityNumber")
  private String socialSecurityNumber = null;

  @JsonProperty("newsletter")
  private Boolean newsletter = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("requireOrganizationNumber")
  private Boolean requireOrganizationNumber = null;

  @JsonProperty("requireSocialSecurityNumber")
  private Boolean requireSocialSecurityNumber = null;

  @JsonProperty("requireVATNumber")
  private Boolean requireVATNumber = null;

  public AccountInfo username(String username) {
    this.username = username;
    return this;
  }

   /**
   * The account username.
   * @return username
  **/
  @ApiModelProperty(value = "The account username.")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public AccountInfo company(String company) {
    this.company = company;
    return this;
  }

   /**
   * The users company.
   * @return company
  **/
  @ApiModelProperty(value = "The users company.")
  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public AccountInfo vatNumber(String vatNumber) {
    this.vatNumber = vatNumber;
    return this;
  }

   /**
   * 
   * @return vatNumber
  **/
  @ApiModelProperty(value = "")
  public String getVatNumber() {
    return vatNumber;
  }

  public void setVatNumber(String vatNumber) {
    this.vatNumber = vatNumber;
  }

  public AccountInfo country(String country) {
    this.country = country;
    return this;
  }

   /**
   * 
   * @return country
  **/
  @ApiModelProperty(value = "")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public AccountInfo countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * 
   * @return countryCode
  **/
  @ApiModelProperty(value = "")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public AccountInfo organizationNumber(String organizationNumber) {
    this.organizationNumber = organizationNumber;
    return this;
  }

   /**
   * 
   * @return organizationNumber
  **/
  @ApiModelProperty(value = "")
  public String getOrganizationNumber() {
    return organizationNumber;
  }

  public void setOrganizationNumber(String organizationNumber) {
    this.organizationNumber = organizationNumber;
  }

  public AccountInfo socialSecurityNumber(String socialSecurityNumber) {
    this.socialSecurityNumber = socialSecurityNumber;
    return this;
  }

   /**
   * 
   * @return socialSecurityNumber
  **/
  @ApiModelProperty(value = "")
  public String getSocialSecurityNumber() {
    return socialSecurityNumber;
  }

  public void setSocialSecurityNumber(String socialSecurityNumber) {
    this.socialSecurityNumber = socialSecurityNumber;
  }

  public AccountInfo newsletter(Boolean newsletter) {
    this.newsletter = newsletter;
    return this;
  }

   /**
   * 
   * @return newsletter
  **/
  @ApiModelProperty(value = "")
  public Boolean isNewsletter() {
    return newsletter;
  }

  public void setNewsletter(Boolean newsletter) {
    this.newsletter = newsletter;
  }

  public AccountInfo email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The accounts e-mail address.
   * @return email
  **/
  @ApiModelProperty(value = "The accounts e-mail address.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public AccountInfo firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * The users name.
   * @return firstName
  **/
  @ApiModelProperty(value = "The users name.")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public AccountInfo lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * The users surname.
   * @return lastName
  **/
  @ApiModelProperty(value = "The users surname.")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public AccountInfo requireOrganizationNumber(Boolean requireOrganizationNumber) {
    this.requireOrganizationNumber = requireOrganizationNumber;
    return this;
  }

   /**
   * 
   * @return requireOrganizationNumber
  **/
  @ApiModelProperty(value = "")
  public Boolean isRequireOrganizationNumber() {
    return requireOrganizationNumber;
  }

  public void setRequireOrganizationNumber(Boolean requireOrganizationNumber) {
    this.requireOrganizationNumber = requireOrganizationNumber;
  }

  public AccountInfo requireSocialSecurityNumber(Boolean requireSocialSecurityNumber) {
    this.requireSocialSecurityNumber = requireSocialSecurityNumber;
    return this;
  }

   /**
   * 
   * @return requireSocialSecurityNumber
  **/
  @ApiModelProperty(value = "")
  public Boolean isRequireSocialSecurityNumber() {
    return requireSocialSecurityNumber;
  }

  public void setRequireSocialSecurityNumber(Boolean requireSocialSecurityNumber) {
    this.requireSocialSecurityNumber = requireSocialSecurityNumber;
  }

  public AccountInfo requireVATNumber(Boolean requireVATNumber) {
    this.requireVATNumber = requireVATNumber;
    return this;
  }

   /**
   * 
   * @return requireVATNumber
  **/
  @ApiModelProperty(value = "")
  public Boolean isRequireVATNumber() {
    return requireVATNumber;
  }

  public void setRequireVATNumber(Boolean requireVATNumber) {
    this.requireVATNumber = requireVATNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountInfo accountInfo = (AccountInfo) o;
    return Objects.equals(this.username, accountInfo.username) &&
        Objects.equals(this.company, accountInfo.company) &&
        Objects.equals(this.vatNumber, accountInfo.vatNumber) &&
        Objects.equals(this.country, accountInfo.country) &&
        Objects.equals(this.countryCode, accountInfo.countryCode) &&
        Objects.equals(this.organizationNumber, accountInfo.organizationNumber) &&
        Objects.equals(this.socialSecurityNumber, accountInfo.socialSecurityNumber) &&
        Objects.equals(this.newsletter, accountInfo.newsletter) &&
        Objects.equals(this.email, accountInfo.email) &&
        Objects.equals(this.firstName, accountInfo.firstName) &&
        Objects.equals(this.lastName, accountInfo.lastName) &&
        Objects.equals(this.requireOrganizationNumber, accountInfo.requireOrganizationNumber) &&
        Objects.equals(this.requireSocialSecurityNumber, accountInfo.requireSocialSecurityNumber) &&
        Objects.equals(this.requireVATNumber, accountInfo.requireVATNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, company, vatNumber, country, countryCode, organizationNumber, socialSecurityNumber, newsletter, email, firstName, lastName, requireOrganizationNumber, requireSocialSecurityNumber, requireVATNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountInfo {\n");
    
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    vatNumber: ").append(toIndentedString(vatNumber)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    organizationNumber: ").append(toIndentedString(organizationNumber)).append("\n");
    sb.append("    socialSecurityNumber: ").append(toIndentedString(socialSecurityNumber)).append("\n");
    sb.append("    newsletter: ").append(toIndentedString(newsletter)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    requireOrganizationNumber: ").append(toIndentedString(requireOrganizationNumber)).append("\n");
    sb.append("    requireSocialSecurityNumber: ").append(toIndentedString(requireSocialSecurityNumber)).append("\n");
    sb.append("    requireVATNumber: ").append(toIndentedString(requireVATNumber)).append("\n");
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

