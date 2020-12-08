package abstract_class_and_interface.thuc_hanh.comparable.square;

import inheritance.thuc_hanh.Circle;
import inheritance.thuc_hanh.Square;

import java.util.Arrays;
import java.util.Comparator;

public class SquareTest {
    public static void main(String[] args) {
        Square[] square = new Square[3];
        square[0] = new Square(4);
        square[1] = new Square(3);
        square[2] = new Square(5);

        System.out.println("Pre-sorted:");
        for (Square sq : square) {
            System.out.println(sq);
        }
        Comparator squareComparator = new SquareComparator();
        Arrays.sort(square,squareComparator);

        System.out.println("After-sorted:");
        for (Square sq : square) {
            System.out.println(sq);
        }
    }
}
