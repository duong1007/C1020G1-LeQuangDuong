package binary_file.bai_tap.product_manager;

import java.io.Serializable;

public class Product implements Serializable {
    private String name;
    private String manufacturer;
    private double price;
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Product(String name, String manufacturer, double price, String description) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product " + name +
                ", Manufacturer: " + manufacturer +
                ", Price: " + price +
                ", Description: " + description;
    }
}
