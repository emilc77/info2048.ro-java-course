package ro.info2048.primitive.no_decimals;

public class AutoIncrement1 {
    public static void main(String[] args) {
        int i = 1;

        i = i + 1;
        System.out.println(i); // 2

        i += 1;
        System.out.println(i); // 3

        i++;
        System.out.println(i); // 4

        ++i;
        System.out.println(i); // 5
    }
}
