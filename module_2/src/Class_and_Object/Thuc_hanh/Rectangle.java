package Class_and_Object.Thuc_hanh;

public class Rectangle {
    double width, height;
    public Rectangle() {

    }
    public double getArea() {
        return this.height*this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public double getWidth() {
        return this.width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public Rectangle(double width,double height){
        this.width = width;
        this.height = height;
    }
    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "Rectangle{" + "width = " + width + ", height = " + height + "}";
    }
}
