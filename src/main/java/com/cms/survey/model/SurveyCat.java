//package com.cms.survey.model;
//
//import jakarta.persistence.*;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import lombok.AllArgsConstructor;
//
//import java.sql.Timestamp;
//import java.util.HashSet;
//import java.util.Set;
//
//@Entity
//@Table(name = "ma_survey_cat_")
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//public class SurveyCat {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Column(name = "cat", nullable = false)
//    private String cat;
//
//
//    @Column(name = "status", nullable = false)
//    private Boolean status;
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
//
//
//}
//


package com.cms.survey.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.sql.Timestamp;

@Entity
@Table(name = "ma_survey_cat_")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SurveyCat extends BaseModel{
    @Id
    private String id;

    @Column(name = "cat")
    private String cat;

    @Column(name = "status")
    private String status;
}
