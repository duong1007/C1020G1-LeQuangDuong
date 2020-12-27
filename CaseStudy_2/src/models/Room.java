package models;

import commons.regex.Regex;

import java.util.Scanner;

public class Room extends Services {

    private String freeServices;

    public Room() {
    }

    public Room(String id,String servicesName,double useArea,double price,int maxPeople,String rentalType,String freeServices) {
        this.id = id;
        this.servicesName = servicesName;
        this.useArea = useArea;
        this.price = price;
        this.maxPeople = maxPeople;
        this.rentalType = rentalType;
        this.freeServices = freeServices;
    }

    public String getID() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getServicesName() {
        return servicesName;
    }

    public void setServicesName(String servicesName) {
        this.servicesName = servicesName;
    }

    public double getUseArea() {
        return useArea;
    }

    public void setUseArea(double useArea) {
        this.useArea = useArea;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Id: ");
        this.id = scanner.next();
        if(!checkRegex(this.id, Regex.ID_ROOM_REGEX)) {
            System.err.println("WRONG FORMAT!!! : ID = SVRO-YYYY with YYYY is numbers");
            this.input();
        }

        while (servicesName == null) {
            System.out.println("Enter ServicesName: ");
            this.servicesName = scanner.next();
            if (!checkRegex(this.servicesName, Regex.SV_NAME_REGEX)) {
                System.err.println("WRONG FORMAT!!! : First letter capitalization");
                servicesName = null;
            }
        }

        while (!checkRegex(this.useArea)) {
            System.out.println("Enter UseArea: ");
            this.useArea = scanner.nextDouble();
            if (!checkRegex(this.useArea)) {
                System.err.println("WRONG FORMAT!!! : Use Area is greater than 30");
            }
        }

        System.out.println("Enter Price: ");
        this.price = scanner.nextDouble();

        while (!checkRegex(this.maxPeople)) {
            System.out.println("Enter MaxPeople: ");
            this.maxPeople = scanner.nextInt();
            if (!checkRegex(this.maxPeople)) {
                System.err.println("WRONG FORMAT!!! : number of people is greater than 0 and less than 20");
            }
        }

        System.out.println("Enter RentalType: ");
        this.rentalType = scanner.next();

        while (freeServices == null) {
            System.out.println("Enter FreeServices: ");
            this.freeServices = scanner.next();
            if (!checkRegex(this.freeServices.toLowerCase())) {
                System.err.println("WRONG FORMAT!!! : Free Service must is one of massage, karaoke, food, drink, car");
                freeServices = null;
            }
        }
    }

    private boolean checkRegex(String string,String regex){
        Regex regexObject = new Regex(regex);
        return regexObject.validate(string);
    }

    private boolean checkRegex(double area){
        return !(area < 30);
    }

    private boolean checkRegex(int people){
        return people > 0 && people < 20;
    }

    private boolean checkRegex(String sv) {
        switch (sv) {
            case "massage":
            case "karaoke":
            case "food":
            case "drink":
            case "car":
                return true;
            default:
                return false;
        }
    }



    @Override
    public String showInfo() {
        return "Room{" +
                "Id = '" + id + '\'' +
                ", ServicesName = '" + servicesName + '\'' +
                ", UseArea = " + useArea +
                ", Price = " + price +
                ", MaxPeople = " + maxPeople +
                ", RentalType = '" + rentalType + '\'' +
                ", FreeServices= '" + freeServices + '\'' +
                '}';
    }

    @Override
    public String toString() {
        return id +
                ',' + servicesName +
                ',' + useArea +
                ',' + price +
                ',' + maxPeople +
                ',' + rentalType +
                ',' + freeServices;
    }
}
