package com.cms.survey.co;
import com.cms.survey.model.UserGroupMember;
import jakarta.persistence.EmbeddedId;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsersGroupsMembersCo {

    @EmbeddedId
    private UserGroupMemberCo id;
}
