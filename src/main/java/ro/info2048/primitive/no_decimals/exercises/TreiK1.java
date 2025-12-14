package ro.info2048.primitive.no_decimals.exercises;

import java.util.Random;

public class TreiK1 {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(20); // [0,19]

        int rest = n % 3;
        System.out.println("n=" + n);
        if (rest == 0) {
            System.out.println("3k");
        } else if (rest == 1) {
            System.out.println("3k+1");
        } else if (rest == 2) {
            System.out.println("3k+2");
        }
    }
}
