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

public class SurveyUserId implements Serializable {

    @Column(name = "survey_id")
    private String surveyId;

    @Column(name = "user_id")
    private Long userId;


}
