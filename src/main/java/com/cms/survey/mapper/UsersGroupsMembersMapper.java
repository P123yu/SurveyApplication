package com.cms.survey.mapper;

import com.cms.survey.co.UsersGroupsMembersCo;
import com.cms.survey.dto.UsersGroupsMembersDTO;
import com.cms.survey.model.UsersGroupsMembers;
import org.mapstruct.Mapper;

import java.util.List;


@Mapper(componentModel = "spring")
public interface UsersGroupsMembersMapper {
    UsersGroupsMembersDTO entityToDTO(UsersGroupsMembers usersGroupsMembers);

    UsersGroupsMembers coToEntity(UsersGroupsMembersCo usersGroupsMembersCo);

    List<UsersGroupsMembersDTO> entityListToDTOList(List<UsersGroupsMembers> usersGroupsMembers);
}
