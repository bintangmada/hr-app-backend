package com.hr_app.hr_app_backend.repository;

import com.hr_app.hr_app_backend.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RegionRepository extends JpaRepository<Region, Integer> {

    @Query(value = "SELECT * FROM REGIONS WHERE LOWER(TRIM(REGION_NAME) = LOWER(TRIM(:regionName)))", nativeQuery = true)
    Region findRegionByRegionName(@Param("regionName") String regionName);
}
