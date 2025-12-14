package ro.info2048.execution_control.while_statement;

public class BadGrades {
    public static void main(String[] args) {
        int[] grades = {10, 9, 7, 4, 5};
        int index = 0;
        while (index < grades.length) {
            if (grades[index] < 5) {
                System.out.println("Bad grade: " + grades[index]);
            }
            index++;
        }
    }
}
