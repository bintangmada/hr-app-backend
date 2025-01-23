package com.hr_app.hr_app_backend.payload;

public class CountryDto {

    private Long rowId;
    private String countryId;
    private String countryName;
    private RegionDto region;

    public CountryDto() {
    }

    public CountryDto(Long rowId, String countryId, String countryName, RegionDto regionDto) {
        this.rowId = rowId;
        this.countryId = countryId;
        this.countryName = countryName;
        this.region = regionDto;
    }

    public Long getRowId() {
        return rowId;
    }

    public void setRowId(Long rowId) {
        this.rowId = rowId;
    }

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public RegionDto getRegion() {
        return region;
    }

    public void setRegionDto(RegionDto regionDto) {
        this.region = regionDto;
    }
}
