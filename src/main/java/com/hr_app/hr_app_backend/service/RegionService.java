package com.hr_app.hr_app_backend.service;

import com.hr_app.hr_app_backend.payload.RegionDto;
import com.hr_app.hr_app_backend.payload.request.RegionDtoRequest;
import com.hr_app.hr_app_backend.payload.response.ApiResponse;

import java.util.List;

public interface RegionService {

    ApiResponse<RegionDtoRequest> createOneRegion(RegionDtoRequest regionDtoRequest);
    ApiResponse<List<RegionDtoRequest>> getAllRegions();

    ApiResponse<RegionDto> getOneRegion(int regionId);

    ApiResponse<RegionDto> updateOneRegion(int regionId, RegionDto regionDto);

    ApiResponse<String> deleteOneRegion(int regionId);

}
