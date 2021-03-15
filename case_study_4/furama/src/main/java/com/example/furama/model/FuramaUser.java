package com.example.furama.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "user")
public class FuramaUser {
    @Id
    private String username;

    private String password;

    @OneToOne(mappedBy = "furamaUser")
    private Employee employee;

    @OneToMany(mappedBy = "furamaUser")
    private Set<FuramaUserRole> furamaUserRole;

    public FuramaUser() {
    }

    public Set<FuramaUserRole> getFuramaUserRole() {
        return furamaUserRole;
    }

    public void setFuramaUserRole(Set<FuramaUserRole> furamaUserRole) {
        this.furamaUserRole = furamaUserRole;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
