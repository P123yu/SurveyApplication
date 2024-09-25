package com.cms.survey.service;
import com.cms.survey.co.SurveySubCatCo;
import com.cms.survey.dto.SurveySubCatDTO;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface SurveySubCatService {
    SurveySubCatDTO createSurveySubCat(SurveySubCatCo surveySubCatCo);
    SurveySubCatDTO updateSurveySubCat(String subCatId, SurveySubCatCo surveySubCatCo);
    List<SurveySubCatDTO> getAllSurveySubCat(String catId);
    void deleteSurveySubCat(String subCatId);
//    SurveySubCatDTO getSurveyCatByCatId(String id);

}
