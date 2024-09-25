package com.cms.survey.repository;

import com.cms.survey.model.Survey;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SurveyRepository extends JpaRepository<Survey,String> {
   Page<Survey> findAll(Pageable pageable);
//Page<Survey> findAll(Pageable pageable);

}
