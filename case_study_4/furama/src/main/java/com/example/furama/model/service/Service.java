package com.example.furama.model.service;


import com.example.furama.model.contract.Contract;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.util.Set;

@Entity
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "service_id")
    private Long serviceId;

    @NotEmpty(message = "Not Empty")
    @Pattern(regexp = "^(DV-)\\d{4}$",message = "CustomerCode Must be (KH-XXXX) with X in [0,9]")
    @Column(name = "service_code",length = 20,unique = true)
    private String serviceCode;

    @NotEmpty(message = "Not Empty")
    @Column(name = "service_name",length = 45, nullable = false)
    private String serviceName;

    @Min(value = 0,message = "must be > 0")
    @Column(name = "service_area")
    private int serviceArea;

    @Min(value = 0,message = "must be > 0")
    @Column(name = "service_cost")
    private double serviceCost;

    @Min(value = 0,message = "must be > 0")
    @Column(name = "service_max_people")
    private int serviceMaxPeople;

    @NotEmpty(message = "Not Empty")
    @Column(name = "standar_room",length = 45, nullable = false)
    private String standardRoom;

    @NotEmpty(message = "Not Empty")
    @Column(name = "description_other_convenience",length = 45, nullable = false)
    private String descriptionOtherConvenience;

    @Column(name = "pool_area")
    private double poolArea;

    @Min(value = 0,message = "must be > 0")
    @Column(name = "number_of_floors")
    private int numberOfFloors;

    @ManyToOne
    @JoinColumn(name = "rent_type_id",referencedColumnName = "rent_type_id")
    private RentType rentType;

    @ManyToOne
    @JoinColumn(name = "service_type_id",referencedColumnName = "service_type_id")
    private ServiceType serviceType;

    @OneToMany(mappedBy = "serviceContract",cascade = CascadeType.ALL)
    private Set<Contract> contractServices;

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public Set<Contract> getContractServices() {
        return contractServices;
    }

    public void setContractServices(Set<Contract> contractServices) {
        this.contractServices = contractServices;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public RentType getRentType() {
        return rentType;
    }

    public void setRentType(RentType rentType) {
        this.rentType = rentType;
    }

    public Long getServiceId() {
        return serviceId;
    }

    public void setServiceId(Long serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public int getServiceArea() {
        return serviceArea;
    }

    public void setServiceArea(int serviceArea) {
        this.serviceArea = serviceArea;
    }

    public double getServiceCost() {
        return serviceCost;
    }

    public void setServiceCost(double serviceCost) {
        this.serviceCost = serviceCost;
    }

    public int getServiceMaxPeople() {
        return serviceMaxPeople;
    }

    public void setServiceMaxPeople(int serviceMaxPeople) {
        this.serviceMaxPeople = serviceMaxPeople;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getDescriptionOtherConvenience() {
        return descriptionOtherConvenience;
    }

    public void setDescriptionOtherConvenience(String descriptionOtherConvenience) {
        this.descriptionOtherConvenience = descriptionOtherConvenience;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }
}
