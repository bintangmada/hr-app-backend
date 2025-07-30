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
        Region existingRegion = regionRepository.findRegionByRegionName(regionDto.getRegionName().toLowerCase());

        if (existingRegion != null) {
            throw new EntityExistsException("Region telah terdaftar");
        }

        Region region = mapRegionDtoToRegionEntity(regionDto);
        Region savedRegion = regionRepository.save(region);
        RegionDtoRequest regionDtoRequest = mapRegionEntityToRegionDto(savedRegion);

        return buildSuccessResponse(
                regionDtoRequest,
                "REGION BERHASIL DIBUAT",
                HttpStatus.CREATED
        );
    }

    @Override
    public ApiResponse<List<RegionDtoRequest>> getAllRegions() {
        List<Region> regions = regionRepository.findAll();
        List<RegionDtoRequest> regionDtos = new ArrayList<>();

        for (Region region : regions) {
            regionDtos.add(mapRegionEntityToRegionDto(region));
        }

        return buildSuccessResponse(
                regionDtos,
                "Berhasil mengambil semua data region",
                HttpStatus.OK
        );
    }

    @Override
    public ApiResponse<RegionDto> getOneRegion(int regionId) {
        // TODO: implement
        return null;
    }

    @Override
    public ApiResponse<RegionDto> updateOneRegion(int regionId, RegionDto regionDto) {
        // TODO: implement
        return null;
    }

    @Override
    public ApiResponse<String> deleteOneRegion(int regionId) {
        // TODO: implement
        return null;
    }

    // === Mapping Methods ===

    private Region mapRegionDtoToRegionEntity(RegionDtoRequest dto) {
        Region region = new Region();
        region.setRegionName(dto.getRegionName());
        return region;
    }

    private RegionDtoRequest mapRegionEntityToRegionDto(Region region) {
        RegionDtoRequest dto = new RegionDtoRequest();
        dto.setRegionId(region.getRegionId());
        dto.setRegionName(region.getRegionName());
        return dto;
    }

    // === Utility Response Builder ===

    private <T> ApiResponse<T> buildSuccessResponse(T data, String message, HttpStatus status) {
        ApiResponse<T> response = new ApiResponse<>();
        response.setStatus("SUCCESS");
        response.setCode(status);
        response.setMessage(message);
        response.setTimeStamp(LocalDateTime.now());
        response.setData(data);
        return response;
    }


}
