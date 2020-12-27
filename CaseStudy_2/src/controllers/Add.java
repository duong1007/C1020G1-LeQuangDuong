package controllers;

import data.FileData;
import models.Customer;
import models.House;
import models.Room;
import models.Villa;
import java.util.Scanner;

public class Add {
    static Scanner scanner = new Scanner(System.in);
    static final String VILLA = "src/Data/Villa.csv";
    static final String HOUSE = "src/Data/House.csv";
    static final String ROOM = "src/Data/Room.csv";
    static final String CUSTOMER = "src/data/Customer.csv";


    public static void addNewServices() {

        int choice = 0;
        while (choice != 5) {
            Display.displayAddMenu();
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Villa villa = new Villa();
                    villa.input();
                    FileData.saveData(VILLA, villa);
                    break;
                case 2:
                    House house = new House();
                    house.input();
                    FileData.saveData(HOUSE, house);
                    break;
                case 3:
                    Room room = new Room();
                    room.input();
                    FileData.saveData(ROOM, room);
                    break;
                case 4:
                    MainControllers.option();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Choice do not exist!");
                    break;
            }
        }
    }

    public static void addNewCustomer(){
        Customer customer = new Customer();
        customer.input();
        FileData.saveData(CUSTOMER,customer);
    }

    public static void addNewBooking(){
        System.out.println("Choice Serial!!");
        Booking<Customer> customerBooking = new Booking<>();
        Customer customer = customerBooking.book(FileData.readFileCustomer());
        String id;
        if (customer != null) {
            id = customer.getId();
        } else {
            System.err.println("ID not exists!!!");
            return;
        }

        Display.displayBooking();
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                Booking<Villa> villaBooking = new Booking<>();
                Villa villa = villaBooking.book(FileData.readFileVilla());
                if (villa != null) {
                    FileData.saveBooking(id, villa.getID());
                } else {
                    System.err.println("Serial villa not exists!!!");
                    addNewBooking();
                }
                break;
            case 2:
                Booking<House> houseBooking = new Booking<>();
                House house = houseBooking.book(FileData.readFileHouse());
                if (house != null) {
                    FileData.saveBooking(id, house.getID());
                } else {
                    System.err.println("Serial house not exists!!!");
                    addNewBooking();
                }
            case 3:
                Booking<Room> roomBooking = new Booking<>();
                Room room = roomBooking.book(FileData.readFileRoom());
                if (room != null) {
                    FileData.saveBooking(id, room.getID());
                } else {
                    System.err.println("Serial room not exists!!!");
                    addNewBooking();
                }
        }
    }
}
