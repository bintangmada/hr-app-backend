package com.hr_app.hr_app_backend.service;

import com.hr_app.hr_app_backend.payload.RegionDto;

import java.util.List;

public interface RegionService {

    RegionDto createOneRegion(RegionDto regionDto);

    RegionDto getOneRegion(int regionId);

    List<RegionDto> getAllRegions();

    RegionDto updateOneRegion(int regionId, RegionDto regionDto);

    void deleteOneRegion(int regionId);

}
