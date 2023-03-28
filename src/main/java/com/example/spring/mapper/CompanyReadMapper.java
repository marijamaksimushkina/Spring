package com.example.spring.mapper;

import com.example.spring.database.entity.Company;
import com.example.spring.dto.CompanyReadDto;

public class CompanyReadMapper implements Mapper<Company, CompanyReadDto>{
    @Override
    public CompanyReadDto map(Company object) {
        return new CompanyReadDto(
                object.getId(),
                object.getName()
        );
    }
}
