package ro.info2048.execution_control.if_statement;

import java.util.Random;

public class LotteryPrize1 {
    public static void main(String[] args) {
        Random random = new Random();
        // 6 / 49 - matches
        int numbersMatched = random.nextInt(7); // 0-6

        if (numbersMatched == 6) {
            System.out.println("Jackpot, millionare!");
        } else {
            if (numbersMatched == 5) {
                System.out.println("Enough money!");
            } else {
                if (numbersMatched == 4) {
                    System.out.println("Some money.");
                } else {
                    System.out.println("nothing....");
                }
            }
        }
    }
}
