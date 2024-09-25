package com.cms.survey.service;

import com.cms.survey.co.SurveyScheduleCo;
import com.cms.survey.dto.SurveyDTO;
import com.cms.survey.dto.SurveyScheduleDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SurveyScheduleService {
    SurveyScheduleDTO createSurveySchedule(SurveyScheduleCo surveyScheduleCo);
    SurveyScheduleDTO updateSurveySchedule(Long id, SurveyScheduleCo surveyScheduleCo);
    List<SurveyScheduleDTO> getAllSurveySchedule();
    void deleteSurveySchedule(Long id);
    SurveyScheduleDTO getSurveyScheduleById(Long id);
}
