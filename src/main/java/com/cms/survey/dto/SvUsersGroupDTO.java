package com.cms.survey.dto;

import com.cms.survey.model.BaseModel;
import com.cms.survey.model.UserGroupId;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;


@Data
@NoArgsConstructor
@AllArgsConstructor

public class SvUsersGroupDTO  {

    @EmbeddedId
    private UserGroupIdDTO id;

}
