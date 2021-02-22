package model.bean;

public class ServiceFurama {
    private Integer id;
    private String name;
    private int area;
    private double cost;
    private int maxPeople;
    private String rentType;
    private String serviceType;
    private String standardRoom;
    private String description;
    private double poolArea;
    private int numberOfFloors;


    public ServiceFurama(String name, int area, double cost, int maxPeople, String rentType, String serviceType,
                         String standardRoom, String description, double poolArea, int numberOfFloors) {
        this.name = name;
        this.area = area;
        this.cost = cost;
        this.maxPeople = maxPeople;
        this.rentType = rentType;
        this.serviceType = serviceType;
        this.standardRoom = standardRoom;
        this.description = description;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public ServiceFurama(String name, int area, double cost, int maxPeople, String rentType, String serviceType,
                         String standardRoom, String description, int numberOfFloors) {
        this.name = name;
        this.area = area;
        this.cost = cost;
        this.maxPeople = maxPeople;
        this.rentType = rentType;
        this.serviceType = serviceType;
        this.standardRoom = standardRoom;
        this.description = description;
        this.numberOfFloors = numberOfFloors;
    }


    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
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

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }
}
