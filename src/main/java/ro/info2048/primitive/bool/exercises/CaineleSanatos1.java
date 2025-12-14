package ro.info2048.primitive.bool.exercises;

import java.util.Random;

public class CaineleSanatos1 {
    public static void main(String[] args) {
        Random random = new Random();
        boolean caineleSanatos = random.nextBoolean();
        boolean caineleBolnav = !caineleSanatos;
        System.out.println("Sanatos: " + caineleSanatos);
        System.out.println("Bolnav: " + caineleBolnav);
    }
}
