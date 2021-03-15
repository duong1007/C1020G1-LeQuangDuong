package com.codegym.springsecurity.repository;

import com.codegym.springsecurity.model.AppRole;
import com.codegym.springsecurity.model.AppUser;
import com.codegym.springsecurity.model.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRoleRepository extends JpaRepository<UserRole,Long> {

    List<UserRole> findAllByAppUser(AppUser appUser);

}
