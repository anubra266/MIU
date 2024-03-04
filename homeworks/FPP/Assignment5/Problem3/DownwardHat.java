package homeworks.FPP.Assignment5.Problem3;

public class DownwardHat implements Figure {
    private static String figure = "\\/";

    public void getFigure() {
        System.out.println(figure);
    }

    public void getFigureWithClass() {
        System.out.println("DownwardHat : " + figure);
    }
}
