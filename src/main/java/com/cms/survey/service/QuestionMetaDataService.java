package com.cms.survey.service;

import com.cms.survey.co.QuestionMetaDataCo;
import com.cms.survey.dto.QuestionMetaDataDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface QuestionMetaDataService {

    QuestionMetaDataDTO createQuestionMetaData(QuestionMetaDataCo questionMetaDataCo);
    QuestionMetaDataDTO updateQuestionMetaData(String id, QuestionMetaDataCo questionMetaDataCo);
    List<QuestionMetaDataDTO> getAllQuestionMetaData();
    void deleteQuestionMetaData(String id);
    QuestionMetaDataDTO getQuestionMetaDataById(String id);
}
