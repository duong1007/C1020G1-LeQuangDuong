package controllers;

import java.util.List;
import java.util.Scanner;

public class DeleteObject<E> {
    public boolean delete(List<E> objects) {
        for (int index = 0; index < objects.size() ; index++) {
            System.out.println((index + 1) + "." + objects.get(index) );
        }

        System.out.print("Your choice (ID) : ");
        int choice = new Scanner(System.in).nextInt();
        for (int index = 0; index < objects.size() ; index++) {
            if (choice == index) {
                objects.remove(index);
                return true;
            }
        }
        return false;
    }
}
