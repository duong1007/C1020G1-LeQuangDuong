package inheritance.bai_tap.circle;

public class TestCircleCylinder {
    public static void main(String[] args) {
        //Circle
        Circle circle = new Circle();
        System.out.println(circle.toString());
        Circle circle1 = new Circle(5,"black");
        System.out.println(circle1.toString());

        //Cylinder
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder.toString());
        Cylinder cylinder1 = new Cylinder(5,"yellow",5);
        System.out.println(cylinder1.toString());
    }
}