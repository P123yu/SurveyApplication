package com.cms.survey.mapper;

import com.cms.survey.co.SectionCo;
import com.cms.survey.dto.SectionDTO;
import com.cms.survey.model.Section;
import com.cms.survey.model.Survey;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SectionMapper {

    SectionDTO entityToDTO(Section section);

    Section coToEntity(SectionCo sectionCo);

    List<SectionDTO> entityListToDTOList(List<Section> section);
}
