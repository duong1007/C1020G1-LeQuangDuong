package introduction_to_java.bai_tap;
import java.util.Scanner;
public class hien_thi_loi_chao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.println("Enter Your Name: ");
        name = scanner.next();
        System.out.printf("%-7s%s","Hello:",name);
    }
}
