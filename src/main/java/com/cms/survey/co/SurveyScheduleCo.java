package com.cms.survey.co;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.util.Date;

@Data
public class SurveyScheduleCo {


    @NotBlank(message = "Schedule cannot be blank")
    @Size(min = 1, max = 255, message = "Schedule must be between 1 and 255 characters")
    private String schedule;

    @NotNull(message = "Sort cannot be null")
    @Min(value = 0, message = "Sort must be greater than or equal to 0")
    @Max(value = 1000, message = "Sort must be less than or equal to 1000")
    private Integer sort;

//    @NotNull(message = "Start Date cannot be null")
////    @PastOrPresent(message = "Start Date cannot be in the future")
////    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
//    private Date startDate;
//
//    @NotNull(message = "End Date cannot be null")
////    @Future(message = "End Date must be in the future")
////    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
//    private Date endDate;
//

    @NotNull(message = "Status cannot be null")
    private Boolean status;
}
