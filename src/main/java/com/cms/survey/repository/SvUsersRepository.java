package com.cms.survey.repository;

import com.cms.survey.model.SurveyUserId;
import com.cms.survey.model.SvUsers;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SvUsersRepository extends JpaRepository<SvUsers, SurveyUserId> {
    void deleteByIdUserId(Long userId);
    //List<SvUsers> findAll
}
