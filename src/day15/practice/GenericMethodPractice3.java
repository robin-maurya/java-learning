package day15.practice;

public class GenericMethodPractice3 {

    public static <T, U> void printData(T first, U second) {
        System.out.println(first);
        System.out.println(second);
    }

    public static void main(String[] args) {
        printData("Robin", 25);
        printData("Java", 99.5);
        printData("TCS", true);
    }
}
