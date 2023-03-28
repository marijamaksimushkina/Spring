package com.example.spring.dto;

import com.example.spring.database.entity.Role;
import lombok.Value;

import java.time.LocalDate;

@Value
public class UserReadDto {
    Long id;
    String username;
    LocalDate birthdate;
    String firstname;
    String lastname;
    String image;
    Role role;
    CompanyReadDto company;
}
