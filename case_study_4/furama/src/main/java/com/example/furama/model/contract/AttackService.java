package com.example.furama.model.contract;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "attack_service")
public class AttackService {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "attack_service_id")
    private Long attackServiceId;

    @Column(name = "attack_service_name",length = 45)
    private String attackServiceName;

    @Column(name = "attack_service_cost")
    private double attackServiceCost;

    @Column(name = "attack_service_unit")
    private double attackServiceUnit;

    @Column(name = "attack_service_status",length = 45)
    private String attackServiceStatus;

    @OneToMany(mappedBy = "attackService")
    private Set<ContractDetail> contractDetails;

    public Set<ContractDetail> getContractDetails() {
        return contractDetails;
    }

    public void setContractDetails(Set<ContractDetail> contractDetails) {
        this.contractDetails = contractDetails;
    }

    public Long getAttackServiceId() {
        return attackServiceId;
    }

    public void setAttackServiceId(Long attackServiceId) {
        this.attackServiceId = attackServiceId;
    }

    public String getAttackServiceName() {
        return attackServiceName;
    }

    public void setAttackServiceName(String attackServiceName) {
        this.attackServiceName = attackServiceName;
    }

    public double getAttackServiceCost() {
        return attackServiceCost;
    }

    public void setAttackServiceCost(double attackServiceCost) {
        this.attackServiceCost = attackServiceCost;
    }

    public double getAttackServiceUnit() {
        return attackServiceUnit;
    }

    public void setAttackServiceUnit(double attackServiceUnit) {
        this.attackServiceUnit = attackServiceUnit;
    }

    public String getAttackServiceStatus() {
        return attackServiceStatus;
    }

    public void setAttackServiceStatus(String attackServiceStatus) {
        this.attackServiceStatus = attackServiceStatus;
    }
}
