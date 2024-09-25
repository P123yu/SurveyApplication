package com.cms.survey.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuestionOptionsDTO {


    private String questionId;


    private Integer sort;


    private String placeholder;


    private String optionLabel;

    private String optionValues;

    private Boolean optionDefault;


}
