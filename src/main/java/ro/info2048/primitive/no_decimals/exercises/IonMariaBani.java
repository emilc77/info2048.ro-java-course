package ro.info2048.primitive.no_decimals.exercises;

import java.util.Random;

public class IonMariaBani {
    public static void main(String[] args) {
        Random random = new Random();
        int baniMaria = random.nextInt(51); // [0,50]
        int baniIon = random.nextInt(51); // [0,50]

        System.out.println("Maria: " + baniMaria);
        System.out.println("Ion: " + baniIon);
        if (baniMaria > baniIon) {
            System.out.println("Maria are mai multi.");
        }
        if (baniMaria < baniIon) {
            System.out.println("Ion are mai multi.");
        }
        if (baniMaria == baniIon) {
            System.out.println("Ion si Maria au la fel.");
        }
    }
}
