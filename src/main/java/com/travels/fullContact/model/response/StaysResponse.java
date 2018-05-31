package com.travels.fullContact.model.response;

import java.awt.*;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Nithin on 5/30/2018.
 */
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class StaysResponse {

  @JsonProperty(value = "stay_id")
  private Integer stayId;

  @JsonProperty(value = "stay_name")
  private String stayname;

  @JsonProperty(value = "loc")
  private String loc;

  public Integer getStayId() {
    return stayId;
  }

  public void setStayId(Integer stayId) {
    this.stayId = stayId;
  }

  public String getStayname() {
    return stayname;
  }

  public void setStayname(String stayname) {
    this.stayname = stayname;
  }

  public String getLoc() {
    return loc;
  }

  public void setLoc(String loc) {
    this.loc = loc;
  }

  @Override
  public String toString() {
    return "StaysResponse{" + "stayId=" + stayId + ", stayname='" + stayname + '\'' + ", loc='"
        + loc + '\'' + '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (!(o instanceof StaysResponse))
      return false;

    StaysResponse that = (StaysResponse) o;

    if (getStayId() != null ? !getStayId().equals(that.getStayId()) : that.getStayId() != null)
      return false;
    if (getStayname() != null ?
        !getStayname().equals(that.getStayname()) :
        that.getStayname() != null)
      return false;
    return getLoc() != null ? getLoc().equals(that.getLoc()) : that.getLoc() == null;

  }

  @Override
  public int hashCode() {
    int result = getStayId() != null ? getStayId().hashCode() : 0;
    result = 31 * result + (getStayname() != null ? getStayname().hashCode() : 0);
    result = 31 * result + (getLoc() != null ? getLoc().hashCode() : 0);
    return result;
  }
}
