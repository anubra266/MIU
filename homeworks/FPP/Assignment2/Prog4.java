package homeworks.FPP.Assignment2;

public class Prog4 {
    public static void main(String[] args) {
        float x = (float) 1.27;
        float y = (float) 3.881;
        float z = (float) 9.6;

        int res1 = (int) (x + y + z);
        int res2 = Math.round(x + y + z);

        System.out.println(res1);
        System.out.println(res2);
    }
}
