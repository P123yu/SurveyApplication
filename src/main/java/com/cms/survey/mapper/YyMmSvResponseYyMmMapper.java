package com.cms.survey.mapper;

import com.cms.survey.co.QuestionCo;
import com.cms.survey.co.YyMmSvResponseYyMmCo;
import com.cms.survey.dto.QuestionDTO;
import com.cms.survey.dto.YyMmSvResponseYyMmDTO;
import com.cms.survey.model.Question;
import com.cms.survey.model.YyMmSvResponseYyMm;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface YyMmSvResponseYyMmMapper {
    YyMmSvResponseYyMmDTO entityToDTO(YyMmSvResponseYyMm yyMmSvResponseYyMm);

    YyMmSvResponseYyMm coToEntity(YyMmSvResponseYyMmCo yyMmSvResponseYyMmCo);

    List<YyMmSvResponseYyMmDTO> entityListToDTOList(List<YyMmSvResponseYyMm> yyMmSvResponseYyMm);
}
