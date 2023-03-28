package com.example.spring.database.repository;
import com.example.spring.database.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface CompanyRepository extends JpaRepository<Company, Integer> {
    //@Query(name = "Company.findByName")
    @Query("select c from Company  c where c.name = :name2")
    Optional<Company> findByName(@Param("name2") String name);

    List<Company> findByNameContainingIgnoreCase(String fragment);
}
