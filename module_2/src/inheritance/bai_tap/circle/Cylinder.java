package inheritance.bai_tap.circle;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        this(6);
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return this.getArea()*this.height;
    }

    @Override
    public String toString() {
        return "A " + this.getColor() +
                " Cylinder with radius = " +  this.getRadius() +
                ", height = " + this.getHeight() +
                " and Volume = " + this.getVolume();
    }
}
