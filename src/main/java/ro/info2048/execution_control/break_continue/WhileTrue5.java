package ro.info2048.execution_control.break_continue;

import java.util.Random;

public class WhileTrue5 {
    public static void main(String[] args) {
        Random random = new Random();
        while (true) {
            int grade = random.nextInt(10) + 1; // 1-10
            if (grade >= 10) {
                System.out.println("Exceptional!");
                break;
            }
        }
    }
}
