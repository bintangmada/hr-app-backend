package com.hr_app.hr_app_backend.payload.request;

public class RegionDtoRequest {

    private int regionId;
    private String regionName;

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

    public RegionDtoRequest(int regionId, String regionName) {
        this.regionId = regionId;
        this.regionName = regionName;
    }

    public RegionDtoRequest() {
    }
}
