package ro.info2048.execution_control.break_continue.problems;

public class ABVariousConditions {
    public static void main(String[] args) {
        for (int a = 1; a < 10; a++) {
            for (int b = 0; b < 10; b++) {
                int number = 10 * a + b;
                if (number % 3 != 2) { // 3k + 2
                    continue;
                }
                if (a + b != 11) {
                    continue;
                }
                System.out.println(number);
            }
        }
    }
}
