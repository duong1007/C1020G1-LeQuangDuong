package access_modifier.bai_tap;

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
        return this.radius*Math.PI;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Circle() {
        this.color = "red";
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

}
