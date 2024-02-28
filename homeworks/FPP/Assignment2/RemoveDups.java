package homeworks.FPP.Assignment2;

import java.util.Arrays;

public class RemoveDups {
    public static void main(String[] args) {
        String[] arr = { "horse", "dog", "cat", "horse", "dog" };

        String[] newArr = removeDups(arr);
        System.out.println(Arrays.toString(newArr));
    }

    public static boolean isExisting(String[] arr, String el) {
        for (String element : arr) {
            if (element == el) {
                return true;
            }
        }
        return false;
    }

    public static String[] removeDups(String[] arr) {
        String[] newArr = new String[arr.length];
        int newLength = 0;

        for (int i = 0; i < newArr.length; i++) {
            if (arr[i] == null)
                continue;
            if (isExisting(newArr, arr[i]))
                continue;

            newArr[i] = arr[i];
            newLength++;
        }

        String[] res = new String[newLength];
        System.arraycopy(newArr, 0, res, 0, newLength);

        return res;
    }
}
