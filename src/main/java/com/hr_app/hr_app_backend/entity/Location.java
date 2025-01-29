package com.hr_app.hr_app_backend.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "locations")
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long locationId;

    @Column(name = "street_address", nullable = false, length = 255)
    private String streetAddress;

    @Column(name = "postal_code", length = 6, nullable = false)
    private Long postalCode;

    @Column(name = "city", length = 30, nullable = false)
    private String city;

    @Column(name = "state_province", length = 50, nullable = false)
    private String stateProvince;

    // RELATION TO COUNTRY
    @ManyToOne
    @JoinColumn(name = "country_id", nullable = false)
    private Country country;
}
