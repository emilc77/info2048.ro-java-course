package ro.info2048.primitive.no_decimals;

import java.util.Random;

public class IntPlusMinusMultiply {
    public static void main(String[] args) {
        Random random = new Random();
        int i = random.nextInt(100); // [0,99]
        int j = random.nextInt(100); // [0,99]

        System.out.println("i=" + i);
        System.out.println("j=" + j);
        System.out.println("i+j=" + (i + j));
        System.out.println("i-j=" + (i - j));
        System.out.println("i*j=" + (i * j));
    }
}
