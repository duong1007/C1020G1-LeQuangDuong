package Class_and_Object.bai_tap.fan;

public class MainFan {
    public static void main(String[] args) {
        Fan fan_1 = new Fan();
        fan_1.setSpeed(fan_1.getFAST());
        fan_1.setRadius(10);
        fan_1.setColor("Yellow");
        fan_1.setOn(true);
        System.out.println("Fan 1: " + fan_1.toString());
        Fan fan_2 = new Fan();
        fan_2.setSpeed(fan_2.getMEDIUM());
        System.out.println("Fan 2: " + fan_2.toString());
    }
}
