package inheritance.bai_tap.point;

public class MoveAblePoint extends Point2D {
    private float xSpeed;
    private float ySpeed;

    public MoveAblePoint(){

    }

    public MoveAblePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveAblePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed,float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] arr = {this.xSpeed,this.ySpeed};
        return arr;
    }
    public MoveAblePoint move() {
        float x = this.getX();
        x += this.getXSpeed();
        this.setX(x);
        float y = this.getY();
        y += this.getYSpeed();
        this.setY(y);
        return this;
    }

    @Override
    public String toString() {
        return "MoveAblePoint (" + this.getX() + ", " + this.getY() + ")"+
                ", " + "speed = (" + this.xSpeed +", "+ this.ySpeed +")";
    }
}
