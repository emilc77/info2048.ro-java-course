
package ro.info2048.primitive.no_decimals;

public class OperatorDivideWithEquals {
    public static void main(String[] args) {
        int i = 99;
        System.out.println(i); // 100
        i = i / 5;
        System.out.println(i); // 20
        i /= 5;
        System.out.println(i); // 4
    }
}
