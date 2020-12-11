package dsa_stack_queque.bai_tap.stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseElementStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập phần tử của mảng:");
        int numberArray;
        do {
            numberArray = scanner.nextInt();
        } while (numberArray < 0);

        int[] array = new int[numberArray];
        for (int index = 0; index < numberArray ; index++) {
            System.out.print("nhập phần tử " + (index + 1));
            array[index] = scanner.nextInt();
        }

        Stack<Integer> stack = new Stack<Integer>();
        for (int index = 0; index < array.length ; index++) {
            stack.push(array[index]);
        }
        System.out.println(stack.toString());

        for (int index = 0; index < array.length ; index++) {
            array[index] = stack.pop();
        }
        System.out.println(Arrays.toString(array));
    }
}
