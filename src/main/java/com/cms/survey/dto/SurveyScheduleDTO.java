package com.cms.survey.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class SurveyScheduleDTO {

    private Long id;

    private String schedule;

    private Integer sort;

    private Boolean status;

}
