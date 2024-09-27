package com.bookkeeping.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(authorizeRequests ->
                authorizeRequests
                    .requestMatchers("/login").permitAll() // Allow unauthenticated access to the login page
                    .anyRequest().authenticated() // Require authentication for all other requests
            )
            .formLogin(formLogin ->
                formLogin
                    .loginPage("/login") // Login page URL
                    .permitAll() // Allow unauthenticated access to the login page
            )
            .logout(logout ->
                logout.permitAll() // Allow logout for everyone
            );

        return http.build();
    }
}
