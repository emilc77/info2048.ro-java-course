package ro.info2048.execution_control.if_statement;

import java.util.Random;

public class NestedIfs1 {
    public static void main(String[] args) {
        Random random = new Random();
        int age = random.nextInt(100); // 0-99
        boolean male = random.nextBoolean(); // true/false

        if (male) {
            if (age > 60) {
                System.out.println("Old man");
            }
        }
    }
}
