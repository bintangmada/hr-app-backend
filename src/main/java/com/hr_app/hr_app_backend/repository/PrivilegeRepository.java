package com.hr_app.hr_app_backend.repository;

import com.hr_app.hr_app_backend.entity.Privilege;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface PrivilegeRepository extends JpaRepository<Privilege, Integer> {

    boolean existsByName(String privilegeName);

    @Modifying
    @Query(value = "insert into role_privilege (role_id, privilege_id) values (:role_id, :privilege_id)", nativeQuery = true)
    public void insertRolePrivilege(@Param("role_id") Integer roleId, @Param("privilege_id") Integer privilegeId);

    @Query(value = "SELECT COUNT(*) FROM role_privilege WHERE role_id = :roleId AND privilege_id = :privilegeId", nativeQuery = true)
    Integer countByRoleIdAndPrivilegeId(@Param("roleId") Integer roleId, @Param("privilegeId") Integer privilegeId);

}
