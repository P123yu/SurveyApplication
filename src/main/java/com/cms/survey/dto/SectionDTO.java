package com.cms.survey.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SectionDTO {

    private String id;

    private String surveyId;

    private Boolean isPreSurvey;

    private String sectionName;

    private Integer sort;

}
