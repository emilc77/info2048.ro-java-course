package ro.info2048.execution_control.break_continue.problems;

public class NumbersInFirst101 {
    public static void main(String[] args) {
        int allDigits = 0;
        for (int i = 1; i < 100; i++) {
            int digitsCurrentNumber;
            if (i < 10) {
                digitsCurrentNumber = 1;
            } else {
                digitsCurrentNumber = 2;
            }
            allDigits = allDigits + digitsCurrentNumber;
            if (allDigits >= 101) {
                System.out.println(i);
                break;
            }
        }
    }
}
