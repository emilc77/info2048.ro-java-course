package ro.info2048.execution_control.break_continue;

public class TwoDigitsNonM2or3 {
    public static void main(String[] args) {
        for (int i = 10; i < 100; i++) {
            if (i % 2 == 0) {
                continue;
            }
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
