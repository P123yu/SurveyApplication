package com.cms.survey.service.impl;

import com.cms.survey.co.QuestionCo;

import com.cms.survey.dto.QuestionDTO;

import com.cms.survey.mapper.QuestionMapper;

import com.cms.survey.model.Question;

import com.cms.survey.repository.QuestionRepository;

import com.cms.survey.service.QuestionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class QuestionServiceImpl extends BaseService implements QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private QuestionMapper  questionMapper;

    @Override
    public QuestionDTO createQuestion(QuestionCo questionCo) {
        Question question=questionMapper.coToEntity(questionCo);
        question.setId(genId(question.getQuestion()));
        setModifier(question);
        question = questionRepository.save(question);
        return questionMapper.entityToDTO(question);
    }

    @Override
    public QuestionDTO updateQuestion(String id, QuestionCo questionCo) {
        Question question = questionMapper.coToEntity(questionCo);
        question.setId(id);
        setModifier(question);
        question = questionRepository.save(question);
        return questionMapper.entityToDTO(question);
    }

    @Override
    public List<QuestionDTO> getAllQuestion() {
        List<Question> allQuestion=questionRepository.findAll();
        return questionMapper.entityListToDTOList(allQuestion);
    }

    @Override
    public void deleteQuestion(String id) {
        questionRepository.deleteById(id);
    }

    @Override
    public QuestionDTO getQuestionById(String id) {
        Question question = questionRepository.findById(id).orElseThrow(() -> new RuntimeException("question not found with id: " + id));
        return questionMapper.entityToDTO(question);
    }
}



