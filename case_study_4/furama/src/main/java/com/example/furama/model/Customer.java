package com.example.furama.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Long customerId;

    @Column(name = "customer_code",length = 20,unique = true)
    private String CustomerCode;

    @Column(name = "customer_name",length = 45, nullable = false)
    private String customerName;

    @Column(name = "customer_birthday",length = 45,columnDefinition = "date", nullable = false)
    private String customerBirthday;

    @Column(name = "customer_gender",length = 15, nullable = false)
    private String customerGender;

    @Column(name = "customer_id_card",length = 45, nullable = false)
    private String customerIdCard;

    @Column(name = "customer_phone",length = 45, nullable = false)
    private String customerPhone;

    @Column(name = "customer_email",length = 45)
    private String customerEmail;

    @Column(name = "customer_address",length = 45)
    private String customerAddress;

    @ManyToOne
    @JoinColumn(name = "customer_type_id",referencedColumnName = "customer_type_id")
    private CustomerType customerType;

    @OneToMany(mappedBy = "customerContract")
    private Set<Contract> contractCustomers;

    public Customer() {
    }

    public String getCustomerCode() {
        return CustomerCode;
    }

    public void setCustomerCode(String customerCode) {
        CustomerCode = customerCode;
    }

    public Set<Contract> getContractCustomers() {
        return contractCustomers;
    }

    public void setContractCustomers(Set<Contract> contractCustomers) {
        this.contractCustomers = contractCustomers;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerBirthday() {
        return customerBirthday;
    }

    public void setCustomerBirthday(String customerBirthday) {
        this.customerBirthday = customerBirthday;
    }

    public String getCustomerGender() {
        return customerGender;
    }

    public void setCustomerGender(String customerGender) {
        this.customerGender = customerGender;
    }

    public String getCustomerIdCard() {
        return customerIdCard;
    }

    public void setCustomerIdCard(String customerIdCard) {
        this.customerIdCard = customerIdCard;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }
}
