package ro.info2048.execution_control.do_while_statement;

import java.util.Random;

public class BigGrade {
    public static void main(String[] args) {
        Random random = new Random();

        int grade;
        do {
            grade = random.nextInt(10) + 1; // 1-10
            System.out.println("Grade: " + grade);
        } while (grade != 10);

        System.out.println("Final grade: " + grade);
    }
}
