package com.example.thi_cuoi_ky.model;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import javax.persistence.*;
import javax.validation.constraints.Future;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Date;

@Entity
public class Transaction {
    @Id
    @Column(name = "transaction_code")
    @Pattern(regexp = "^(MGD-)\\d{4}$",message = "transactionCode Must be (MGD-XXXX) with X in [0,9]")
    private String transactionCode;


    @Column(name = "transaction_date",nullable = false,columnDefinition = "date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Future(message = "Transaction date must be in future")
    private Date transactionDate;

    @Column(name = "type_service",nullable = false)
    @NotNull(message = "Transaction type not null")
    private String transactionType;

    @Column(name = "transaction_total",nullable = false)
    @Min(500000)
    @NotNull(message = "Transaction total not null")
    private double transactionTotal;

    @Column(name = "transaction_area",nullable = false)
    @NotNull(message = "Area not null")
    @Min(20)
    private double transactionArea;

    @ManyToOne
    @JoinColumn(name = "customer_id",referencedColumnName = "customer_id")
    private Customer customer;

    public Transaction() {
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getTransactionCode() {
        return transactionCode;
    }

    public void setTransactionCode(String transactionCode) {
        this.transactionCode = transactionCode;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public double getTransactionTotal() {
        return transactionTotal;
    }

    public void setTransactionTotal(double transactionTotal) {
        this.transactionTotal = transactionTotal;
    }

    public double getTransactionArea() {
        return transactionArea;
    }

    public void setTransactionArea(double transactionArea) {
        this.transactionArea = transactionArea;
    }
}
