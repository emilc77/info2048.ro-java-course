package ro.info2048.execution_control.if_statement;

import java.util.Random;

public class NestedIfs2 {
    public static void main(String[] args) {
        Random random = new Random();
        int age = random.nextInt(100); // 0-99
        boolean male = random.nextBoolean(); // true/false

        System.out.println("age=" + age + ", male=" + male);
        if (male) {
            if (age > 60) {
                System.out.println("Old man");
            } else {
                System.out.println("Young man");
            }
        } else {
            if (age > 60) {
                System.out.println("Old woman");
            } else {
                System.out.println("Young woman");
            }
        }
    }
}
