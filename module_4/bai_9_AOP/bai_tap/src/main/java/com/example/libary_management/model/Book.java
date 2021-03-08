package com.example.libary_management.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String type;
    private String content;
    private int amount;

    @OneToMany
    @JoinColumn(name = "borrow_book_id",referencedColumnName = "id")
    private Set<BorrowBook> borrowBooks;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Set<BorrowBook> getBorrowBooks() {
        return borrowBooks;
    }

    public void setBorrowBooks(Set<BorrowBook> borrowBooks) {
        this.borrowBooks = borrowBooks;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
