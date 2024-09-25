package com.cms.survey.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Entity
@Table(name = "us_users_group_")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsersGroup extends BaseModel{

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "group_name")
    private String groupName;



}
