package com.cms.survey.service.impl;

import com.cms.survey.co.QuestionMetaDataCo;
import com.cms.survey.dto.QuestionMetaDataDTO;
import com.cms.survey.mapper.QuestionMetaDataMapper;
import com.cms.survey.model.QuestionMetaData;
import com.cms.survey.repository.QuestionMetaDataRepository;
import com.cms.survey.service.QuestionMetaDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;
import java.util.Random;

@Service
public class QuestionMetaDataServiceImpl extends BaseService implements QuestionMetaDataService {

    @Autowired
    private QuestionMetaDataRepository questionMetaDataRepository;

    @Autowired
    private QuestionMetaDataMapper questionMetaDataMapper;





    @Override
    public QuestionMetaDataDTO createQuestionMetaData(QuestionMetaDataCo questionMetaDataCo) {
        QuestionMetaData questionMetaData=questionMetaDataMapper.coToEntity(questionMetaDataCo);
        questionMetaData.setId(genId(questionMetaData.getTitle()));
        setModifier(questionMetaData);
        questionMetaData = questionMetaDataRepository.save(questionMetaData);
        return questionMetaDataMapper.entityToDTO(questionMetaData);
    }


    @Override
    public QuestionMetaDataDTO updateQuestionMetaData(String id, QuestionMetaDataCo questionMetaDataCo) {
        QuestionMetaData questionMetaData = questionMetaDataMapper.coToEntity(questionMetaDataCo);
        questionMetaData.setId(id);
        setModifier(questionMetaData);
        questionMetaData = questionMetaDataRepository.save(questionMetaData);
        return questionMetaDataMapper.entityToDTO(questionMetaData);
    }

    @Override
    public List<QuestionMetaDataDTO> getAllQuestionMetaData() {
        List<QuestionMetaData> questionMetaData=questionMetaDataRepository.findAll();
        return questionMetaDataMapper.entityListToDTOList(questionMetaData);
    }

    @Override
    public void deleteQuestionMetaData(String id) {
        questionMetaDataRepository.deleteById(id);
    }

    @Override
    public QuestionMetaDataDTO getQuestionMetaDataById(String id) {
        QuestionMetaData questionMetaData = questionMetaDataRepository.findById(id).orElseThrow(() -> new RuntimeException("section not found with id: " + id));
        return questionMetaDataMapper.entityToDTO(questionMetaData);
    }
}
