package libs;

import data.FileData;
import models.Customer;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Cinema4D {
    private static Queue<String> nameCustomer = new LinkedList<>();
    private static final int MAX_TICKETS = 10;
    private static int count;

    private static Customer searchCustomer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ID search: ");
        String id = scanner.next();
        List<Customer> customers = FileData.readFileCustomer();
        for (Customer customer : customers) {
            if (customer.getId().equals(id)) {
                return customer;
            }
        }
        return null;
    }

    public static void addCinemaCustomer() {
        Customer customer = searchCustomer();
        if (customer == null){
            System.out.println("Customer not exist ");
            return;
        }
        nameCustomer.add(customer.getName());
        if (count == MAX_TICKETS) {
            System.out.println("Sold out!!!");
            return;
        }
        count++;
    }

    public static void ShowCinemaCustomer() {
        while (!nameCustomer.isEmpty()) {
            System.out.println(nameCustomer.poll());
        }
    }
}
