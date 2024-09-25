package com.cms.survey.mapper;

import com.cms.survey.co.QuestionCo;
import com.cms.survey.dto.QuestionDTO;
import com.cms.survey.model.Question;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface QuestionMapper {
    QuestionDTO entityToDTO(Question question);

    Question coToEntity(QuestionCo questionCo);

    List<QuestionDTO> entityListToDTOList(List<Question> question);
}
