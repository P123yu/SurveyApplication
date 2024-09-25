package com.cms.survey.model;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@Entity
@Table(name = "sv_users_group_")

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class SvUsersGroup extends BaseModel{

    @EmbeddedId
    private UserGroupId id;

}
