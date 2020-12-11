package dsa_stack_queque.bai_tap;

import java.util.AbstractCollection;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Symbol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a expression: ");
        String expression = scanner.nextLine();
        Stack<Character> bStack = new Stack<Character>();
        boolean checked = true;
        for (int i = 0; i < expression.length() ; i++) {
            char c = expression.charAt(i);
            if (c == ')' && bStack.empty()){
                checked = false;
                break;
            } else if (c == '(') {
                bStack.push(c);
            } else if ( c == ')') {
                bStack.pop();
            }
        }

        if (bStack.empty() && checked) {
            System.out.println("Well");
        } else {
            System.out.println("Wrong");
        }
    }
}
