package com.cms.survey.service;

import com.cms.survey.co.SurveyCatCo;
import com.cms.survey.dto.SurveyCatDTO;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public interface SurveyCatService {
    SurveyCatDTO createSurveyCat(SurveyCatCo surveyCatCo);
    SurveyCatDTO updateSurveyCat(String catId, SurveyCatCo surveyCatCo);
    List<SurveyCatDTO> getAllSurveyCat();
    void deleteSurveyCat(String catId);
//    SurveyCatDTO getSurveyCatById(String catId);
}
