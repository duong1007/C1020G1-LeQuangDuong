package com.example.furama.model.account;

import javax.persistence.*;

@Entity
@Table(name = "user_role")
public class FuramaUserRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "role_id",referencedColumnName = "role_id")
    private FuramaRole furamaRole;

    @ManyToOne
    @JoinColumn(name = "username",referencedColumnName = "username")
    private FuramaUser furamaUser;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public FuramaRole getFuramaRole() {
        return furamaRole;
    }

    public void setFuramaRole(FuramaRole furamaRole) {
        this.furamaRole = furamaRole;
    }

    public FuramaUser getFuramaUser() {
        return furamaUser;
    }

    public void setFuramaUser(FuramaUser furamaUser) {
        this.furamaUser = furamaUser;
    }
}
