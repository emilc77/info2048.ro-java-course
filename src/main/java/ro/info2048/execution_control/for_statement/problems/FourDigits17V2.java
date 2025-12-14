package ro.info2048.execution_control.for_statement.problems;

public class FourDigits17V2 {
    public static void main(String[] args) {
        for (int a = 1; a < 10; a++) {
            for (int b = a + 1; b < 10; b++) {
                for (int c = b + 1; c < 10; c++) {
                    for (int d = c + 1; d < 10; d++) {
                        if (a + b + c + d == 17) {
                            System.out.println("" + a + b + c + d);
                        }
                    }
                }
            }
        }
    }
}
