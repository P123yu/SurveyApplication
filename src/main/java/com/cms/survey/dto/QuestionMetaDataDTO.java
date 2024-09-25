package com.cms.survey.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuestionMetaDataDTO {

    private String id;

    private String sectionId;

    private String formatType;

    private Integer sort;

    private String title;


    private String tableItems;
}
