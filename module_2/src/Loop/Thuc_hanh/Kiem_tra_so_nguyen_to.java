package Loop.Thuc_hanh;
import java.util.Scanner;
public class Kiem_tra_so_nguyen_to {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int number = scanner.nextInt();
        int i = 2;
        String result;
        if (number < 2) {
            result = number + " is not a prime";
        } else {
            while (number % i != 0) {
                i++;
            }
            if (i == number) {
                result = number + " is a prime";
            } else {
                result = number + " is not a prime";
            }
        }
        System.out.println(result);
    }
}
