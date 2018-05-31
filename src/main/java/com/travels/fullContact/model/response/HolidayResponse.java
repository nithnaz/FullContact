package com.travels.fullContact.model.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Nithin on 5/30/2018.
 */
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class HolidayResponse {

  @JsonProperty(value = "total_distance")
  private Double totalDistance;

  @JsonProperty(value = "stays")
  private List<StaysResponse> stays;

  public Double getTotalDistance() {
    return totalDistance;
  }

  public void setTotalDistance(Double totalDistance) {
    this.totalDistance = totalDistance;
  }

  public List<StaysResponse> getStays() {
    return stays;
  }

  public void setStays(List<StaysResponse> stays) {
    this.stays = stays;
  }

  @Override
  public String toString() {
    return "HolidayResponse{" + "totalDistance=" + totalDistance + ", stays=" + stays + '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (!(o instanceof HolidayResponse))
      return false;

    HolidayResponse that = (HolidayResponse) o;

    if (getTotalDistance() != null ?
        !getTotalDistance().equals(that.getTotalDistance()) :
        that.getTotalDistance() != null)
      return false;
    return getStays() != null ? getStays().equals(that.getStays()) : that.getStays() == null;

  }

  @Override
  public int hashCode() {
    int result = getTotalDistance() != null ? getTotalDistance().hashCode() : 0;
    result = 31 * result + (getStays() != null ? getStays().hashCode() : 0);
    return result;
  }
}
