package ro.info2048.execution_control.if_statement;

import java.util.Random;

public class EmtpyElse {
    public static Random random = new Random();
    public static void main(String[] args) {
        if (lightsOn() && bookBought() && bookGood()){
            System.out.println("Reading...");
        } else {
            // do nothing
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

    private static void startReading() {

    }
}
