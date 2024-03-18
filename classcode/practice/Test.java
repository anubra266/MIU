package classcode.practice;

import java.util.LinkedList;

public class Test {
    public static boolean isPalindrome(String str) {
        // Create an empty linked list
        LinkedList<Character> list = new LinkedList<>();

        // Insert characters into the linked list
        for (char c : str.toCharArray()) {
            list.add(c);
        }

        // Remove and compare each character from the linked list
        int size = list.size();
        int i = 0;
        for (char c : list) {
            if (c != list.get(size - 1 - i++)) {
                return false;
            }
        }

        // If all characters match, it's a palindrome
        return true;
    }

    public static void main(String[] args) {
        String palindromeStr = "cbc";
        if (isPalindrome(palindromeStr)) {
            System.out.println("'" + palindromeStr + "' is a palindrome.");
        } else {
            System.out.println("'" + palindromeStr + "' is not a palindrome.");
        }
    }
}
