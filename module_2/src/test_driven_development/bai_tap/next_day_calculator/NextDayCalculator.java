package test_driven_development.bai_tap.next_day_calculator;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class NextDayCalculator {
    public static String showNextDay(String string) {
        String[] check = string.split("/");
        int day = Integer.parseInt(check[0]);
        int month = Integer.parseInt(check[1]);
        int year = Integer.parseInt(check[2]);
        int maxDay = 0;
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
                if (year % 4 == 0) {
                    maxDay = 29;
                } else {
                    maxDay = 28;
                }
                break;
            default:
                break;
        }
        if (day == maxDay) {
            check[0] ="1";
            if (month == 12) {
                check[1] = "1";
                check[2] = String.valueOf(year + 1);
            } else {
                check[1] = String.valueOf(month + 1);
            }
        } else {
            check[0] = String.valueOf(day + 1);
        }
        return check[0] + "/" + check[1] + "/" + check[2];
    }
}
