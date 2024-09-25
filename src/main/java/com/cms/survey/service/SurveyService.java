package com.cms.survey.service;

import com.cms.survey.co.SurveyCo;
import com.cms.survey.co.SurveyScheduleConfigCo;
import com.cms.survey.dto.SurveyDTO;
import com.cms.survey.dto.SurveyScheduleConfigRenderDTO;
import com.cms.survey.model.Survey;
//import com.cms.survey.model.SurveyScheduleConfig;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface SurveyService {
    SurveyDTO createSurvey(SurveyCo surveyCo);
    SurveyDTO updateSurvey(String id, SurveyCo surveyCo);
    List<SurveyDTO> getAllSurvey();
    void deleteSurvey(String id);
    SurveyDTO getSurveyById(String id);
    List<SurveyDTO> getAllSurveyPageAndSort(int page, int size, String sortBy, String direction);
//    SurveyScheduleConfig saveSurveyScheduleConfig(SurveyScheduleConfigCo config);
//
//    List<SurveyScheduleConfigRenderDTO> getConfigsByScheduleId(Integer scheduleId);
}
