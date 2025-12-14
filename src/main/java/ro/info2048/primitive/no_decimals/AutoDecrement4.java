package ro.info2048.primitive.no_decimals;

public class AutoDecrement4 {
    public static void main(String[] args) {
        int i = 10;

        --i;
        int j = i;
        System.out.println(j); // 9

        i--;
        int k = i;
        System.out.println(k); // 8
    }
}
