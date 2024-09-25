////package com.cms.survey.model;
////
////import jakarta.persistence.*;
////import lombok.Data;
////import lombok.NoArgsConstructor;
////import lombok.AllArgsConstructor;
////
////import java.sql.Timestamp;
////
////@Entity
////@Table(name = "ma_survey_sub_cat_")
////@Data
////@NoArgsConstructor
////@AllArgsConstructor
////public class SurveySubCat{
////
////    @Id
////    @GeneratedValue(strategy = GenerationType.IDENTITY)
////    private Long id;
////
////    @Column(name = "cat_id")
////    private Integer catId;
////
////    @Column(name = "sub_cat", nullable = false)
////    private String subCat;
////
////    @Column(name = "status", nullable = false)
////    private Boolean status;
////
////    @Column(name = "created_at")
////    private Timestamp createdAt;
////
////    @Column(name = "created_by")
////    private Long createdBy;
////
////    @Column(name = "modified_at")
////    private Timestamp modifiedAt;
////
////    @Column(name = "modified_by")
////    private Long modifiedBy;
////}
//
//
//
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
//@Table(name = "ma_survey_sub_cat_")
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//public class SurveySubCat{
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
////    @Column(name = "cat_id")
////    private Integer catId;
//
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "cat_id", referencedColumnName = "id")
//    private SurveyCat surveyCat;
//
//    @Column(name = "sub_cat", nullable = false)
//    private String subCat;
//survey
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
//}


package com.cms.survey.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.sql.Timestamp;

@Entity
@Table(name = "ma_survey_sub_cat_")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SurveySubCat extends BaseModel{

    @Id
    private String id;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "cat_id", referencedColumnName = "id")
//    private SurveyCat surveyCat;

    @Column(name = "cat_id")
    private String catId;

    @Column(name = "sub_cat")
    private String subCat;

    @Column(name = "status")
    private String status;

}
