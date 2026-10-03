package day15.practice;


public class GenericMethodPractice {

    public static <T> void printData(T data) {
        System.out.println(data);
    }

    public static void main(String[] args) {

        printData("Robin");

        printData(500);

        printData(99.5);
    }

}
