package com.travels.fullContact.model.request;

import java.util.List;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Nithin on 5/30/2018.
 */
public class HolidayRequest {

  @JsonProperty(value = "dest_types")
  @NotNull()
  private List<String> dest_types;

  @JsonProperty(value = "max_travel")
  @NotNull()
  private Integer max_travel;

  @JsonProperty(value = "rating")
  @NotNull()
  private Integer rating;

  public List<String> getDest_types() {
    return dest_types;
  }

  public void setDest_types(List<String> dest_types) {
    this.dest_types = dest_types;
  }

  public Integer getMax_travel() {
    return max_travel;
  }

  public void setMax_travel(Integer max_travel) {
    this.max_travel = max_travel;
  }

  public Integer getRating() {
    return rating;
  }

  public void setRating(Integer rating) {
    this.rating = rating;
  }

  @Override()
  public String toString() {
    return "HolidayRequest{" + "dest_types=" + dest_types + ", max_travel=" + max_travel
        + ", rating=" + rating + '}';
  }

  @Override()
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (!(o instanceof HolidayRequest))
      return false;

    HolidayRequest that = (HolidayRequest) o;

    if (getDest_types() != null ?
        !getDest_types().equals(that.getDest_types()) :
        that.getDest_types() != null)
      return false;
    if (getMax_travel() != null ?
        !getMax_travel().equals(that.getMax_travel()) :
        that.getMax_travel() != null)
      return false;
    return getRating() != null ? getRating().equals(that.getRating()) : that.getRating() == null;

  }

  @Override
  public int hashCode() {
    int result = getDest_types() != null ? getDest_types().hashCode() : 0;
    result = 31 * result + (getMax_travel() != null ? getMax_travel().hashCode() : 0);
    result = 31 * result + (getRating() != null ? getRating().hashCode() : 0);
    return result;
  }
}
