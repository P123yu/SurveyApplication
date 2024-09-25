//package com.cms.survey.co;
//import jakarta.validation.constraints.Future;
//import jakarta.validation.constraints.NotBlank;
//import jakarta.validation.constraints.NotNull;
//import jakarta.validation.constraints.PastOrPresent;
//import lombok.Data;
//
//import java.util.Date;
//
//@Data
//public class SvSurveyScheduleCo {
//    @NotNull(message = "Survey ID cannot be null")
//    private Integer surveyId;
//
//    @NotNull(message = "Schedule ID cannot be null")
//    private Integer scheduleId;
//
//    @NotNull(message = "Start Date cannot be null")
//    //@PastOrPresent(message = "Start Date cannot be in the future")
//    private Date startDate;
//
//    @NotNull(message = "End Date cannot be null")
//    //@Future(message = "End Date must be in the future")
//    private Date endDate;
//
//    @NotBlank(message = "Schedule can not be blank")
//    private String scheduleTitle;
//
//}
