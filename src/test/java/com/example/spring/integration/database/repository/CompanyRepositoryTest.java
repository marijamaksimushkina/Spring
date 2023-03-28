//package com.example.spring.integration.database.repository;
//
//import com.example.spring.database.entity.Company;
//import com.example.spring.database.repository.CompanyRepository;
//import com.example.spring.integration.annotation.IT;
//import lombok.RequiredArgsConstructor;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Disabled;
//import org.junit.jupiter.api.Test;
//import org.springframework.transaction.annotation.Transactional;
//import org.springframework.transaction.support.TransactionTemplate;
//
//import javax.persistence.EntityManager;
//import java.util.Map;
//
//@RequiredArgsConstructor
//    class CompanyRepositoryTest extends IntegrationTestBase{
//    private static final Integer APPLE_ID = 5;
//    private final EntityManager entityManager;
//    private final TransactionTemplate transactionTemplate;
//    private final CompanyRepository companyRepository;
//
//    @Test
//    void checkFindByQueries(){
//        companyRepository.findByName("Google");
//        companyRepository.findByNameContainingIgnoreCase("a");
//    }
////    @Test
////    @Disabled
////    void delete(){
////        var maybeCompany = companyRepository.findById(APPLE_ID);
////        assertTrue(maybeCompany.isPresent());
////        maybeCompany.ifPresent(companyRepository::delete);
////        entityManager.flush();
////        assertTrue(companyRepository.findById(APPLE_ID).isEmpty());
////    }
//
//    @Test
//    void findById(){
//        transactionTemplate.executeWithoutResult(tx -> {
//            var company = entityManager.find(Company.class, 1);
//            Assertions.assertNotNull(company);
//        });
//    }
//
//    @Test
//    void save(){
//        var company = Company.builder()
//                .name("Apple")
//                .locales(Map.of(
//                        "ru", "Apple описание",
//                        "en", "Apple description"
//                ))
//                .build();
//        entityManager.persist(company);
//        Assertions.assertNotNull(company.getId());
//    }
//}
