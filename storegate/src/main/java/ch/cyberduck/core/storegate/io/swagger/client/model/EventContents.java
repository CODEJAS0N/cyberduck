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
import ch.cyberduck.core.storegate.io.swagger.client.model.EventItem;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * A eventContent object
 */
@ApiModel(description = "A eventContent object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-08T17:57:06.518+02:00")
public class EventContents {
  @JsonProperty("totalRowCount")
  private Integer totalRowCount = null;

  @JsonProperty("events")
  private List<EventItem> events = null;

  public EventContents totalRowCount(Integer totalRowCount) {
    this.totalRowCount = totalRowCount;
    return this;
  }

   /**
   * Total number of item.
   * @return totalRowCount
  **/
  @ApiModelProperty(value = "Total number of item.")
  public Integer getTotalRowCount() {
    return totalRowCount;
  }

  public void setTotalRowCount(Integer totalRowCount) {
    this.totalRowCount = totalRowCount;
  }

  public EventContents events(List<EventItem> events) {
    this.events = events;
    return this;
  }

  public EventContents addEventsItem(EventItem eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<>();
    }
    this.events.add(eventsItem);
    return this;
  }

   /**
   * The list of items.
   * @return events
  **/
  @ApiModelProperty(value = "The list of items.")
  public List<EventItem> getEvents() {
    return events;
  }

  public void setEvents(List<EventItem> events) {
    this.events = events;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventContents eventContents = (EventContents) o;
    return Objects.equals(this.totalRowCount, eventContents.totalRowCount) &&
        Objects.equals(this.events, eventContents.events);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalRowCount, events);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventContents {\n");
    
    sb.append("    totalRowCount: ").append(toIndentedString(totalRowCount)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
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

