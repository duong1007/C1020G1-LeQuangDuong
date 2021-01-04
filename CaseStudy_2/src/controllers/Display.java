package controllers;

public class Display {
    public static void displayMainMenu() {
        System.out.print("1.\tAdd New Services\n" +
                "2.\tShow Services\n" +
                "3.\tAdd New Customer\n" +
                "4.\tShow Information of Customer\n" +
                "5.\tAdd New Booking\n" +
                "6.\tShow Information of Employee\n" +
                "7.\tSearch Employee\n" +
                "8.\tAdd Cinema Customer\n" +
                "9.\tShow Cinema Customer\n" +
                "10.\tDelete\n" +
                "11.\tExit\n" +
                "\tYour Choice:" );
    }

    public static void displayAddMenu() {
        System.out.print("1.\tAdd New Villa\n" +
                "2.\tAdd New House\n" +
                "3.\tAdd New Room\n" +
                "4.\tBack to menu\n" +
                "5.\tExit\n" +
                "\tYour Choice:");
    }

    public static void displayShowServices() {
        System.out.print("1.\tShow all Villa\n" +
                "2.\tShow all House\n" +
                "3.\tShow all Room\n" +
                "4.\tShow All Name Villa Not Duplicate\n" +
                "5.\tShow All Name House Not Duplicate\n" +
                "6.\tShow All Name Name Not Duplicate\n" +
                "7.\tBack to menu\n" +
                "8.\tExit\n" +
                "\tYour Choice:");
    }

    public static void displayBooking () {
        System.out.println("1.\tBooking Villa\n" +
                "2.\tBooking House\n" +
                "3.\tBooking Room\n" +
                "\tYour Choice:");
    }

    public static void displayDelete() {
        System.out.println("1.\tDelete Service\n" +
                "2.\tDelete Customer\n" +
                "3.\tDelete Employee\n" +
                "4.\tDelete Booking\n" +
                "5.\tExit\n" +
                "\tYour Choice:");
    }

    public static void displayDeleteService() {
        System.out.println("1.\tDelete Villa\n" +
                "2.\tDelete House\n" +
                "3.\tDelete Room\n" +
                "4.\tExit\n" +
                "\tYour Choice:");
    }
}
