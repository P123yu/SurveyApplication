package com.cms.survey.co;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor

public class UserGroupIdCo implements Serializable {
    private String surveyId;
    private String groupId;
}
