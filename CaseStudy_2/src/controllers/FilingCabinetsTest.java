package controllers;

import models.Employee;
import models.FilingCabinets;

import java.util.Scanner;

public class FilingCabinetsTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
