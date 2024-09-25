package com.cms.survey.service.impl;

import com.cms.survey.co.SvUsersGroupCo;
import com.cms.survey.co.UsersGroupCo;
import com.cms.survey.dto.SvUsersGroupDTO;
import com.cms.survey.dto.UsersGroupDTO;
import com.cms.survey.mapper.SvUsersGroupMapper;
import com.cms.survey.mapper.UsersGroupMapper;
import com.cms.survey.model.Section;
import com.cms.survey.model.SvUsersGroup;
import com.cms.survey.model.UserGroupId;
import com.cms.survey.model.UsersGroup;
import com.cms.survey.repository.SvUsersGroupRepository;
import com.cms.survey.repository.UsersGroupRepository;
import com.cms.survey.service.SvUsersGroupService;
import com.cms.survey.service.UsersGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SvUsersGroupServiceImpl extends BaseService implements SvUsersGroupService {

    @Autowired
    private SvUsersGroupRepository svUsersGroupRepository;

    @Autowired
    private SvUsersGroupMapper svUsersGroupMapper;


    @Override
    public SvUsersGroupDTO createSvUsersGroup(SvUsersGroupCo svUsersGroupCo) {
        SvUsersGroup svUsersGroup=svUsersGroupMapper.coToEntity(svUsersGroupCo);
        UserGroupId userGroupId = new UserGroupId();
        userGroupId.setSurveyId(svUsersGroup.getId().getSurveyId());
        userGroupId.setGroupId(svUsersGroup.getId().getGroupId());
        svUsersGroup.setId(userGroupId);
        setModifier(svUsersGroup);
        svUsersGroup = svUsersGroupRepository.save(svUsersGroup);
        return svUsersGroupMapper.entityToDTO(svUsersGroup);

    }




    @Override
    public SvUsersGroupDTO updateSvUsersGroup(String  groupId, SvUsersGroupCo svUsersGroupCo) {
        SvUsersGroup svUsersGroup = svUsersGroupMapper.coToEntity(svUsersGroupCo);
        UserGroupId userGroupId = new UserGroupId();
        userGroupId.setGroupId(groupId);
        svUsersGroup.setId(userGroupId);
        setModifier(svUsersGroup);
        svUsersGroup = svUsersGroupRepository.save(svUsersGroup);
        return svUsersGroupMapper.entityToDTO(svUsersGroup);
    }

    @Override
    public List<SvUsersGroupDTO> getAllSvUsersGroup() {
        List<SvUsersGroup> allSvUsersGroup=svUsersGroupRepository.findAll();
        return svUsersGroupMapper.entityListToDTOList(allSvUsersGroup);
    }

    @Override
    @Transactional
    public void deleteSvUsersGroup(String groupId) {
        svUsersGroupRepository.deleteByIdGroupId(groupId);
    }

    @Override
    public SvUsersGroupDTO getSvUsersGroupById(UserGroupId id) {
        SvUsersGroup svUsersGroup = svUsersGroupRepository.findById(id).orElseThrow(() -> new RuntimeException("SvUsersGroup not found with id: " + id));
        return svUsersGroupMapper.entityToDTO(svUsersGroup);
    }
}





