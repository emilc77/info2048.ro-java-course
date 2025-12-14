package ro.info2048.execution_control.break_continue;

public class InfiniteWhile2 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            if (i == 2) {
                continue;
            }
            i++;
        }
    }
}
