package com.cms.survey.model;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.sql.Timestamp;

@Entity
@Table(name = "sv_blocks_")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class SurveyScheduleBlock extends BaseModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "survey_schedule_id")
    private Integer surveyScheduleId;

    @Column(name = "is_pre_survey")
    private Boolean isPreSurvey;

    @Column(name = "blockName")
    private String blockName;

    @Column(name = "sort")
    private Float sort;


}
