package ro.info2048.primitive.bool;

public class BooleanEquality {
    public static void main(String[] args) {
        boolean var1 = true;
        boolean var2 = false;

        if (var1 == var2) {
            System.out.println("Sunt egale");
        }

        if (var1 != var2) {
            System.out.println("Nu sunt egale");
        }
    }
}
