package homeworks.FPP.Assignment3.Problem3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter C for Circle");
        System.out.println("Enter R for Rectangle");
        System.out.println("Enter T for Triangle");
        String input = scanner.nextLine();

        switch (input) {
            case "C":
                System.out.println("Enter the radius of the Circle");
                double radius = scanner.nextDouble();
                Circle circle = new Circle(radius);
                System.out.println("The area of Circle is: " + circle.getArea());

                break;

            case "R":
                System.out.println("Enter the width of the Rectangle");
                double width = scanner.nextDouble();
                System.out.println("Enter the height of the Rectangle");
                double height = scanner.nextDouble();
                Rectangle rectangle = new Rectangle(width, height);
                System.out.println("The area of Rectangle is: " + rectangle.getArea());

                break;

            case "T":
                System.out.println("Enter the base of the Triangle");
                double base = scanner.nextDouble();
                System.out.println("Enter the height of the Triangle");
                double triangleHeight = scanner.nextDouble();
                Triangle triangle = new Triangle(base, triangleHeight);
                System.out.println("The area of Triangle is: " + triangle.getArea());

                break;

            default:
                break;
        }

        scanner.close();

    }
}
