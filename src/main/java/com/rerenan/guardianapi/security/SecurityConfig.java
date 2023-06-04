package com.rerenan.guardianapi.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable()) // desabilita a autenticação automatica
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers(HttpMethod.GET, "/") // permite requisição get em /
                        .permitAll().anyRequest().authenticated()); // qualquer outro tipo de requisição é autenticada

        http.addFilterBefore(new AuthFilter(), UsernamePasswordAuthenticationFilter.class);

        return http.build();

    }
}
