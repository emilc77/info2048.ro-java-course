package ro.info2048.execution_control.break_continue;

public class FirstNumberMultipliedDigits24 {
    public static void main(String[] args) {
        for (int a = 1; a < 10; a++) {
            for (int b = 0; b < 10; b++) {
                if (a * b == 24) {
                    System.out.println("" + a + b);
                    break;
                }
            }
        }
    }
}
