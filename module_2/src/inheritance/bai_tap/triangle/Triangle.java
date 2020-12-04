package inheritance.bai_tap.triangle;


import inheritance.thuc_hanh.Shape;

public class Triangle extends Shape {
   private double side1;
   private double side2;
   private double side3;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3, String color,boolean filled) {
        super(color,filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getArea(){
        double p = getPerimeter()/2;
        double s = Math.sqrt(p*(p - this.side1)*(p - this.side2)*(p - this.side3));
        return s;
    }

     public double getPerimeter() {
        double p = this.side1 + this.side2 + this.side3;
        return p;
     }

    @Override
    public String toString() {
        return "Triangle " + this.getColor() +" (" +
                "side1 = " + side1 +
                ", side2 = " + side2 +
                ", side3 = " + side3 +
                ", area = " + getArea() +
                ", perimeter = " + getPerimeter() +
                ')';
    }
}
