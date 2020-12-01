package Introduction_to_Java.Bai_tap;
import java.util.Scanner;
public class Doc_so_thanh_chu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        String Number,Result = null,Unit,Tens,Hundred;
        char hundred,tens,unit;
        System.out.println("Enter Your Number:");
        number = scanner.nextInt();
        Number = number + "";
        hundred = 0;
        tens = 0;
        unit = 0;
        switch (Number.length()) {
            case 1:
                unit = Number.charAt(0);
                unit = (char) Integer.parseInt(String.valueOf(unit));
                break;
            case 2:
                unit = Number.charAt(1);
                unit = (char) Integer.parseInt(String.valueOf(unit));
                tens = Number.charAt(0);
                tens = (char) Integer.parseInt(String.valueOf(tens));
                break;
            default:
                unit = Number.charAt(2);
                unit = (char) Integer.parseInt(String.valueOf(unit));
                tens = Number.charAt(1);
                tens = (char) Integer.parseInt(String.valueOf(tens));
                hundred = Number.charAt(0);
                hundred = (char) Integer.parseInt(String.valueOf(hundred));
        }
        switch (unit) {
            case 0:
                Unit = "Zero";
                break;
            case 1:
                Unit = "One";
                break;
            case 2:
                Unit = "Two";
                break;
            case 3:
                Unit = "Three";
                break;
            case 4:
                Unit = "Four";
                break;
            case 5:
                Unit = "Five";
                break;
            case 6:
                Unit = "Six";
                break;
            case 7:
                Unit = "Seven";
                break;
            case 8:
                Unit = "Eight";
                break;
            default:
                Unit = "Nine";
                break;
        }
        switch (tens){
            case 0:
                Tens = "";
                break;
            case 1:
                switch (unit){
                    case 0:
                        Tens = "Ten";
                        break;
                    case 1:
                        Tens = "Eleven";
                        break;
                    case 2:
                        Tens = "Twelve";
                        break;
                    case 3:
                        Tens = "Thirteen";
                        break;
                    case 4:
                        Tens = "Fourteen";
                        break;
                    case 5:
                        Tens = "Fifteen";
                        break;
                    case 6:
                        Tens = "Sixteen";
                        break;
                    case 7:
                        Tens = "Seventeen";
                        break;
                    case 8:
                        Tens = "Eighteen";
                        break;
                    default:
                        Tens = "Nineteen";
                }
                break;
            case 2:
                Tens = "Twenty";
                break;
            case 3:
                Tens = "Thirty";
                break;
            case 4:
                Tens = "Fourty";
                break;
            case 5:
                Tens = "Fifty";
                break;
            case 6:
                Tens = "Sixty";
                break;
            case 7:
                Tens = "Seventy";
                break;
            case 8:
                Tens = "Eighty";
                break;
            default:
                Tens = "Ninety";
        }
        switch (hundred){
            case 1:
                Hundred = "One";
                break;
            case 2:
                Hundred = "Two";
                break;
            case 3:
                Hundred = "Three";
                break;
            case 4:
                Hundred = "Four";
                break;
            case 5:
                Hundred = "Five";
                break;
            case 6:
                Hundred = "Six";
                break;
            case 7:
                Hundred = "Seven";
                break;
            case 8:
                Hundred = "Eight";
                break;
            default:
                Hundred = "Nine";
                break;
        }
        if (number >= 100){
            if (number % 100 == 0){
                Result = Hundred + " Hundred";
            } else if(unit == 0 || tens == 1) {
                Result = Hundred + " Hundred" + " And " + Tens;
            } else {
                Result = Hundred + " Hundred" + " And " + Tens + " " + Unit;
            }
        } else if ( number >=20){
            if (unit == 0){
                Result = Tens;
            } else {
                Result = Tens + " " + Unit;
            }
        } else {
            if (number >= 10) {
                Result = Tens;
            }else {
                Result = Unit;
            }
        }
        System.out.println(Result);
    }
}
