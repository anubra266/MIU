package homeworks.FPP.Assignment4;

public class Prog2 {
    public static void main(String[] args) {
        System.out.println(countDigits(12345));
    }

    public static int countDigits(int n) {
        if (n < 10) {
            return 1;
        } else {
            return 1 + countDigits(n / 10);
        }
    }
}
