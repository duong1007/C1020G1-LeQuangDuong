package com.example.furama.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "service_id")
    private Long serviceId;

    @Column(name = "service_code",length = 20,unique = true)
    private String ServiceCode;

    @Column(name = "service_name",length = 45, nullable = false)
    private String serviceName;

    @Column(name = "service_area")
    private int serviceArea;

    @Column(name = "service_cost")
    private double serviceCost;

    @Column(name = "service_max_people")
    private int serviceMaxPeople;

    @Column(name = "standar_room",length = 45, nullable = false)
    private String standardRoom;

    @Column(name = "description_other_convenience",length = 45, nullable = false)
    private String descriptionOtherConvenience;

    @Column(name = "pool_area")
    private double poolArea;

    @Column(name = "number_of_floors")
    private int numberOfFloors;

    @ManyToOne
    @JoinColumn(name = "rent_type_id",referencedColumnName = "rent_type_id")
    private RentType rentType;

    @ManyToOne
    @JoinColumn(name = "service_type_id",referencedColumnName = "service_type_id")
    private ServiceType serviceType;

    @OneToMany(mappedBy = "serviceContract")
    private Set<Contract> contractServices;

    public String getServiceCode() {
        return ServiceCode;
    }

    public void setServiceCode(String serviceCode) {
        ServiceCode = serviceCode;
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
