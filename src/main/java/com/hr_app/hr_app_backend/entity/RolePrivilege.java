package com.hr_app.hr_app_backend.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "role_privilege")
public class RolePrivilege {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rowId;
    @Column(name = "role_id")
    private Long roleId;
    @Column(name = "privilege_id")
    private Long privilegeId;

    public RolePrivilege() {
    }

    public RolePrivilege(Long rowId, Long roleId, Long privilegeId) {
        this.rowId = rowId;
        this.roleId = roleId;
        this.privilegeId = privilegeId;
    }

    public Long getRowId() {
        return rowId;
    }

    public void setRowId(Long rowId) {
        this.rowId = rowId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getPrivilegeId() {
        return privilegeId;
    }

    public void setPrivilegeId(Long privilegeId) {
        this.privilegeId = privilegeId;
    }
}
