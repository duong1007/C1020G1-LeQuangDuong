package controllers;
import libs.Cinema4D;

import java.util.*;

public class MainControllers {

    public static void option() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (choice != 7) {
            Display.displayMainMenu();
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Add.addNewServices();
                    break;
                case 2:
                    Show.showServices();
                    break;
                case 3:
                    Add.addNewCustomer();
                    break;
                case 4:
                    Show.showInformationCustomer();
                    break;
                case 5:
                    Add.addNewBooking();
                    break;
                case 6:
                    Show.showInformationEmployee();
                    break;
                case 7:
                    Cinema4D.addCinemaCustomer();
                    break;
                case 8:
                    Cinema4D.ShowCinemaCustomer();
                    break;
                case 9:
                    Show.searchEmployee();
                    break;
                case 10:
                    break;
                default:
                    System.out.println("Choice not exists");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        option();
    }
}
