package com.cms.survey.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.sql.Timestamp;

@Entity
@Table(name = "sv_section_")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Section extends BaseModel{

    @Id
    @Column(name = "id")
    private String id;

//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "survey_id", referencedColumnName = "id")
//    private Survey survey;

    @Column(name = "survey_id")
    private String surveyId;

    @Column(name = "is_pre_survey")
    private Boolean isPreSurvey;

    @Column(name = "section_name")
    private String sectionName;

    @Column(name = "sort")
    private Integer sort;


}
