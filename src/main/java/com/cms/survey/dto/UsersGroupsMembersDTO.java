package com.cms.survey.dto;
import com.cms.survey.model.UserGroupMember;
import jakarta.persistence.EmbeddedId;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class UsersGroupsMembersDTO {
    @EmbeddedId
    private UserGroupMemberDTO id;
}


