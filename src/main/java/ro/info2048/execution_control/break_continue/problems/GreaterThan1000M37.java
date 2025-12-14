package ro.info2048.execution_control.break_continue.problems;

public class GreaterThan1000M37 {
    public static void main(String[] args) {
        for (int i = 1001; i < 1000000; i++) {
            if (i % 37 == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
