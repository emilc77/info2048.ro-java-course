package ro.info2048.execution_control.break_continue.problems;

public class DogRabit {
    public static void main(String[] args) {
        int distantaCaine = 0;
        int distantaIepure = 0;
        int sarituraIepure = 60; // cm
        int sarituraCaine = 5 * sarituraIepure / 2; // cm
        int distantaInitiala = 60 * 100; // cm

        while (true) {
            distantaIepure += 3 * sarituraIepure;
            distantaCaine += 2 * sarituraCaine;
            boolean prins = distantaCaine >= distantaIepure
                        + distantaInitiala;
            if (prins) {
                System.out.println(distantaCaine + " cm");
                System.out.println((distantaCaine / 100) + " m");
                break;
            }
        }
    }
}
