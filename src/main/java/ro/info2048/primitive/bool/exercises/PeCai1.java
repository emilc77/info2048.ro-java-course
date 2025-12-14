package ro.info2048.primitive.bool.exercises;

import java.util.Random;

public class PeCai1 {
    public static void main(String[] args) {
        Random random = new Random();
        boolean euAmCal = random.nextBoolean();
        boolean tuAiCal = random.nextBoolean();
        boolean suntemImpreuna = euAmCal == tuAiCal;

        if (suntemImpreuna) {
            System.out.println("Petrecem timpul impreuna");
        }
    }
}
