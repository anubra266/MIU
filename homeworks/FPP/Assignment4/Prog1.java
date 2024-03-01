package homeworks.FPP.Assignment4;

public class Prog1 {
    public static void main(String[] args) {
        reverse(12345);
    }

    public static void reverse(int n) {
        if (n < 10) {
            System.out.println(n);
        } else {
            System.out.println(n % 10);
            reverse(n / 10);
        }
    }

}
