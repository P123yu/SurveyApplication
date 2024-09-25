//package com.cms.survey.model;
//
//import jakarta.persistence.*;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import lombok.AllArgsConstructor;
//
//import java.sql.Timestamp;
//
//@Entity
//@Table(name = "sv_question_format_")
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//public class QuestionFormat {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Column(name = "block_id")
//    private Integer blockId;
//
//    @Enumerated(EnumType.STRING)
//    @Column(name = "format_type", nullable = false)
//    private QuestionFormatTypeEnum formatType;
//
//    @Column(name = "format_title")
//    private String formatTitle;
//
//    @Column(name = "sort")
//    private Float sort;
//
//    @Column(name = "format_conf", columnDefinition = "JSON")
//    private String formatConf;
//
//    @Enumerated(EnumType.STRING)
//    @Column(name = "format_option_type")
//    private OptionTypeEnum formatOptionType;
//
//    @Column(name = "format_option_default")
//    private String formatOptionDefault;
//
//    @Column(name = "format_is_optional")
//    private Boolean formatIsOptional;
//
//

//}
