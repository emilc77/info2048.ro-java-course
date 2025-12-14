package ro.info2048.execution_control.if_statement;

import java.util.Random;

public class ElseIfNumberOfLegs {
    public static void main(String[] args) {
        Random random = new Random();
        int numberOfLegs = random.nextInt(5); // 0-4
        if (numberOfLegs == 0) {
            System.out.println("Snake, Snail");
        } else if (numberOfLegs == 2) {
            System.out.println("Birds");
        } else if (numberOfLegs == 4) {
            System.out.println("Dogs, Cats");
        } else {
            System.out.println("Really ?!?! ");
        }
    }
}
