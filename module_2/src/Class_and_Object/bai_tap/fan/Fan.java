package Class_and_Object.bai_tap.fan;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = this.SLOW;
    boolean on;
    private double radius = 5;
    private String color = "blue";

    public boolean isOn() {
        return on;
    }

    public int getMEDIUM() {
        return this.MEDIUM;
    }

    public int getFAST() {
        return this.FAST;
    }

    public int getSLOW() {
        return this.SLOW;
    }

    public double getRadius() {
        return this.radius;
    }

    public int getSpeed() {
        return this.speed;
    }

    public String getColor() {
        return this.color;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public Fan(){

    }

    public String toString(){

        if (isOn()) {
            return "speed: " + this.speed + ", " +
                    "color: " + this.color + ", " +
                    "radius: " + this.radius + ", " + "fan is on";
        } else {
            return "color: " + this.color + ", " +
                    "radius: " + this.radius + ", " + "fan is off";
        }

    }
}
