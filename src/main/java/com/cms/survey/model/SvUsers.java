package com.cms.survey.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "sv_users_")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SvUsers extends BaseModel{

    @EmbeddedId
    private SurveyUserId id;



}
