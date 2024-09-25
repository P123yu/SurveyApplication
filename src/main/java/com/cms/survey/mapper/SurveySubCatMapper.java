package com.cms.survey.mapper;
import com.cms.survey.co.SurveySubCatCo;
import com.cms.survey.dto.SurveySubCatDTO;
import com.cms.survey.model.SurveySubCat;
import org.mapstruct.Mapper;
import java.util.List;

@Mapper(componentModel = "spring")
public interface SurveySubCatMapper {

    SurveySubCatDTO entityToDTO(SurveySubCat surveySubCat);

    SurveySubCat coToEntity(SurveySubCatCo surveySubCatCo);

    List<SurveySubCatDTO> entityListToDTOList(List<SurveySubCat> surveySubCat);
}
