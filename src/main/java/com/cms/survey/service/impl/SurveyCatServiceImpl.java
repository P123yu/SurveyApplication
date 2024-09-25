package com.cms.survey.service.impl;
import com.cms.survey.co.SurveyCatCo;
import com.cms.survey.dto.SurveyCatDTO;
import com.cms.survey.mapper.SurveyCatMapper;
import com.cms.survey.model.SurveyCat;
import com.cms.survey.repository.SurveyCatRepository;
import com.cms.survey.service.SurveyCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;
import java.util.Random;

@Service
public class SurveyCatServiceImpl extends BaseService implements SurveyCatService {
    @Autowired
    private SurveyCatRepository surveyCatRepository;

    @Autowired
    private SurveyCatMapper surveyCatMapper;


    @Override
    public SurveyCatDTO createSurveyCat(SurveyCatCo surveyCatCo) {
        SurveyCat surveyCat=surveyCatMapper.coToEntity(surveyCatCo);
        surveyCat.setId(genId(surveyCat.getCat()));
        surveyCat.setStatus("true");
        setModifier(surveyCat);
        surveyCat = surveyCatRepository.save(surveyCat);
        return surveyCatMapper.entityToDTO(surveyCat);
    }

    @Override
    public SurveyCatDTO updateSurveyCat(String catId, SurveyCatCo surveyCatCo) {
        SurveyCat surveyCat = surveyCatMapper.coToEntity(surveyCatCo);
        surveyCat.setId(catId);
        surveyCat.setStatus("true");
        setModifier(surveyCat);
        surveyCat = surveyCatRepository.save(surveyCat);
        return surveyCatMapper.entityToDTO(surveyCat);
    }

    @Override
    public List<SurveyCatDTO> getAllSurveyCat() {
        List<SurveyCat> allSurveyCat=surveyCatRepository.findAll();
        allSurveyCat.forEach(surveyCat -> surveyCat.setStatus("true"));
        return surveyCatMapper.entityListToDTOList(allSurveyCat);
    }

    @Override
    public void deleteSurveyCat(String catId) {
        surveyCatRepository.deleteById(catId);
    }

//    @Override
//    public SurveyCatDTO getSurveyCatById(String catId) {
//        SurveyCat surveyCategory = surveyCatRepository.findById(catId).orElseThrow(() -> new RuntimeException("Survey Category not found with id: " + catId));
//        surveyCategory.setStatus(true);
//        return surveyCatMapper.entityToDTO(surveyCategory);
//    }
}
