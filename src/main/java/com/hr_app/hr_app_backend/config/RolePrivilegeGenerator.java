package com.hr_app.hr_app_backend.config;

import com.hr_app.hr_app_backend.entity.Employee;
import com.hr_app.hr_app_backend.entity.Privilege;
import com.hr_app.hr_app_backend.entity.Role;
import com.hr_app.hr_app_backend.repository.EmployeeRepository;
import com.hr_app.hr_app_backend.repository.PrivilegeRepository;
import com.hr_app.hr_app_backend.repository.RoleRepository;
import com.hr_app.hr_app_backend.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RolePrivilegeGenerator implements CommandLineRunner {

    private final BCryptPasswordEncoder bCryptPasswordEncoder;
    private final UserRepository userRepository;
    private final EmployeeRepository employeeRepository;
    private final RoleRepository roleRepository;
    private final PrivilegeRepository privilegeRepository;

    public RolePrivilegeGenerator(BCryptPasswordEncoder bCryptPasswordEncoder, UserRepository userRepository, EmployeeRepository employeeRepository, RoleRepository roleRepository, PrivilegeRepository privilegeRepository) {

        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
        this.userRepository = userRepository;
        this.employeeRepository = employeeRepository;
        this.roleRepository = roleRepository;
        this.privilegeRepository = privilegeRepository;
    }


    @Override
    public void run(String... args) throws Exception {

        // GENERATE ROLE
        List<Role> listRole = new ArrayList<>();

        if (!roleRepository.existsByName("ADMIN")) {
            Role roleAdmin = new Role("ADMIN", null, null);
            listRole.add(roleAdmin);
        }

        if (!roleRepository.existsByName("EMPLOYEE")) {
            Role roleEmployee = new Role("EMPLOYEE", null, null);
            listRole.add(roleEmployee);
        }

        if (!listRole.isEmpty()) {
            roleRepository.saveAll(listRole);
        }

        // GENERATE PRIVILEGE
        List<Privilege> listPrivilege = new ArrayList<>();
        addPrivilegeIfNotExists(listPrivilege, "CREATE_ADMIN");
        addPrivilegeIfNotExists(listPrivilege, "READ_ADMIN");
        addPrivilegeIfNotExists(listPrivilege, "UPDATE_ADMIN");
        addPrivilegeIfNotExists(listPrivilege, "DELETE_ADMIN");
        addPrivilegeIfNotExists(listPrivilege, "CREATE_EMPLOYEE");
        addPrivilegeIfNotExists(listPrivilege, "READ_EMPLOYEE");
        addPrivilegeIfNotExists(listPrivilege, "UPDATE_EMPLOYEE");
        addPrivilegeIfNotExists(listPrivilege, "DELETE_EMPLOYEE");

        if(!listPrivilege.isEmpty()){
            privilegeRepository.saveAll(listPrivilege);
        }

    }
    private void addPrivilegeIfNotExists(List<Privilege> listPrivilege, String privilegeName){
        if(!privilegeRepository.existsByName(privilegeName)){
            Privilege privilege = new Privilege(privilegeName, null);
            listPrivilege.add(privilege);
        }
    }
}
