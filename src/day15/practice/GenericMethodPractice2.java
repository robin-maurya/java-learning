package day15.practice;

public class GenericMethodPractice2 {

    public static <T> void printData( T data) {
        System.out.println(data);
    }

    public static void main(String[] args) {

        printData("Robin");
        printData(25);
        printData(99.5);
        printData(true);
    }
}
