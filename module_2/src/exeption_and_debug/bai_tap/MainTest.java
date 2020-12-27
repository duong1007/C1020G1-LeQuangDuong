package exeption_and_debug.bai_tap;

import java.util.Scanner;

public class MainTest {
        public static void main(String[] args) {
            int a, b, c;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter A :");
            a = scanner.nextInt();

            System.out.println("Enter B :");
            b = scanner.nextInt();

            System.out.println("Enter C :");
            c = scanner.nextInt();
            try {
                Triangle triangle = new Triangle(a, b, c);
            } catch (IllegalTriangleException e) {
                e.printStackTrace();
            }
            try {
                System.out.println(new Triangle(a,b,4));
            } catch (IllegalTriangleException e) {
                e.printStackTrace();
            }

        }
}
