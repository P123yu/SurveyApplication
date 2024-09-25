package com.cms.survey.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class YyMmSvResponseYyMmDTO {

    private String surveyId;

    private String userId;

    private Timestamp surveyAt;

    private Timestamp startAt;

    private Timestamp endAt;

    private String response;

    private String preSurveyResp;

}
