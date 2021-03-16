package com.example.furama.model.customer;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "customer_type")
public class CustomerType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_type_id")
    private Long customerTypeId;

    @Column(name = "customer_type_name",length = 45)
    private String customerTypeName;

    @OneToMany(mappedBy = "customerType")
    private Set<Customer> customerTypes;

    public Set<Customer> getCustomerTypes() {
        return customerTypes;
    }

    public void setCustomerTypes(Set<Customer> customerTypes) {
        this.customerTypes = customerTypes;
    }

    public Long getCustomerTypeId() {
        return customerTypeId;
    }

    public void setCustomerTypeId(Long customerTypeId) {
        this.customerTypeId = customerTypeId;
    }

    public String getCustomerTypeName() {
        return customerTypeName;
    }

    public void setCustomerTypeName(String customerTypeName) {
        this.customerTypeName = customerTypeName;
    }

    public CustomerType() {
    }
}
