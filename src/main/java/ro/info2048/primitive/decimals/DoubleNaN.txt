package ro.info2048.primitive.decimals;

/**
 * More examples at:
 * https://www.baeldung.com/java-not-a-number
 */
public class DoubleNaN {
    public static void main(String[] args) {
        double nan = 0.0 / 0.0;

        System.out.println("nan=" + nan);
    }
}
