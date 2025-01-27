package com.hr_app.hr_app_backend.entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.TypeAlias;

import java.util.Date;

@Entity
@Table(name = "Employees")
public class Employees {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeId;

    @Column(name = "first_name", length = 20, nullable = false)
    private String firstName;

    @Column(name = "last_name", length = 20, nullable = false)
    private String last_name;

    @Column(name = "phone_number", length = 12, nullable = false)
    private String phoneNumber;

    @Column(name = "hire_date", nullable = true)
    private Date hireDate;

    @Column(name = "salary", nullable = true)
    private Double salary;

    @Column(name = "commission_pct", nullable = true)
    private Double commissionPct;

    // RELATION TO JOB
    // RELATION TO MANAGER (SELF JOIN)
    // RELATION TO DEPARTMENT
    // RELATION TO USER_APP

}
