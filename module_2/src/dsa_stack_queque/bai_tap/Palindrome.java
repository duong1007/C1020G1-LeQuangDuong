package dsa_stack_queque.bai_tap;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập 1 chuỗi: ");
        String string = scanner.nextLine();
        String checkString = string.toLowerCase();
        Stack<Character> checkStack = new Stack<Character>();
        Queue<Character> checkQueue = new ArrayDeque<Character>();

        for (int i = 0; i < checkString.length() ; i++) {
            char c = checkString.charAt(i);
            checkStack.push(c);
            checkQueue.add(c);
        }
        
        double optimal = Math.ceil(checkString.length()/2);
        boolean check = true;

        for (int i = 0; i < checkString.length() ; i++) {
            if(checkQueue.remove() != checkStack.pop()) {
                check = false;
                break;
            }
        }

        if (check) {
            System.out.println(string + " is Palindrome");
        } else {
            System.out.println(string + " is not Palindrome");
        }
    }
}
