package com.cms.survey.co;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;


@Data
public class SurveySubCatCo {
    @NotNull(message = "Category ID cannot be null")
    private String catId;

    @NotBlank(message = "Sub-category name cannot be blank")
    private String subCat;

}
