package com.cms.survey.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Entity
@Table(name = "yy_sv_survey_arch_")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class YySvSurveyArchYy extends BaseModel{

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "title")
    private String title;

    @Column(name = "start_date")
    private Timestamp startDate;

    @Column(name = "end_date")
    private Timestamp endDate;

    @Lob
    @Column(name = "questions", columnDefinition = "JSONB")
    private String questions;




}
