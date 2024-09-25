package com.cms.survey.co;

import jakarta.persistence.EmbeddedId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor

public class SvUsersGroupCo  {

    @EmbeddedId
    private UserGroupIdCo id;

}
