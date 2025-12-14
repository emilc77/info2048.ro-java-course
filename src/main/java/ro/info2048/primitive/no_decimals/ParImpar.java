package ro.info2048.primitive.no_decimals;

import java.util.Random;

public class ParImpar {
    public static void main(String[] args) {
        Random random = new Random();
        int i = random.nextInt(100); // [0,99]
        System.out.println("i = " + i);
        System.out.println("i % 2 = " + (i % 2));
        System.out.println("par = " + (i % 2 == 0));
        System.out.println("impar = " + (i % 2 == 1));
    }
}
