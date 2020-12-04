package mang_va_phuong_thuc.thuc_hanh;

public class Tim_gia_tri_min_bang_phuong_thuc {
    public static void main(String[] args) {
        int []arr = {4, 12, 7, 8, 1, 6, 9};
        int arrMin = minValue(arr);
        System.out.println("The smallest element in the array is: " + arrMin);
    }
    public static int minValue(int[] arr) {
        int i,min = arr[0];
        for (i = 0; i < arr.length;i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}
