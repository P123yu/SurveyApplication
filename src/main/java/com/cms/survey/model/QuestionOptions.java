package com.cms.survey.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Entity
@Table(name = "sv_question_options_")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuestionOptions extends BaseModel{

    @Id
    @Column(name = "id")
    private String id;

//    @ManyToOne
//    @JoinColumn(name = "question_id", referencedColumnName = "id")
//    private Question question;

    @Column(name = "question_id")
    private String questionId;

    @Column(name = "sort")
    private Integer sort;

    @Column(name = "placeholder")
    private String placeholder;

    @Column(name = "option_label")
    private String optionLabel;

    @Lob
    @Column(name = "option_values")
    private String optionValues;

    @Column(name = "option_default")
    private Boolean optionDefault;



}
