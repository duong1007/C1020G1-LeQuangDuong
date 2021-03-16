package com.example.furama.model.customer;

import com.example.furama.model.contract.Contract;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Set;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Long customerId;

    @NotNull(message = "Not Null")
    @Pattern(regexp = "^(KH-)\\d{4}$",message = "CustomerCode Must be (KH-XXXX) with X in [0,9]")
    @Column(name = "customer_code",length = 20,unique = true)
    private String customerCode;

    @NotNull(message = "Not Null")
    @Column(name = "customer_name",length = 45, nullable = false)
    private String customerName;

    @NotNull(message = "Not Null")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "customer_birthday",length = 45,columnDefinition = "date", nullable = false)
    private String customerBirthday;

    @NotNull(message = "Not Null")
    @Column(name = "customer_gender",length = 15, nullable = false)
    private String customerGender;

    @NotNull(message = "Not Null")
    @Column(name = "customer_id_card",length = 45, nullable = false)
    private String customerIdCard;

    @NotNull(message = "Not Null")
    @Pattern(regexp = "^(090|091|[(]84[+][)]90|[(]84+[)]91)\\d{7}$",message = "must be 090xx|091xx|(+84)xx")
    @Column(name = "customer_phone",length = 45, nullable = false)
    private String customerPhone;

    @Email(message = "Email must be abc@abc.abc")
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
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
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
