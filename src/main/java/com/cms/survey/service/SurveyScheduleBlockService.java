package com.cms.survey.service;
import com.cms.survey.co.SurveyScheduleBlockCo;
import com.cms.survey.dto.SurveyScheduleBlockDTO;
import org.springframework.stereotype.Service;

@Service
public interface SurveyScheduleBlockService {
    SurveyScheduleBlockDTO createSurveyScheduleBlock(SurveyScheduleBlockCo surveyScheduleBlockCo);
    SurveyScheduleBlockDTO updateSurveyScheduleBlock(Long id, SurveyScheduleBlockCo surveyScheduleBlockCo);
    void deleteSurveyScheduleBlock(Long id);
    SurveyScheduleBlockDTO getSurveyScheduleBlockByScheduleId(Integer surveyScheduleId);
}
