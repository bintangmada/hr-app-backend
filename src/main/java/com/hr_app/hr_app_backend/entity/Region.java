package com.hr_app.hr_app_backend.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "regions")
public class Region {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int regionId;

    @Column(name = "region_name", length = 30, nullable = false)
    private String regionName;

    @OneToMany(mappedBy = "region")
    private List<Country> countries;

    public Region() {
    }

    public Region(int regionId, String regionName, List<Country> countries) {
        this.regionId = regionId;
        this.regionName = regionName;
        this.countries = countries;
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

    public List<Country> getCountries() {
        return countries;
    }

    public void setCountries(List<Country> countries) {
        this.countries = countries;
    }
}
