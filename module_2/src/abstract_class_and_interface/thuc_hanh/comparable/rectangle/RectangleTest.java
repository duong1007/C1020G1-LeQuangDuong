package abstract_class_and_interface.thuc_hanh.comparable.rectangle;

import inheritance.thuc_hanh.Rectangle;

import java.util.Arrays;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle[] rectangle = new Rectangle[3];
        rectangle[0] = new Rectangle(3,4);
        rectangle[1] = new Rectangle(4,5);
        rectangle[2] = new Rectangle(1,3);

        System.out.println("Pre-sorted:");
        for (Rectangle r : rectangle ) {
            System.out.println(r);
        }

        RectangleComparator rectangleComparator = new RectangleComparator();
        Arrays.sort(rectangle, rectangleComparator);
        System.out.println("After-sorted:");
        for (Rectangle r : rectangle) {
            System.out.println(r);
        }
    }
}
