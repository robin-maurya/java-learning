package day15.practice;

public class BoundedGenericPractice {
    public static <T extends Number> void printNumber(T number) {
        System.out.println(number);
    }

    public static void main(String[] args) {
        printNumber(100);
        printNumber(99.5);
        printNumber(25.5f);
    }
}
