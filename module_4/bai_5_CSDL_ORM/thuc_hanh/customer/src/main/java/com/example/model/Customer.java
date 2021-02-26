package com.example.model;

import javax.persistence.*;

@Entity
@Table
public class Customer implements Cloneable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
