package ro.info2048.primitive.no_decimals;

public class AutoDecrement1 {
    public static void main(String[] args) {
        int i = 10;

        i = i - 1;
        System.out.println(i); // 9

        i -= 1;
        System.out.println(i); // 8

        i--;
        System.out.println(i); // 7

        --i;
        System.out.println(i); // 6
    }
}
