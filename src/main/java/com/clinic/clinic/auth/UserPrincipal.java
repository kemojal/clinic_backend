//package com.clinic.clinic.auth;
//
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import java.util.Collection;
//
//public class UserPrincipal implements UserDetails {
//
//    private final User user;
//
//    public UserPrincipal(User user) {
//        this.user = user;
//    }
//
//    @Override
//    public String getUsername() {
//        return user.getUsername();
//    }
//
//    @Override
//    public String getPassword() {
//        return user.getPassword();
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return user.isEnabled();
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return user.getAuthorities();
//    }
//}
