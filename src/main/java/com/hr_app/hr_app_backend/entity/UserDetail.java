//package com.hr_app.hr_app_backend.entity;
//
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.List;
//
//public class UserDetail implements UserDetails {
//
//    private User user;
//
//    public UserDetail(User user) {
//        this.user = user;
//    }
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//
//        List<GrantedAuthority> listAuthority = new ArrayList<>();
//
//        user.getRoles().forEach(role -> {
//           String myRole = "ROLE_"+role.getName().toUpperCase();
//           listAuthority.add(new SimpleGrantedAuthority(myRole));
//
//           role.getPrivileges().forEach(privilege ->{
//              String myPrivilege = privilege.getName().toUpperCase();
//              listAuthority.add(new SimpleGrantedAuthority(myPrivilege));
//           });
//        });
//
//        return listAuthority;
//    }
//
//    public Long getUserId(){
//        return user.getUserId();
//    }
//
//    @Override
//    public String getPassword() {
//        return user.getPassword();
//    }
//
//    @Override
//    public String getUsername() {
//        return user.getUsername();
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return user.isEnabled();
//    }
//}
