package com.cms.survey.mapper;

import com.cms.survey.co.QuestionMetaDataCo;
import com.cms.survey.dto.QuestionMetaDataDTO;
import com.cms.survey.model.QuestionMetaData;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface QuestionMetaDataMapper {
    QuestionMetaDataDTO entityToDTO(QuestionMetaData questionMetaData);

    QuestionMetaData coToEntity(QuestionMetaDataCo questionMetaDataCo);

    List<QuestionMetaDataDTO> entityListToDTOList(List<QuestionMetaData> questionMetaData);
}
