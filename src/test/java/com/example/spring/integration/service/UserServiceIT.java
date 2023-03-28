//package com.example.spring.integration.service;
//
//import com.example.spring.database.entity.Role;
//import com.example.spring.dto.UserCreateEditDto;
//import com.example.spring.dto.UserReadDto;
//import com.example.spring.integration.IntegrationTestBase;
//import com.example.spring.service.UserService;
//import lombok.RequiredArgsConstructor;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//
//import java.time.LocalDate;
//import java.util.List;
//import java.util.Optional;
//
//
//@RequiredArgsConstructor
//public class UserServiceIT extends IntegrationTestBase {
//    private static final Long USER_1 = 1L;
//    private static final Integer COMPANY_1 = 1;
//    private final UserService userService;
//    @Test
//    void findAll(){
//        List<UserReadDto> result = userService.findAll();
//    }
//
//    @Test
//    void findById(){
//        Optional<UserReadDto> maybe = userService.findById(USER_1);
//    }
//
//    @Test
//    void create(){
//        UserCreateEditDto userDto = new UserCreateEditDto(
//                "test@gmail.com",
//                LocalDate.now(),
//                "Test",
//                "Test",
//                Role.ADMIN,
//                COMPANY_1
//        );
//        UserReadDto actualResult = userService.create(userDto);
//        Assertions.assertEquals(userDto.getUsername(), actualResult.getUsername());
//        Assertions.assertEquals(userDto.getBirthdate(), actualResult.getBirthdate());
//        Assertions.assertEquals(userDto.getFirstname(), actualResult.getFirstname());
//        Assertions.assertEquals(userDto.getLastname(), actualResult.getLastname());
//        Assertions.assertEquals(userDto.getCompanyId(), actualResult.getCompany().id());
//        Assertions.assertSame(userDto.getRole(), actualResult.getRole());
//    }
//
//    void update(){
//        UserCreateEditDto userDto = new UserCreateEditDto(
//                "test@gmail.com",
//                LocalDate.now(),
//                "Test",
//                "Test",
//                Role.ADMIN,
//                COMPANY_1
//        );
//        Optional<UserReadDto> actualResult = userService.update(USER_1, userDto);
//    }
//}
