package Mang_va_phuong_thuc.Bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class Plus_column_array_2_space {
    public static void main(String[] args) {
        int row;
        int column;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter row of matrix : ");
            row = scanner.nextInt();
            System.out.print("Enter column of matrix : ");
            column = scanner.nextInt();
            if (column < 1){
                System.out.println("Column phải lớn hơn 0");
            }
            if (row < 1) {
                System.out.println("Row phải lớn hơn 0");
            }
        } while (row < 1 || column < 1);
        int arr[][] = new int[row][column];
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
        int columnNumber;
        do {
            System.out.println("Enter Column Number: ");
            columnNumber = scanner.nextInt();
            if (columnNumber < 1 || columnNumber > arr[0].length) {
                System.out.println("Not have this column");
            }
        }while (columnNumber < 1 || columnNumber > arr[0].length);
        System.out.println("Max in matrix is: " + plusColumn(arr,columnNumber));
    }
    public static int plusColumn(int arr[][], int columnNumber) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][columnNumber - 1];
        }
        return sum;
    }
}
