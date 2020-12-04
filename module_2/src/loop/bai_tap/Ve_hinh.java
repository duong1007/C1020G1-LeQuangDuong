package loop.bai_tap;
import java.util.Scanner;
public class Ve_hinh {
    public static void main(String[] args) {
        int i,j,choice,k;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Menu");
            System.out.println("1. Draw the rectangle");
            System.out.println("2. Draw the square triangle(The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("3. Draw isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Draw the rectangle");
                    for ( i = 0; i < 3; i++) {
                        for (j = 0; j < 6; j++){
                            System.out.print("* ");
                        }
                        System.out.printf("\n");
                    }
                    break;
                case 2:
                    System.out.println("Draw the square botton-right");
                    for ( i = 1; i < 6; i++){
                        for (k = 5;k > i; k--){
                            System.out.print("  ");
                        }
                        for ( j = 0;j < i ;j++){
                            System.out.print(" *");
                        }
                        System.out.printf("\n");
                    }
                    System.out.println("Draw the square botton-left");
                    for ( i = 1; i < 6; i++){
                        for ( j = 0;j < i ;j++){
                            System.out.print("* ");
                        }
                        System.out.printf("\n");
                    }
                    System.out.println("Draw the square top-right");
                    for ( i = 0; i < 5; i++){
                        for ( j = 0;j < i ;j++){
                            System.out.print("  ");
                        }
                        for (k = 5;k > i; k--){
                            System.out.print(" *");
                        }
                        System.out.printf("\n");
                    }
                    System.out.println("Draw the square top-left");
                    for ( i = 5; i > 0; i--){
                        for ( j = i;j > 0 ;j--){
                            System.out.print("* ");
                        }
                        System.out.printf("\n");
                    }
                    break;
                case 3:
                    System.out.println("Draw isosceles triangle");
                    for ( i = 1; i < 6; i++){
                        for (k = 5;k > i; k--){
                            System.out.print(" ");
                        }
                        for ( j = 0;j < i ;j++){
                            System.out.print(" *");
                        }
                        System.out.printf("\n");
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        } while (choice != 0);
    }
}
