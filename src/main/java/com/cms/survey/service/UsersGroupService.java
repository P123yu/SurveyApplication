package com.cms.survey.service;

import com.cms.survey.co.UsersGroupCo;
import com.cms.survey.dto.UsersGroupDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UsersGroupService {
    UsersGroupDTO createUsersGroup(UsersGroupCo usersGroupCo);
    UsersGroupDTO updateUsersGroup(String id, UsersGroupCo usersGroupCo);
    List<UsersGroupDTO> getAllUsersGroup();
    void deleteUsersGroup(String id);
    UsersGroupDTO getUsersGroupById(String id);
}
