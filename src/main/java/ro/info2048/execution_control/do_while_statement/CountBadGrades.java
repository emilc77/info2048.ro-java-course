package ro.info2048.execution_control.do_while_statement;

public class CountBadGrades {
    public static void main(String[] args) {
        int[] grades = {10, 9, 7, 4, 5, 7, 2, 5};
        int badGrades = 0;

        int index = 0;
        do {
            if (grades[index] < 5) {
                badGrades++;
            }
            index++;
        } while (index < grades.length);

        System.out.println("Number of bad grades: " + badGrades);
    }
}
