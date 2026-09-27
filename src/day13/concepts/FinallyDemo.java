package day13.concepts;
public class FinallyDemo {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 2);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
