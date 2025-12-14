package ro.info2048.primitive.no_decimals;

public class AutoIncrement3 {
    public static void main(String[] args) {
        int i = 1;

        int j = ++i;
        System.out.println(i); // 2
        System.out.println(j); // 2
        int k = i++;
        System.out.println(i); // 3
        System.out.println(k); // 2
    }
}
