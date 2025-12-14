package ro.info2048.execution_control.for_statement;

public class ForScope {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            System.out.println(i);
        }
        // System.out.println(i); // compilation error
    }
}
