package com.hr_app.hr_app_backend.repository;

import com.hr_app.hr_app_backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
@Transactional(readOnly = true)
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);

    Optional<User> findByUsername(String username);
    Optional<User> existsByEmail(String email);
    Optional<User> existsByUsername(String username);

    @Transactional
    @Modifying
    @Query("update User a set a.isEnabled=true where a.userId = ?1")
    int enableUser(int id);

    @Transactional
    @Modifying
    @Query("update User a set a.isEnabled=false where a.userId= ?1")
    int disableUser(int id);



}
