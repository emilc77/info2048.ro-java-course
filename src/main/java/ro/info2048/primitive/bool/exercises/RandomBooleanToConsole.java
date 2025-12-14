package ro.info2048.primitive.bool.exercises;

import java.util.Random;

public class RandomBooleanToConsole {
    public static void main(String[] args) {
        Random random = new Random();
        boolean suntFericit = random.nextBoolean();
        if (suntFericit) {
            System.out.println("Uiiiiii");
        } else {
            System.out.println("Aoleu");
        }
    }
}
