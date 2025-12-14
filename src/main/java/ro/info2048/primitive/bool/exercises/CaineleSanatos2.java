package ro.info2048.primitive.bool.exercises;

import java.util.Random;

public class CaineleSanatos2 {
    public static void main(String[] args) {
        Random random = new Random();
        boolean caineSanatos = random.nextBoolean();
        boolean caineBolnav = !caineSanatos;
        System.out.println("Sau " + (caineSanatos || caineBolnav));
        System.out.println("Si: " + (caineSanatos && caineBolnav));

    }
}
