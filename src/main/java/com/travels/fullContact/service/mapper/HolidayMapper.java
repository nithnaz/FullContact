package com.travels.fullContact.service.mapper;

import java.util.List;
import java.util.Set;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.ReportingPolicy;
import com.travels.fullContact.entity.Stays;
import com.travels.fullContact.model.response.StaysResponse;

/**
 * Created by Nithin on 5/30/2018.
 */
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS, componentModel = "spring")
public interface HolidayMapper {
  /**
   * Map {@link List} of {@link Stays} to {@link StaysResponse}.
   * @param staysList
   * @return List of {@link StaysResponse}
   */
  List<StaysResponse> toStaysResponses(List<Stays> staysList);

  @Mappings(value = { @Mapping(source = "stay_id", target = "stayId"),
      @Mapping(source = "stay_name", target = "stayname"),
      @Mapping(target = "loc", expression = "java("
          + "maptotarget(stays))")})
  StaysResponse toStaysResponse(Stays stays);

  default String maptotarget(final Stays stays) {
    return stays.getLoc().replace("POINT", "").replace("(", "[").replace(")", "]").replace(" ", ",");
  }

}
