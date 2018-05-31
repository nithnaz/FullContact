package com.travels.fullContact.service;

import java.util.ArrayList;
import java.util.List;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import com.travels.fullContact.entity.Stays;
import com.travels.fullContact.model.request.HolidayRequest;
import com.travels.fullContact.model.response.HolidayResponse;
import com.travels.fullContact.model.response.StaysResponse;
import com.travels.fullContact.repository.HolidayDao;
import com.travels.fullContact.service.mapper.HolidayMapper;
import com.travels.fullContact.utils.Utils;

/**
 * Created by Nithin on 5/30/2018.
 */

public interface HolidayService {
  /**
   *
   * @param holidayRequest
   * @return
   */
  List<HolidayResponse> getHolidays(final HolidayRequest holidayRequest);


}
