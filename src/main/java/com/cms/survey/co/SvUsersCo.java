package com.cms.survey.co;

import com.cms.survey.model.SurveyUserId;
import jakarta.persistence.EmbeddedId;
import lombok.Data;

@Data
public class SvUsersCo {

    @EmbeddedId
    private SurveyUserId id;

}
