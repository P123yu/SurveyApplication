package com.cms.survey.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SurveyScheduleConfigDTO {

  private Integer scheduleId;
  private Object configs; // Use Object for raw JSON

}
