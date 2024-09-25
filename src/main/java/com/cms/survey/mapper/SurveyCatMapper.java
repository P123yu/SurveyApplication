package com.cms.survey.mapper;
import com.cms.survey.co.SurveyCatCo;
import com.cms.survey.dto.SurveyCatDTO;
import com.cms.survey.model.SurveyCat;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SurveyCatMapper {

    SurveyCatDTO entityToDTO(SurveyCat surveyCat);

    SurveyCat coToEntity(SurveyCatCo surveyCatCo);

    List<SurveyCatDTO> entityListToDTOList(List<SurveyCat> surveyCat);
}
