package com.cms.survey.service;

import com.cms.survey.co.QuestionCo;
import com.cms.survey.dto.QuestionDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface QuestionService {
    QuestionDTO createQuestion(QuestionCo questionCo);
    QuestionDTO updateQuestion(String id, QuestionCo questionCo);
    List<QuestionDTO> getAllQuestion();
    void deleteQuestion(String id);
    QuestionDTO getQuestionById(String id);
}
