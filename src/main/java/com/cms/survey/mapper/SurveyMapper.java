package com.cms.survey.mapper;
import com.cms.survey.co.SurveyCo;
import com.cms.survey.dto.SurveyDTO;
import com.cms.survey.model.Survey;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import java.util.List;

@Mapper(componentModel = "spring")
public interface SurveyMapper {

       SurveyDTO entityToDTO(Survey survey);

       Survey coToEntity(SurveyCo surveyCo);

       List<SurveyDTO> entityListToDTOList(List<Survey> survey);

}
