package com.cms.survey.service.impl;
import com.cms.survey.co.SurveySubCatCo;
import com.cms.survey.dto.SurveySubCatDTO;
import com.cms.survey.mapper.SurveySubCatMapper;
import com.cms.survey.model.SurveyCat;
import com.cms.survey.model.SurveySubCat;
import com.cms.survey.repository.SurveySubCatRepository;
import com.cms.survey.service.SurveySubCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;
import java.util.Random;

@Service
public class SurveySubCatServiceImpl extends BaseService implements SurveySubCatService {

    @Autowired
    private SurveySubCatRepository surveySubCatRepository;

   @Autowired
   private SurveySubCatMapper surveySubCatMapper;

    @Override
    public SurveySubCatDTO createSurveySubCat(SurveySubCatCo surveySubCatCo) {
        SurveySubCat surveySubCat=surveySubCatMapper.coToEntity(surveySubCatCo);
        surveySubCat.setId(genId(surveySubCat.getSubCat()));
        surveySubCat.setStatus("true");
        setModifier(surveySubCat);
        surveySubCat = surveySubCatRepository.save(surveySubCat);
        return surveySubCatMapper.entityToDTO(surveySubCat);
    }

    @Override
    public SurveySubCatDTO updateSurveySubCat(String subCatId, SurveySubCatCo surveySubCatCo) {
        SurveySubCat surveySubCat = surveySubCatMapper.coToEntity(surveySubCatCo);
        surveySubCat.setId(subCatId);
        surveySubCat.setStatus("true");
        setModifier(surveySubCat);
        surveySubCat = surveySubCatRepository.save(surveySubCat);
        return surveySubCatMapper.entityToDTO(surveySubCat);
    }

    @Override
    public List<SurveySubCatDTO> getAllSurveySubCat(String catId) {
        List<SurveySubCat> allSurveySubCat=surveySubCatRepository.findAll();
        return surveySubCatMapper.entityListToDTOList(allSurveySubCat);
    }

    @Override
    public void deleteSurveySubCat(String subCatId) {
          surveySubCatRepository.deleteById(subCatId);
    }

//    @Override
//    public SurveySubCatDTO getSurveyCatByCatId(String id) {
//        return null;
//    }

}





