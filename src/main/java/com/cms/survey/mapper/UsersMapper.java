package com.cms.survey.mapper;


import com.cms.survey.co.UsersCo;

import com.cms.survey.dto.UsersDTO;

import com.cms.survey.model.Users;
import org.mapstruct.Mapper;

import java.util.List;


@Mapper(componentModel = "spring")
public interface UsersMapper {
    UsersDTO entityToDTO(Users users);

    Users coToEntity(UsersCo usersCo);

    List<UsersDTO> entityListToDTOList(List<Users> users);
}
