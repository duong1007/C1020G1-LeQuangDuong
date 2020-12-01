package Loop.Bai_tap;
public class So_nguyen_to_nho_hon_100 {
    public static void main(String[] args) {
        int i,j;
        for (i = 2; i <= 100 ;i++){
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
                System.out.println(i);

            }
        }
    }
}
