package com.cms.survey.service;

import com.cms.survey.co.UsersGroupsMembersCo;
import com.cms.survey.dto.UsersGroupsMembersDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UsersGroupsMembersService {

    UsersGroupsMembersDTO createUsers(UsersGroupsMembersCo usersGroupsMembersCo);
//    UsersGroupsMembersDTO updateUsers(Long id, UsersGroupsMembersCo usersGroupsMembersCo);
//    List<UsersGroupsMembersDTO> getAllUsers();
//    void deleteUsers(Long id);
//    UsersGroupsMembersDTO getUsersById(Long id);

}
