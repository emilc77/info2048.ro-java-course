package ro.info2048.primitive.no_decimals.exercises;

import java.util.Random;

public class Perechi {
    public static void main(String[] args) {
        Random random = new Random();
        int numarCopii = random.nextInt(20); // [0,19]

        System.out.println("Avem " + numarCopii + " copii");
        if (numarCopii % 2 == 0) {
            System.out.println("Pot sa-i grupez in perechi");
        }
        if (numarCopii % 2 != 0) {
            System.out.println("Nu pot sa-i grupez pe toti " +
                    "in perechi, avem unul fara pereche");
        }
    }
}
