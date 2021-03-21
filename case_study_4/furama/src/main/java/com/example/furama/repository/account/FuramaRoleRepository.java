package com.example.furama.repository.account;

import com.example.furama.model.account.FuramaRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FuramaRoleRepository extends JpaRepository<FuramaRole,Long> {
    FuramaRole findByFuramaRoleName(String name);
}
