package ro.info2048.execution_control.for_statement.problems;

public class TwoDigitsSumDivisibleBy5 {
    public static void main(String[] args) {
        for (int a = 1; a < 10; a++) {
            for (int b = 0; b < 10; b++) {
                if ((a + b) % 5 == 0) {
                    System.out.println("" + a + b);
                }
            }
        }
    }
}
