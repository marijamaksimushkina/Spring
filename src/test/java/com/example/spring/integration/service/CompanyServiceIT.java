package com.example.spring.integration.service;

import com.example.spring.config.DatabaseProperties;
import com.example.spring.dto.CompanyReadDto;
import com.example.spring.integration.annotation.IT;
import com.example.spring.service.CompanyService;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.TestConstructor;

@IT
@RequiredArgsConstructor
public class CompanyServiceIT {

    private static final Integer COMPANY_ID = 1;

    private final CompanyService companyService;
    private final DatabaseProperties databaseProperties;
    @Test
    void findById(){
        var actualResult = companyService.findById(COMPANY_ID);

        Assertions.assertTrue(actualResult.isPresent());

        var expectedResult = new CompanyReadDto(COMPANY_ID, null);
//        actualResult.isPresent(actual -> Assertions.assertEquals(expectedResult, actual));
    }
}
