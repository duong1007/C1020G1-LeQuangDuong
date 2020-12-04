package mang_va_phuong_thuc.thuc_hanh;

import java.util.Scanner;

public class Tim_gia_tri_lon_nhat {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size should not exceed 20");
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.print("Property list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        int max = array[0];
        int index = 0;
        for (i = 1; i < array.length; i++){
            if (max < array[i]){
                max = array[i];
                index = i;
            }
        }
        index++;
        System.out.printf("\n");
        System.out.println("The largest property value in the list is " + max + " ,at position " + index);
    }
}
