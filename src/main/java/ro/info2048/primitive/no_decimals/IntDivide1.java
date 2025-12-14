package ro.info2048.primitive.no_decimals;

import java.util.Random;

public class IntDivide1 {
    public static void main(String[] args) {
        Random random = new Random();
        int i = random.nextInt(100); // [0-99]
        // sa evitam sa fie 0
        int j = random.nextInt(10) + 1; // [1,10]

        System.out.println("i=" + i);
        System.out.println("j=" + j);
        System.out.println("i/j=" + (i / j));
        System.out.println("i%j=" + (i % j));
    }
}
