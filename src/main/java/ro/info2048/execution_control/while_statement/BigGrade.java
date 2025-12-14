package ro.info2048.execution_control.while_statement;

import java.util.Random;

public class BigGrade {
    public static void main(String[] args) {
        Random random = new Random();
        int grade = 0;

        while (grade != 10) {
            grade = random.nextInt(10) + 1; // 1-10
            System.out.println("Grade: " + grade);
        }

        System.out.println("Final grade: " + grade);
    }
}
