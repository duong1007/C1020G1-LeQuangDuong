package Loop.Bai_tap;
import java.util.Scanner;
public class So_nguyen_to_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        int numbers = scanner.nextInt();
        int i,j,count;
        count = 1;
        for (i = 2; count <= numbers;i++) {
            j = 2;
            boolean check = true;
            while (j <= Math.sqrt(i)) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
                j++;
            }
            if (check) {
                System.out.println(count + ". " +i);
                count++;
            }
        }
    }
}
