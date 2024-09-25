package com.cms.survey.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;



@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor

public class UserGroupId implements Serializable {

//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "survey_id", referencedColumnName = "id")
//    private Survey survey;

    @Column(name = "survey_id")
    private String surveyId;

//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "group_id", referencedColumnName = "id")
//    private UsersGroup usersGroup;

    @Column(name = "group_id")
    private String groupId;


}
