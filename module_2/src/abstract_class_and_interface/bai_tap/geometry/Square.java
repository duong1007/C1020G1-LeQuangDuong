package abstract_class_and_interface.bai_tap.geometry;

import abstract_class_and_interface.bai_tap.colorable.Colorable;
import abstract_class_and_interface.bai_tap.resizeable.Resizeable;

public class Square extends Rectangle implements Resizeable , Colorable {
    public Square() {
    }

    public Square( double side){
        super(side, side);
    }

    public Square( double side, String color,boolean filled){
        super(side, side, color, filled);
    }

        public double getSide () {
        return getWidth();
    }

        public void setSide ( double side){
        super.setWidth(side);
        super.setLength(side);
    }

        @Override
        public void setWidth ( double width){
        setSide(width);
    }

        @Override
        public void setLength ( double length){
        setSide(length);
    }

        @Override
        public String toString () {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public String howToColor() {
        return "Color all four sides.";
    }
}
