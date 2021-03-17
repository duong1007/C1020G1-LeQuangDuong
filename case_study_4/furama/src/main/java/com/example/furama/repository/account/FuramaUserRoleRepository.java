package com.example.furama.repository.account;

import com.example.furama.model.account.FuramaUser;
import com.example.furama.model.account.FuramaUserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FuramaUserRoleRepository extends JpaRepository<FuramaUserRole,Long> {

    List<FuramaUserRole> findAllByFuramaUser(FuramaUser appUser);

}
