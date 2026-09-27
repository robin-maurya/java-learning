package day13.concepts;
public class ExceptionPropagationDemo {
    static void methodC() { System.out.println(10 / 0); }
    static void methodB() { methodC(); }
    static void methodA() { methodB(); }
    public static void main(String[] args) {
        try {
            methodA();
        } catch (ArithmeticException e) {
            System.out.println("Caught in main: " + e.getMessage());
        }
    }
}
