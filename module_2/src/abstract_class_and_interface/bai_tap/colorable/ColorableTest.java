package abstract_class_and_interface.bai_tap.colorable;

import abstract_class_and_interface.bai_tap.geometry.Circle;
import abstract_class_and_interface.bai_tap.geometry.Rectangle;
import abstract_class_and_interface.bai_tap.geometry.Shape;
import abstract_class_and_interface.bai_tap.geometry.Square;

public class ColorableTest {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(5, 4);
        Square square = new Square(5);
        Shape[] shapes = {circle, rectangle, square};
        for (Shape shape : shapes) {
            if (shape instanceof Colorable) {
                System.out.println(((Colorable) shape).howToColor());
            }else  if (shape instanceof Circle) {
                System.out.println(((Circle) shape).getArea());
            } else  if (shape instanceof Rectangle) {
                System.out.println(((Rectangle) shape).getArea());
            }
        }
    }
}
