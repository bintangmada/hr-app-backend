package com.hr_app.hr_app_backend.service;

import com.hr_app.hr_app_backend.payload.RegionDto;
import com.hr_app.hr_app_backend.payload.request.RegionDtoRequest;
import com.hr_app.hr_app_backend.payload.response.ApiResponse;

import java.util.List;

public interface RegionService {

    ApiResponse<RegionDtoRequest> createOneRegion(RegionDtoRequest regionDtoRequest);
    List<RegionDto> getAllRegions();

    RegionDto getOneRegion(int regionId);

    RegionDto updateOneRegion(int regionId, RegionDto regionDto);

    void deleteOneRegion(int regionId);

}
