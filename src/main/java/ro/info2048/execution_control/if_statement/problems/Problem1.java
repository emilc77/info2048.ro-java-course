package ro.info2048.execution_control.if_statement.problems;

import java.util.Random;

public class Problem1 {
    public static void main(String[] args) {
        Random random = new Random();
        boolean sickDog = random.nextBoolean();
        if (sickDog) {
            System.out.println("Meet the vet");
        } else {
            System.out.println("Let's have a movie!");
        }
    }
}
