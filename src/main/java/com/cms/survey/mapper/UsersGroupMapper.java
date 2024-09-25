package com.cms.survey.mapper;


import com.cms.survey.co.UsersGroupCo;
import com.cms.survey.dto.UsersGroupDTO;
import com.cms.survey.model.UsersGroup;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UsersGroupMapper {

    UsersGroupDTO entityToDTO(UsersGroup usersGroup);

    UsersGroup coToEntity(UsersGroupCo usersGroupCo);

    List<UsersGroupDTO> entityListToDTOList(List<UsersGroup> usersGroup);
}
