package exeption_and_debug.bai_tap;

public class Triangle {
    private int side_1;
    private int side_2;
    private int side_3;

    public Triangle(int side_1, int side_2, int side_3) throws IllegalTriangleException {
        if (side_1 < 0 || side_2 < 0 || side_3< 0 || side_1 + side_2 < side_3 || side_1 + side_3 < side_2 || side_3 + side_2 < side_1 ) {
            throw  new IllegalTriangleException("cạnh không phù hợp");
        }
        this.side_1 = side_1;
        this.side_2 = side_2;
        this.side_3 = side_3;
    }
}
