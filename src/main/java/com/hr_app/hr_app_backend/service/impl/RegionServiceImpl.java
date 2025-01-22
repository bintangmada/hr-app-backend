package com.hr_app.hr_app_backend.service.impl;

import com.hr_app.hr_app_backend.entity.Region;
import com.hr_app.hr_app_backend.payload.RegionDto;
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

    public RegionDto createOneRegion(RegionDto regionDto){
        Region regionEntity = mapToEntity(regionDto);
        Region savedRegionEntity = regionRepository.save(regionEntity);
        RegionDto regionDtoResponse = mapToDto(savedRegionEntity);
        return regionDtoResponse;
    }

    public List<RegionDto> getAllRegions(){
        List<RegionDto> listRegionDto = new ArrayList<>();
        for(Region regionEntity : regionRepository.findAll()){
            RegionDto regionDto = mapToDto(regionEntity);
            listRegionDto.add(regionDto);
        }
        return listRegionDto;
    }

    public RegionDto getOneRegion(int regionId){
        return null;
    }

    public RegionDto updateOneRegion(int regionId, RegionDto regionDto){
        return null;
    }

    public void deleteOneRegion(int regionId){

    }

    // Mapping RegionDto to RegionEntity
    public Region mapToEntity(RegionDto regionDto){
        Region regionEntity = new Region();
        regionEntity.setRegionName(regionDto.getRegionName());
        return regionEntity;
    }

    // Mapping RegionEntity to RegionDto
    public RegionDto mapToDto(Region region){
        RegionDto regionDto = new RegionDto();
        regionDto.setRegionId(region.getRegionId());
        regionDto.setRegionName(region.getRegionName());
        return regionDto;
    }

}
