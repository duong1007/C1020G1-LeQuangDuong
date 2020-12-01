package Mang_va_phuong_thuc.Bai_tap;

import java.util.Scanner;

public class Them_phan_tu_vao_mang {
    public static void main(String[] args) {
        int numbers;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter nummbers of array: ");
            numbers = scanner.nextInt();
            if (numbers < 1) {
                System.out.println("numbers must be greater than 0");
            }
        } while (numbers < 1);
    }
}
