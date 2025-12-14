package ro.info2048.primitive.bool;

public class ShortCircuitAnd2 {
    public static void main(String[] args) {
        boolean mergemLaMedic = pisicaBolnava() && masinaMerge();
        System.out.println("Mergem la medic? " + mergemLaMedic);
    }

    static boolean pisicaBolnava() {
        System.out.println("Pisica e bolnava");
        return true;
    }

    static boolean masinaMerge() {
        System.out.println("Masina merge");
        return true;
    }
}
