package com.cms.survey.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class SurveySubCatDTO {
    private String id;
    private String catId;
    private String subCat;
    private Boolean status;
}
