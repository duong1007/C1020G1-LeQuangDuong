package Class_and_Object.bai_tap.quadratic_equation;

import java.util.Scanner;

public class MainQuadraticEquation {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = scanner.nextDouble();
        System.out.println("Enter b: ");
        b = scanner.nextDouble();
        System.out.println("Enter c: ");
        c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        double delta = quadraticEquation.getDiscriminant();
        double r1 = quadraticEquation.getRoot1();
        double r2 = quadraticEquation.getRoot2();
        if (delta > 0) {
            System.out.printf("%s\n%s\n%s","Equation have two root is:","r1 = " + r1,"r2 = " + r2);
        } else if (delta == 0) {
            System.out.println("Equation have two equals root is: " + r1);
        } else {
            System.out.println("The equation has no roots");
        }
    }
}
