package com.cms.survey.repository;

import com.cms.survey.model.SurveySchedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SurveyScheduleRepository extends JpaRepository<SurveySchedule,Long> {
}
