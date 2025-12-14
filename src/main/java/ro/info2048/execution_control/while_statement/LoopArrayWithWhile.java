package ro.info2048.execution_control.while_statement;

public class LoopArrayWithWhile {
    public static void main(String[] args) {
        String[] names = {"Carmen", "Ana", "Philip"};
        int index = 0;
        while (index < names.length) {
            System.out.println("Name " + index + " : "
                    + names[index]);
            index++;
        }
        System.out.println("loop finished");
    }
}
