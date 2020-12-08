package abstract_class_and_interface.bai_tap.resizeable;

import abstract_class_and_interface.bai_tap.geometry.Circle;
import abstract_class_and_interface.bai_tap.geometry.Rectangle;
import abstract_class_and_interface.bai_tap.geometry.Square;

public class ResizeableTest {
    public static void main(String[] args) {
        double percent = 10;
        Circle circle = new Circle(4);
        System.out.println("Circle Area Before reSide: " + circle.getArea() );
        System.out.println("Circle Area After reSide: " + circle.reSide(percent) +"\n");

        Rectangle rectangle = new Rectangle(3,5);
        System.out.println("Rectangle Area Before reSide: " + rectangle.getArea() );
        System.out.println("Rectangle Area After reSide: " + rectangle.reSide(percent)+"\n");

        Square square = new Square(5);
        System.out.println("Square Area Before reSide: " + square.getArea() );
        System.out.println("Square Area After reSide: " + square.reSide(percent)+"\n");
    }
}
