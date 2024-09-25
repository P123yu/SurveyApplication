package com.cms.survey.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Entity
@Table(name = "yymm_sv_response_{yy_mm}_")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class YyMmSvResponseYyMm extends BaseModel{

    @Id
    @Column(name = "id")
    private String id;


//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "survey_id", referencedColumnName = "id")
//    private Survey survey;


    @Column(name = "survey_id")
    private String surveyId;

//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "user_id", referencedColumnName = "id")
//    private Users user;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "survey_at")
    private Timestamp surveyAt;

    @Column(name = "start_at")
    private Timestamp startAt;

    @Column(name = "end_at")
    private Timestamp endAt;

    @Lob
    @Column(name = "response", columnDefinition = "JSONB")
    private String response;

    @Column(name = "response_status")
    private String responseStatus;

    @Lob
    @Column(name = "pre_survey_resp", columnDefinition = "JSONB")
    private String preSurveyResp;

}
