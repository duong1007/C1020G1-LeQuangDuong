package models;

import commons.regex.Regex;

import java.util.Scanner;

public class Villa extends Services {

    private String standard;
    private String description;
    private double poolArea;
    private int numberFloors;

    public Villa() {
    }

    public Villa(String id,String servicesName,double useArea,double price,int maxPeople,String rentalType,String standard, String description, double poolArea, int numberFloors) {
        this.id = id;
        this.servicesName = servicesName;
        this.useArea = useArea;
        this.price = price;
        this.maxPeople = maxPeople;
        this.rentalType = rentalType;
        this.standard = standard;
        this.description = description;
        this.poolArea = poolArea;
        this.numberFloors = numberFloors;
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

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
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

    public int getNumberFloors() {
        return numberFloors;
    }

    public void setNumberFloors(int numberFloors) {
        this.numberFloors = numberFloors;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Id: ");
        this.id = scanner.next();
        if(!checkRegex(this.id, Regex.ID_VILLA_REGEX)) {
            System.err.println("WRONG FORMAT!!! : ID format is SVVL-YYYY with YYYY is numbers");
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
        System.out.println("Enter Standard: ");
        this.standard = scanner.next();
        System.out.println("Enter Description: ");
        this.description = scanner.next();

        while (!checkRegex(this.poolArea)) {
            System.out.println("Enter PoolArea: ");
            this.poolArea = scanner.nextDouble();
            if (!checkRegex(this.poolArea)) {
                System.err.println("WRONG FORMAT!!! : Use Area is greater than 30");
            }
        }

        while (numberFloors <= 0) {
            System.out.println("Enter NumberFloors: ");
            this.numberFloors = scanner.nextInt();
            if (numberFloors <= 0) {
                System.err.println("WRONG FORMAT!!! : number of floors is greater than 0");
            }
        }
    }

    private boolean checkRegex(String string,String regex){
        Regex regexObject = new Regex(regex);
        return regexObject.validate(string);
    }

    private boolean checkRegex(double area){
        return !(area <= 30);
    }

    private boolean checkRegex(int people){
        return people > 0 && people < 20;
    }



    @Override
    public String showInfo() {
        return "Villa{" +
                "Id = '" + id + '\'' +
                ", ServicesName = '" + servicesName + '\'' +
                ", UseArea = " + useArea +
                ", Price = " + price +
                ", MaxPeople = " + maxPeople +
                ", RentalType = '" + rentalType + '\'' +
                ", Standard = '" + standard + '\'' +
                ", Description = '" + description + '\'' +
                ", PoolArea = " + poolArea +
                ", NumberFloors = " + numberFloors +
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
                ',' + standard +
                ',' + description +
                ',' + poolArea +
                ',' + numberFloors;
    }
}
