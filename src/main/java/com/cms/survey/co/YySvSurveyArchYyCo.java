//package com.cms.survey.co;
//
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import jakarta.validation.constraints.NotBlank;
//import jakarta.validation.constraints.NotNull;
//import jakarta.validation.constraints.Size;
//import java.util.Date;
//
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@Builder
//public class YySvSurveyArchYyCo {
//
//    @NotBlank(message = "Title is mandatory")
//    @Size(max = 255, message = "Title must be less than 255 characters")
//    private String title;
//
//    @NotNull(message = "Start date is mandatory")
//    private Date startDate;
//
//    @NotNull(message = "End date is mandatory")
//    private Date endDate;
//
//    @NotBlank(message = "Questions field is mandatory")
//    private String questions;
//}
