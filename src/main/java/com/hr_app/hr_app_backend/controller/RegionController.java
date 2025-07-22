package com.hr_app.hr_app_backend.controller;

import com.hr_app.hr_app_backend.payload.RegionDto;
import com.hr_app.hr_app_backend.payload.request.RegionDtoRequest;
import com.hr_app.hr_app_backend.payload.response.ApiResponse;
import com.hr_app.hr_app_backend.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/region")
public class RegionController {

    private RegionService regionService;

    @Autowired
    public RegionController(RegionService regionService){
        this.regionService = regionService;
    }

    @PostMapping()
    public ResponseEntity<ApiResponse<RegionDtoRequest>> createOneRegion(@RequestBody RegionDtoRequest regionDtoRequest){
        ApiResponse<RegionDtoRequest> regionCreated = regionService.createOneRegion(regionDtoRequest);
        return new ResponseEntity<>(regionCreated, HttpStatus.CREATED);
    }

//    @GetMapping()
//    public List<RegionDto> getAllRegions(){
//        return regionService.getAllRegions();
//    }
}
