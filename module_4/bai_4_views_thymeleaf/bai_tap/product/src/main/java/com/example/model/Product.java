package com.example.model;

public class Product {
    private int id;
    private String name;
    private double price;
    private String manufacture;
    private String description;

    public Product(int id, String name, double price, String manufacture, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.manufacture = manufacture;
        this.description = description;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
