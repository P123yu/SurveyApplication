package com.cms.survey.repository;

import com.cms.survey.model.Section;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SectionRepository extends JpaRepository<Section,String> {
}
