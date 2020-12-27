import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Date:");
        DateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
        String sDate_1 = scanner.next();
        Date date = dateFormat.parse(sDate_1);
        String sDate_2 = dateFormat.format(date);
        String[] check = sDate_2.split("/");
        int day = Integer.parseInt(check[0]);
        int month = Integer.parseInt(check[1]);
        int year = Integer.parseInt(check[2]);
        int maxDay = 0;
        boolean flag = true;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                maxDay = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                maxDay = 30;
                break;
            case 2:
                if(year % 4 == 0){
                    maxDay = 29;
                } else {
                    maxDay = 28;
                }
                break;
            default:
                flag = false;
                break;

        }
        if (year < 1900 || year > ( Calendar.getInstance().get(Calendar.YEAR) - 18)
        && day > maxDay) {
            flag = false;
        }
        System.out.println(flag);
    }
}
