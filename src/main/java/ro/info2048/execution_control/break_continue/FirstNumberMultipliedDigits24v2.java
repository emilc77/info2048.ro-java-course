package ro.info2048.execution_control.break_continue;

public class FirstNumberMultipliedDigits24v2 {
    public static void main(String[] args) {
        outer_loop:
        for (int a = 1; a < 10; a++) {
            for (int b = 0; b < 10; b++) {
                if (a * b == 24) {
                    System.out.println("" + a + b);
                    break outer_loop;
                }
            }
        }
    }
}
