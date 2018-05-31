package com.travels.fullContact.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.travels.fullContact.model.request.HolidayRequest;
import com.travels.fullContact.model.response.HolidayResponse;
import com.travels.fullContact.service.HolidayService;

/**
 * @author Nithin
 * @version 1.0
 */
@RestController()
public class HolidayController {

  @Autowired()
  private HolidayService holidayService;

  @RequestMapping(value = "/holidays", method = RequestMethod.GET, produces = "application/json")
  public ResponseEntity<List<HolidayResponse>> getHolidays(final HolidayRequest holidayRequest) {
    final List<HolidayResponse> holidayResponses = holidayService.getHolidays(holidayRequest);
    if (holidayResponses.isEmpty()) {
      return new ResponseEntity<List<HolidayResponse>>(holidayResponses, HttpStatus.NOT_FOUND);
    }
    return new ResponseEntity<List<HolidayResponse>>(holidayResponses, HttpStatus.OK);
  }
}
