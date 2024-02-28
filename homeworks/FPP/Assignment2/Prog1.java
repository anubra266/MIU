package homeworks.FPP.Assignment2;

import homeworks.FPP.Assignment2.attachment.RandomNumbers;

/**
 * Prog1
 */
public class Prog1 {

    public static void main(String[] args) {
        int x = RandomNumbers.getRandomInt(1, 9);
        int y = RandomNumbers.getRandomInt(3, 14);

        System.out.println(Math.pow(Math.PI, x));
        System.out.println(Math.pow(y, Math.PI));
    }

}