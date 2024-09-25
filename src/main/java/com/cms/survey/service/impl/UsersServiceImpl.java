package com.cms.survey.service.impl;

import com.cms.survey.co.UsersCo;
import com.cms.survey.dto.UsersDTO;
import com.cms.survey.mapper.UsersMapper;
import com.cms.survey.model.Users;
import com.cms.survey.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cms.survey.repository.UsersRepository;
import java.util.List;


@Service
public class UsersServiceImpl extends BaseService implements UsersService {

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private UsersMapper usersMapper;



    @Override
    public UsersDTO updateUsers(Long id, UsersCo usersCo) {
        Users users = usersMapper.coToEntity(usersCo);
        users.setId(id);
        setModifier(users);
        users = usersRepository.save(users);
        return usersMapper.entityToDTO(users);

    }

    @Override
    public UsersDTO createUsers(UsersCo usersCo) {
        Users users=usersMapper.coToEntity(usersCo);
        setModifier(users);
        users = usersRepository.save(users);
        return usersMapper.entityToDTO(users);
    }

    @Override
    public List<UsersDTO> getAllUsers() {
        List<Users> allSurvey=usersRepository.findAll();
        return usersMapper.entityListToDTOList(allSurvey);
    }

    @Override
    public void deleteUsers(Long id) {
             usersRepository.deleteById(id);
    }

    @Override
    public UsersDTO getUsersById(Long id) {
        Users users = usersRepository.findById(id).orElseThrow(() -> new RuntimeException("Users not found with id: " + id));
        return usersMapper.entityToDTO(users);
    }
}











