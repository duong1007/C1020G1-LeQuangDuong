package com.example.db_spring_security.repository;

import com.example.db_spring_security.model.User;
import com.example.db_spring_security.model.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRoleRepository extends JpaRepository<UserRole,Long> {
    List<UserRole> findAllByUser(User user);
}
