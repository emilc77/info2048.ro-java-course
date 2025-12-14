package ro.info2048.execution_control.if_statement.problems;

import java.util.Random;

public class Problem3Solution3 {
    public static void main(String[] args) {
        Random random = new Random();
        int age = random.nextInt(100); // 0-99
        if (age < 18) {
            System.out.println("Child");
        } else if (age < 60) {
            System.out.println("Grown Up");
        } else {
            System.out.println("Old Person");
        }
    }
}
