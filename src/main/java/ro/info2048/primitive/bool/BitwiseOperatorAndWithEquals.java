package ro.info2048.primitive.bool;

public class BitwiseOperatorAndWithEquals {
    public static void main(String[] args) {
        boolean sambataCuSoare = true;
        boolean duminicaCuSoare = false;

        boolean weekendCuSoare = sambataCuSoare;
        weekendCuSoare = weekendCuSoare && duminicaCuSoare;
        System.out.println(weekendCuSoare); // false

        weekendCuSoare = sambataCuSoare;
        weekendCuSoare &= duminicaCuSoare;
        System.out.println(weekendCuSoare); // false
    }
}
