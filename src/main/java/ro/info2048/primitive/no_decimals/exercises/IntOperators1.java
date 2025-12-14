package ro.info2048.primitive.no_decimals.exercises;

import java.util.Random;

public class IntOperators1 {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(20) + 1; // [1,20]
        int b = random.nextInt(20) + 1; // [1,20]
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("(a + b) = " + (a + b));
        System.out.println("(a - b) = " + (a - b));
        System.out.println("(a * b) = " + (a * b));
        System.out.println("(a / b) = " + (a / b));
        System.out.println("(a % b) = " + (a % b));
    }
}
