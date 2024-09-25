package com.cms.survey.co;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.Date;

@Data
public class SurveyCatCo {

    @NotBlank(message = "Category name cannot be empty")
    private String cat;

}




