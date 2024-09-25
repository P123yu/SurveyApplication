package com.cms.survey.co;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UsersCo {

    @NotNull(message = "user name cannot be null")
    private String  username;
}

