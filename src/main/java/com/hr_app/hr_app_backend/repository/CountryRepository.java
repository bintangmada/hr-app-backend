package com.hr_app.hr_app_backend.repository;

import com.hr_app.hr_app_backend.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
