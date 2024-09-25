package com.cms.survey.service.impl;

import com.cms.survey.co.UsersGroupsMembersCo;
import com.cms.survey.dto.UsersGroupsMembersDTO;
import com.cms.survey.mapper.UsersGroupsMembersMapper;
import com.cms.survey.model.*;
import com.cms.survey.repository.UsersGroupsMembersRepository;
import com.cms.survey.service.UsersGroupsMembersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UsersGroupsMembersServiceImpl extends BaseService implements UsersGroupsMembersService {

    @Autowired
    private UsersGroupsMembersRepository usersGroupsMembersRepository;

    @Autowired
    private UsersGroupsMembersMapper usersGroupsMembersMapper;



//    @Override
//    public UsersGroupsMembersDTO updateUsers(Long id, UsersGroupsMembersCo usersGroupsMembersCo) {
//        UsersGroupsMembers usersGroupsMembers = usersGroupsMembersMapper.coToEntity(usersGroupsMembersCo);
//        usersGroupsMembers.setId(id);
//        usersGroupsMembers = usersGroupsMembersRepository.save(usersGroupsMembers);
//        return usersGroupsMembersMapper.entityToDTO(usersGroupsMembers);
//
//    }



//    @Override
//    public UsersGroupsMembersDTO createUsers(UsersGroupsMembersCo usersGroupsMembersCo) {
//        UsersGroupsMembers usersGroupsMembers=usersGroupsMembersMapper.coToEntity(usersGroupsMembersCo);
//        System.out.println(String.valueOf(usersGroupsMembers));
//        UserGroupMember userGroupMember=new UserGroupMember();
//        userGroupMember.setUserId(usersGroupsMembers.getId().getUserId());
//        userGroupMember.setGroupId(usersGroupsMembers.getId().getGroupId());
//        usersGroupsMembers.setId(userGroupMember);
//        setModifier(usersGroupsMembers);
//        usersGroupsMembers = usersGroupsMembersRepository.save(usersGroupsMembers);
//        return usersGroupsMembersMapper.entityToDTO(usersGroupsMembers);
//    }

    @Override
    public UsersGroupsMembersDTO createUsers(UsersGroupsMembersCo usersGroupsMembersCo) {
        UsersGroupsMembers usersGroupsMembers = usersGroupsMembersMapper.coToEntity(usersGroupsMembersCo);
        System.out.println(String.valueOf(usersGroupsMembers));
        String groupId = usersGroupsMembers.getId().getGroupId();
        Long userId = usersGroupsMembers.getId().getUserId();
        usersGroupsMembersRepository.insertUserGroupMember(groupId, userId);
        return usersGroupsMembersMapper.entityToDTO(usersGroupsMembers);
    }


//    @Override
//    public List<UsersGroupsMembersDTO> getAllUsers() {
//        List<UsersGroupsMembers> allSurvey=usersGroupsMembersRepository.findAll();
//        return usersGroupsMembersMapper.entityListToDTOList(allSurvey);
//    }
//
//    @Override
//    public void deleteUsers(Long id) {
//        usersGroupsMembersRepository.deleteById(id);
//    }
//
//    @Override
//    public UsersGroupsMembersDTO getUsersById(Long id) {
//        UsersGroupsMembers usersGroupsMembers = usersGroupsMembersRepository.findById(id).orElseThrow(() -> new RuntimeException("UsersGroupsMembers not found with id: " + id));
//        return usersGroupsMembersMapper.entityToDTO(usersGroupsMembers);
//    }
}











