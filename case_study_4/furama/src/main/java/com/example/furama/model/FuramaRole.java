package com.example.furama.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "role")
public class FuramaRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Long furamaRoleId;

    @Column(name = "role_name")
    private String furamaRoleName;

    @OneToMany(mappedBy = "furamaRole")
    private Set<FuramaUserRole> furamaUserRoles;

    public FuramaRole() {
    }

    public Set<FuramaUserRole> getFuramaUserRoles() {
        return furamaUserRoles;
    }

    public void setFuramaUserRoles(Set<FuramaUserRole> furamaUserRoles) {
        this.furamaUserRoles = furamaUserRoles;
    }

    public Long getFuramaRoleId() {
        return furamaRoleId;
    }

    public void setFuramaRoleId(Long furamaRoleId) {
        this.furamaRoleId = furamaRoleId;
    }

    public String getFuramaRoleName() {
        return furamaRoleName;
    }

    public void setFuramaRoleName(String furamaRoleName) {
        this.furamaRoleName = furamaRoleName;
    }
}
