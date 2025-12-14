package ro.info2048.primitive.bool;

public class ShortCircuitOr2 {
    public static void main(String[] args) {
        boolean mergemLaMedic = pisicaBolnava() || caineBolnav();
        System.out.println("Mergem la medic? " + mergemLaMedic);
    }

    static boolean pisicaBolnava() {
        System.out.println("Pisica nu e bolnava");
        return false;
    }

    static boolean caineBolnav() {
        System.out.println("Cainele e bolnav");
        return true;
    }
}
