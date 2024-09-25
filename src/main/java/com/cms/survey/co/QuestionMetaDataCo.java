package com.cms.survey.co;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class QuestionMetaDataCo {

    @NotBlank(message = "Section ID cannot be blank")
    private String sectionId;

    @NotBlank(message = "Format Type cannot be blank")
    @Size(max = 50, message = "Format Type cannot exceed 50 characters")
    private String formatType;

    @NotNull(message = "Sort cannot be null")
    private Integer sort;

    @NotBlank(message = "Title cannot be blank")
    @Size(max = 100, message = "Title cannot exceed 100 characters")
    private String title;

    @NotBlank(message = "Table Items cannot be blank")
    private String tableItems;
}
