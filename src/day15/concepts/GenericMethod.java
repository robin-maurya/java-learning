
package day15.concepts;

public class GenericMethod {

    public static <T> void printData(T data) {
        System.out.println(data);
    }

    public static void main(String[] args) {
        printData("Robin");
        printData(100);
        printData(10.5);
        printData(true);
    }
}
