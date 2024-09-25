package com.cms.survey.service.impl;

import com.cms.survey.co.SvUsersCo;
import com.cms.survey.dto.SvUsersDTO;
import com.cms.survey.mapper.SvUsersMapper;
import com.cms.survey.model.*;
import com.cms.survey.repository.SvUsersRepository;
import com.cms.survey.service.SvUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SvUsersServiceImpl extends BaseService implements SvUsersService {

    @Autowired
    private SvUsersRepository svUsersRepository;

    @Autowired
    private SvUsersMapper svUsersMapper;

    @Override
    public SvUsersDTO createSvUsers(SvUsersCo svUsersCo) {
        SvUsers svUsers=svUsersMapper.coToEntity(svUsersCo);
        SurveyUserId surveyUserId = new SurveyUserId();
        surveyUserId.setSurveyId(svUsers.getId().getSurveyId());
        surveyUserId.setUserId(svUsers.getId().getUserId());
        svUsers.setId(surveyUserId);
        setModifier(svUsers);
        svUsers = svUsersRepository.save(svUsers);
        return svUsersMapper.entityToDTO(svUsers);
    }

    @Transactional
    @Override
    public void deleteSvUsersByUserId(Long userId) {
          svUsersRepository.deleteByIdUserId(userId);
    }
}
