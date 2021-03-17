package com.example.furama.repository.account;

import com.example.furama.model.account.FuramaUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuramaUserRepository extends JpaRepository<FuramaUser,Long> {
    FuramaUser findByUsername(String name);
}
