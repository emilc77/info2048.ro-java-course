package ro.info2048.execution_control.for_statement;

public class LoopArrayWithFor {
    public static void main(String[] args) {
        String[] names = {"Carmen", "Ana", "Philip"};

        for (int i = 0; i < names.length; i++) {
            System.out.println("Name " + i + " : " + names[i]);
        }

        System.out.println("loop finished");
    }
}
