package com.cms.survey.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Entity
@Table(name = "sv_question_")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Question extends BaseModel{

    @Id
    @Column(name = "id")
    private String id;

//
//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "format_id", referencedColumnName = "id")
//    private QuestionMetaData questionMetaData;

    @Column(name = "format_id")
    private String formatId;

    @Column(name = "sort")
    private Integer sort;

    @Column(name = "question")
    private String question;

    @Column(name = "que_option_type")
    private String queOptionType;

    @Column(name = "que_validation")
    private String queValidation;
}
