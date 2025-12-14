package ro.info2048.introducere.about_methods;

public class VoidReturnMethod {
    public static void main(String[] args) {
        VoidReturnMethod instance = new VoidReturnMethod();
        instance.printAge();
    }

    public void printAge() {
        int age = 25;
        System.out.println(age);
        return;
    }
}
