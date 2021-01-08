package mang_va_phuong_thuc.bai_tap;

import java.util.Arrays;

public class Gop_mang {
    public static void main(String[] args) {
        int arrA[] = {5,4,3,2,1};
        int arrB[] = {10,9,8,7,6};
        System.out.println("Array 1 is: " + Arrays.toString(arrA));
        System.out.println("Array 2 is: " + Arrays.toString(arrB));
        System.out.println("New Array: " + concat(arrA,arrB));
    }
    public static String concat(int arrA[], int arrB[]) {
        int arrPlus[] = new int[arrA.length + arrB.length];
        System.arraycopy(arrA, 0, arrPlus, 0, arrA.length);
        System.arraycopy(arrB, 0, arrPlus, arrA.length + 0, arrB.length);
        return Arrays.toString(arrPlus);
    }
}
