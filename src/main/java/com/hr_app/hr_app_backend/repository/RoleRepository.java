package com.hr_app.hr_app_backend.repository;

import com.hr_app.hr_app_backend.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

    Optional<Role> findByName(String roleName);
    boolean existsByName(String roleName);

}
