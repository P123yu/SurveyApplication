//package com.cms.survey.model;
//
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import java.sql.Timestamp;
//
//@Data
//@Entity
//@Table(name = "yy_sv_survey_users_arch_yy")
//@NoArgsConstructor
//@AllArgsConstructor
//
//public class YySvSurveyUsersArchYy {
//
//    @Id
//    @Column(name="survey_id")
//    private Integer surveyId;
//
//    @Column(name="user_ids")
//    private String userIds;
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
//}