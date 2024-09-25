package com.cms.survey.co;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class QuestionOptionsCo {

    @NotBlank(message = "Question ID cannot be blank")
    private String questionId;

    @NotNull(message = "Sort order cannot be null")
    private Integer sort;

    @Size(max = 255, message = "Placeholder cannot exceed 255 characters")
    private String placeholder;

    @NotBlank(message = "Option label cannot be blank")
    @Size(max = 255, message = "Option label cannot exceed 255 characters")
    private String optionLabel;

    @NotBlank(message = "Option values cannot be blank")
    @Size(max = 500, message = "Option values cannot exceed 500 characters")
    private String optionValues;

    @NotNull(message = "Option default cannot be null")
    private Boolean optionDefault;
}
