package ro.info2048.execution_control.for_statement;

public class ForScopeCorrection1 {
    public static void main(String[] args) {
        int i = 1;
        for (; i <= 3; i++) {
            System.out.println(i);
        }
        System.out.println(i);
    }
}
