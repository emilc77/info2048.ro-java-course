package ro.info2048.execution_control.if_statement;

import java.util.Random;

public class EmtpyIfCorrection1 {
    public static Random random = new Random();
    public static void main(String[] args) {
        boolean canRead = lightsOn() && bookBought() && bookGood();
        if (!canRead) {
            System.out.println("I am miserable!");
        }
    }

    private static boolean lightsOn() {
        return random.nextBoolean();
    }
    private static boolean bookBought() {
        return random.nextBoolean();
    }
    private static boolean bookGood() {
        return random.nextBoolean();
    }
}
