package inheritance.bai_tap.circle;

public class Circle {
    private double radius;
    private String color;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return this.radius*this.radius*Math.PI;
    }


    public void setColor(String color) {
        this.color = color;
    }

    public Circle() {
        this(1,"red");
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public String toString() {
        return "A " + this.getColor() +
                " Circle with radius = " + this.getRadius() +
                ", Area = " + this.getArea();
    }
}
