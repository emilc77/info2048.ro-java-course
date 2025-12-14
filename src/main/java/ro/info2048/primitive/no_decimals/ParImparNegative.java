package ro.info2048.primitive.no_decimals;

public class ParImparNegative {
    public static void main(String[] args) {
        int i = -13;
        System.out.println("i / 2 = " + (i / 2));
        System.out.println("i % 2 = " + (i % 2));
        System.out.println("par = " + (i % 2 == 0));
        System.out.println("impar = " + (i % 2 == 1));
    }
}
