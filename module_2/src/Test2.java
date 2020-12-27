import java.util.Calendar;

public class Test2 {
    public static void main(String[] args) {
        int a = 2002;
        System.out.println(a == ( Calendar.getInstance().get(Calendar.YEAR) - 18));
    }
}
