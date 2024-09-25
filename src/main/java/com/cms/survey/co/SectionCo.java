package com.cms.survey.co;

import lombok.Data;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Data
public class SectionCo {

    @NotBlank(message = "Survey ID cannot be blank")
    private String surveyId;

    @NotNull(message = "PreSurvey status is required")
    private Boolean isPreSurvey;

    @NotBlank(message = "Section name cannot be blank")
    @Size(max = 100, message = "Section name cannot exceed 100 characters")
    private String sectionName;

    @NotNull(message = "Sort order is required")
    private Integer sort;
}
