package com.example.furama.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Position {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "position_id")
    private Long positionId;

    @Column(name = "position_name", length = 45)
    private String positionName;

    @OneToMany(mappedBy = "employeePosition")
    private Set<Employee> employeePositions;

    public Position() {
    }

    public Long getPositionId() {
        return positionId;
    }

    public void setPositionId(Long positionId) {
        this.positionId = positionId;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public Set<Employee> getEmployeePositions() {
        return employeePositions;
    }

    public void setEmployeePositions(Set<Employee> employeePositions) {
        this.employeePositions = employeePositions;
    }
}
