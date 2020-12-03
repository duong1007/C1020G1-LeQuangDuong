package Class_and_Object.bai_tap.quadratic_equation;

public class QuadraticEquation {
    double a;
    double b;
    double c;
    public QuadraticEquation() {
    }

    public QuadraticEquation (double a, double b, double c) {
       this.a = a;
       this.b = b;
       this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getDiscriminant() {
        double delta;
        delta = Math.pow(this.getB(), 2) - (4 * this.getA() * this.getC());
        return delta;
    }

    public double getRoot1() {
        double r;
        r = (-this.getB() + Math.sqrt(this.getDiscriminant()))/2*this.getA();
        return r;
    }

    public double getRoot2() {
        double r;
        r = (-this.getB() - Math.sqrt(this.getDiscriminant()))/2*this.getA();
        return r;
    }
}
