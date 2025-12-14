package ro.info2048.primitive.no_decimals.exercises;

import java.util.Random;

public class TreiK3 {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(20); // [0,19]

        int cat = n / 3;
        int rest = n % 3;
        if (rest == 0) {
            System.out.println("3 * " + cat + " = " + n);
        } else if (rest == 1) {
            System.out.println("3 * " + cat + " + " + rest
                    + " = " + n);
        } else {
            System.out.println("3 * " + cat + " + " + rest
                    + " = " + n);
        }
    }
}
