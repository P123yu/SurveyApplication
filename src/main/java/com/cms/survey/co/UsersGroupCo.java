package com.cms.survey.co;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UsersGroupCo {
    @NotBlank(message = "GroupName cannot be blank")
    private String groupName;
}
