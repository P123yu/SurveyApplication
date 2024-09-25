package com.cms.survey.service.impl;

import com.cms.survey.co.SectionCo;
import com.cms.survey.dto.SectionDTO;
import com.cms.survey.mapper.SectionMapper;
import com.cms.survey.model.Section;
import com.cms.survey.repository.SectionRepository;
import com.cms.survey.service.SectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;
import java.util.Random;

@Service
public class SectionServiceImpl extends BaseService implements SectionService {
    
    @Autowired
    private SectionRepository sectionRepository;
    
    @Autowired
    private SectionMapper sectionMapper;


    @Override
    public SectionDTO createSection(SectionCo sectionCo) {
        Section section=sectionMapper.coToEntity(sectionCo);
        section.setId(genId(section.getSectionName()));
        setModifier(section);
        section = sectionRepository.save(section);
        return sectionMapper.entityToDTO(section);
    }

    @Override
    public SectionDTO updateSection(String id, SectionCo sectionCo) {
        Section section = sectionMapper.coToEntity(sectionCo);
        section.setId(id);
        setModifier(section);
        section = sectionRepository.save(section);
        return sectionMapper.entityToDTO(section);
    }

    @Override
    public List<SectionDTO> getAllSection() {
        List<Section> allSection=sectionRepository.findAll();
        return sectionMapper.entityListToDTOList(allSection);
    }

    @Override
    public void deleteSection(String id) {
        sectionRepository.deleteById(id);
    }

    @Override
    public SectionDTO getSectionById(String id) {
        Section section = sectionRepository.findById(id).orElseThrow(() -> new RuntimeException("section not found with id: " + id));
        return sectionMapper.entityToDTO(section);
    }
}
