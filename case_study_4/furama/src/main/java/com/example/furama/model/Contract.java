package com.example.furama.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contract_id")
    private Long contractId;

    @Column(name = "contract_start_date",columnDefinition = "datetime",nullable = false)
    private String contractStartDate;

    @Column(name = "contract_end_date",columnDefinition = "datetime",nullable = false)
    private String contractEndDate;

    @Column(name = "contract_deposit",nullable = false)
    private double contractDeposit;

    @Column(name = "contract_total_money",nullable = false)
    private double contractTotalMoney;

    @ManyToOne
    @JoinColumn(name = "employee_id",referencedColumnName = "employee_id")
    private Employee employeeContract;

    @ManyToOne
    @JoinColumn(name = "customer_id",referencedColumnName = "customer_id")
    private Customer customerContract;

    @ManyToOne
    @JoinColumn(name = "service_id",referencedColumnName = "service_id")
    private Service serviceContract;

    @OneToMany(mappedBy = "contract")
    private Set<ContractDetail> contractDetail;

    public Contract() {
    }

    public Long getContractId() {
        return contractId;
    }

    public void setContractId(Long contractId) {
        this.contractId = contractId;
    }

    public String getContractStartDate() {
        return contractStartDate;
    }

    public void setContractStartDate(String contractStartDate) {
        this.contractStartDate = contractStartDate;
    }

    public String getContractEndDate() {
        return contractEndDate;
    }

    public void setContractEndDate(String contractEndDate) {
        this.contractEndDate = contractEndDate;
    }

    public double getContractDeposit() {
        return contractDeposit;
    }

    public void setContractDeposit(double contractDeposit) {
        this.contractDeposit = contractDeposit;
    }

    public double getContractTotalMoney() {
        return contractTotalMoney;
    }

    public void setContractTotalMoney(double contractTotalMoney) {
        this.contractTotalMoney = contractTotalMoney;
    }

    public Employee getEmployeeContract() {
        return employeeContract;
    }

    public void setEmployeeContract(Employee employeeContract) {
        this.employeeContract = employeeContract;
    }

    public Customer getCustomerContract() {
        return customerContract;
    }

    public void setCustomerContract(Customer customerContract) {
        this.customerContract = customerContract;
    }

    public Service getServiceContract() {
        return serviceContract;
    }

    public void setServiceContract(Service serviceContract) {
        this.serviceContract = serviceContract;
    }

    public Set<ContractDetail> getContractDetail() {
        return contractDetail;
    }

    public void setContractDetail(Set<ContractDetail> contractDetail) {
        this.contractDetail = contractDetail;
    }
}
