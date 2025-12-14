package ro.info2048.primitive.bool;

public class BitwiseOperatorOrWithEquals {
    public static void main(String[] args) {
        boolean tomJerry = true;
        boolean garfield = false;

        boolean distractie = tomJerry;
        distractie = distractie || garfield;
        System.out.println(distractie); // true

        distractie = tomJerry;
        distractie |= garfield;
        System.out.println(distractie); // true
    }
}
