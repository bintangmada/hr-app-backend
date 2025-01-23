package com.hr_app.hr_app_backend.payload.response;

import com.hr_app.hr_app_backend.payload.CountryDto;

import java.util.List;

public class RegionDtoResponse {

    private int regionId;
    private String regionName;
    private List<CountryDto> countryDtos;

    public int getRegionId() {
        return regionId;
    }

    public void setRegionId(int regionId) {
        this.regionId = regionId;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public List<CountryDto> getCountryDtos() {
        return countryDtos;
    }

    public void setCountryDtos(List<CountryDto> countryDtos) {
        this.countryDtos = countryDtos;
    }
}
