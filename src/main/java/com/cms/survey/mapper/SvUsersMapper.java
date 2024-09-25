package com.cms.survey.mapper;

import com.cms.survey.co.SvUsersCo;
import com.cms.survey.dto.SvUsersDTO;
import com.cms.survey.model.SvUsers;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SvUsersMapper {

    SvUsersDTO entityToDTO(SvUsers svUsers);

    SvUsers coToEntity(SvUsersCo svUsersCo);

    List<SvUsersDTO> entityListToDTOList(List<SvUsers> svUsers);
}
