package com.hr_app.hr_app_backend.appuser;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class AppUserService implements UserDetailsService {

    private AppUserRepository appUserRepository;
    private static final String USER_NOT_FOUND_MSG = "User with email %s not found";
    public AppUserService(AppUserRepository appUserRepository){
        this.appUserRepository = appUserRepository;
    }
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return appUserRepository.findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException(String.format(USER_NOT_FOUND_MSG, email)));
    }

    public UserDetails loadUser2(String email){
        return appUserRepository.findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("User with email" + email + "not found"));
    }
}
