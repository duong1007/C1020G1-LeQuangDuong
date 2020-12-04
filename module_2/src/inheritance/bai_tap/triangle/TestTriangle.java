package inheritance.bai_tap.triangle;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        double a,b,c;
        String color;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Khởi tạo 1 tam giác : ");
        System.out.println("Màu sắc: ");
        color = scanner.next();
        System.out.println("cạnh 1:");
        a = scanner.nextDouble();
        System.out.println("cạnh 2:");
        b = scanner.nextDouble();
        System.out.println("cạnh 3:");
        c = scanner.nextDouble();
        Triangle triangle = new Triangle(a,b,c,color,true);
        System.out.println(triangle.toString());
    }
}
