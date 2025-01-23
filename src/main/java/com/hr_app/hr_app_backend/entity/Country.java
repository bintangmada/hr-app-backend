package com.hr_app.hr_app_backend.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "countries")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rowId;

    @Column(name = "country_id", length = 3, unique = true)
    private String countryId;

    @Column(name = "country_name", length = 100, nullable = false)
    private String countryName;

    @ManyToOne
    @JoinColumn(name = "region_id", nullable = false)
    private Region region;

    public Country() {
    }

    public Country(Long rowId, String countryId, String countryName, Region region) {
        this.rowId = rowId;
        this.countryId = countryId;
        this.countryName = countryName;
        this.region = region;
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

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public Long getRowId() {
        return rowId;
    }

    public void setRowId(Long rowId) {
        this.rowId = rowId;
    }

}
