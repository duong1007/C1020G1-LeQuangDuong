package sort_algorithm.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array:");
        int size = scanner.nextInt();
        int array[] = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Inout: " + Arrays.toString(array));
        insertionSort(array);
        System.out.println("Output: " + Arrays.toString(array));
    }
// Cài đặt thuật toán chèn;
    private static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int tempIndex = i;
            int temp = array[i];
           for (int j = i - 1; j >= 0; j--){
               if (temp < array[j]){
                   array[j + 1] = array[j];
                   tempIndex = j;
               }
           }
           // Mô tả các bước chèn
           if (i != tempIndex) {
               System.out.println("Insertion " + temp + " before " + array[tempIndex]);
           }
           array[tempIndex] = temp;
           if (i != tempIndex) {
                System.out.println(Arrays.toString(array));
           }
        }
    }
}
