package com.hr_app.hr_app_backend.repository;

import com.hr_app.hr_app_backend.entity.Privilege;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrivilegeRepository extends JpaRepository<Privilege, Integer> {

    boolean existsByName(String privilegeName);
}
