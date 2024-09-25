package com.cms.survey.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="us_users_group_")

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsersGroupsMembers extends BaseModel {
    @EmbeddedId
    private UserGroupMember id;
}
