package com.travels.fullContact.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.travels.fullContact.entity.Stays;
import com.travels.fullContact.model.request.HolidayRequest;
import com.travels.fullContact.repository.mapper.StaysRowMapper;

/**
 * Created by Nithin on 5/30/2018.
 */
@Transactional()
@Repository()
public class HolidayDao {

  @Autowired
  private DataSource dataSource;

  @Autowired()
  private JdbcTemplate jdbcTemplate;

  public HolidayDao(JdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }

  public List<Stays> getAllBookings(final HolidayRequest holidayRequest) {
    String sql =
        "SELECT stays.stay_id,stays.stay_name,stays.stay_type,stays.dest_type,AsText(stays.loc) AS location"
            + " FROM stays JOIN bookings" + " ON stays.stay_id=bookings.stay_id  WHERE"
            + " stays.dest_type IN (:destTypes) AND bookings.rating >=(:rating) LIMIT 5 OFFSET 0";

    NamedParameterJdbcTemplate namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(
        dataSource);

    Map namedParameters = new HashMap();
    namedParameters.put("destTypes", holidayRequest.getDest_types());
    namedParameters.put("rating", holidayRequest.getRating());
    RowMapper<Stays> rowMapper = new StaysRowMapper();
    final List<Stays> staysList = namedParameterJdbcTemplate.query(sql, namedParameters, rowMapper);

    return staysList;
  }
}
