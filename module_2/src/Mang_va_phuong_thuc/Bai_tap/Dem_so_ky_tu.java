package Mang_va_phuong_thuc.Bai_tap;

import java.util.Scanner;

public class Dem_so_ky_tu {
    public static void main(String[] args) {
        String str;
        String c;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter yor string");
        str = scanner.nextLine();
        do {
            System.out.println("Enter your char : ");
            c = scanner.next();
            if (c.length() != 1) {
                System.out.println("Enter one char");
            }
        } while (c.length() != 1);
        for (int i = 0; i < str.length() ; i++) {
            if (c.charAt(0) == str.charAt(i)){
                count++;
            }
        }
        if (count == 0) {
            System.out.println("No one your char in string");
        } else {
            System.out.println("you have " + count + " char in string");
        }
    }
}
