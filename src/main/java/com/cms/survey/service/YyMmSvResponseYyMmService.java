package com.cms.survey.service;

import com.cms.survey.co.YyMmSvResponseYyMmCo;
import com.cms.survey.dto.YyMmSvResponseYyMmDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface YyMmSvResponseYyMmService {
    YyMmSvResponseYyMmDTO createYyMmResponse(YyMmSvResponseYyMmCo yyMmSvResponseYyMmCo);
    YyMmSvResponseYyMmDTO updateYyMmResponse(String id, YyMmSvResponseYyMmCo yyMmSvResponseYyMmCo);
    List<YyMmSvResponseYyMmDTO> getAllYyMmResponse();
    void deleteYyMmResponse(String id);
    YyMmSvResponseYyMmDTO getYyMmResponseById(String id);
}
