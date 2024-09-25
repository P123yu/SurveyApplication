package com.cms.survey.dto;

import com.fasterxml.jackson.databind.JsonNode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SurveyScheduleConfigRenderDTO {

  private Long id;
  private Integer scheduleId;
  private JsonNode configs; // JSON field

}
