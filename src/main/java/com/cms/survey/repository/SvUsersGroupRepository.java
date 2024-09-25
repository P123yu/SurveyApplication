package com.cms.survey.repository;

import com.cms.survey.model.SvUsersGroup;
import com.cms.survey.model.UserGroupId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SvUsersGroupRepository extends JpaRepository<SvUsersGroup, UserGroupId> {
    Optional<SvUsersGroup> findByIdGroupId(String groupId);
    void deleteByIdGroupId(String groupId);
}
