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
import ch.cyberduck.core.storegate.io.swagger.client.model.Product;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-08T17:57:06.518+02:00")
public class SalepackageProduct {
  @JsonProperty("currentId")
  private String currentId = null;

  @JsonProperty("used")
  private Long used = null;

  @JsonProperty("expires")
  private DateTime expires = null;

  @JsonProperty("available")
  private List<Product> available = null;

  public SalepackageProduct currentId(String currentId) {
    this.currentId = currentId;
    return this;
  }

   /**
   * Also Default
   * @return currentId
  **/
  @ApiModelProperty(value = "Also Default")
  public String getCurrentId() {
    return currentId;
  }

  public void setCurrentId(String currentId) {
    this.currentId = currentId;
  }

  public SalepackageProduct used(Long used) {
    this.used = used;
    return this;
  }

   /**
   * 
   * @return used
  **/
  @ApiModelProperty(value = "")
  public Long getUsed() {
    return used;
  }

  public void setUsed(Long used) {
    this.used = used;
  }

  public SalepackageProduct expires(DateTime expires) {
    this.expires = expires;
    return this;
  }

   /**
   * 
   * @return expires
  **/
  @ApiModelProperty(value = "")
  public DateTime getExpires() {
    return expires;
  }

  public void setExpires(DateTime expires) {
    this.expires = expires;
  }

  public SalepackageProduct available(List<Product> available) {
    this.available = available;
    return this;
  }

  public SalepackageProduct addAvailableItem(Product availableItem) {
    if (this.available == null) {
      this.available = new ArrayList<>();
    }
    this.available.add(availableItem);
    return this;
  }

   /**
   * 
   * @return available
  **/
  @ApiModelProperty(value = "")
  public List<Product> getAvailable() {
    return available;
  }

  public void setAvailable(List<Product> available) {
    this.available = available;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SalepackageProduct salepackageProduct = (SalepackageProduct) o;
    return Objects.equals(this.currentId, salepackageProduct.currentId) &&
        Objects.equals(this.used, salepackageProduct.used) &&
        Objects.equals(this.expires, salepackageProduct.expires) &&
        Objects.equals(this.available, salepackageProduct.available);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentId, used, expires, available);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SalepackageProduct {\n");
    
    sb.append("    currentId: ").append(toIndentedString(currentId)).append("\n");
    sb.append("    used: ").append(toIndentedString(used)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
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

