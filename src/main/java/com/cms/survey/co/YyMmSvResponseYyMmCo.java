package com.cms.survey.co;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.sql.Timestamp;

@Data
public class YyMmSvResponseYyMmCo {

    @NotBlank(message = "Survey ID cannot be blank")
    private String surveyId;

    @NotBlank(message = "User ID cannot be blank")
    private String userId;

    @NotNull(message = "Survey timestamp cannot be null")
    private Timestamp surveyAt;

    @NotNull(message = "Start timestamp cannot be null")
    private Timestamp startAt;

    @NotNull(message = "End timestamp cannot be null")
    private Timestamp endAt;

    @NotBlank(message = "Response cannot be blank")
    private String response;

    @NotBlank(message = "PreSurveyResp cannot be blank")
    private String preSurveyResp;
}
