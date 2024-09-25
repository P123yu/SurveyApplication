package com.cms.survey.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuestionDTO {
    private String id;

    private String formatId;

    private Integer sort;

    private String question;

    private String queOptionType;

    private String queValidation;

}
