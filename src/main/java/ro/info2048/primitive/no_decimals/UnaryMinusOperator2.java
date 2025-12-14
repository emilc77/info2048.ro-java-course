package ro.info2048.primitive.no_decimals;

public class UnaryMinusOperator2 {
    public static void main(String[] args) {
        int i = 6;
        int j = 5 * -i;
        System.out.println(j); // -30

        j = 5 * (-i);
        System.out.println(j); // -30
    }
}
