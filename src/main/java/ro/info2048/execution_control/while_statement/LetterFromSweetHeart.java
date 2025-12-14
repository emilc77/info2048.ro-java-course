package ro.info2048.execution_control.while_statement;

import java.util.Random;

public class LetterFromSweetHeart {
    static Random random = new Random();
    public static void main(String[] args) {
        while (!theLetterHasCome()) {
            System.out.println("sorrow...");
        }
        System.out.println(":-) HAPPY!!!!");
    }
    static boolean theLetterHasCome() {
        return random.nextInt(100) % 10 == 0;// 90% false
    }
}
