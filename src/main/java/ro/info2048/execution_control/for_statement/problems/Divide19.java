package ro.info2048.execution_control.for_statement.problems;

public class Divide19 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 55; i <= 2578; i++) {
            if (i % 19 == 0) {
                count++;
            }
        }
        System.out.println("Solution: " + count);
    }
}
