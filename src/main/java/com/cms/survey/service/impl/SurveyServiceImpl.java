package com.cms.survey.service.impl;
import com.cms.survey.co.SurveyCo;
import com.cms.survey.co.SurveyScheduleConfigCo;
import com.cms.survey.dto.SurveyDTO;
import com.cms.survey.dto.SurveyScheduleConfigRenderDTO;
import com.cms.survey.mapper.SurveyMapper;
//import com.cms.survey.mapper.SurveyScheduleConfigMapper;
import com.cms.survey.model.Survey;
import com.cms.survey.model.SurveyCat;
//import com.cms.survey.model.SurveyScheduleConfig;
import com.cms.survey.repository.SurveyRepository;
//import com.cms.survey.repository.SurveyScheduleConfigRepository;
import com.cms.survey.service.SurveyService;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SurveyServiceImpl extends BaseService implements SurveyService {


    @Autowired
    public SurveyRepository surveyRepository;
//
//    @Autowired
//    private SurveyScheduleConfigRepository surveyConfigRepository;


    @Autowired
    public SurveyMapper surveyMapper;

//    @Autowired
//    public SurveyScheduleConfigMapper surveyScheduleConfigMapper;

//    @Autowired
//    private ObjectMapper objectMapper;



    @Override
    public SurveyDTO createSurvey(SurveyCo surveyCo) {
        Survey survey=surveyMapper.coToEntity(surveyCo);
        survey.setId(genId(survey.getTitle()));
        survey.setStatus("true");
        setModifier(survey);
        survey = surveyRepository.save(survey);
        return surveyMapper.entityToDTO(survey);
    }



    @Override
    public SurveyDTO updateSurvey(String id, SurveyCo surveyCo) {
        Survey survey = surveyMapper.coToEntity(surveyCo);
        survey.setId(id);
        survey.setStatus("true");
        setModifier(survey);
        survey = surveyRepository.save(survey);
        return surveyMapper.entityToDTO(survey);
    }



    @Override
    public List<SurveyDTO> getAllSurvey() {
        List<Survey> allSurvey=surveyRepository.findAll();
        allSurvey.forEach(survey -> survey.setStatus("true"));
        return surveyMapper.entityListToDTOList(allSurvey);
    }

    @Override
    public void deleteSurvey(String id) {
        surveyRepository.deleteById(id);
    }

    @Override
    public SurveyDTO getSurveyById(String Id) {
        Survey survey = surveyRepository.findById(Id).orElseThrow(() -> new RuntimeException("Survey not found with id: " + Id));
        survey.setStatus("true");
        return surveyMapper.entityToDTO(survey);
    }


//    @Override
//    public List<SurveyDTO> getAllSurveyPageAndSort(int page, int perPage, String[] sortBy, String[] order) {
//        List<Sort.Order> orders = new ArrayList<>();
//        for (int i = 0; i < sortBy.length; i++) {
//            orders.add(new Sort.Order(Sort.Direction.fromString(order[i]), sortBy[i]));
//        }
//        Pageable pageable = PageRequest.of(page, perPage, Sort.by(orders));
//        return surveyPage.getContent();
//        List<Survey>surveyList= (List<Survey>) surveyRepository.findAll(pageable);
//        return surveyMapper.entityListToDTOList(surveyList);
//
//    }


    public List<SurveyDTO> getAllSurveyPageAndSort(int page, int size, String sortBy, String direction) {
        // Determine the sort direction
        Sort.Direction sortDirection = direction.equalsIgnoreCase("DESC") ? Sort.Direction.DESC : Sort.Direction.ASC;

        // Create Pageable with the page number, size, and sorting
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortDirection, sortBy));

        // Fetch the paginated and sorted data
        Page<Survey> surveyPage = surveyRepository.findAll(pageable);

        // Return the content (List<Survey>) of the Page
        List<Survey>surveyList=surveyPage.getContent();
        return surveyMapper.entityListToDTOList(surveyList);

    }

//    public Page<Survey> listSurveys(int page, int perPage, String[] sortBy, String[] order) {
//        List<Sort.Order> orders = new ArrayList<>();
//        for (int i = 0; i < sortBy.length; i++) {
//            orders.add(new Sort.Order(Sort.Direction.fromString(order[i]), sortBy[i]));
//        }
//
//        Pageable pageable = PageRequest.of(page, perPage, Sort.by(orders));
//        return surveyRepository.findAll(pageable);
//    }

//
//    @Override
//    public List<SurveyDTO> getAllSurveyPageAndSort(int page, int perPage, String[] sortBy, String[] order) {
//            List<Sort.Order> orders = new ArrayList<>();
//            for (int i = 0; i < sortBy.length; i++) {
//                orders.add(new Sort.Order(Sort.Direction.fromString(order[i]), sortBy[i]));
//            }
//            Pageable pageable = PageRequest.of(page, perPage, Sort.by(orders));
//        return surveyPage.getContent();
//            List<Survey>surveyList= (List<Survey>) surveyRepository.findAll(pageable);
//        return surveyMapper.entityListToDTOList(surveyList);
//
//    }
//
//    public SurveyScheduleConfig saveSurveyScheduleConfig(SurveyScheduleConfigCo config) {
//
//        SurveyScheduleConfig surveyConfig=new SurveyScheduleConfig();
//        try {
//            String jsonConfigs = objectMapper.writeValueAsString(config.getConfigs());
//            surveyConfig.setConfigs(jsonConfigs);
//            surveyConfig.setScheduleId(config.getScheduleId());
//        } catch (Exception e) {
//            // Handle exception
//        }
//
//
//        return surveyConfigRepository.save(surveyConfig);
//    }
//
//    public List<SurveyScheduleConfigRenderDTO> getConfigsByScheduleId(Integer scheduleId) {
//
//        List<SurveyScheduleConfig> configs = surveyConfigRepository.findLatestOneByScheduleId(scheduleId);
//
//        List<SurveyScheduleConfigRenderDTO> finalConfig = configs.stream().map(config -> {
//            SurveyScheduleConfigRenderDTO dto = new SurveyScheduleConfigRenderDTO();
//            dto.setId(config.getId());
//            dto.setScheduleId(config.getScheduleId());
//
//            try {
//                JsonNode jsonConfigs = objectMapper.readTree(config.getConfigs());
//                dto.setConfigs(jsonConfigs);
//            } catch (Exception e) {
//                // Handle exception
//            }
//
////            dto.setStatus(config.getStatus());
////            dto.setCreatedAt(config.getCreatedAt());
////            dto.setCreatedBy(config.getCreatedBy());
////            dto.setModifiedAt(config.getModifiedAt());
////            dto.setModifiedBy(config.getModifiedBy());
//            return dto;
//        }).collect(Collectors.toList());
//
//        return finalConfig;
//    }
}

