package inheritance.bai_tap.point;

public class Point3D extends Point2D {
    private float z;

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        this.setX(x);
        this.setY(y);
        this.z = z;
    }

    public float[] getXYZ() {
        float[] array = {this.getX(),this.getY(),this.getZ()};
        return array;
    }

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point3D (" + this.getX()+", " + this.getY() +", " + this.getZ() + ")";
    }
}
