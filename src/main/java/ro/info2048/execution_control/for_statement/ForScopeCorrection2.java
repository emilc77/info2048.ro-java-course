package ro.info2048.execution_control.for_statement;

public class ForScopeCorrection2 {
    public static void main(String[] args) {
        int i = 1;
        for (; i <= 3; ) {
            System.out.println(i);
            i++;
        }
        System.out.println(i);
    }
}
