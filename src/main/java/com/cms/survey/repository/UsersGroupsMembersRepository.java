package com.cms.survey.repository;

import com.cms.survey.model.UserGroupMember;
import com.cms.survey.model.UsersGroupsMembers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface UsersGroupsMembersRepository extends JpaRepository<UsersGroupsMembers, UserGroupMember> {

    @Transactional
    @Modifying
    @Query(value = "INSERT INTO us_users_group_ (group_id, user_id) VALUES (:groupId, :userId)", nativeQuery = true)
    void insertUserGroupMember(@Param("groupId") String groupId, @Param("userId") Long userId);



}
