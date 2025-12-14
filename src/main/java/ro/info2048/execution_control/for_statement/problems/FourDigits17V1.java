package ro.info2048.execution_control.for_statement.problems;

public class FourDigits17V1 {
    public static void main(String[] args) {
        for (int a = 1; a < 10; a++) {
            for (int b = 0; b < 10; b++) {
                for (int c = 0; c < 10; c++) {
                    for (int d = 0; d < 10; d++) {
                        if (a < b && b < c && c < d
                                && a + b + c + d == 17) {
                            System.out.println("" + a + b + c + d);
                        }
                    }
                }
            }
        }
    }
}
