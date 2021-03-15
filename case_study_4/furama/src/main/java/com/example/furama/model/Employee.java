package com.example.furama.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private Long employeeId;

    @Column(name = "employee_name",length = 45,nullable = false)
    private String employeeName;

    @Column(name = "employee_birthday",columnDefinition = "date",nullable = false)
    private String employeeBirthday;

    @Column(name = "employee_id_card",length = 45,nullable = false)
    private String employeeCard;

    @Column(name = "employee_salary",length = 45,nullable = false)
    private double employeeSalary;

    @Column(name = "employee_phone",length = 45,nullable = false)
    private double employeePhone;


    @Column(name = "employee_email",length = 45)
    private String employeeEmail;

    @Column(name = "employee_address",length = 45)
    private String employeeAddress;

    @ManyToOne
    @JoinColumn(name = "education_degree_id",referencedColumnName = "education_degree_id")
    private EducationDegree employeeEducation;

    @ManyToOne
    @JoinColumn(name = "division_id",referencedColumnName = "division_id")
    private Division employeeDivision;

    @ManyToOne
    @JoinColumn(name = "position_id",referencedColumnName = "position_id")
    private Position employeePosition;

    @OneToOne
    @JoinColumn(name = "username",referencedColumnName = "username")
    private FuramaUser furamaUser;

    @OneToMany(mappedBy = "employeeContract")
    private Set<Contract> contractEmployees;


    public Employee() {
    }

    public FuramaUser getFuramaUser() {
        return furamaUser;
    }

    public void setFuramaUser(FuramaUser furamaUser) {
        this.furamaUser = furamaUser;
    }

    public Set<Contract> getContractEmployees() {
        return contractEmployees;
    }

    public void setContractEmployees(Set<Contract> contractEmployees) {
        this.contractEmployees = contractEmployees;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeBirthday() {
        return employeeBirthday;
    }

    public void setEmployeeBirthday(String employeeBirthday) {
        this.employeeBirthday = employeeBirthday;
    }

    public String getEmployeeCard() {
        return employeeCard;
    }

    public void setEmployeeCard(String employeeCard) {
        this.employeeCard = employeeCard;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public double getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(double employeePhone) {
        this.employeePhone = employeePhone;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public EducationDegree getEmployeeEducation() {
        return employeeEducation;
    }

    public void setEmployeeEducation(EducationDegree employeeEducation) {
        this.employeeEducation = employeeEducation;
    }

    public Division getEmployeeDivision() {
        return employeeDivision;
    }

    public void setEmployeeDivision(Division employeeDivision) {
        this.employeeDivision = employeeDivision;
    }

    public Position getEmployeePosition() {
        return employeePosition;
    }

    public void setEmployeePosition(Position employeePosition) {
        this.employeePosition = employeePosition;
    }
}
