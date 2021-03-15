package com.example.furama.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Division {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "division_id")
    private Long divisionId;

    @Column(name = "division_name",length = 45)
    private String divisionName;

    @OneToMany(mappedBy = "employeeDivision")
    private Set<Employee> employeeDivisions;

    public Division() {
    }

    public Long getDivisionId() {
        return divisionId;
    }

    public void setDivisionId(Long divisionId) {
        this.divisionId = divisionId;
    }

    public String getDivisionName() {
        return divisionName;
    }

    public void setDivisionName(String divisionName) {
        this.divisionName = divisionName;
    }

    public Set<Employee> getEmployeeDivisions() {
        return employeeDivisions;
    }

    public void setEmployeeDivisions(Set<Employee> employeeDivisions) {
        this.employeeDivisions = employeeDivisions;
    }
}
