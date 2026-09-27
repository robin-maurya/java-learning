package day13.concepts;
public class ThrowDemo {
    static void validateAge(int age) {
        if (age < 18) throw new IllegalArgumentException("Age must be 18 or above.");
        System.out.println("Eligible.");
    }
    public static void main(String[] args) {
        validateAge(16);
    }
}
