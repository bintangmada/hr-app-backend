package com.hr_app.hr_app_backend.controller;

import com.hr_app.hr_app_backend.payload.RegionDto;
import com.hr_app.hr_app_backend.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
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
    public RegionDto createOneRegion(@RequestBody RegionDto regionDto){
        return regionService.createOneRegion(regionDto);
    }

    @GetMapping()
    public List<RegionDto> getAllRegions(){
        return regionService.getAllRegions();
    }
}
