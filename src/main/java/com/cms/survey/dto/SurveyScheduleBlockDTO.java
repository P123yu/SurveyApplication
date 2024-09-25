package com.cms.survey.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SurveyScheduleBlockDTO {

    private Long id;

    private Integer surveyScheduleId;

    private Boolean isPreSurvey;

    private String blockName;

    private Float sort;

}
