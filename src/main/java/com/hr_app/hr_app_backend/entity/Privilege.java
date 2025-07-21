package com.hr_app.hr_app_backend.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "privileges")
public class Privilege {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int privilegeId;

    @Column(nullable = false, length = 50)
    private String name;

    public Privilege(int privilegeId, String name) {
        this.privilegeId = privilegeId;
        this.name = name;
    }

    public Privilege() {
    }

    public int getPrivilegeId() {
        return privilegeId;
    }

    public void setPrivilegeId(int privilegeId) {
        this.privilegeId = privilegeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
