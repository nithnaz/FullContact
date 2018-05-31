package com.travels.fullContact.service.impl;

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
import com.travels.fullContact.service.HolidayService;
import com.travels.fullContact.service.mapper.HolidayMapper;
import com.travels.fullContact.utils.Utils;

/**
 * Created by Nithin on 5/30/2018.
 */
@Service()
public class HolidayServiceImpl implements HolidayService{

  @Autowired()
  private HolidayDao holidayDao;

  @Autowired()
  private HolidayMapper holidayMapper;

  public HolidayServiceImpl() {
    holidayMapper = Mappers.getMapper(HolidayMapper.class);
  }

  /**
   *
   * @param holidayRequest holidayRequest
   * @return List of HolidayResponse.
   */
  @Override()
  public List<HolidayResponse> getHolidays(HolidayRequest holidayRequest) {

    final List<Stays> staysList = holidayDao.getAllBookings(holidayRequest);

    final List<HolidayResponse> holidayResponses = new ArrayList<>();
    final List<StaysResponse> staysResponses = holidayMapper.toStaysResponses(staysList);
    final HolidayResponse holidayResponse = new HolidayResponse();
    Double totalDistance = new Double(0);
    if (!CollectionUtils.isEmpty(staysResponses)) {
      List<StaysResponse> staysResponseList = new ArrayList<>();
      for (int i = 0; i <= staysResponses.size() - 1; i++) {

        final String[] coordinates1 = staysResponses.get(i).getLoc().replace("[", "")
            .replace("]", "").split(",");
        if (i + 1 >= staysResponses.size()) {
          totalDistance = totalDistance + Utils
              .distance(Double.valueOf(coordinates1[0]), Double.valueOf(coordinates1[1]),
                  Double.valueOf(0), Double.valueOf(0), "K");
        } else {
          final String[] coordinates2 = staysResponses.get(i + 1).getLoc().replace("[", "")
              .replace("]", "").split(",");
          final Double lat1 = Double.valueOf(coordinates1[0]);
          final Double lon1 = Double.valueOf(coordinates1[1]);
          final Double lat2 = Double.valueOf(coordinates2[0]);
          final Double lon2 = Double.valueOf(coordinates2[1]);

          totalDistance = totalDistance + Utils.distance(lat1, lon1, lat2, lon2, "K");
        }
        if (totalDistance > holidayRequest.getMax_travel()) {
          break;
        } else {
          staysResponseList.add(staysResponses.get(i));
          holidayResponse.setTotalDistance(totalDistance);
        }
      }
      if (!CollectionUtils.isEmpty(staysResponseList)) {
        holidayResponse.setStays(staysResponseList);
      }
      holidayResponses.add(holidayResponse);
      return holidayResponses;
    }
    return new ArrayList<>();
  }
}
