package homeworks.FPP.Assignment2;

import java.util.Arrays;

public class Prog5 {
    public static int[] combineArrays(int[] arr1, int[] arr2) {
        int length = arr1.length + arr2.length;
        int[] res = new int[length];

        System.arraycopy(arr1, 0, res, 0, arr1.length);
        System.arraycopy(arr2, 0, res, arr1.length, arr2.length);

        return res;
    }

    public static void main(String[] args) {
        int[] arr1 = { 5, 6, -4, 3, 1 };
        int[] arr2 = { 3, 8, 9, 11 };

        int[] res = combineArrays(arr1, arr2);

        System.out.println(Arrays.toString(res));
    }
}
