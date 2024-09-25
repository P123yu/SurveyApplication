package com.cms.survey.co;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserGroupMemberCo implements Serializable {

    @NotBlank(message = "groupId cannot be blank")
    private String groupId;
    @NotNull(message = "userId cannot be null")
    private Long userId;
}
