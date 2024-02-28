package homeworks.FPP.Assignment2;

public class Prog6 {
    public static int min(int[] arrayOfInts) {
        int res = arrayOfInts[0];

        for (int i : arrayOfInts) {
            if (res > i)
                res = i;
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22 };

        int res = min(arr);
        System.out.println(res);
    }
}
