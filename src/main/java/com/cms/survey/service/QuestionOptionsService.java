package com.cms.survey.service;

import com.cms.survey.co.QuestionOptionsCo;
import com.cms.survey.dto.QuestionOptionsDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface QuestionOptionsService {
    QuestionOptionsDTO createQuestionOptions(QuestionOptionsCo questionOptionsCo);
    QuestionOptionsDTO updateQuestionOptions(String id, QuestionOptionsCo questionOptionsCo);
    List<QuestionOptionsDTO> getAllQuestionOptions();
    void deleteQuestionOptions(String id);
    QuestionOptionsDTO getQuestionOptionsById(String id);
}
