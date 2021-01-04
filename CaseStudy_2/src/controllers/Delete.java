package controllers;

import data.FileData;
import models.*;

import java.util.List;
import java.util.Scanner;

public class Delete {


    static final String VILLA = "src/Data/Villa.csv";
    static final String HOUSE = "src/Data/House.csv";
    static final String ROOM = "src/Data/Room.csv";
    static final String CUSTOMER = "src/data/Customer.csv";
    static final String EMPLOYEE = "src/data/Employee.csv";


    static Scanner scanner = new Scanner(System.in);
    private static void deleteService() {
        Display.displayDeleteService();
        int choice = 0;
        while (choice != 4) {
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    DeleteObject<Villa> deleteVilla = new DeleteObject<>();
                    List<Villa> villas = FileData.readFileVilla();
                    deleteVilla.delete(villas);
                    for (Villa villa: villas) {
                        FileData.updateData(VILLA, villa);
                    }
                    break;
                case 2:
                    DeleteObject<House> deleteHouse = new DeleteObject<>();
                    List<House> houses = FileData.readFileHouse();
                    deleteHouse.delete(houses);
                    for (House house : houses) {
                        FileData.updateData(HOUSE,house);
                    }
                    break;
                case 3:
                    DeleteObject<Room> deleteRoom = new DeleteObject<>();
                    List<Room> rooms = FileData.readFileRoom();
                    deleteRoom.delete(rooms);
                    for (Room room : rooms) {
                        FileData.updateData(ROOM,room);
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Your choice not exists");
                    break;
            }
        }
    }

    private static void deleteCustomer(){
        DeleteObject<Customer> deleteCustomer = new DeleteObject<>();
        List<Customer> customers = FileData.readFileCustomer();
        deleteCustomer.delete(customers);
        for (Customer customer: customers) {
            FileData.updateData(CUSTOMER,customer);
        }
    }

    private static void deleteEmployee() {
        DeleteObject<Employee> deleteEmployee = new DeleteObject<>();
        List<Employee> employeeList = FileData.readFileEmployee();
        deleteEmployee.delete(employeeList);
        for (Employee employee: employeeList) {
            FileData.updateData(EMPLOYEE,employee);
        }
    }

    private static void deleteBooking() {

    }

    public static void delete() {
        Display.displayDelete();
        int choice = 0;
        while (choice != 5) {
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    deleteService();
                    break;
                case 2:
                    deleteCustomer();
                    break;
                case 3:
                    deleteEmployee();
                    break;
                case 4:
                    deleteBooking();
                    break;
                default:
                    System.out.println("your choice not exists");
                    break;
            }
        }
    }
}
