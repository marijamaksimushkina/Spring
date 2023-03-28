package com.example.spring.integration.database.repository;

import com.example.spring.database.entity.Role;
import com.example.spring.database.entity.User;
import com.example.spring.database.repository.UserRepository;
import com.example.spring.dto.UserFilter;
import com.example.spring.integration.IntegrationTestBase;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.time.LocalDate;

import static org.hamcrest.MatcherAssert.assertThat;

@RequiredArgsConstructor
 class UserRepositoryTest extends IntegrationTestBase {
    private final UserRepository userRepository;

    @Test
    void checkBatcy(){
        var users = userRepository.findAll();
        userRepository.updateCompanyAndRole(users);
        System.out.println();
    }
    @Test
    void checkJdbcTemlate(){
        var users = userRepository.findAllByCompanyIdAndRole(1, Role.USER);
        System.out.println();
    }
    @Test
    void checkAuditing(){
        var ivan = userRepository.findById(1L).get();
        ivan.setBirthDate(ivan.getBirthDate().plusYears(1L));
        userRepository.flush();
        System.out.println();
    }
    @Test
    void checkCustomImplementation(){
        UserFilter filter = new UserFilter(
                null, "%ov%", LocalDate.now()
        );
        var users = userRepository.findAllByFilter(filter);
        System.out.println();
    }

    @Test
    void checkProjections(){
        var users = userRepository.findAllByCompanyId(1);
        System.out.println();
    }
    @Test
    void checkPageable(){
        var pageable = PageRequest.of(1, 2, Sort.by("id"));
        var slice = userRepository.findAllBy(pageable);
        slice.forEach(user -> System.out.println(user.getCompany().getName()));

        while (slice.hasNext()){
            slice = userRepository.findAllBy(slice.nextPageable());
            slice.forEach(user -> System.out.println(user.getCompany().getName()));
        }
    }
    @Test
    void checkSort(){
        var sortBy = Sort.sort(User.class);
        var sort = sortBy.by(User::getFirstname)
                .and(sortBy.by(User::getLastname));

        var sortById = Sort.by("firstname").and(Sort.by("lastname"));
        var allUsers = userRepository.findTop3ByBirthDateBefore(LocalDate.now(), sort);

    }

    @Test
    void checkFirstTop(){
        var topUser = userRepository.findTopByOrderByIdDest();
        topUser.ifPresent(user -> Assertions.assertEquals(5L, user.getId()));

    }
    @Test
    void checkUpdate(){
        var resultCount = userRepository.updateRole(Role.USER, 1L, 5L);
        Assertions.assertEquals(2, resultCount);
    }
//    @Test
//    void checkQueries(){
//        var users = userRepository.findAllBy("a", "ov");
//        Assertions.assertThat(users).hasSize(3);
//    }
}
