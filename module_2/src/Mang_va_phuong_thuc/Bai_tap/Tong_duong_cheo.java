package Mang_va_phuong_thuc.Bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class Tong_duong_cheo {
    public static void main(String[] args) {
        int numbers;
        double arr[][];
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter row and column of matrix : ");
            numbers = scanner.nextInt();
            if (numbers < 1){
                System.out.println("Column phải lớn hơn 0");
            }
        } while (numbers < 1);
        arr = new double[numbers][numbers];
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                System.out.print("Enter element " +i +j +" : ");
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Matrix :");
        for (int i = 0; i <arr.length; i++) {
            System.out.println( Arrays.toString(arr[i]));
        }
        System.out.println("Tổng đường chéo chính = " + sum(arr));
    }
    public static int sum(double arr[][]) {
        int sum = 0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if (i == j) {
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }
}
