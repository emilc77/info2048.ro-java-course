package ro.info2048.execution_control.for_statement;

public class NestedFors2 {
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            System.out.println("i=" + i);

            for (int j = 0; j < 2; j++) {
                System.out.println("j=" + j);
            }
        }
    }
}
