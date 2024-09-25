package com.cms.survey.repository;

import com.cms.survey.model.SurveyScheduleBlock;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SurveyScheduleBlockRepository extends JpaRepository<SurveyScheduleBlock,Long> {
    Optional<SurveyScheduleBlock> findBySurveyScheduleId(Integer surveyScheduleId);
}
