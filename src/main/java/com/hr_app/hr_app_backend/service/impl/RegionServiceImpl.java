package com.hr_app.hr_app_backend.service.impl;

import com.hr_app.hr_app_backend.entity.Region;
import com.hr_app.hr_app_backend.payload.RegionDto;
import com.hr_app.hr_app_backend.payload.request.RegionDtoRequest;
import com.hr_app.hr_app_backend.payload.response.ApiResponse;
import com.hr_app.hr_app_backend.repository.RegionRepository;
import com.hr_app.hr_app_backend.service.RegionService;
import jakarta.persistence.EntityExistsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class RegionServiceImpl implements RegionService {

    @Autowired
    private RegionRepository regionRepository;

    @Override
    public ApiResponse<RegionDtoRequest> createOneRegion(RegionDtoRequest regionDto) {
        Region existingRegion = regionRepository.findRegionByRegionName(regionDto.getRegionName());
        if (existingRegion != null){
            throw new EntityExistsException("Region telah terdaftar");
        }
        Region region = mapRegionDtoToRegionEntity(regionDto);
        Region savedRegion = regionRepository.save(region);

        RegionDtoRequest regionDtoRequest = mapRegionEntityToRegionDto(savedRegion);
        ApiResponse<RegionDtoRequest> apiResponse = new ApiResponse<>();
        apiResponse.setData(regionDtoRequest);
        apiResponse.setMessage("REGION BERHASIL DIBUAT");
        apiResponse.setCode(HttpStatus.CREATED);
        apiResponse.setTimeStamp(LocalDateTime.now());
        apiResponse.setStatus("SUCCESS");
        return apiResponse;
    }

    @Override
    public ApiResponse<List<RegionDto>> getAllRegions() {
        return null;
    }

    @Override
    public ApiResponse<RegionDto> getOneRegion(int regionId) {
        return null;
    }

    @Override
    public ApiResponse<RegionDto> updateOneRegion(int regionId, RegionDto regionDto) {
        return null;
    }

    @Override
    public ApiResponse<String> deleteOneRegion(int regionId) {
        return null;
    }

    private Region mapRegionDtoToRegionEntity(RegionDtoRequest regionDto){
        Region region = new Region();
        region.setRegionName(regionDto.getRegionName());
        return region;
    }

    private RegionDtoRequest mapRegionEntityToRegionDto(Region region){
        RegionDtoRequest dto = new RegionDtoRequest();
        dto.setRegionId(region.getRegionId());
        dto.setRegionName(region.getRegionName());
        return dto;
    }
}
