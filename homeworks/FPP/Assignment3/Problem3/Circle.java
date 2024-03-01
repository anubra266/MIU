package homeworks.FPP.Assignment3.Problem3;

final public class Circle {

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double computeArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return computeArea();
    }
}
