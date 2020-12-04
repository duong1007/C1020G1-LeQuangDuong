package mang_va_phuong_thuc.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class Tim_min_trong_mang {
    public static void main(String[] args) {
        int number;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            number = scanner.nextInt();
            if (number < 1)
                System.out.println("Size should must exceed 0");
        } while (number < 1);
        array = new int[number];
        for (int i = 0; i < array.length;i++) {
            System.out.print("Enter element " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
        }
        System.out.print("Array is: " + Arrays.toString(array));
        int min = array[0];
        for (int i = 1; i < array.length; i++){
            if (min > array[i]){
                min = array[i];
            }
        }
        System.out.printf("\n");
        System.out.println("Min in Array is : " + min);
    }
}
