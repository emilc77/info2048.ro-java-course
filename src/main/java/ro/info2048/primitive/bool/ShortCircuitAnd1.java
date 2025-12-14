package ro.info2048.primitive.bool;

public class ShortCircuitAnd1 {
    public static void main(String[] args) {
        boolean mergemLaMedic = pisicaBolnava() && masinaMerge();
        System.out.println("Mergem la medic? " + mergemLaMedic);
    }

    static boolean pisicaBolnava() {
        System.out.println("Pisica nu e bolnava");
        return false;
    }

    static boolean masinaMerge() {
        System.out.println("Masina merge");
        return true;
    }
}
