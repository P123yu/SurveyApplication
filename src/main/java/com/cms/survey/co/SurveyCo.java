package com.cms.survey.co;
import jakarta.validation.constraints.*;
import lombok.Data;
import java.util.Date;

@Data
public class SurveyCo {

    @NotBlank(message = "Title is mandatory")
    @Size(max = 255, message = "Title must be less than 255 characters")
    private String title;

    @NotNull(message = "Sub-category ID is mandatory")
    private String subCatId;

    @NotNull(message = "Start date is mandatory")
    //@FutureOrPresent(message = "Start date must be in the present or future")
    private Date startDate;

    @NotNull(message = "End date is mandatory")
    //@FutureOrPresent(message = "End date must be in the present or future")
    private Date endDate;


}
