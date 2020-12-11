package dsa_stack_queque.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập 1 số: ");
        double number;
        number = scanner.nextDouble();

        Stack<Integer> intBinary = new Stack<Integer>();
        int intNumber = (int) Math.floor(number);
        intBinary(intBinary, intNumber);


        Stack<Integer> doubleBinary = new Stack<Integer>();
        double doubleNumber = number - intNumber;
        doubleBinary.push(2);
        doubleBinary(doubleBinary, doubleNumber);

        String str = "";
        if (doubleNumber == 0) {
            str = getString(intBinary, str);
        } else if (intNumber == 0) {
            str = "0." + getString(doubleBinary, str);
        } else {
            str = getString(intBinary, str) + "." + getString(doubleBinary, str);;
        }
        System.out.println("Binary = " + str);
    }

    private static String getString(Stack<Integer> Binary, String str) {
        while (Binary.size() != 0) {
            str += Binary.pop();
        }
        return str;
    }


    private static void doubleBinary(Stack<Integer> doubleBinary, double doubleNumber) {
        while (doubleNumber != 0.0 ) {
            int d = (int) Math.floor(doubleNumber*2);
            doubleBinary.push(d);
            doubleNumber = doubleNumber*2 - d;
        }
    }

    private static void intBinary(Stack<Integer> intBinary, int intNumber) {
        while (intNumber != 0 ) {
            Integer c =  intNumber % 2;
            intNumber = (intNumber - c)/2;
            intBinary.push(c);
        }
    }
}
