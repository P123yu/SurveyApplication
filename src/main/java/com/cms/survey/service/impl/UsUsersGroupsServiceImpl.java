//package com.cms.survey.service.impl;
//
//import com.cms.survey.co.UsUsersGroupsCo;
//import com.cms.survey.dto.UsUsersGroupsDTO;
//import com.cms.survey.dto.UsersGroupsMembersDTO;
//import com.cms.survey.mapper.UsersGroupsMembersMapper;
//import com.cms.survey.model.UsersGroupsMembers;
//import com.cms.survey.repository.UsUsersGroupsRepository;
//import com.cms.survey.service.UsUsersGroupsService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class UsUsersGroupsServiceImpl  implements UsUsersGroupsService {
//
//    @Autowired
//    private UsUsersGroupsRepository usUsersGroupsRepository;
//
//    @Autowired
//    private UsersGroupsMembersMapper usUsersGroupsMapper;
//
//
//
//    @Override
//    public UsersGroupsMembersDTO updateUsers(Long id, UsUsersGroupsCo usUsersGroupsCo) {
//        UsersGroupsMembers usUsersGroups = usUsersGroupsMapper.coToEntity(usUsersGroupsCo);
//        usUsersGroups.setId(id);
//        usUsersGroups = usUsersGroupsRepository.save(usUsersGroups);
//        return usUsersGroupsMapper.entityToDTO(usUsersGroups);
//
//    }
//
//    @Override
//    public UsUsersGroupsDTO createUsers(UsUsersGroupsCo usUsersGroupsCo) {
//        UsersGroupsMembers usUsersGroups=usUsersGroupsMapper.coToEntity(usUsersGroupsCo);
//        usUsersGroups = usUsersGroupsRepository.save(usUsersGroups);
//        return usUsersGroupsMapper.entityToDTO(usUsersGroups);
//    }
//
//    @Override
//    public List<UsUsersGroupsDTO> getAllUsers() {
//        List<UsersGroupsMembers> allSurvey=usUsersGroupsRepository.findAll();
//        return usUsersGroupsMapper.entityListToDTOList(allSurvey);
//    }
//
//    @Override
//    public void deleteUsers(Long id) {
//        usUsersGroupsRepository.deleteById(id);
//    }
//
//    @Override
//    public UsUsersGroupsDTO getUsersById(Long id) {
//        UsersGroupsMembers usUsersGroups = usUsersGroupsRepository.findById(id).orElseThrow(() -> new RuntimeException("UsersGroupsMembers not found with id: " + id));
//        return usUsersGroupsMapper.entityToDTO(usUsersGroups);
//    }
//}
//
//
//
//
//
//
//
//
//
//
//
