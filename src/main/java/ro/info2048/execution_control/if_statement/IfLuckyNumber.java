package ro.info2048.execution_control.if_statement;

import java.util.Random;

public class IfLuckyNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(20); // 0-19
        if (number == 13) {
            System.out.println("My lucky number!");
        } else {
            System.out.println("not so lucky ....");
        }
    }
}
