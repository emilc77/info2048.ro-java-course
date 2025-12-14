package ro.info2048.execution_control.for_statement.problems;

public class LastDigitIs4 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i <= 1000000; i++) {
            int lastDigit = i % 10;
            if (lastDigit == 4) {
                count++;
            }
        }
        System.out.println("Solution: " + count);
    }
}
