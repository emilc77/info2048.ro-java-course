package ro.info2048.execution_control.break_continue;

import java.util.Random;

public class WhileLastIsContinue {
    public static void main(String[] args) {
        Random random = new Random();
        int value = random.nextInt(10) + 1; // 1-10
        while (value != 10) {
            System.out.println("Not 10 yet...");
            value = random.nextInt(10) + 1; // 1-10
            continue;
        }
    }
}
