package com.cms.survey.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.sql.Timestamp;

@Entity
@Table(name = "sv_question_metadata_")

@Data
@NoArgsConstructor
@AllArgsConstructor

public class QuestionMetaData extends BaseModel {

    @Id
    private String id;

//
//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "section_id", referencedColumnName = "id")
//    private Section section;

    @Column(name = "section_id")
    private String sectionId;

    @Column(name = "format_type")
    private String formatType;

    @Column(name="sort")
    private Integer sort;

    @Column(name="title")
    private String title;

    @Lob
    @Column(name = "table_items")
    private String tableItems;



}


