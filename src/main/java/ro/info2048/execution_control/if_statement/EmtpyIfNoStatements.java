package ro.info2048.execution_control.if_statement;

import java.util.Random;

public class EmtpyIfNoStatements {
    public static Random random = new Random();
    public static void main(String[] args) {
        if (lightBulbOn() && isTheBookBought() && isTheBookGood()) {
            // I am reading - I have a good time
        }
    }

    private static boolean lightBulbOn() {
        return random.nextBoolean();
    }
    private static boolean isTheBookBought() {
        return random.nextBoolean();
    }
    private static boolean isTheBookGood() {
        return random.nextBoolean();
    }
}
