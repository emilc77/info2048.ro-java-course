package ro.info2048.execution_control.if_statement;

import java.util.Random;

public class EmtpyIfCorrection2Explanation {
    public static Random random = new Random();
    public static void main(String[] args) {
        if (!lightsOn() || !bookBought() || !bookGood()) {
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
