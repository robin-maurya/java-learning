
package day15.concepts;

public class BoundedGenerics {

    public static <T extends Number> void printNumber(T number) {
        System.out.println("Value: " + number);
        System.out.println("Double value: " + number.doubleValue());
    }

    public static void main(String[] args) {
        printNumber(100);
        printNumber(10.5);
        printNumber(25.75f);

        // printNumber("Robin"); // Compile-time error
    }
}
