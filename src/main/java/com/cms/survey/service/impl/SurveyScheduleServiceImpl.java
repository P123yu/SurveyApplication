package com.cms.survey.service.impl;
import com.cms.survey.co.SurveyScheduleCo;
import com.cms.survey.dto.SurveyScheduleDTO;
import com.cms.survey.mapper.SurveyScheduleMapper;
import com.cms.survey.model.SurveySchedule;
import com.cms.survey.repository.SurveyScheduleRepository;
import com.cms.survey.service.SurveyScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SurveyScheduleServiceImpl implements SurveyScheduleService {

    @Autowired
    private SurveyScheduleRepository surveyScheduleRepository;

    @Autowired
    private SurveyScheduleMapper surveyScheduleMapper;



    @Override
    public SurveyScheduleDTO createSurveySchedule(SurveyScheduleCo surveyScheduleCo) {
        SurveySchedule surveySchedule =surveyScheduleMapper.coToEntity(surveyScheduleCo);
        surveySchedule = surveyScheduleRepository.save(surveySchedule);
        return surveyScheduleMapper.entityToDTO(surveySchedule);
    }

    @Override
    public SurveyScheduleDTO updateSurveySchedule(Long id, SurveyScheduleCo surveyScheduleCo) {
        SurveySchedule surveySchedule = surveyScheduleMapper.coToEntity(surveyScheduleCo);
        surveySchedule.setId(id);
        surveySchedule = surveyScheduleRepository.save(surveySchedule);
        return surveyScheduleMapper.entityToDTO(surveySchedule);
    }

    @Override
    public List<SurveyScheduleDTO> getAllSurveySchedule() {
        List<SurveySchedule> allSurveySchedule=surveyScheduleRepository.findAll();
        return surveyScheduleMapper.entityListToDTOList(allSurveySchedule);
    }

    @Override
    public void deleteSurveySchedule(Long id) {
          surveyScheduleRepository.deleteById(id);
    }

    @Override
    public SurveyScheduleDTO getSurveyScheduleById(Long id) {
        SurveySchedule surveySchedule = surveyScheduleRepository.findById(id).orElseThrow(() -> new RuntimeException("Survey not found with id: " + id));
        return surveyScheduleMapper.entityToDTO(surveySchedule);
    }
}
