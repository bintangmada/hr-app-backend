package com.hr_app.hr_app_backend.repository;

import com.hr_app.hr_app_backend.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegionRepository extends JpaRepository<Region, Integer> {
}
