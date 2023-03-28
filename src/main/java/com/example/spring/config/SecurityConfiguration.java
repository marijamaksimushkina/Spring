package com.example.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

//@Configuration
//public class SecurityConfiguration extends WebSecurityConfigurer {
//    @Override
//            protected void configure(HttpSecurity http) throws Exception{
//        http
//                .csrf().disable()
//                .authorizeRequests().anyRequest().authenticated()
//                .and()
////                .httpBasic(Customizer.withDefaults());
//                .logout(logout -> logout
//                        .logoutUrl("/logout")
//                        .logoutSuccessUrl())
//                .formLogin(login -> login
//                        .loginPage("/login")
//                        .defaultSuccessUrl("users")
//                        .permitAll());
//    }
//    @Bean
//    public PasswordEncoder passwordEncoder(){
//        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
//    }
//
//}
