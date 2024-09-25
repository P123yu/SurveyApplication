package com.cms.survey.service.impl;


import com.cms.survey.co.QuestionOptionsCo;
import com.cms.survey.dto.QuestionOptionsDTO;
import com.cms.survey.mapper.QuestionOptionsMapper;
import com.cms.survey.model.QuestionOptions;
import com.cms.survey.repository.QuestionOptionsRepository;
import com.cms.survey.service.QuestionOptionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class QuestionOptionsServiceImpl extends BaseService implements QuestionOptionsService {

    @Autowired
    private QuestionOptionsRepository questionOptionsRepository;

    @Autowired
    private QuestionOptionsMapper questionOptionsMapper;

    @Override
    public QuestionOptionsDTO createQuestionOptions(QuestionOptionsCo questionOptionsCo) {
        QuestionOptions questionOptions=questionOptionsMapper.coToEntity(questionOptionsCo);
        questionOptions.setId(genId(questionOptions.getOptionLabel()));
        setModifier(questionOptions);
        questionOptions = questionOptionsRepository.save(questionOptions);
        return questionOptionsMapper.entityToDTO(questionOptions);
    }

    @Override
    public QuestionOptionsDTO updateQuestionOptions(String id, QuestionOptionsCo questionOptionsCo) {
        QuestionOptions questionOptions = questionOptionsMapper.coToEntity(questionOptionsCo);
        questionOptions.setId(id);
        setModifier(questionOptions);
        questionOptions = questionOptionsRepository.save(questionOptions);
        return questionOptionsMapper.entityToDTO(questionOptions);
    }

    @Override
    public List<QuestionOptionsDTO> getAllQuestionOptions() {
        List<QuestionOptions> allQuestionOptions=questionOptionsRepository.findAll();
        return questionOptionsMapper.entityListToDTOList(allQuestionOptions);
    }

    @Override
    public void deleteQuestionOptions(String id) {
        questionOptionsRepository.deleteById(id);
    }

    @Override
    public QuestionOptionsDTO getQuestionOptionsById(String id) {
        QuestionOptions questionOptions = questionOptionsRepository.findById(id).orElseThrow(() -> new RuntimeException("questionOptions not found with id: " + id));
        return questionOptionsMapper.entityToDTO(questionOptions);
    }
}


