package ro.info2048.primitive.no_decimals;

public class AutoDecrement3 {
    public static void main(String[] args) {
        int i = 10;
        int j = --i;
        System.out.println(i); // 9
        System.out.println(j); // 9
        int k = i--;
        System.out.println(i); // 8
        System.out.println(k); // 9
    }
}
