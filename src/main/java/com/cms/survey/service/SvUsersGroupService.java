package com.cms.survey.service;


import com.cms.survey.co.SvUsersGroupCo;
import com.cms.survey.dto.SvUsersGroupDTO;
import com.cms.survey.model.UserGroupId;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface SvUsersGroupService {

    SvUsersGroupDTO createSvUsersGroup(SvUsersGroupCo svUsersGroupCo);
    SvUsersGroupDTO updateSvUsersGroup(String groupId, SvUsersGroupCo usersGroupCo);
    List<SvUsersGroupDTO> getAllSvUsersGroup();
    void deleteSvUsersGroup(String groupId);
    SvUsersGroupDTO getSvUsersGroupById(UserGroupId id);
}
