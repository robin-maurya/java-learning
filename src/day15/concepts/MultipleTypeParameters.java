
package day15.concepts;

public class MultipleTypeParameters {

    public static <T, U> void printPair(T first, U second) {
        System.out.println("First: " + first);
        System.out.println("Second: " + second);
    }

    public static void main(String[] args) {
        printPair("Robin", 100);
        printPair(10.5, true);
        printPair("Java", "Generics");
    }
}
