package ro.info2048.primitive.bool;

public class ShortCircuitOr1 {
    public static void main(String[] args) {
        boolean mergemLaMedic = pisicaBolnava() || caineBolnav();
        System.out.println("Mergem la medic? " + mergemLaMedic);
    }

    static boolean pisicaBolnava() {
        System.out.println("Pisica e bolnava");
        return true;
    }

    static boolean caineBolnav() {
        System.out.println("Cainele nu e bolnav");
        return false;
    }
}
