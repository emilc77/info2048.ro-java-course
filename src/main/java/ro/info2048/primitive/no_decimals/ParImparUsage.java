package ro.info2048.primitive.no_decimals;

import java.util.Random;

public class ParImparUsage {
    public static void main(String[] args) {
        Random random = new Random();
        int i = random.nextInt(100) - 50; // [-50,49]
        System.out.println("i = " + i);
        if (i % 2 == 0) {
            System.out.println("par");
        }
        if (i % 2 != 0) {
            System.out.println("impar");
        }
    }
}
