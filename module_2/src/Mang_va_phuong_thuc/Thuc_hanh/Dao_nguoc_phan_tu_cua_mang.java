package Mang_va_phuong_thuc.Thuc_hanh;

import java.util.Scanner;

public class Dao_nguoc_phan_tu_cua_mang {
    public static void main(String[] args) {
        int size;
        int arr[], arrReverse[];
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter size : ");
            size = scanner.nextInt();
            if (size >20) {
                System.out.println("Size does not exceed 20");
            }
        } while (size > 20);
        arr = new int[size];
        arrReverse = new int[size];
        for (int i = 0; i <arr.length;i++) {
            System.out.println("Enter element " +(i+1)+ " :");
            arr[i] = scanner.nextInt();
        }
        System.out.printf("%-20s%s", "Elements in arr: ", "");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }
        for (int j = 0; j < arr.length; j++) {
            arrReverse[j] = arr[arr.length -1 -j];
        }
        System.out.println(" ");
        System.out.printf("%-20s%s", "Reverse arr: ", "");
        for (int j = 0; j < arrReverse.length; j++) {
            System.out.print(arrReverse[j] + "\t");
        }
    }
}
