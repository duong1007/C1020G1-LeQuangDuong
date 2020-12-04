package mang_va_phuong_thuc.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class Xoa_phan_tu_khoi_mang {
    public static void main(String[] args) {
        int numbers, X, i,index;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter numbers of arr: ");
            numbers = scanner.nextInt();
        } while (numbers < 1);
        int arr[] = new int[numbers];
        for (i = 0; i < numbers; i++) {
            System.out.println("Enter Element " + (i + 1));
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter Element Delete: ");
        X = scanner.nextInt();
        index = checkValue(arr,X);
        if (index != -1) {
            System.out.println(deleteValue(arr, index));
        } else {
            System.out.println("Not Element");
        }
    }
    public static int checkValue(int arr[], int X) {
        int index = -1;
        for(int i = 0; i < arr.length; i++){
            if (arr[i] == X) {
                index = i;
            }
        }
        return index;
    }
    public static String deleteValue(int[] arr, int index){
        for (int i = index; i < arr.length - 1; i++){
            arr[i] = arr[i + 1];
        }
        arr[arr.length -1] = 0;
        return "Array after delete: " + Arrays.toString(arr);
    }
}
