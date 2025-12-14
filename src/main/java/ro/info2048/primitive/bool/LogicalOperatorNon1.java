package ro.info2048.primitive.bool;

public class LogicalOperatorNon1 {
    public static void main(String[] args) {
        boolean afaraNoapte = true;
        boolean afaraZi = !afaraNoapte;
        System.out.println(afaraZi); // false

        if (!afaraZi) {
            pornesteLumina();
        }
    }

    static void pornesteLumina() {
        System.out.println("Lumina Porninta");
    }
}
