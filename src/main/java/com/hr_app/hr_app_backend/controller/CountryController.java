package com.hr_app.hr_app_backend.controller;

import com.hr_app.hr_app_backend.payload.CountryDto;
import com.hr_app.hr_app_backend.repository.CountryRepository;
import com.hr_app.hr_app_backend.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/country")
public class CountryController {

    private CountryService countryService;

    @Autowired
    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @PostMapping
    public ResponseEntity<CountryDto> createOneCountry(@RequestBody CountryDto countryDto){
        return new ResponseEntity<>(countryService.createOneCountry(countryDto), HttpStatus.CREATED);
    }
}
