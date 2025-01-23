package com.hr_app.hr_app_backend.service.impl;

import com.hr_app.hr_app_backend.entity.Country;
import com.hr_app.hr_app_backend.entity.Region;
import com.hr_app.hr_app_backend.payload.CountryDto;
import com.hr_app.hr_app_backend.repository.CountryRepository;
import com.hr_app.hr_app_backend.repository.RegionRepository;
import com.hr_app.hr_app_backend.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImpl implements CountryService {

    private RegionRepository regionRepository;
    private CountryRepository countryRepository;

    @Autowired
    public CountryServiceImpl(RegionRepository regionRepository, CountryRepository countryRepository){
        this.regionRepository = regionRepository;
        this.countryRepository = countryRepository;
    }
    @Override
    public CountryDto createOneCountry(CountryDto countryDto) {
        Country countryEntity = mapToEntity(countryDto);
        Country savedCountry = countryRepository.save(countryEntity);
        return null;
    }

    @Override
    public CountryDto getOneCountry(Long countryId) {
        return null;
    }

    @Override
    public List<CountryDto> getAllCountries() {
        return null;
    }

    @Override
    public CountryDto updateCountry(Long countryId, CountryDto countryDto) {
        return null;
    }

    @Override
    public void deleteOneCountry() {

    }

    // Map country dto to country entity
    private Country mapToEntity(CountryDto countryDto){
        Country countryEntity = new Country();
        countryEntity.setCountryId(countryDto.getCountryId());
        countryEntity.setCountryName(countryDto.getCountryName());

        Region region = regionRepository.findById(countryDto.getRegion().getRegionId())
                .orElseThrow(() -> new RuntimeException("Region not found"));

        countryEntity.setRegion(region);

        return countryEntity;

    }

    // Map country entity to country dto

}
