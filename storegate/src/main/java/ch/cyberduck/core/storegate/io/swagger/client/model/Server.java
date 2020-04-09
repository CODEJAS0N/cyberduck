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
import org.joda.time.DateTime;

/**
 * Server information object
 */
@ApiModel(description = "Server information object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-08T17:57:06.518+02:00")
public class Server {
  @JsonProperty("version")
  private String version = null;

  @JsonProperty("serverId")
  private String serverId = null;

  @JsonProperty("timestamp")
  private DateTime timestamp = null;

  public Server version(String version) {
    this.version = version;
    return this;
  }

   /**
   * The version of SOSA running on the server
   * @return version
  **/
  @ApiModelProperty(value = "The version of SOSA running on the server")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public Server serverId(String serverId) {
    this.serverId = serverId;
    return this;
  }

   /**
   * The serverId of the server
   * @return serverId
  **/
  @ApiModelProperty(value = "The serverId of the server")
  public String getServerId() {
    return serverId;
  }

  public void setServerId(String serverId) {
    this.serverId = serverId;
  }

  public Server timestamp(DateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * The time of generation
   * @return timestamp
  **/
  @ApiModelProperty(value = "The time of generation")
  public DateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(DateTime timestamp) {
    this.timestamp = timestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Server server = (Server) o;
    return Objects.equals(this.version, server.version) &&
        Objects.equals(this.serverId, server.serverId) &&
        Objects.equals(this.timestamp, server.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, serverId, timestamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Server {\n");
    
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

