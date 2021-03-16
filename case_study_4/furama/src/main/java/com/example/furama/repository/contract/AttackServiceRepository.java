package com.example.furama.repository.contract;

import com.example.furama.model.contract.AttackService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttackServiceRepository extends JpaRepository<AttackService,Long> {
}
