package ro.info2048.primitive.bool;

public class OneCharBoolOperator {
    public static void main(String[] args) {
        boolean val1 = true;
        boolean val2 = false;

        // | - doar un caracter
        boolean valOr = val1 | val2;
        System.out.println(valOr); // true

        // & - doar un caracter
        boolean valAnd = val1 & val2;
        System.out.println(valAnd); // false
    }
}
