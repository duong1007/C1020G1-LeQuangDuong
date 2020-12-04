package introduction_to_java.bai_tap;
import java.util.Scanner;
public class Chuyen_doi_tien_te {
    public static void main(String[] args) {
        float USD,rate;
        rate = 23000;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter USD :");
            USD = scanner.nextFloat();
            if (USD < 0) {
                System.out.println("USD must be less than 0");
            }
        } while (USD < 0);
        System.out.println("Chance to VND = " + USD*rate +" vnđ");
    }
}

