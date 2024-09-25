//package com.cms.survey.service.impl;
//import com.cms.survey.co.SvSurveyScheduleCo;
//import com.cms.survey.dto.SvSurveyScheduleDTO;
//import com.cms.survey.mapper.SvSurveyScheduleMapper;
//import com.cms.survey.model.SvSurveySchedule;
//import com.cms.survey.repository.SvSurveyScheduleRepository;
//import com.cms.survey.service.SvSurveyScheduleService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import java.util.List;
//
//@Service
//public class SvSurveyScheduleServiceImpl implements SvSurveyScheduleService {
//
//    @Autowired
//    private SvSurveyScheduleRepository svSurveyScheduleRepository;  // Assuming SvSurveyScheduleRepository is an interface for the database operations  // Example: @Autowired private SvSurveyScheduleRepository svSurveyScheduleRepository;  // In real-world scenario, use the corresponding interface from the Spring Data JPA repository package.  // Example: @Autowired private SvSurveyScheduleRepository svSurveyScheduleRepository;  // In real-world scenario, use the corresponding interface from the Spring
//
//    @Autowired
//    private SvSurveyScheduleMapper svSurveyScheduleMapper;
//
//
//    @Override
//    public SvSurveyScheduleDTO createSvSurveySchedule(SvSurveyScheduleCo svSurveyScheduleCo) {
//        SvSurveySchedule svSurveySchedule = svSurveyScheduleMapper.coToEntity(svSurveyScheduleCo);
//        //log
//        System.out.println(String.valueOf(svSurveySchedule));
//
//        svSurveySchedule=svSurveyScheduleRepository.save(svSurveySchedule);
//        return svSurveyScheduleMapper.entityToDTO(svSurveySchedule);
//    }
//
//    @Override
//    public SvSurveyScheduleDTO updateSvSurveySchedule(Long id, SvSurveyScheduleCo svSurveyScheduleCo) {
//        SvSurveySchedule svSurveySchedule=svSurveyScheduleMapper.coToEntity(svSurveyScheduleCo);
//        svSurveySchedule.setId(id);
//        svSurveySchedule=svSurveyScheduleRepository.save(svSurveySchedule);
//        return svSurveyScheduleMapper.entityToDTO(svSurveySchedule);
//    }
//
//    @Override
//    public List<SvSurveyScheduleDTO> getAllSvSurveySchedule() {
//       List<SvSurveySchedule> allSvSurveySchedule=svSurveyScheduleRepository.findAll();
//       return svSurveyScheduleMapper.entityListToDTOList(allSvSurveySchedule);
//    }
//
//    @Override
//    public void deleteSvSurveySchedule(Long id) {
//             svSurveyScheduleRepository.deleteById(id);
//    }
//
//    @Override
//    public List<SvSurveyScheduleDTO> getSvSurveyScheduleBySurveyId(Long surveyId) {
//        System.out.println(surveyId+"surveyId");
//        List<SvSurveySchedule>allSvSurveyByScheduleId=svSurveyScheduleRepository.findBySurveyId(surveyId);
//        return svSurveyScheduleMapper.entityListToDTOList(allSvSurveyByScheduleId);
//    }
//}
