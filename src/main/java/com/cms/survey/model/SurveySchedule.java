package com.cms.survey.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.sql.Timestamp;

@Entity
@Table(name = "ma_survey_schedule_")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SurveySchedule extends BaseModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "schedule", nullable = false)
    private String schedule;

    @Column(name = "sort")
    private Integer sort;

    @Column(name = "status", nullable = false)
    private Boolean status;


}
