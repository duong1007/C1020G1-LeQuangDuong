package Mang_va_phuong_thuc.Bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class Them_phan_tu_vao_mang {
    public static void main(String[] args) {
        int numbers,index,number;
        int arr[];
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter nummbers of array: ");
            numbers = scanner.nextInt();
            if (numbers < 1) {
                System.out.println("numbers must be greater than 0");
            }
        } while (numbers < 1);
        arr = new int[numbers];
        for (int i = 0; i < arr.length ; i++) {
            System.out.print("Enter element " + (i +1) +": ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Old Array : " + Arrays.toString(arr));
        System.out.print("Enter number push: ");
        number = scanner.nextInt();
        do {
            System.out.println("Enter element push: ");
            index = scanner.nextInt();
            if (index < 0 || index > (arr.length -1)){
                System.out.print("index numbers must be greater than 0 and nhỏ hơn độ dài mảng");
            }
        }while (index < 0 || index > (arr.length -1));
        System.out.println("New Array : " + push(arr,number,index));
    }
    public static String push (int arr[],int number,int index){
        int[] newArray = new int[arr.length + 1];
        for (int i = 0; i < newArray.length ; i++) {
            if(i < index){
                newArray[i] = arr[i];
            } else if (i == index){
                newArray[i] = number;
            } else {
                newArray[i] = arr[i - 1];
            }
        }
        return Arrays.toString(newArray);
    }
}
