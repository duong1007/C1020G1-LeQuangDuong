package abstract_class_and_interface.thuc_hanh.comparable.rectangle;

import inheritance.thuc_hanh.Rectangle;

import java.util.Comparator;

public class RectangleComparator implements Comparator<Rectangle> {
    @Override
    public int compare(Rectangle r1, Rectangle r2) {
        if (r1.getWidth() > r2.getWidth()) return 1;
        else if (r1.getWidth() < r2.getWidth()) return -1;
        else return 0;
    }
}
