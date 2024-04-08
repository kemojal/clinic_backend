//package com.clinic.clinic.config;
//
//import com.clinic.clinic.service.CustomUserDetailsService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//
//
//
//@Autowired
//private CustomUserDetailsService customUserDetailsService;
//
//@Bean
//public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//
//
//
//    http
//            .authorizeHttpRequests((requests) -> requests
//                    .requestMatchers("/authenticate").permitAll()
//                    .anyRequest().authenticated()
//            )
//            .userDetailsService(customUserDetailsService)
//            .formLogin()
//            .and()
//            .logout()
//            .logoutSuccessUrl("/");
//
//    return http.build();
//}
