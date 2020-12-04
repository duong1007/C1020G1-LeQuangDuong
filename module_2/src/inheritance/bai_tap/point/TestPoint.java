package inheritance.bai_tap.point;

import java.sql.SQLOutput;

public class TestPoint {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D.toString());
        point2D = new Point2D(2,5);
        System.out.println(point2D.toString());

        //Point3D
        Point3D point3D = new Point3D();
        System.out.println(point2D.toString());
        point3D = new Point3D(1,2,3);
        System.out.println(point3D.toString());
    }
}
