package com.cms.survey.service.impl;

import com.cms.survey.co.QuestionCo;
import com.cms.survey.co.SurveyCatCo;
import com.cms.survey.co.YyMmSvResponseYyMmCo;
import com.cms.survey.dto.QuestionDTO;
import com.cms.survey.dto.SurveyCatDTO;
import com.cms.survey.dto.YyMmSvResponseYyMmDTO;
import com.cms.survey.mapper.QuestionMapper;
import com.cms.survey.mapper.YyMmSvResponseYyMmMapper;
import com.cms.survey.model.Question;
import com.cms.survey.model.SurveyCat;
import com.cms.survey.model.YyMmSvResponseYyMm;
import com.cms.survey.repository.QuestionRepository;
import com.cms.survey.repository.YyMmSvResponseYyMmRepository;
import com.cms.survey.service.QuestionService;
import com.cms.survey.service.YyMmSvResponseYyMmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class YyMmSvResponseYyMmSeviceImpl extends BaseService implements YyMmSvResponseYyMmService {

    @Autowired
    private YyMmSvResponseYyMmRepository yyMmSvResponseYyMmRepository;

    @Autowired
    private YyMmSvResponseYyMmMapper yyMmSvResponseYyMmMapper;


    @Override
    public YyMmSvResponseYyMmDTO createYyMmResponse(YyMmSvResponseYyMmCo yyMmSvResponseYyMmCo) {
        YyMmSvResponseYyMm yyMmSvResponseYyMm=yyMmSvResponseYyMmMapper.coToEntity(yyMmSvResponseYyMmCo);
        yyMmSvResponseYyMm.setId(genId(yyMmSvResponseYyMm.getSurveyId()));
        yyMmSvResponseYyMm.setResponseStatus("true");
        setModifier(yyMmSvResponseYyMm);
        yyMmSvResponseYyMm = yyMmSvResponseYyMmRepository.save(yyMmSvResponseYyMm);
        return yyMmSvResponseYyMmMapper.entityToDTO(yyMmSvResponseYyMm);
    }

    @Override
    public YyMmSvResponseYyMmDTO updateYyMmResponse(String id, YyMmSvResponseYyMmCo yyMmSvResponseYyMmCo) {
        YyMmSvResponseYyMm yyMmSvResponseYyMm = yyMmSvResponseYyMmMapper.coToEntity(yyMmSvResponseYyMmCo);
        yyMmSvResponseYyMm.setId(id);
        yyMmSvResponseYyMm.setResponseStatus("true");
        setModifier(yyMmSvResponseYyMm);
        yyMmSvResponseYyMm = yyMmSvResponseYyMmRepository.save(yyMmSvResponseYyMm);
        return yyMmSvResponseYyMmMapper.entityToDTO(yyMmSvResponseYyMm);
    }

    @Override
    public List<YyMmSvResponseYyMmDTO> getAllYyMmResponse() {
        List<YyMmSvResponseYyMm> allYyMmSvResponseYyMm=yyMmSvResponseYyMmRepository.findAll();
        allYyMmSvResponseYyMm.forEach(yyMmSvResponseYyMm -> yyMmSvResponseYyMm.setResponseStatus("true"));
        return yyMmSvResponseYyMmMapper.entityListToDTOList(allYyMmSvResponseYyMm);
    }

    @Override
    public void deleteYyMmResponse(String id) {
        yyMmSvResponseYyMmRepository.deleteById(id);
    }

    @Override
    public YyMmSvResponseYyMmDTO getYyMmResponseById(String id) {
        YyMmSvResponseYyMm yyMmSvResponseYyMm = yyMmSvResponseYyMmRepository.findById(id).orElseThrow(() -> new RuntimeException("YyMmSvResponseYyMm not found with id: " + id));
        yyMmSvResponseYyMm.setResponseStatus("true");
        return yyMmSvResponseYyMmMapper.entityToDTO(yyMmSvResponseYyMm);
    }
}


