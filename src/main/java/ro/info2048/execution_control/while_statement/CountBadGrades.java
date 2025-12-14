package ro.info2048.execution_control.while_statement;

public class CountBadGrades {
    public static void main(String[] args) {
        int[] grades = {10, 9, 7, 4, 5, 7, 2, 5};
        int badGrades = 0;

        int index = 0;
        while (index < grades.length) {
            if (grades[index] < 5) {
                badGrades++;
            }
            index++;
        }

        System.out.println("Number of bad grades: " + badGrades);
    }
}
