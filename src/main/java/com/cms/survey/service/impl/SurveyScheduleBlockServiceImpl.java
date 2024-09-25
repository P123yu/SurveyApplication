package com.cms.survey.service.impl;
import com.cms.survey.co.SurveyScheduleBlockCo;
import com.cms.survey.dto.SurveyScheduleBlockDTO;
import com.cms.survey.mapper.SurveyScheduleBlockMapper;
import com.cms.survey.model.SurveyScheduleBlock;
import com.cms.survey.repository.SurveyScheduleBlockRepository;
import com.cms.survey.service.SurveyScheduleBlockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SurveyScheduleBlockServiceImpl implements SurveyScheduleBlockService {

    @Autowired
    private SurveyScheduleBlockRepository surveyScheduleBlockRepository;

    @Autowired
    private SurveyScheduleBlockMapper surveyScheduleBlockMapper;

    @Override
    public SurveyScheduleBlockDTO createSurveyScheduleBlock(SurveyScheduleBlockCo surveyScheduleBlockCo) {
        SurveyScheduleBlock surveyScheduleBlock=surveyScheduleBlockMapper.coToEntity(surveyScheduleBlockCo);
        surveyScheduleBlock = surveyScheduleBlockRepository.save(surveyScheduleBlock);
        return surveyScheduleBlockMapper.entityToDTO(surveyScheduleBlock);
    }

    @Override
    public SurveyScheduleBlockDTO updateSurveyScheduleBlock(Long id, SurveyScheduleBlockCo surveyScheduleBlockCo) {
        SurveyScheduleBlock surveyScheduleBlock=surveyScheduleBlockMapper.coToEntity(surveyScheduleBlockCo);
        surveyScheduleBlock.setId(id);
        surveyScheduleBlock = surveyScheduleBlockRepository.save(surveyScheduleBlock);
        return surveyScheduleBlockMapper.entityToDTO(surveyScheduleBlock);
    }

    @Override
    public void deleteSurveyScheduleBlock(Long id) {
          surveyScheduleBlockRepository.deleteById(id);
    }

    @Override
    public SurveyScheduleBlockDTO getSurveyScheduleBlockByScheduleId(Integer surveyScheduleId) {
        SurveyScheduleBlock surveyScheduleBlock=surveyScheduleBlockRepository.findBySurveyScheduleId(surveyScheduleId).orElseThrow(() -> new RuntimeException("Survey Schedule Block not found with surveyScheduleId: " + surveyScheduleId));
        return surveyScheduleBlockMapper.entityToDTO(surveyScheduleBlock);
    }
}
