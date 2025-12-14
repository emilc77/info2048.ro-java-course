package ro.info2048.primitive.bool.exercises;

import java.util.Random;

public class CaineleSanatos3 {
    public static void main(String[] args) {
        Random random = new Random();
        boolean caineSanatos = random.nextBoolean();
        boolean amBaniDeVeterinar = random.nextBoolean();
        boolean mergemVet = !caineSanatos && amBaniDeVeterinar;

        System.out.println("Sanatos? " + caineSanatos);
        System.out.println("Bani? " + amBaniDeVeterinar);
        System.out.println("Mergem? " + mergemVet);
    }
}
