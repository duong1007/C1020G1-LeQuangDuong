package abstract_class_and_interface.thuc_hanh.comparable.square;

import inheritance.thuc_hanh.Square;

import java.util.Comparator;

public class SquareComparator implements Comparator<Square> {

    @Override
    public int compare(Square s1, Square s2) {
        if (s1.getWidth() > s2.getWidth()) return 1;
        else if (s1.getWidth() < s2.getWidth()) return -1;
        else return 0;
    }
}
