package com.travels.fullContact.utils;

/**
 * Created by Nithin on 5/30/2018.
 */
public class Utils {



  /**
   * Calculate distance between two coordinates.
   *
   * @param lat1
   * @param lon1
   * @param lat2
   * @param lon2
   * @param unit
   * @return
   */
  public static double distance(Double lat1, Double lon1, Double lat2, Double lon2, String unit) {
    double theta = lon1 - lon2;
    double dist = Math.sin(deg2rad(lat1)) * Math.sin(deg2rad(lat2)) + Math.cos(deg2rad(lat1)) * Math
        .cos(deg2rad(lat2)) * Math.cos(deg2rad(theta));
    dist = Math.acos(dist);
    dist = rad2deg(dist);
    dist = dist * 60 * 1.1515;
    if (unit == "K") {
      dist = dist * 1.609344;
    } else if (unit == "N") {
      dist = dist * 0.8684;
    }

    return (dist);
  }

  /**
   * This function converts decimal degrees to radians.
   * @param deg
   * @return
   */
  private static double deg2rad(double deg) {
    return (deg * Math.PI / 180.0);
  }

  /**
   * This function converts radians to decimal degrees.
   * @param rad
   * @return
   */
  private static double rad2deg(double rad) {
    return (rad * 180 / Math.PI);
  }
}
