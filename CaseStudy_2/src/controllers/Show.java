package controllers;

import data.FileData;
import libs.FilingCabinets;
import models.*;
import commons.regex.compare.CompareName;

import java.util.*;

public class Show {

    static Scanner scanner = new Scanner(System.in);

    private static void nameVillaNotDuplicate() {
        TreeSet<String> villaTreeSet = new TreeSet<>();
        for (Villa villa: FileData.readFileVilla()) {
            villaTreeSet.add(villa.getServicesName());
        }
        System.out.println(villaTreeSet);
    }

    private static void nameHouseNotDuplicate()  {
        TreeSet<String> houseTreeSet = new TreeSet<>();
        for (House house: FileData.readFileHouse()) {
            houseTreeSet.add(house.getServicesName());
        }
        System.out.println(houseTreeSet);
    }

    private static void nameRoomNotDuplicate()  {
        TreeSet<String> roomTreeSet = new TreeSet<>();
        for (Room villa: FileData.readFileRoom()) {
            roomTreeSet.add(villa.getServicesName());
        }
        System.out.println(roomTreeSet);
    }

    public static void showServices()  {
        int choice = 0;
        while (choice != 8) {
            Display.displayShowServices();
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    for (Villa villa: FileData.readFileVilla()) {
                        System.out.println(villa.showInfo());
                    }
                    break;
                case 2:
                    for (House house : FileData.readFileHouse()) {
                        System.out.println(house.showInfo());
                    }
                    break;
                case 3:
                    for (Room room : FileData.readFileRoom()) {
                        System.out.println(room.showInfo());
                    }
                    break;
                case 4:
                    nameVillaNotDuplicate();
                    break;
                case 5:
                    nameHouseNotDuplicate();
                    break;
                case 6:
                    nameRoomNotDuplicate();
                    break;
                case 7:
                    MainControllers.option();
                    break;
                case 8:
                    break;
                default:
                    System.out.println("Choice do not exist!");
                    break;
            }
        }
    }

    public static void showInformationCustomer() {
        List<Customer> customerList = FileData.readFileCustomer();
        customerList.sort(new CompareName());

        for (Customer customer : customerList) {
            System.out.println(customer.showInfo());
        }
    }

    public static void showInformationEmployee() {
        Map<String,Employee> employeeList = FileData.readFileEmployeeMap();
        for (Map.Entry<String,Employee> entry : employeeList.entrySet()) {
            System.out.println("ID " + entry.getKey() + ", " + entry.getValue().showInfo());

        }
    }

    public static void searchEmployee() {
        System.out.println("Enter ID search: ");
        String id = scanner.next();
        Employee employee = FilingCabinets.searchEmployee(id);
        if (employee != null) {
            System.out.println(employee.showInfo());
        } else {
            System.err.println("Id not exists!!!");
        }
    }
}
