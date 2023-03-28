package com.example.spring.service;

import com.example.spring.database.entity.Company;
import com.example.spring.database.repository.CompanyRepository;
import com.example.spring.dto.CompanyReadDto;
import com.example.spring.listener.entity.EntityEvent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.context.ApplicationEventPublisher;

import java.util.Collections;
import java.util.Optional;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

@ExtendWith(MockitoExtension.class)
class CompanyServiceTests {
	private static final Integer COMPANY_ID = 1;
	@Mock
	private CompanyRepository companyRepository;
	@Mock
	private UserService userService;
	@Mock
	private ApplicationEventPublisher eventPublisher;
	@InjectMocks
	private CompanyService companyService;

	@Test
	void findById() {
		Mockito.doReturn(Optional.of(new Company(COMPANY_ID, null, Collections.emptyMap())))
				.when(companyRepository).findById(COMPANY_ID);

		var actualResult = companyService.findById(COMPANY_ID);
		Assertions.assertTrue(actualResult.isPresent());

		var expectedResult = new CompanyReadDto(COMPANY_ID, null);
		actualResult.isPresent(actual -> Assertions.assertEquals(expectedResult, actual));

		verify(eventPublisher).publishEvent(any(EntityEvent.class));
		verifyNoMoreInteractions(eventPublisher, userService);
	}

}
