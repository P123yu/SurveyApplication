//package com.cms.survey.model;
//import jakarta.persistence.*;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import lombok.AllArgsConstructor;
//import java.sql.Timestamp;
//import java.util.Date;
//
//@Entity
//@Table(name = "sv_survey_schedule_")
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//public class SvSurveySchedule {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Column(name = "survey_id")
//    private Integer surveyId;
//
//    @Column(name = "schedule_id")
//    private Integer scheduleId;
//
//    @Column(name="schedule_title")
//    private String scheduleTitle;
//
//    @Column(name = "start_date")
//    private Date startDate;
//
//    @Column(name = "end_date")
//    private Date endDate;
//
//
//
////    @Enumerated(EnumType.STRING)
////    @Column(name = "status", nullable = false)
////    private SurveyScheduleStatusEnum status;
//
//    @Column(name = "created_at")
//    private Timestamp createdAt;
//
//    @Column(name = "created_by")
//    private Long createdBy;
//
//    @Column(name = "modified_at")
//    private Timestamp modifiedAt;
//
//    @Column(name = "modified_by")
//    private Long modifiedBy;
//
//}
