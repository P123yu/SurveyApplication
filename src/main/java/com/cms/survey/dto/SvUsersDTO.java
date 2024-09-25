package com.cms.survey.dto;

import jakarta.persistence.EmbeddedId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SvUsersDTO {

    @EmbeddedId
    private SurveyUserIdDTO id;

}
