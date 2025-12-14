package ro.info2048.primitive.no_decimals;

public class AutoIncrement2Long {
    public static void main(String[] args) {
        long a = 1;

        System.out.println(a++); // 1
        System.out.println(a); // 2
        System.out.println(++a); // 3
        System.out.println(a); // 3
    }
}
