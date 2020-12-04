package mang_va_phuong_thuc.thuc_hanh;

import java.util.Scanner;

public class Tìm_gia_tri_trong_mang {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your search: ");
        name = scanner.next();
        int i;
        for (i = 0; i < students.length;i++){
            if (students[i].equals(name)) {
                System.out.println("Yes");
                break;
            }
        }
        if (i == students.length){
            System.out.println("No");
        }
    }
}
