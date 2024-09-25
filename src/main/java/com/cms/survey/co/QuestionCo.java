package com.cms.survey.co;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuestionCo {

    @NotBlank(message = "Format ID cannot be blank")
    private String formatId;

    @NotNull(message = "Sort order cannot be null")
    private Integer sort;

    @NotBlank(message = "Question cannot be blank")
    @Size(max = 500, message = "Question cannot exceed 500 characters")
    private String question;

    @NotBlank(message = "Question option type cannot be blank")
    private String queOptionType;

    @Size(max = 100, message = "Question validation cannot exceed 100 characters")
    private String queValidation;

}
