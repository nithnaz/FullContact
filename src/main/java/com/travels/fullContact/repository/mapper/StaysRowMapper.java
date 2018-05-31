package com.travels.fullContact.repository.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import com.travels.fullContact.entity.Stays;

/**
 * Created by Nithin on 5/30/2018.
 */
public class StaysRowMapper implements RowMapper<Stays> {

  @Override()
  public Stays mapRow(ResultSet resultSet, int i) throws SQLException {
    final Stays stays = new Stays();
    stays.setStay_id(resultSet.getInt("stay_id"));
    stays.setStay_name(resultSet.getString("stay_name"));
    stays.setLoc(resultSet.getString("location"));

    return stays;
  }
}
