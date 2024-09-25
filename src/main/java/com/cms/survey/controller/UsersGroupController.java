package com.cms.survey.controller;

import com.cms.survey.co.UsersGroupCo;
import com.cms.survey.dto.UsersGroupDTO;

import com.cms.survey.service.UsersGroupService;
import com.cms.survey.util.ResponseUtil;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/users-group")
@Validated
public class UsersGroupController   {

    private final UsersGroupService usersGroupService;

    public UsersGroupController(UsersGroupService usersGroupService) {
        this.usersGroupService = usersGroupService;
    }

    @PostMapping("")
    public ResponseEntity<ResponseUtil<UsersGroupDTO>> createUsersGroup(@Valid @RequestBody UsersGroupCo usersGroupCo) {
        UsersGroupDTO createdQuiz = usersGroupService.createUsersGroup(usersGroupCo);
        ResponseUtil<UsersGroupDTO> response = ResponseUtil.<UsersGroupDTO>builder()
                .status(HttpStatus.CREATED.value())
                .success(true)
                .message("users group created successfully")
                .data(createdQuiz)
                .build();
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ResponseUtil<UsersGroupDTO>> updateUsersGroup(@PathVariable String id, @Valid @RequestBody UsersGroupCo usersGroupCo) {
        UsersGroupDTO updatedQuiz = usersGroupService.updateUsersGroup(id, usersGroupCo);
        ResponseUtil<UsersGroupDTO> response = ResponseUtil.<UsersGroupDTO>builder()
                .status(HttpStatus.OK.value())
                .success(true)
                .message("users group updated successfully")
                .data(updatedQuiz)
                .build();
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ResponseUtil<Void>> deleteUsersGroup(@PathVariable String id) {
        usersGroupService.deleteUsersGroup(id);
        ResponseUtil<Void> response = ResponseUtil.<Void>builder()
                .status(HttpStatus.NO_CONTENT.value())
                .success(true)
                .message("users group deleted successfully")
                .build();
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(response);
    }

    @GetMapping("/list")
    public ResponseEntity<ResponseUtil<List<UsersGroupDTO>>> getAllUsersGroup() {
        List<UsersGroupDTO> surveyList = usersGroupService.getAllUsersGroup();
        ResponseUtil<List<UsersGroupDTO>> response = ResponseUtil.<List<UsersGroupDTO>>builder()
                .status(HttpStatus.OK.value())
                .success(true)
                .message("All users group retrieved successfully")
                .data(surveyList)
                .build();
        return ResponseEntity.ok(response);
    }


    @GetMapping("/{id}")
    public ResponseEntity<ResponseUtil<UsersGroupDTO>> getUsersGroupById(@PathVariable String id) {
        UsersGroupDTO survey = usersGroupService.getUsersGroupById(id);
        ResponseUtil<UsersGroupDTO> response = ResponseUtil.<UsersGroupDTO>builder()
                .status(HttpStatus.OK.value())
                .success(true)
                .message("users group retrieved successfully")
                .data(survey)
                .build();
        return ResponseEntity.ok(response);
    }
    
}
