package Loop.Thuc_hanh;
import java.util.Scanner;
public class Tim_UCLN {
    public static void main(String[] args) {
        int a,b;
        String result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number a: ");
        a = scanner.nextInt();
        System.out.println("Enter Number b: ");
        b = scanner.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 && b == 0){
            result = "No greatest common factor";
        } else if (a == 0) {
            result = "Greatest common factor: " + b;
        } else if (b == 0){
            result = "Greatest common factor: " + a;
        } else {
            while (a != b) {
                if (a > b)
                    a = a - b;
                else
                    b = b - a;
            }
            result = "Greatest common factor: " + a;
        }
        System.out.println(result);
    }
}
