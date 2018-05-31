package com.travels.fullContact.entity;

/**
 * Created by Nithin on 5/30/2018.
 */
public class Bookings {

  private Integer cust_id;
  private Integer stay_id;
  private Integer rating;

  public Integer getCust_id() {
    return cust_id;
  }

  public void setCust_id(Integer cust_id) {
    this.cust_id = cust_id;
  }

  public Integer getStay_id() {
    return stay_id;
  }

  public void setStay_id(Integer stay_id) {
    this.stay_id = stay_id;
  }

  public Integer getRating() {
    return rating;
  }

  public void setRating(Integer rating) {
    this.rating = rating;
  }
}
