package ro.info2048.primitive.no_decimals.exercises;

public class SchimbaSemnul2 {
    public static void main(String[] args) {
        int schimbat1 = schimbaSemnul(5);
        System.out.println(schimbat1);
        int schimbat2 = schimbaSemnul(-7);
        System.out.println(schimbat2);
    }

    public static int schimbaSemnul(int parameter) {
        return -parameter;
    }
}
