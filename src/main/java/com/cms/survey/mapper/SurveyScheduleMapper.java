package com.cms.survey.mapper;
import com.cms.survey.co.SurveyScheduleCo;
import com.cms.survey.dto.SurveyScheduleDTO;
import com.cms.survey.model.SurveySchedule;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SurveyScheduleMapper {

    SurveyScheduleDTO entityToDTO(SurveySchedule surveySchedule);

    SurveySchedule coToEntity(SurveyScheduleCo surveyScheduleCo);

    List<SurveyScheduleDTO> entityListToDTOList(List<SurveySchedule> surveySchedule);

}
