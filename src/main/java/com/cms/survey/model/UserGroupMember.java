package com.cms.survey.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserGroupMember implements Serializable {

    @Column(name = "id")
    private String groupId;

    @Column(name = "user_id")
    private Long userId;
}
