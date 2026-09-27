package day13.practice;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] numbers ={10, 20, 30};

        try {
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index");
        } finally {
            System.out.println("Array operation completed");
        }
    }
}
