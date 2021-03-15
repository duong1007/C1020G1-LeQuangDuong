package com.example.furama.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Division {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "division_id")
    private Long division_id;

    @Column(name = "division_name",length = 45)
    private String division_name;

    @OneToMany(mappedBy = "employeeDivision")
    private Set<Employee> employeeDivisions;

    public Division() {
    }

    public Long getDivision_id() {
        return division_id;
    }

    public void setDivision_id(Long division_id) {
        this.division_id = division_id;
    }

    public String getDivision_name() {
        return division_name;
    }

    public void setDivision_name(String division_name) {
        this.division_name = division_name;
    }

    public Set<Employee> getEmployeeDivisions() {
        return employeeDivisions;
    }

    public void setEmployeeDivisions(Set<Employee> employeeDivisions) {
        this.employeeDivisions = employeeDivisions;
    }
}
