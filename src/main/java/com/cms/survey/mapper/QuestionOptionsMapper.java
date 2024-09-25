package com.cms.survey.mapper;

import com.cms.survey.co.QuestionOptionsCo;
import com.cms.survey.dto.QuestionOptionsDTO;
import com.cms.survey.model.QuestionOptions;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface QuestionOptionsMapper {
    QuestionOptionsDTO entityToDTO(QuestionOptions questionOptions);

    QuestionOptions coToEntity(QuestionOptionsCo questionOptionsCo);

    List<QuestionOptionsDTO> entityListToDTOList(List<QuestionOptions> questionOptions);
}
