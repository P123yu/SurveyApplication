package com.cms.survey.co;
import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class SurveyScheduleBlockCo {

    @NotNull(message = "Survey Schedule ID cannot be null")
    @Min(value = 1, message = "Survey Schedule ID must be at least 1")
    private Integer surveyScheduleId;

    @NotNull(message = "Pre-Survey status cannot be null")
    private Boolean isPreSurvey;

    @NotBlank(message = "Block Name cannot be blank")
    @Size(min = 1, max = 255, message = "Block Name must be between 1 and 255 characters")
    private String blockName;

    @NotNull(message = "Sort cannot be null")
    @Min(value = 0, message = "Sort must be greater than or equal to 0")
    @Max(value = 1000, message = "Sort must be less than or equal to 1000")
    private Float sort;
}
