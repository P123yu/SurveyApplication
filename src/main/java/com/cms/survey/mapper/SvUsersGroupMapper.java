package com.cms.survey.mapper;

import com.cms.survey.co.SurveyCo;
import com.cms.survey.co.SvUsersGroupCo;
import com.cms.survey.dto.SurveyDTO;
import com.cms.survey.dto.SvUsersGroupDTO;
import com.cms.survey.model.Survey;
import com.cms.survey.model.SvUsersGroup;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel="spring")
public interface SvUsersGroupMapper {
    SvUsersGroupDTO entityToDTO(SvUsersGroup survey);

    SvUsersGroup coToEntity(SvUsersGroupCo surveyCo);

    List<SvUsersGroupDTO> entityListToDTOList(List<SvUsersGroup> survey);

}
