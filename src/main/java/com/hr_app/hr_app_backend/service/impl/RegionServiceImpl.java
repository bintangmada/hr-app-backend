package com.hr_app.hr_app_backend.service.impl;

import com.hr_app.hr_app_backend.entity.Region;
import com.hr_app.hr_app_backend.payload.RegionDto;
import com.hr_app.hr_app_backend.payload.request.RegionDtoRequest;
import com.hr_app.hr_app_backend.payload.response.ApiResponse;
import com.hr_app.hr_app_backend.repository.RegionRepository;
import com.hr_app.hr_app_backend.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RegionServiceImpl implements RegionService {

    private RegionRepository regionRepository;

    @Autowired
    public RegionServiceImpl(RegionRepository regionRepository){
        this.regionRepository = regionRepository;
    }

    public ApiResponse<RegionDtoRequest> createOneRegion(RegionDtoRequest regionDtoRequest){

        Region existingRegion = regionRepository.findRegionByRegionName(regionDtoRequest.getRegionName());
        ApiResponse apiResponse = new ApiResponse();

        if(existingRegion != null){
            apiResponse.setStatus(false);
            apiResponse.setMessage("Region dengan nama : "+regionDtoRequest.getRegionName()+" sudah ada di database");
            apiResponse.setData(null);
            return apiResponse;
        }

        Region regionEntity = mapRegionRequestToRegionEntity(regionDtoRequest);
        Region savedRegionEntity = regionRepository.save(regionEntity);
        RegionDtoRequest regionDtoRequestt = mapRegionEntityToRegionDtoRequest(savedRegionEntity);
        apiResponse.setStatus(true);
        apiResponse.setMessage("Region dengan nama : "+regionDtoRequest.getRegionName()+" berhasil dibuat");
        apiResponse.setData(regionDtoRequestt);

        return apiResponse;
    }

    public List<RegionDto> getAllRegions(){
        return null;
    }

    public RegionDto getOneRegion(int regionId){
        return null;
    }

    public RegionDto updateOneRegion(int regionId, RegionDto regionDto){
        return null;
    }

    public void deleteOneRegion(int regionId){

    }

    // Map region dto request to region entity
    Region mapRegionRequestToRegionEntity(RegionDtoRequest regionDtoRequest){
        Region regionEntity = new Region();
        regionEntity.setRegionName(regionDtoRequest.getRegionName());
        return regionEntity;
    }

    // Map region dto entity to region dto request
    RegionDtoRequest mapRegionEntityToRegionDtoRequest(Region regionEntity){
        RegionDtoRequest regionDtoRequest = new RegionDtoRequest();
        regionDtoRequest.setRegionId(regionEntity.getRegionId());
        regionDtoRequest.setRegionName(regionEntity.getRegionName());
        return regionDtoRequest;
    }
}
