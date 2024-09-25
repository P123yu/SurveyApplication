package com.cms.survey.repository;

import com.cms.survey.model.QuestionMetaData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionMetaDataRepository extends JpaRepository<QuestionMetaData,String> {
}
