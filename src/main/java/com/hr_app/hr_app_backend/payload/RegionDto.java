package com.hr_app.hr_app_backend.payload;

import java.util.List;

public class RegionDto {
    private int regionId;
    private String regionName;
    private List<CountryDto> countryDtos;

    public RegionDto() {
    }

    public RegionDto(int regionId, String regionName, List<CountryDto> countryDtos) {
        this.regionId = regionId;
        this.regionName = regionName;
        this.countryDtos = countryDtos;
    }

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
