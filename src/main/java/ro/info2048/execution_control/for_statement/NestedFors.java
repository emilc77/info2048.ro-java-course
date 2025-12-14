package ro.info2048.execution_control.for_statement;

public class NestedFors {
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("i=" + i + "; j=" + j);
            }
        }
    }
}
