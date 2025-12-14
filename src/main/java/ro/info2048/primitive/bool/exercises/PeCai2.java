package ro.info2048.primitive.bool.exercises;

import java.util.Random;

public class PeCai2 {
    public static void main(String[] args) {
        Random random = new Random();
        boolean euAmCal = random.nextBoolean();
        boolean tuAiCal = random.nextBoolean();
        boolean suntemImpreuna = euAmCal = tuAiCal;

        System.out.println("euAmCal: " + euAmCal);
        System.out.println("tuAiCal: " + tuAiCal);
        System.out.println("suntemImpreuna: " + suntemImpreuna);
    }
}
