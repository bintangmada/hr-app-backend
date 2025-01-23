package com.hr_app.hr_app_backend.service;

import com.hr_app.hr_app_backend.payload.CountryDto;

import java.util.List;

public interface CountryService {

    CountryDto createOneCountry(CountryDto countryDto);
    CountryDto getOneCountry(Long countryId);
    List<CountryDto> getAllCountries();
    CountryDto updateCountry(Long countryId, CountryDto countryDto);
    void deleteOneCountry();

}
