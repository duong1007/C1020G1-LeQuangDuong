package mang_va_phuong_thuc.thuc_hanh;

import java.util.Scanner;

public class Chuyen_doi_do_c_f {
    public static void main(String[] args) {
        int choice;
        double fahrenheit;
        double celsius;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.printf("%s\n%s\n%s\n","1. Fahrenheit to Celsius","2. Celsius to Fahrenheit","0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice){
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("Enter Fahrenheit: ");
                    fahrenheit = scanner.nextInt();
                    System.out.println("Celsius = " +fahrenheitToCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.println("Enter Celsius: ");
                    celsius = scanner.nextInt();
                    System.out.println("Fahrenheit = " + celsiusToFahrenheit(celsius));
                    break;
                default:
                    System.out.println("No Choice");
            }
        } while (choice != 0);
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }
}
