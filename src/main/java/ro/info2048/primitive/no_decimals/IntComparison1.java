package ro.info2048.primitive.no_decimals;

import java.util.Random;

public class IntComparison1 {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(5); // [0,5]
        int b = random.nextInt(5); // [0,5]
        System.out.println(a + " == " + b + " : " + (a == b));
        System.out.println(a + " != " + b + " : " + (a != b));
        System.out.println(a + " > " + b + " : " + (a > b));
        System.out.println(a + " >= " + b + " : " + (a >= b));
        System.out.println(a + " < " + b + " : " + (a < b));
        System.out.println(a + " <= " + b + " : " + (a <= b));
    }
}
