package com.cms.survey.service;

import com.cms.survey.co.SvUsersCo;
import com.cms.survey.co.SvUsersGroupCo;
import com.cms.survey.dto.SvUsersDTO;
import com.cms.survey.dto.SvUsersGroupDTO;
import com.cms.survey.model.UserGroupId;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface SvUsersService {

    SvUsersDTO createSvUsers(SvUsersCo svUsersCo);
  //  SvUsersDTO updateSvUsersGroupByPagination(Long userId, SvUsersCo svUsersCo);
    void deleteSvUsersByUserId(Long userId);

}
