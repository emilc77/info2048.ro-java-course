package ro.info2048.primitive.no_decimals;

public class AutoIncrement4 {
    public static void main(String[] args) {
        int i = 1;

        ++i;
        int j = i;
        System.out.println(j); // 2

        i++;
        int k = i;
        System.out.println(k); // 3
    }
}
