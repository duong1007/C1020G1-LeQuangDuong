package controllers;

import java.util.List;
import java.util.Scanner;

public class Booking<E> {
    public E book(List<E> objects) {
        for (int index = 0; index < objects.size() ; index++) {
            System.out.println((index + 1) + "." + objects.get(index) );
        }

        System.out.print("Your choice : ");
        int choice = new Scanner(System.in).nextInt();
        for (int index = 0; index < objects.size() ; index++) {
            if (choice == index) {
                return objects.get(index);
            }
        }
        return null;
    }
}
