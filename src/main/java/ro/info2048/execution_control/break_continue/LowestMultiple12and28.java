package ro.info2048.execution_control.break_continue;

public class LowestMultiple12and28 {
    public static void main(String[] args) {
        for (int i = 1; i < 100000000; i++) {
            if (i % 12 == 0 && i % 28 == 0) {
                System.out.println(i);
                break;
            }
        }
        System.out.println("loop finished");
    }
}
