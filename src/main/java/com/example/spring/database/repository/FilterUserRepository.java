package com.example.spring.database.repository;

import com.example.spring.database.entity.Role;
import com.example.spring.database.entity.User;
import com.example.spring.dto.PersonalInfo;
import com.example.spring.dto.UserFilter;

import java.util.List;

public interface FilterUserRepository {

    List<User> findAllByFilter(UserFilter filter);

    List<PersonalInfo> findAllByCompanyIdAndRole(Integer companyId, Role role);

    void updateCompanyAndRole(List<User> users);
    void updateCompanyAndRoleNamed(List<User> users);
}
