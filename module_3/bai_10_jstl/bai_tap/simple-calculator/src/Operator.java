public class Operator {
    public static String Calculator(String operator, int numberOne, int numberTwo) {
        if (operator.equals("Addition")) {
            return String.valueOf(numberOne + numberTwo);
        } else if (operator.equals("Subtraction")) {
            return String.valueOf(numberOne - numberTwo);
        } else if (operator.equals("Multiplication")) {
            return String.valueOf(numberOne*numberTwo);
        } else {
            return String.valueOf(numberOne/numberTwo);
        }
    }
}
