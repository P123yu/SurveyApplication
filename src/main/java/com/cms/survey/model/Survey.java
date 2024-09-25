package com.cms.survey.model;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "sv_survey_")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Survey extends BaseModel{

    @Id
    private String id;

    @Column(name = "title")
    private String title;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "sub_cat_id", referencedColumnName = "id")
//    private SurveySubCat surveySubCat;

    @Column(name = "sub_cat_id")
    private String subCatId;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "end_date")
    private Date endDate;

    @Column(name = "status")
    private String status;

}
