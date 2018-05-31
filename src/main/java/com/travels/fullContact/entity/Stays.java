package com.travels.fullContact.entity;


/**
 * Created by Nithin on 5/30/2018.
 */
public class Stays {

  private Integer stay_id;
  private String stay_name;
  private String stay_type;
  private String dest_type;
  private String loc;

  public Integer getStay_id() {
    return stay_id;
  }

  public void setStay_id(Integer stay_id) {
    this.stay_id = stay_id;
  }

  public String getStay_name() {
    return stay_name;
  }

  public void setStay_name(String stay_name) {
    this.stay_name = stay_name;
  }

  public String getStay_type() {
    return stay_type;
  }

  public void setStay_type(String stay_type) {
    this.stay_type = stay_type;
  }

  public String getDest_type() {
    return dest_type;
  }

  public void setDest_type(String dest_type) {
    this.dest_type = dest_type;
  }

  public String getLoc() {
    return loc;
  }

  public void setLoc(String loc) {
    this.loc = loc;
  }
}
