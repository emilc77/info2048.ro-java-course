package ro.info2048.primitive.bool;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MyBooleanPrimitive2 {
    public static void main(String[] args) {
        Path path = Paths.get("C:/temp/");
        boolean exists = Files.exists(path);
        if (exists) {
            System.out.println("Exista");
        } else {
            System.out.println("Nu exista!");
        }
    }
}
