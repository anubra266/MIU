package homeworks.FPP.Assignment5.Problem1;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Circle("Red", 5);
        shapes[1] = new Rectangle("Blue", 5, 10);
        shapes[2] = new Square("Green", 5);
        shapes[3] = new Circle("Yellow", 10);
        shapes[4] = new Rectangle("Black", 10, 20);

        print(shapes);

    }

    public static void print(Shape[] shapes) {
        for (Shape shape : shapes) {
            System.out.println("Area of " + shape.getClass().getSimpleName() + " is " + shape.calculateArea());
            System.out
                    .println("Perimeter of " + shape.getClass().getSimpleName() + " is " + shape.calculatePerimeter());
            System.out.println();
        }
    }
}
