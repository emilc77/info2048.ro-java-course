package ro.info2048.primitive.no_decimals.exercises;

import java.util.Random;

public class Perechi2 {
    public static void main(String[] args) {
        Random random = new Random();
        int numarCopii = random.nextInt(20); // [0,19]

        if (numarCopii == 1) {
            System.out.println("Avem 1 copil");
        } else {
            System.out.println("Avem " + numarCopii + " copii");
        }
        if (numarCopii % 2 == 0) {
            System.out.println("Pot sa-i grupez in perechi");
        } else {
            System.out.println("Nu pot sa-i grupez " +
                    "in perechi, avem unul fara pereche");
        }
    }
}
