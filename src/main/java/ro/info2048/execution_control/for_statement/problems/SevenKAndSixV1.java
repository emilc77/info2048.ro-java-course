package ro.info2048.execution_control.for_statement.problems;

public class SevenKAndSixV1 {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            int number = 7 * i + 6;
            if (number < 100) {
                System.out.println(number);
            }
        }
    }
}
