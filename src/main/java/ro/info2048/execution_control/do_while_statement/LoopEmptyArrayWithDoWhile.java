package ro.info2048.execution_control.do_while_statement;

public class LoopEmptyArrayWithDoWhile {
    public static void main(String[] args) {
        String[] names = {};
        int index = 0;
        do {
            System.out.println("Name " + index + " : "
                    + names[index]);
            index++;
        } while (index < names.length);
        System.out.println("loop finished");
    }
}
