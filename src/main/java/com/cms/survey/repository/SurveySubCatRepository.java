package com.cms.survey.repository;

import com.cms.survey.model.SurveySubCat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface SurveySubCatRepository extends JpaRepository<SurveySubCat, String> {
    List<SurveySubCat> findByCatId(String catId);
}
