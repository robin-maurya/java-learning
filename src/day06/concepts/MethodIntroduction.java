package day06.concepts;

public class MethodIntroduction {

    static void greet() {
        System.out.println("Hello Robin");
    }

    static void greet(String name) {
        System.out.println("Hello " + name);
    }

    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        greet();

        greet("Robin");

        int result = add(10,20);

        System.out.println(result);

    }
}
