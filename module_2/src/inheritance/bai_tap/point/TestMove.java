package inheritance.bai_tap.point;

public class TestMove {
    public static void main(String[] args) {
        MoveAblePoint moveAblePoint = new MoveAblePoint(2,2,10,15);
        System.out.println(moveAblePoint.move());
    }
}
