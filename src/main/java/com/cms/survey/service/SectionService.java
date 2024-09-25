package com.cms.survey.service;

import com.cms.survey.co.SectionCo;
import com.cms.survey.dto.SectionDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SectionService {
    SectionDTO createSection(SectionCo sectionCo);
    SectionDTO updateSection(String id, SectionCo sectionCo);
    List<SectionDTO> getAllSection();
    void deleteSection(String id);
    SectionDTO getSectionById(String id);
}
