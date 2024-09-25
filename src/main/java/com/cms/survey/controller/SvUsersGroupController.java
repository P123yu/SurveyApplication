package com.cms.survey.controller;

import com.cms.survey.co.SvUsersGroupCo;
import com.cms.survey.dto.SvUsersGroupDTO;

import com.cms.survey.model.UserGroupId;
import com.cms.survey.service.SvUsersGroupService;
import com.cms.survey.util.ResponseUtil;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin
@RestController
@RequestMapping("/survey-group")
@Validated
public class SvUsersGroupController   {

    private final SvUsersGroupService svUsersGroupService;

    public SvUsersGroupController(SvUsersGroupService svUsersGroupService) {
        this.svUsersGroupService = svUsersGroupService;
    }


    @PostMapping("")
    public ResponseEntity<ResponseUtil<SvUsersGroupDTO>> createSvUsersGroup(@Valid @RequestBody SvUsersGroupCo svUsersGroupCo) {
        System.out.println(String.valueOf(svUsersGroupCo)+" createdSvUsersGroup");
        SvUsersGroupDTO createdSvUsersGroup = svUsersGroupService.createSvUsersGroup(svUsersGroupCo);

        ResponseUtil<SvUsersGroupDTO> response = ResponseUtil.<SvUsersGroupDTO>builder()
                .status(HttpStatus.CREATED.value())
                .success(true)
                .message("createdSvUsersGroup created successfully")
                .data(createdSvUsersGroup)
                .build();
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ResponseUtil<SvUsersGroupDTO>> updateSvUsersGroup(@PathVariable String groupId, @Valid @RequestBody SvUsersGroupCo svUsersGroupCo) {
        SvUsersGroupDTO updatedSvUsersGroup = svUsersGroupService.updateSvUsersGroup(groupId, svUsersGroupCo);
        ResponseUtil<SvUsersGroupDTO> response = ResponseUtil.<SvUsersGroupDTO>builder()
                .status(HttpStatus.OK.value())
                .success(true)
                .message("updatedSvUsersGroup updated successfully")
                .data(updatedSvUsersGroup)
                .build();
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{groupId}")
    public ResponseEntity<ResponseUtil<Void>> deleteSvUsersGroup(@PathVariable String groupId) {
        svUsersGroupService.deleteSvUsersGroup(groupId);
        ResponseUtil<Void> response = ResponseUtil.<Void>builder()
                .status(HttpStatus.NO_CONTENT.value())
                .success(true)
                .message("SvUsersGroup deleted successfully")
                .build();
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(response);
    }

    @GetMapping("/list-all")
    public ResponseEntity<ResponseUtil<List<SvUsersGroupDTO>>> getAllSvUsersGroup() {
        List<SvUsersGroupDTO> svUsersGroupList = svUsersGroupService.getAllSvUsersGroup();
        ResponseUtil<List<SvUsersGroupDTO>> response = ResponseUtil.<List<SvUsersGroupDTO>>builder()
                .status(HttpStatus.OK.value())
                .success(true)
                .message("All createdSvUsersGroup retrieved successfully")
                .data(svUsersGroupList)
                .build();
        return ResponseEntity.ok(response);
    }


    @GetMapping("/{id}")
    public ResponseEntity<ResponseUtil<SvUsersGroupDTO>> getSvUsersGroupById(@PathVariable UserGroupId id) {
        SvUsersGroupDTO SvUsersGroup = svUsersGroupService.getSvUsersGroupById(id);
        ResponseUtil<SvUsersGroupDTO> response = ResponseUtil.<SvUsersGroupDTO>builder()
                .status(HttpStatus.OK.value())
                .success(true)
                .message("createdSvUsersGroup retrieved successfully")
                .data(SvUsersGroup)
                .build();
        return ResponseEntity.ok(response);
    }

}
