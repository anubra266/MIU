package homeworks.FPP.Assignment5.Problem3;

public class Driver {
    public static void main(String[] args) {
        Figure[] figures = new Figure[5];
        figures[0] = new UpwardHat();
        figures[1] = new UpwardHat();
        figures[2] = new DownwardHat();
        figures[3] = new FaceMaker();
        figures[4] = new Vertical();
        for (Figure figure : figures) {
            figure.getFigure();
        }
        System.out.println();
        for (Figure figure : figures) {
            figure.getFigureWithClass();
        }
    }
}
