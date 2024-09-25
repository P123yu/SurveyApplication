//package com.cms.survey.model;
//import jakarta.persistence.*;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import lombok.AllArgsConstructor;
//import java.sql.Timestamp;
//import java.time.LocalDateTime;
//
//@Entity
//@Table(name = "sv_survey_schedule_configs")
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//public class SurveyScheduleConfig extends BaseModel{
//
//  @Id
//  @GeneratedValue(strategy = GenerationType.IDENTITY)
//  private Long id;
//
//  @Column(name = "schedule_id")
//  private Integer scheduleId;
//
//  @Column(name = "configs")
//  private String configs;
//
//  @Column(name = "created_at", nullable = false, updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
//  private LocalDateTime createdAt;
//
//  @Column(name = "created_by")
//  private String createdBy;
//
//  @Column(name = "modified_at", nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
//  private LocalDateTime modifiedAt;
//
//  @Column(name = "modified_by")
//  private String modifiedBy;
//
//  // Getters and setters
//}
