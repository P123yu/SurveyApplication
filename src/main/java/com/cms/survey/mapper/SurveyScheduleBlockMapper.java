package com.cms.survey.mapper;
import com.cms.survey.co.SurveyScheduleBlockCo;
import com.cms.survey.dto.SurveyScheduleBlockDTO;
import com.cms.survey.model.SurveyScheduleBlock;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;


@Mapper(componentModel = "spring")
public interface SurveyScheduleBlockMapper {
    SurveyScheduleBlockDTO entityToDTO(SurveyScheduleBlock surveyScheduleBlock);

    SurveyScheduleBlock coToEntity(SurveyScheduleBlockCo surveyScheduleBlockCo);

}
