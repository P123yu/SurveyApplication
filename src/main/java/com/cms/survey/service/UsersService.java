package com.cms.survey.service;
import com.cms.survey.co.UsersCo;
import com.cms.survey.dto.UsersDTO;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface UsersService {

    UsersDTO createUsers(UsersCo usersCo);
    UsersDTO updateUsers(Long id, UsersCo usersCo);
    List<UsersDTO> getAllUsers();
    void deleteUsers(Long id);
    UsersDTO getUsersById(Long id);

}
