package com.cms.survey.controller;

import com.cms.survey.co.SvUsersCo;
import com.cms.survey.co.SvUsersGroupCo;
import com.cms.survey.dto.SvUsersDTO;
import com.cms.survey.dto.SvUsersGroupDTO;
import com.cms.survey.model.SvUsers;
import com.cms.survey.model.UserGroupId;
import com.cms.survey.service.SvUsersGroupService;
import com.cms.survey.service.SvUsersService;
import com.cms.survey.util.ResponseUtil;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/survey-user")
@Validated
public class SvUsersController   {

    private final SvUsersService svUsersService;

    public SvUsersController(SvUsersService svUsersService) {
        this.svUsersService = svUsersService;
    }


    @PostMapping("")
    public ResponseEntity<ResponseUtil<SvUsersDTO>> createSvUsers(@Valid @RequestBody SvUsersCo svUsersCo) {
        SvUsersDTO createdSvUsers = svUsersService.createSvUsers(svUsersCo);
        ResponseUtil<SvUsersDTO> response = ResponseUtil.<SvUsersDTO>builder()
                .status(HttpStatus.CREATED.value())
                .success(true)
                .message("createdSvUsers created successfully")
                .data(createdSvUsers)
                .build();
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }



    @DeleteMapping("/{userId}")
    public ResponseEntity<ResponseUtil<Void>> deleteSvUsersGroup(@PathVariable Long userId) {
        svUsersService.deleteSvUsersByUserId(userId);
        ResponseUtil<Void> response = ResponseUtil.<Void>builder()
                .status(HttpStatus.NO_CONTENT.value())
                .success(true)
                .message("SvUsers deleted successfully")
                .build();
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(response);
    }


}
