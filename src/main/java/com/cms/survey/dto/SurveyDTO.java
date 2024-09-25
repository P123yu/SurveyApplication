package com.cms.survey.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SurveyDTO {

    private String id;

    private String title;

    private String subCatId;

    private Date startDate;

    private Date endDate;

    private Boolean status;

}
