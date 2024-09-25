package com.cms.survey.service.impl;//package com.cms.survey.service.impl;

import com.cms.survey.co.SurveyCatCo;
import com.cms.survey.co.UsersGroupCo;
import com.cms.survey.dto.SurveyCatDTO;
import com.cms.survey.dto.UsersGroupDTO;
import com.cms.survey.mapper.SurveyCatMapper;
import com.cms.survey.mapper.UsersGroupMapper;
import com.cms.survey.model.SurveyCat;
import com.cms.survey.model.UsersGroup;
import com.cms.survey.repository.SurveyCatRepository;
import com.cms.survey.service.SurveyCatService;
import com.cms.survey.service.UsersGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cms.survey.repository.UsersGroupRepository;
import java.util.List;


@Service
public class UsersGroupServiceImpl extends BaseService implements UsersGroupService {

 @Autowired
 private UsersGroupMapper usersGroupMapper;

 @Autowired
 private UsersGroupRepository usersGroupRepository;

    @Override
    public UsersGroupDTO createUsersGroup(UsersGroupCo usersGroupCo) {
        UsersGroup usersGroup=usersGroupMapper.coToEntity(usersGroupCo);
        usersGroup.setId(genId(usersGroup.getGroupName()));
        setModifier(usersGroup);
        usersGroup = usersGroupRepository.save(usersGroup);
        return usersGroupMapper.entityToDTO(usersGroup);
    }

    @Override
    public UsersGroupDTO updateUsersGroup(String id, UsersGroupCo usersGroupCo) {
        UsersGroup usersGroup = usersGroupMapper.coToEntity(usersGroupCo);
        usersGroup.setId(id);
        setModifier(usersGroup);
        usersGroup = usersGroupRepository.save(usersGroup);
        return usersGroupMapper.entityToDTO(usersGroup);
    }

    @Override
    public List<UsersGroupDTO> getAllUsersGroup() {
        List<UsersGroup> allSurveyCat=usersGroupRepository.findAll();
        return usersGroupMapper.entityListToDTOList(allSurveyCat);
    }

    @Override
    public void deleteUsersGroup(String id) {
        usersGroupRepository.deleteById(id);
    }

    @Override
    public UsersGroupDTO getUsersGroupById(String id) {
        UsersGroup usersGroup = usersGroupRepository.findById(id).orElseThrow(() -> new RuntimeException("Survey Category not found with id: " + id));
        return usersGroupMapper.entityToDTO(usersGroup);
    }
}


