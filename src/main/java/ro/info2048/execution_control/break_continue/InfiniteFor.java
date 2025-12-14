package ro.info2048.execution_control.break_continue;

public class InfiniteFor {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
            if (i == 2) {
                i = 0;
            }
        }
    }
}
